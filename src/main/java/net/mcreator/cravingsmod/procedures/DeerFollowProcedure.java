package net.mcreator.cravingsmod.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class DeerFollowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		boolean eh = false;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == (entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)) {
			eh = false;
		} else {
			eh = true;
		}
		return eh;
	}
}