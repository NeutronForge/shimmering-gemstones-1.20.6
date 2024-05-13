package net.echo.shimmering_gemstones.item;

import net.echo.shimmering_gemstones.ShimmeringGemstones;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new Item.Settings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby",
            new Item(new Item.Settings()));
    public static final Item RUBY_SLIVER = registerItem("ruby_sliver",
            new Item(new Item.Settings()));

    public static final Item RUBY_PLATED_NETHERITE_INGOT = registerItem("ruby_plated_netherite_ingot",
            new Item(new Item.Settings()));
    public static final Item DEPLETED_RUBY_PLATED_NETHERITE_UPGRADE = registerItem("depleted_ruby_plated_netherite_upgrade",
            new Item(new Item.Settings()));
    public static final Item CHARGED_RUBY_PLATED_NETHERITE_UPGRADE = registerItem("charged_ruby_plated_netherite_upgrade",
            new Item(new Item.Settings()));


    public static final Item RUBY_PLATED_NETHERITE_SWORD = registerItem("ruby_plated_netherite_sword",
            (Item)new SwordItem(ModToolMaterials.RUBY_PLATED_NETHERITE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RUBY_PLATED_NETHERITE, 3, -2.4f))));
    public static final Item RUBY_PLATED_NETHERITE_PICKAXE = registerItem("ruby_plated_netherite_pickaxe",
            (Item)new PickaxeItem(ModToolMaterials.RUBY_PLATED_NETHERITE, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RUBY_PLATED_NETHERITE, 1.0f, -2.8f))));
    public static final Item RUBY_PLATED_NETHERITE_AXE = registerItem("ruby_plated_netherite_axe",
            (Item)new AxeItem(ModToolMaterials.RUBY_PLATED_NETHERITE, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RUBY_PLATED_NETHERITE, 5.0f, -3.0f))));



/*
    public static final Item NETHERITE_SWORD = Items.register("netherite_sword",
            (Item)new SwordItem(ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 3, -2.4f))));
    public static final Item NETHERITE_SHOVEL = Items.register("netherite_shovel",
            (Item)new ShovelItem(ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.5f, -3.0f))));
    public static final Item NETHERITE_PICKAXE = Items.register("netherite_pickaxe",
            (Item)new PickaxeItem(ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1.0f, -2.8f))));
    public static final Item NETHERITE_AXE = Items.register("netherite_axe",
            (Item)new AxeItem(ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ToolMaterials.NETHERITE, 5.0f, -3.0f))));
    public static final Item NETHERITE_HOE = Items.register("netherite_hoe", (
            Item)new HoeItem(ToolMaterials.NETHERITE, new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ToolMaterials.NETHERITE, -4.0f, 0.0f))));
*/


    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
        entries.add(RUBY_SLIVER);

        entries.add(DEPLETED_RUBY_PLATED_NETHERITE_UPGRADE);
        entries.add(CHARGED_RUBY_PLATED_NETHERITE_UPGRADE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ShimmeringGemstones.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ShimmeringGemstones.LOGGER.info("Registering mod items for " + ShimmeringGemstones.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
