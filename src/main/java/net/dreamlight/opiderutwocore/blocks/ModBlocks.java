package net.dreamlight.opiderutwocore.blocks;

import net.dreamlight.opiderutwocore.OpideruTwoCoreMod;
import net.dreamlight.opiderutwocore.item.ModItems;
import net.dreamlight.opiderutwocore.item.creativetabs.ModCreativeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, OpideruTwoCoreMod.MODID);
    //BLOCKS
    //----------------------------------------------------------------
    //engineriate
    public static final RegistryObject<Block> ENGINERIATE_BLOCK = registerBlock("engineriate_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(10f)
                    .requiresCorrectToolForDrops().explosionResistance(150f)),
            ModCreativeTabs.OPIDERU_BLOCKS);
    public static final RegistryObject<Block> ENGINERIATE_ORE = registerBlock("engineriate_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(4f)
                    .requiresCorrectToolForDrops().explosionResistance(15f)),
            ModCreativeTabs.OPIDERU_BLOCKS);
    public static final RegistryObject<Block> DEEPSlATE_ENGINERIATE_ORE = registerBlock("deepslate_engineriate_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(9f)
                    .requiresCorrectToolForDrops().explosionResistance(75f)),
            ModCreativeTabs.OPIDERU_BLOCKS);
    //titanium
    public static final RegistryObject<Block> TITANIUM_BLOCK = registerBlock("titanium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(15f)
                    .requiresCorrectToolForDrops().explosionResistance(150f)),
            ModCreativeTabs.OPIDERU_BLOCKS);
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5f)
                    .requiresCorrectToolForDrops().explosionResistance(25f)),
            ModCreativeTabs.OPIDERU_BLOCKS);

    //-------------------------------------------------------------------------
    //Methods
    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    public static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab).stacksTo(64)));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
