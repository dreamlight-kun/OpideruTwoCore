package net.dreamlight.opiderutwocore.item;

import net.dreamlight.opiderutwocore.OpideruTwoCoreMod;
import net.dreamlight.opiderutwocore.item.creativetabs.ModCreativeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OpideruTwoCoreMod.MODID);
    //Engineriate
    public static final RegistryObject<Item> ENGINERIATE_INGOT = ITEMS.register( "engineriate_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    public static final RegistryObject<Item> ENGINERIATE_DUST = ITEMS.register( "powdered_engineriate",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    public static final RegistryObject<Item> ENGINERIATE_NUGGET = ITEMS.register( "engineriate_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    //titanium
    public static final RegistryObject<Item> RAW_ENGINERIATE = ITEMS.register( "raw_engineriate",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register( "titanium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    public static final RegistryObject<Item> TITANIUM_DUST = ITEMS.register( "powdered_titanium",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register( "titanium_nugget",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));

    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register( "raw_titanium",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    //pure gold
    public static final RegistryObject<Item> PURE_GOLD = ITEMS.register( "pure_gold_ingot",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    //transcavite
    public static final RegistryObject<Item> GEM_TRANSCAVITE = ITEMS.register( "transcavite",
            () -> new Item(new Item.Properties().stacksTo(64).tab(ModCreativeTabs.OPIDERU_ITEMS)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
