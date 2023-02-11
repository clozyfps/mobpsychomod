package net.mcreator.mobpsychocraftcollab.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class DarkBlastRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlastAttackProcedure.execute(world, entity);
	}
}
