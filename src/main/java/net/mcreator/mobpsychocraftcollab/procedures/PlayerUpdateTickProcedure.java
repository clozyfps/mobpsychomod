package net.mcreator.mobpsychocraftcollab.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerUpdateTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event);
		}
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
	}
}