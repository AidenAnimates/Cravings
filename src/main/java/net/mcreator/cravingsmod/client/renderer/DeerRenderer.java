package net.mcreator.cravingsmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cravingsmod.entity.DeerEntity;
import net.mcreator.cravingsmod.client.model.ModelDeer;

import com.mojang.blaze3d.vertex.PoseStack;

public class DeerRenderer extends MobRenderer<DeerEntity, LivingEntityRenderState, ModelDeer> {
	private DeerEntity entity = null;

	public DeerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDeer(context.bakeLayer(ModelDeer.LAYER_LOCATION)), 1.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(DeerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("cravings_mod:textures/entities/deer.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}