package net.mcreator.cravingsmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.cravingsmod.entity.BisonEntity;
import net.mcreator.cravingsmod.client.model.ModelBison;

import com.mojang.blaze3d.vertex.PoseStack;

public class BisonRenderer extends MobRenderer<BisonEntity, LivingEntityRenderState, ModelBison> {
	private BisonEntity entity = null;

	public BisonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBison(context.bakeLayer(ModelBison.LAYER_LOCATION)), 2.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(BisonEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("cravings_mod:textures/entities/bison.png");
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(2f, 2f, 2f);
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}