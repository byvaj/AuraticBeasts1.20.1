package net.byvaj.auraticbeasts.item;

import net.byvaj.auraticbeasts.AuraticBeasts;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AuraticBeasts.MOD_ID);

    public static final RegistryObject<Item> SERPENTIUMINGOT = ITEMS.register("serpentium_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAWSERPENTIUM = ITEMS.register("raw_serpentium",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BLAZEFISH = ITEMS.register("blazefish",
            () -> new Item(new Item.Properties().food(ModFoods.BLAZEFISH)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
