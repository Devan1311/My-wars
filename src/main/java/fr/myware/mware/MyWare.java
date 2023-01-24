package fr.myware.mware;

import com.mojang.logging.LogUtils;
import fr.myware.mware.block.entity.ModBlockEntities;
import fr.myware.mware.item.ModItems;
import fr.myware.mware.block.ModBlocks;
import fr.myware.mware.screen.AnvilStationScreen;
import fr.myware.mware.screen.ModMenuTypes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(MyWare.MOD_ID)
public class MyWare {
    public static final String MOD_ID = "mware";

    private static final Logger LOGGER = LogUtils.getLogger();

    public MyWare() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        ModBlockEntities.register(eventBus);
        ModMenuTypes.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ANVIL_STATION_BLOCK.get(), RenderType.translucent());
        MenuScreens.register(ModMenuTypes.ANVIL_STATION_MENU.get(), AnvilStationScreen::new);


        }


    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        GeckoLib.initialize();

    }
}

