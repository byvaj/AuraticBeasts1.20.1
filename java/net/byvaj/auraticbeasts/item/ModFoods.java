package net.byvaj.auraticbeasts.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {

    public static final FoodProperties BLAZEFISH = new FoodProperties.Builder().nutrition(3)
            .saturationMod(1).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600), 1)
            .build();

}
