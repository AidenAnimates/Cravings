package net.mcreator.cravingsmod.procedures;

public class CropMealSuccessConditionProcedure {
	public static boolean execute() {
		boolean var = false;
		if (Math.random() <= 0.6) {
			var = true;
		} else {
			var = false;
		}
		return var;
	}
}