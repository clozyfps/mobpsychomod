package net.mcreator.mobpsychocraftcollab.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mobpsychocraftcollab.network.MobpsychocraftcollabModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BeforeHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity(), event.getAmount());
		}
	}

	public static void execute(Entity entity, double amount) {
		execute(null, entity, amount);
	}

	private static void execute(@Nullable Event event, Entity entity, double amount) {
		if (entity == null)
			return;
		double dmg = 0;
		if (event != null && event.isCancelable()) {
			event.setCanceled(true);
		}
		dmg = amount;
		if (entity instanceof Player) {
			dmg = dmg * (200 / (200 + (entity.getCapability(MobpsychocraftcollabModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new MobpsychocraftcollabModVariables.PlayerVariables())).CurrentPsychicEnergy));
		}
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - dmg));
	}
}
