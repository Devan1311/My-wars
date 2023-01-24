package fr.myware.mware.block;


import fr.myware.mware.MyWare;
import fr.myware.mware.block.custom.AnvilStationBlockBlock;
import fr.myware.mware.item.ModCreativeModeTab;
import fr.myware.mware.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
public class ModBlocks {
            public static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, MyWare.MOD_ID);

        public static final RegistryObject<Block> FORGED_STEEL_BLOCK = registerBlock("forged_steel_block",
                () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                        .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.MY_WARE_TAB);
        public static final RegistryObject<Block> ANVIL_STATION_BLOCK = registerBlock("anvil_station_block",
            () -> new AnvilStationBlockBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            ModCreativeModeTab.MY_WARE_TAB);






        private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
            RegistryObject<T> toReturn = BLOCKS.register(name, block);
            registerBlockItem(name, toReturn, tab);
            return toReturn;
        }

        private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                                CreativeModeTab tab) {
            return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                    new Item.Properties().tab(tab)));
        }

        public static void register(IEventBus eventBus) {
            BLOCKS.register(eventBus);
        }
}
