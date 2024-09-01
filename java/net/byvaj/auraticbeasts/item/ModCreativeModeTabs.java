package net.byvaj.auraticbeasts.item;

import net.byvaj.auraticbeasts.AuraticBeasts;
import net.byvaj.auraticbeasts.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AuraticBeasts.MOD_ID);

    public static final RegistryObject<CreativeModeTab> AURATIC_BEASTS_CREATIVE_TAB =
            CREATIVE_MODE_TABS.register("auratic_beasts_creative_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SERPENTIUMINGOT.get()))
                            .title(Component.translatable("creativetab.auratic_beasts"))
                            .displayItems((itemDisplayParameters, output) -> {

                                output.accept(ModItems.SERPENTIUMINGOT.get());
                                output.accept(ModItems.RAWSERPENTIUM.get());
                                output.accept(ModBlocks.SERPENTIUM_BLOCK.get());
                                output.accept(ModBlocks.RAW_SERPENTIUM_BLOCK.get());
                                output.accept(ModBlocks.SERPENTIUM_ORE.get());
                                output.accept(ModBlocks.DEEPSLATE_SERPENTIUM_ORE.get());

                                output.accept(ModItems.BLAZEFISH.get());


                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
