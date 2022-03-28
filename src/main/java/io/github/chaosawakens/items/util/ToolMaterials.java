package io.github.chaosawakens.items.util;

import io.github.chaosawakens.items.Items;
import io.github.chaosawakens.items.util.generic.GenericToolMaterial;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterials {

  public static final ToolMaterial EMERALD_TOOL_MATERIAL;
  public static final ToolMaterial AMETHYST_TOOL_MATERIAL;
  public static final ToolMaterial RUBY_TOOL_MATERIAL;
  public static final ToolMaterial TIGERS_EYE_TOOL_MATERIAL;
  public static final ToolMaterial CRYSTAL_WOOD_TOOL_MATERIAL;
  public static final ToolMaterial KYANITE_TOOL_MATERIAL;
  public static final ToolMaterial PINK_TOURMALINE_TOOL_MATERIAL;
  public static final ToolMaterial CATS_EYE_TOOL_MATERIAL;
  public static final ToolMaterial ULTIMATE_TOOL_MATERIAL;
  public static final ToolMaterial NIGHTMARE_TOOL_MATERIAL;
  public static final ToolMaterial COPPER_TOOL_MATERIAL;
  public static final ToolMaterial TIN_TOOL_MATERIAL;
  public static final ToolMaterial SILVER_TOOL_MATERIAL;
  public static final ToolMaterial PLATINUM_TOOL_MATERIAL;
  public static final ToolMaterial BATTLEAXE_WEAPON_TOOL_MATERIAL;
  public static final ToolMaterial QUEEN_BATTLEAXE_WEAPON_TOOL_MATERIAL;
  public static final ToolMaterial RAY_GUN_WEAPON_TOOL_MATERIAL;
  public static final ToolMaterial GENERIC_WEAPON_TOOL_MATERIAL;
  public static final ToolMaterial BIG_HAMMER_WEAPON_TOOL_MATERIAL;
  public static final ToolMaterial BERTHA_WEAPON_TOOL_MATERIAL;

  static {
    EMERALD_TOOL_MATERIAL = new GenericToolMaterial(3, 1300, 8, 6, 24,
        Ingredient.ofItems(net.minecraft.item.Items.EMERALD));
    AMETHYST_TOOL_MATERIAL = new GenericToolMaterial(3, 2000, 9, 11, 18,
        Ingredient.ofItems(Items.AMETHYST));
    RUBY_TOOL_MATERIAL = new GenericToolMaterial(4, 1800, 10, 16, 22,
        Ingredient.ofItems(Items.RUBY));
    TIGERS_EYE_TOOL_MATERIAL = new GenericToolMaterial(3, 1600, 10, 8, 20,
        Ingredient.ofItems(Items.TIGERS_EYE));

    // TODO give below Materials their own repairIngredients!
    CRYSTAL_WOOD_TOOL_MATERIAL = new GenericToolMaterial(0, 300, 2, 1, 6,
        Ingredient.ofItems());
    // TODO give below Materials their own repairIngredients!
    KYANITE_TOOL_MATERIAL = new GenericToolMaterial(1, 800, 3, 2, 6,
        Ingredient.ofItems());
    PINK_TOURMALINE_TOOL_MATERIAL = new GenericToolMaterial(2, 1100, 7, 8, 6,
        Ingredient.ofItems(Items.PINK_TOURMALINE_INGOT));
    CATS_EYE_TOOL_MATERIAL = new GenericToolMaterial(3, 1600, 8, 8, 20,
        Ingredient.ofItems(Items.CATS_EYE_INGOT));
    ULTIMATE_TOOL_MATERIAL = new GenericToolMaterial(5, 3000, 15, 36, 64,
        Ingredient.ofItems(Items.TITANIUM_INGOT, Items.URANIUM_INGOT));
    NIGHTMARE_TOOL_MATERIAL = new GenericToolMaterial(3, 1800, 12, 26, 24,
        Ingredient.ofItems(Items.NIGHTMARE_SCALE));
    COPPER_TOOL_MATERIAL = new GenericToolMaterial(1, 150, 4, 2, 6,
        Ingredient.ofItems(Items.COPPER_LUMP));
    TIN_TOOL_MATERIAL = new GenericToolMaterial(1, 180, 5, 3, 8,
        Ingredient.ofItems(Items.TIN_LUMP));
    SILVER_TOOL_MATERIAL = new GenericToolMaterial(2, 450, 7, 4, 10,
        Ingredient.ofItems(Items.SILVER_LUMP));
    PLATINUM_TOOL_MATERIAL = new GenericToolMaterial(3, 1600, 8, 6, 12,
        Ingredient.ofItems(Items.PLATINUM_LUMP));
    BATTLEAXE_WEAPON_TOOL_MATERIAL = new GenericToolMaterial(5, 1200, 15, 47, 64,
        Ingredient.ofItems(Items.TITANIUM_INGOT, Items.URANIUM_INGOT));
    // TODO give below Materials their own repairIngredients!
    QUEEN_BATTLEAXE_WEAPON_TOOL_MATERIAL = new GenericToolMaterial(3, 10000, 15, 663, 96,
        Ingredient.ofItems());
    RAY_GUN_WEAPON_TOOL_MATERIAL = new GenericToolMaterial(0, 50, 0, 0, 0,
        Ingredient.ofItems(net.minecraft.item.Items.REDSTONE_BLOCK));
    // TODO give below Materials their own repairIngredients!
    GENERIC_WEAPON_TOOL_MATERIAL = new GenericToolMaterial(2, 1024, 6, 6, 8,
        null);
    // TODO give below Materials their own repairIngredients!
    BIG_HAMMER_WEAPON_TOOL_MATERIAL = new GenericToolMaterial(2, 2000, 6, 11, 9,
        Ingredient.ofItems());
    // TODO give below Materials their own repairIngredients!
    BERTHA_WEAPON_TOOL_MATERIAL = new GenericToolMaterial(5, 6000, 16, 57, 72,
        Ingredient.ofItems());
  }
}
