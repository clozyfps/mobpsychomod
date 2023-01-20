package net.mcreator.mobpsychocraftcollab.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DarkBlastRangedItemUsedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		RangeAttackProcedure.execute(world, entity);
	}
}
