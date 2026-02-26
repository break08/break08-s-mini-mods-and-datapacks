package com.eznetherite.uselessupgradetemplate;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmithingTransformRecipe;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Make it useless.
 *
 */

public class UselessUpgradeTemplate extends JavaPlugin {

  @Override
  public void onEnable() {
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "shovel_changes"),
            new ItemStack(Material.NETHERITE_SHOVEL),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_SHOVEL),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "sword_changes"),
            new ItemStack(Material.NETHERITE_SWORD),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_SWORD),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "pickaxe_changes"),
            new ItemStack(Material.NETHERITE_PICKAXE),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_PICKAXE),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "axe_changes"),
            new ItemStack(Material.NETHERITE_AXE),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_AXE),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "hoe_changes"),
            new ItemStack(Material.NETHERITE_HOE),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_HOE),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "chestplate_changes"),
            new ItemStack(Material.NETHERITE_CHESTPLATE),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_CHESTPLATE),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "leggings_changes"),
            new ItemStack(Material.NETHERITE_LEGGINGS),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_LEGGINGS),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "boots_changes"),
            new ItemStack(Material.NETHERITE_BOOTS),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_BOOTS),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "helmet_changes"),
            new ItemStack(Material.NETHERITE_HELMET),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_HELMET),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "spear_changes"),
            new ItemStack(Material.NETHERITE_SPEAR),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_SPEAR),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "horse_armor_changes"),
            new ItemStack(Material.NETHERITE_HORSE_ARMOR),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_HORSE_ARMOR),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));
    getServer().addRecipe(
        new SmithingTransformRecipe(
            new NamespacedKey(this, "nautilus_armor_changes"),
            new ItemStack(Material.NETHERITE_NAUTILUS_ARMOR),
            new RecipeChoice.MaterialChoice(Material.GOLD_INGOT),
            new RecipeChoice.MaterialChoice(Material.DIAMOND_NAUTILUS_ARMOR),
            new RecipeChoice.MaterialChoice(Material.NETHERITE_INGOT)));

    saveDefaultConfig();
  }
}
