package net.dreamlight.opiderutwocore.item.creativetabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class ModCreativeTabs {
    public static final CreativeModeTab OPIDERU_BLOCKS = new CreativeModeTab("opideru_blocks_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return Items.GILDED_BLACKSTONE.asItem().getDefaultInstance();
        }
    };
    public static final CreativeModeTab OPIDERU_ITEMS = new CreativeModeTab("opideru_items_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return Items.IRON_INGOT.getDefaultInstance();
        }
    };
    public static final CreativeModeTab OPIDERU_TOOLS = new CreativeModeTab("opideru_tools_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return Items.DIAMOND_SWORD.getDefaultInstance();
        }
    };
}
