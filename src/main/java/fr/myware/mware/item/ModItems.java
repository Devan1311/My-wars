package fr.myware.mware.item;

import fr.myware.mware.MyWare;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import fr.myware.mware.item.ModArmorMaterials;
import org.lwjgl.system.CallbackI;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,MyWare.MOD_ID);

    public static final RegistryObject<Item> ICON =ITEMS.register("icon",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL =ITEMS.register("steel",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> FORGED_STEEL =ITEMS.register("forged_steel",
                () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> HAMMER = ITEMS.register("hammer",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> FORGED_STEEL_SWORD = ITEMS.register("forged_steel_sword",
            () -> new SwordItem(Tiers.IRON, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));

    public static final RegistryObject<Item> FORGED_STEEL_HELMET = ITEMS.register("forged_steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.FORGEDSTEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> FORGED_STEEL_CHESTPLATE = ITEMS.register("forged_steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FORGEDSTEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> FORGED_STEEL_LEGGING = ITEMS.register("forged_steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.FORGEDSTEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> FORGED_STEEL_BOOTS = ITEMS.register("forged_steel_boots",
            () -> new ArmorItem(ModArmorMaterials.FORGEDSTEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));

    public static final RegistryObject<Item> RARE_FORGED_STEEL_HELMET = ITEMS.register("rare_forged_steel_helmet",
            () -> new ArmorItem(ModArmorMaterials.RAREFORGEDSTEEL, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> RARE_STEEL_CHESTPLATE = ITEMS.register("rare_forged_steel_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RAREFORGEDSTEEL, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> RARE_STEEL_LEGGING = ITEMS.register("rare_forged_steel_leggings",
            () -> new ArmorItem(ModArmorMaterials.RAREFORGEDSTEEL, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));
    public static final RegistryObject<Item> RARE_STEEL_BOOTS = ITEMS.register("rare_forged_steel_boots",
            () -> new ArmorItem(ModArmorMaterials.RAREFORGEDSTEEL, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.MY_WARE_TAB)));



    public static  void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
