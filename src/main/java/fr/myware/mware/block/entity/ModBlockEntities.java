package fr.myware.mware.block.entity;
import fr.myware.mware.MyWare;
import fr.myware.mware.block.ModBlocks;
import fr.myware.mware.block.entity.custom.AnvilStationBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, MyWare.MOD_ID);

    public static final RegistryObject<BlockEntityType<AnvilStationBlockEntity>> ANVIL_STATION_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("anvil_station_block_entity", () ->
                    BlockEntityType.Builder.of(AnvilStationBlockEntity::new,
                            ModBlocks.ANVIL_STATION_BLOCK.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}