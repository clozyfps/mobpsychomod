
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mobpsychocraftcollab.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mobpsychocraftcollab.item.DarkBlastItem;
import net.mcreator.mobpsychocraftcollab.MobpsychocraftcollabMod;

public class MobpsychocraftcollabModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MobpsychocraftcollabMod.MODID);
	public static final RegistryObject<Item> DARK_BLAST = REGISTRY.register("dark_blast", () -> new DarkBlastItem());
}
