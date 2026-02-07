/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.moreeffectsinpotions.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.moreeffectsinpotions.MoreEffectsInPotionsMod;

public class MoreEffectsInPotionsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, MoreEffectsInPotionsMod.MODID);
	public static final RegistryObject<Potion> LEVITATION_POTION = REGISTRY.register("levitation_potion", () -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 200, 0, false, true)));
	public static final RegistryObject<Potion> MINING_FATIGUE_POTION = REGISTRY.register("mining_fatigue_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 3600, 0, false, true)));
	public static final RegistryObject<Potion> WITHER_POTION = REGISTRY.register("wither_potion", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 200, 0, false, true)));
	public static final RegistryObject<Potion> HASTE_POTION = REGISTRY.register("haste_potion", () -> new Potion(new MobEffectInstance(MobEffects.DIG_SPEED, 3600, 0, false, true)));
	public static final RegistryObject<Potion> RESISTANT = REGISTRY.register("resistant", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0, false, true)));
	public static final RegistryObject<Potion> BLINDNESS_POTION = REGISTRY.register("blindness_potion", () -> new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 400, 0, false, true)));
	public static final RegistryObject<Potion> HEALTH_BOOST_POTION = REGISTRY.register("health_boost_potion", () -> new Potion(new MobEffectInstance(MobEffects.HEALTH_BOOST, 3600, 0, false, true)));
	public static final RegistryObject<Potion> HERO_OF_THE_VILLAGE_POTION = REGISTRY.register("hero_of_the_village_potion", () -> new Potion(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 600, 0, false, true)));
	public static final RegistryObject<Potion> CONDUIT_POWER_POTION = REGISTRY.register("conduit_power_potion", () -> new Potion(new MobEffectInstance(MobEffects.CONDUIT_POWER, 3600, 0, false, true)));
	public static final RegistryObject<Potion> DOLPHIN_GRACE_POTION = REGISTRY.register("dolphin_grace_potion", () -> new Potion(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400, 0, false, true)));
	public static final RegistryObject<Potion> BAD_LUCK_POTION = REGISTRY.register("bad_luck_potion", () -> new Potion(new MobEffectInstance(MobEffects.UNLUCK, 3600, 0, false, true)));
}