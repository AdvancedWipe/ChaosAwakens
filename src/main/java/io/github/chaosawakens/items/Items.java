package io.github.chaosawakens.items;

import static io.github.chaosawakens.ChaosAwakens.config;
import static io.github.chaosawakens.items.util.ArmorMaterials.AMETHYST_ARMOR_MATERIAL;
import static io.github.chaosawakens.items.util.ArmorMaterials.EMERALD_ARMOR_MATERIAL;
import static io.github.chaosawakens.items.util.ArmorMaterials.EXPERIENCE_ARMOR_MATERIAL;
import static io.github.chaosawakens.items.util.ArmorMaterials.LAPIS_LAZULI_ARMOR_MATERIAL;
import static io.github.chaosawakens.items.util.ArmorMaterials.LAVA_EEL_ARMOR_MATERIAL;
import static io.github.chaosawakens.items.util.ArmorMaterials.RUBY_ARMOR_MATERIAL;
import static io.github.chaosawakens.items.util.ArmorMaterials.TIGERS_EYE_ARMOR_MATERIAL;
import static io.github.chaosawakens.items.util.ArmorMaterials.ULTIMATE_ARMOR_MATERIAL;
import static io.github.chaosawakens.items.util.ToolMaterials.AMETHYST_TOOL_MATERIAL;
import static io.github.chaosawakens.items.util.ToolMaterials.EMERALD_TOOL_MATERIAL;
import static io.github.chaosawakens.items.util.ToolMaterials.GENERIC_WEAPON_TOOL_MATERIAL;
import static io.github.chaosawakens.items.util.ToolMaterials.NIGHTMARE_TOOL_MATERIAL;
import static io.github.chaosawakens.items.util.ToolMaterials.RUBY_TOOL_MATERIAL;
import static io.github.chaosawakens.items.util.ToolMaterials.TIGERS_EYE_TOOL_MATERIAL;
import static io.github.chaosawakens.items.util.ToolMaterials.ULTIMATE_TOOL_MATERIAL;

import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.entities.Entities;
import io.github.chaosawakens.items.util.FoodComponents;
import io.github.chaosawakens.items.util.generic.GenericAxeItem;
import io.github.chaosawakens.items.util.generic.GenericHoeItem;
import io.github.chaosawakens.items.util.generic.GenericPickaxeItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Items implements ModInitializer {

  public static final Item RAW_CORNDOG;
  public static final Item COOKED_CORNDOG;
  public static final Item RAW_BACON;
  public static final Item COOKED_BACON;
  public static final Item CORN;
  public static final Item TOMATO;
  public static final Item LETTUCE;
  public static final Item CHEESE;
  public static final Item GARDEN_SALAD;
  public static final Item BLT;
  public static final Item STRAWBERRY;
  public static final Item RADISH;
  public static final Item RADISH_STEW;
  public static final Item CHERRIES;
  public static final Item SPARK_FISH;
  public static final Item LAVA_EEL;
  public static final Item CRAB_MEAT;
  public static final Item COOKED_CRAB_MEAT;
  public static final Item SEAFOOD_PATTY;
  public static final Item PEACH;
  public static final Item PEACOCK_LEG;
  public static final Item COOKED_PEACOCK_LEG;
  public static final Item BUTTER;
  // GOLDEN FOOD
  public static final Item GOLDEN_BREAD;
  public static final Item GOLDEN_CHICKEN;
  public static final Item GOLDEN_TROPICAL_FISH;
  public static final Item GOLDEN_COD;
  public static final Item GOLDEN_PORKCHOP;
  public static final Item GOLDEN_MELON_SLICE;
  public static final Item GOLDEN_MUSHROOM_STEW;
  public static final Item GOLDEN_STEAK;
  // MATERIALS
  public static final Item AMETHYST;
  public static final Item RUBY;
  public static final Item TIGERS_EYE;
  public static final Item TITANIUM_INGOT;
  public static final Item TITANIUM_NUGGET;
  public static final Item URANIUM_INGOT;
  public static final Item URANIUM_NUGGET;
  public static final Item ALUMINIUM_INGOT;
  public static final Item ALUMINIUM_NUGGET;
  public static final Item COPPER_LUMP;
  public static final Item TIN_LUMP;
  public static final Item SILVER_LUMP;
  public static final Item PLATINUM_LUMP;
  public static final Item PINK_TOURMALINE_INGOT;
  public static final Item PINK_TOURMALINE_NUGGET;
  public static final Item CATS_EYE_INGOT;
  public static final Item CATS_EYE_NUGGET;
  public static final Item SUNSTONE;
  public static final Item BLOODSTONE;
  public static final Item DEAD_STINK_BUG;
  public static final Item ENDER_DRAGON_SCALE;
  public static final Item TRIFFID_GOO;
  public static final Item MOTH_SCALE;
  public static final Item VORTEX_EYE;
  public static final Item NIGHTMARE_SCALE;
  public static final Item WATER_DRAGON_SCALE;
  public static final Item QUEEN_SCALE;
  public static final Item BIG_BERTHA_BLADE;
  public static final Item BIG_BERTHA_GUARD;
  public static final Item BIG_BERTHA_HANDLE;

  public static final Item DRUID_KEY;
  public static final Item SALT;
  // TOOLS
  public static final ToolItem ULTIMATE_SWORD;
  public static final ToolItem ULTIMATE_SHOVEL;
  public static final ToolItem ULTIMATE_PICKAXE;
  public static final ToolItem ULTIMATE_AXE;
  public static final ToolItem ULTIMATE_HOE;
  public static final ToolItem EMERALD_SWORD;
  public static final ToolItem EMERALD_SHOVEL;
  public static final ToolItem EMERALD_PICKAXE;
  public static final ToolItem EMERALD_AXE;
  public static final ToolItem EMERALD_HOE;
  public static final ToolItem RUBY_SWORD;
  public static final ToolItem RUBY_SHOVEL;
  public static final ToolItem RUBY_PICKAXE;
  public static final ToolItem RUBY_AXE;
  public static final ToolItem RUBY_HOE;
  public static final ToolItem AMETHYST_SWORD;
  public static final ToolItem AMETHYST_SHOVEL;
  public static final ToolItem AMETHYST_PICKAXE;
  public static final ToolItem AMETHYST_AXE;
  public static final ToolItem AMETHYST_HOE;
  public static final ToolItem TIGERS_EYE_SWORD;
  public static final ToolItem TIGERS_EYE_SHOVEL;
  public static final ToolItem TIGERS_EYE_PICKAXE;
  public static final ToolItem TIGERS_EYE_AXE;
  public static final ToolItem TIGERS_EYE_HOE;
  public static final ToolItem EXPERIENCE_SWORD;
  // MISC.TOOLS
  public static final ToolItem NIGHTMARE_SWORD;
  // ARMOR
  public static final Item ULTIMATE_HELMET;
  public static final Item ULTIMATE_CHESTPLATE;
  public static final Item ULTIMATE_LEGGINGS;
  public static final Item ULTIMATE_BOOTS;
  public static final Item EMERALD_HELMET;
  public static final Item EMERALD_CHESTPLATE;
  public static final Item EMERALD_LEGGINGS;
  public static final Item EMERALD_BOOTS;
  public static final Item RUBY_HELMET;
  public static final Item RUBY_CHESTPLATE;
  public static final Item RUBY_LEGGINGS;
  public static final Item RUBY_BOOTS;
  public static final Item AMETHYST_HELMET;
  public static final Item AMETHYST_CHESTPLATE;
  public static final Item AMETHYST_LEGGINGS;
  public static final Item AMETHYST_BOOTS;
  public static final Item TIGERS_EYE_HELMET;
  public static final Item TIGERS_EYE_CHESTPLATE;
  public static final Item TIGERS_EYE_LEGGINGS;
  public static final Item TIGERS_EYE_BOOTS;
  public static final Item EXPERIENCE_HELMET;
  public static final Item EXPERIENCE_CHESTPLATE;
  public static final Item EXPERIENCE_LEGGINGS;
  public static final Item EXPERIENCE_BOOTS;
  public static final Item LAVA_EEL_HELMET;
  public static final Item LAVA_EEL_CHESTPLATE;
  public static final Item LAVA_EEL_LEGGINGS;
  public static final Item LAVA_EEL_BOOTS;
  public static final Item LAPIS_LAZULI_HELMET;
  public static final Item LAPIS_LAZULI_CHESTPLATE;
  public static final Item LAPIS_LAZULI_LEGGINGS;
  public static final Item LAPIS_LAZULI_BOOTS;
  // SPAWNEGGS
  public static final Item ENT_EGG;
  public static final Item RED_ANT_EGG;
  public static final Item BROWN_ANT_EGG;
  public static final Item RAINBOW_ANT_EGG;
  public static final Item UNSTABLE_ANT_EGG;
  public static final Item TERMITE_EGG;
  public static final Item HERCULES_BEETLE_EGG;
  public static final Item RUBY_BUG_EGG;
  public static final Item EMERALD_GATOR_EGG;
  public static final Item ROBO_SNIPER_EGG;
  public static final Item BEAVER_EGG;
  public static final Item APPLE_COW_EGG;
  public static final Item GOLDEN_APPLE_COW_EGG;
  public static final Item IRON_GOLEM_EGG;
  public static final Item SNOW_GOLEM_EGG;

  static {
    // FOOD
    RAW_CORNDOG = registerFood("corndog", FoodComponents.RAW_CORNDOG);
    COOKED_CORNDOG = registerFood("cooked_corndog", FoodComponents.COOKED_CORNDOG);
    RAW_BACON = registerFood("bacon", FoodComponents.RAW_BACON);
    COOKED_BACON = registerFood("cooked_bacon", FoodComponents.COOKED_BACON);
    CORN = registerFood("corn", FoodComponents.CORN);
    TOMATO = registerFood("tomato", FoodComponents.TOMATO);
    LETTUCE = registerFood("lettuce", FoodComponents.LETTUCE);
    CHEESE = registerFood("cheese", FoodComponents.CHEESE);
    GARDEN_SALAD = registerFood("garden_salad", FoodComponents.GARDEN_SALAD);
    BLT = registerFood("blt", FoodComponents.BLT);
    STRAWBERRY = registerFood("strawberry", FoodComponents.STRAWBERRY);
    RADISH = registerFood("radish", FoodComponents.RADISH);
    RADISH_STEW = registerFood("radish_stew", FoodComponents.RADISH_STEW);
    CHERRIES = registerFood("cherries", FoodComponents.CHERRIES);
    SPARK_FISH = registerFood("spark_fish", FoodComponents.SPARK_FISH);
    LAVA_EEL = registerFood("lava_eel", FoodComponents.LAVA_EEL);
    CRAB_MEAT = registerFood("crab_meat", FoodComponents.CRAB_MEAT);
    COOKED_CRAB_MEAT = registerFood("cooked_crab_meat", FoodComponents.COOKED_CRAB_MEAT);
    SEAFOOD_PATTY = registerFood("seafood_patty", FoodComponents.SEAFOOD_PATTY);
    PEACH = registerFood("peach", FoodComponents.PEACH);
    PEACOCK_LEG = registerFood("peacock_leg", FoodComponents.PEACOCK_LEG);
    COOKED_PEACOCK_LEG = registerFood("cooked_peacock_leg", FoodComponents.COOKED_PEACOCK_LEG);
    BUTTER = register("butter");
    SALT = register("salt");

    // Golden Food
    GOLDEN_BREAD = registerFood("golden_bread", FoodComponents.SHINY_BREAD);
    GOLDEN_CHICKEN = registerFood("golden_chicken", FoodComponents.SHINY_CHICKEN);
    GOLDEN_TROPICAL_FISH = registerFood("golden_tropical_fish", FoodComponents.SHINY_TROPICAL_FISH);
    GOLDEN_COD = registerFood("golden_cod", FoodComponents.SHINY_COD);
    GOLDEN_PORKCHOP = registerFood("golden_porkchop", FoodComponents.SHINY_PORKCHOP);
    GOLDEN_MELON_SLICE = registerFood("golden_melon_slice", FoodComponents.SHINY_MELON_SLICE);
    GOLDEN_MUSHROOM_STEW = registerFood("golden_mushroom_stew", FoodComponents.SHINY_MUSHROOM_STEW);
    GOLDEN_STEAK = registerFood("golden_steak", FoodComponents.SHINY_STEAK);


    /*
      MINERALS
     */
    AMETHYST = register("amethyst");
    RUBY = register("ruby");
    TIGERS_EYE = register("tigers_eye");
    TITANIUM_INGOT = register("titanium_ingot");
    TITANIUM_NUGGET = register("titanium_nugget");
    URANIUM_INGOT = register("uranium_ingot");
    URANIUM_NUGGET = register("uranium_nugget");
    ALUMINIUM_INGOT = register("aluminum_ingot");
    ALUMINIUM_NUGGET = register("aluminum_nugget");

    COPPER_LUMP = register("copper_lump");
    TIN_LUMP = register("tin_lump");
    SILVER_LUMP = register("silver_lump");
    PLATINUM_LUMP = register("platinum_lump");
    PINK_TOURMALINE_INGOT = register("pink_tourmaline_ingot");
    PINK_TOURMALINE_NUGGET = register("pink_tourmaline_nugget");
    CATS_EYE_INGOT = register("cats_eye_ingot");
    CATS_EYE_NUGGET = register("cats_eye_nugget");
    SUNSTONE = register("sunstone");
    BLOODSTONE = register("bloodstone");
    DEAD_STINK_BUG = register("dead_stink_bug");
    ENDER_DRAGON_SCALE = register("ender_dragon_scale");
    TRIFFID_GOO = register("triffid_goo");
    MOTH_SCALE = register("moth_scale");
    VORTEX_EYE = register("vortex_eye");
    NIGHTMARE_SCALE = register("nightmare_scale");
    WATER_DRAGON_SCALE = register("water_dragon_scale");
    QUEEN_SCALE = register("queen_scale");
    BIG_BERTHA_BLADE = register("big_bertha_blade");
    BIG_BERTHA_GUARD = register("big_bertha_guard");
    BIG_BERTHA_HANDLE = register("big_bertha_handle");

    DRUID_KEY = register("druid_key");

    /*
      TOOLS
     */
    // Ultimate
    ULTIMATE_SWORD = registerSword("ultimate_sword", ULTIMATE_TOOL_MATERIAL,
        config.ultimate.swordDamage, config.ultimate.swordAttackSpeed);
    ULTIMATE_SHOVEL = registerShovel("ultimate_shovel", ULTIMATE_TOOL_MATERIAL,
        config.ultimate.shovelDamage, config.ultimate.shovelAttackSpeed);
    ULTIMATE_PICKAXE = registerPickaxe("ultimate_pickaxe", ULTIMATE_TOOL_MATERIAL,
        config.ultimate.pickaxeDamage, config.ultimate.pickaxeAttackSpeed);
    ULTIMATE_AXE = registerAxe("ultimate_axe", ULTIMATE_TOOL_MATERIAL, config.ultimate.axeDamage,
        config.ultimate.axeAttackSpeed);
    ULTIMATE_HOE = registerHoe("ultimate_hoe", ULTIMATE_TOOL_MATERIAL, config.ultimate.hoeDamage,
        config.ultimate.hoeAttackSpeed);

    // Emerald
    EMERALD_SWORD = registerSword("emerald_sword", EMERALD_TOOL_MATERIAL,
        config.emerald.swordDamage, config.emerald.swordAttackSpeed);
    EMERALD_SHOVEL = registerShovel("emerald_shovel", EMERALD_TOOL_MATERIAL,
        config.emerald.shovelDamage, config.emerald.shovelAttackSpeed);
    EMERALD_PICKAXE = registerPickaxe("emerald_pickaxe", EMERALD_TOOL_MATERIAL,
        config.emerald.pickaxeDamage, config.emerald.pickaxeAttackSpeed);
    EMERALD_AXE = registerAxe("emerald_axe", EMERALD_TOOL_MATERIAL, config.emerald.axeDamage,
        config.emerald.axeAttackSpeed);
    EMERALD_HOE = registerHoe("emerald_hoe", EMERALD_TOOL_MATERIAL, config.emerald.hoeDamage,
        config.emerald.hoeAttackSpeed);

    // Ruby
    RUBY_SWORD = registerSword("ruby_sword", RUBY_TOOL_MATERIAL, config.ruby.swordDamage,
        config.ruby.swordAttackSpeed);
    RUBY_SHOVEL = registerShovel("ruby_shovel", RUBY_TOOL_MATERIAL, config.ruby.shovelDamage,
        config.ruby.shovelAttackSpeed);
    RUBY_PICKAXE = registerPickaxe("ruby_pickaxe", RUBY_TOOL_MATERIAL, config.ruby.pickaxeDamage,
        config.ruby.pickaxeAttackSpeed);
    RUBY_AXE = registerAxe("ruby_axe", RUBY_TOOL_MATERIAL, config.ruby.axeDamage,
        config.ruby.axeAttackSpeed);
    RUBY_HOE = registerHoe("ruby_hoe", RUBY_TOOL_MATERIAL, config.ruby.hoeDamage,
        config.ruby.hoeAttackSpeed);

    // Amethyst
    AMETHYST_SWORD = registerSword("amethyst_sword", AMETHYST_TOOL_MATERIAL,
        config.amethyst.swordDamage, config.amethyst.swordAttackSpeed);
    AMETHYST_SHOVEL = registerShovel("amethyst_shovel", AMETHYST_TOOL_MATERIAL,
        config.amethyst.shovelDamage, config.amethyst.shovelAttackSpeed);
    AMETHYST_PICKAXE = registerPickaxe("amethyst_pickaxe", AMETHYST_TOOL_MATERIAL,
        config.amethyst.pickaxeDamage, config.amethyst.pickaxeAttackSpeed);
    AMETHYST_AXE = registerAxe("amethyst_axe", AMETHYST_TOOL_MATERIAL, config.amethyst.axeDamage,
        config.amethyst.axeAttackSpeed);
    AMETHYST_HOE = registerHoe("amethyst_hoe", AMETHYST_TOOL_MATERIAL, config.amethyst.hoeDamage,
        config.amethyst.hoeAttackSpeed);

    // Tigers_eye
    TIGERS_EYE_SWORD = registerSword("tigers_eye_sword", TIGERS_EYE_TOOL_MATERIAL,
        config.tigersEye.swordDamage, config.tigersEye.swordAttackSpeed);
    TIGERS_EYE_SHOVEL = registerShovel("tigers_eye_shovel", TIGERS_EYE_TOOL_MATERIAL,
        config.tigersEye.shovelDamage, config.tigersEye.shovelAttackSpeed);
    TIGERS_EYE_PICKAXE = registerPickaxe("tigers_eye_pickaxe", TIGERS_EYE_TOOL_MATERIAL,
        config.tigersEye.pickaxeDamage, config.tigersEye.pickaxeAttackSpeed);
    TIGERS_EYE_AXE = registerAxe("tigers_eye_axe", TIGERS_EYE_TOOL_MATERIAL,
        config.tigersEye.axeDamage, config.tigersEye.axeAttackSpeed);
    TIGERS_EYE_HOE = registerHoe("tigers_eye_hoe", TIGERS_EYE_TOOL_MATERIAL,
        config.tigersEye.hoeDamage, config.tigersEye.hoeAttackSpeed);

    // Experience
    EXPERIENCE_SWORD = registerSword("experience_sword", GENERIC_WEAPON_TOOL_MATERIAL,
        config.miscWeapons.experienceSwordDamage, config.miscWeapons.swordAttackSpeed);

    // Misc.Weapons
    NIGHTMARE_SWORD = registerSword("nightmare_sword", NIGHTMARE_TOOL_MATERIAL,
        config.miscWeapons.nightmareSwordDamage, config.miscWeapons.swordAttackSpeed);

    /*
      ARMOR
     */
    // Ultimate
    ULTIMATE_HELMET = register("ultimate_helmet", ULTIMATE_ARMOR_MATERIAL, EquipmentSlot.HEAD);
    ULTIMATE_CHESTPLATE = register("ultimate_chestplate", ULTIMATE_ARMOR_MATERIAL,
        EquipmentSlot.CHEST);
    ULTIMATE_LEGGINGS = register("ultimate_leggings", ULTIMATE_ARMOR_MATERIAL, EquipmentSlot.LEGS);
    ULTIMATE_BOOTS = register("ultimate_boots", ULTIMATE_ARMOR_MATERIAL, EquipmentSlot.FEET);

    // Emerald
    EMERALD_HELMET = register("emerald_helmet", EMERALD_ARMOR_MATERIAL, EquipmentSlot.HEAD);
    EMERALD_CHESTPLATE = register("emerald_chestplate", EMERALD_ARMOR_MATERIAL,
        EquipmentSlot.CHEST);
    EMERALD_LEGGINGS = register("emerald_leggings", EMERALD_ARMOR_MATERIAL, EquipmentSlot.LEGS);
    EMERALD_BOOTS = register("emerald_boots", EMERALD_ARMOR_MATERIAL, EquipmentSlot.FEET);

    // Ruby
    RUBY_HELMET = register("ruby_helmet", RUBY_ARMOR_MATERIAL, EquipmentSlot.HEAD);
    RUBY_CHESTPLATE = register("ruby_chestplate", RUBY_ARMOR_MATERIAL, EquipmentSlot.CHEST);
    RUBY_LEGGINGS = register("ruby_leggings", RUBY_ARMOR_MATERIAL, EquipmentSlot.LEGS);
    RUBY_BOOTS = register("ruby_boots", RUBY_ARMOR_MATERIAL, EquipmentSlot.FEET);

    // Amethyst
    AMETHYST_HELMET = register("amethyst_helmet", AMETHYST_ARMOR_MATERIAL, EquipmentSlot.HEAD);
    AMETHYST_CHESTPLATE = register("amethyst_chestplate", AMETHYST_ARMOR_MATERIAL,
        EquipmentSlot.CHEST);
    AMETHYST_LEGGINGS = register("amethyst_leggings", AMETHYST_ARMOR_MATERIAL, EquipmentSlot.LEGS);
    AMETHYST_BOOTS = register("amethyst_boots", AMETHYST_ARMOR_MATERIAL, EquipmentSlot.FEET);

    // Tigers_eye
    TIGERS_EYE_HELMET = register("tigers_eye_helmet", TIGERS_EYE_ARMOR_MATERIAL,
        EquipmentSlot.HEAD);
    TIGERS_EYE_CHESTPLATE = register("tigers_eye_chestplate", TIGERS_EYE_ARMOR_MATERIAL,
        EquipmentSlot.CHEST);
    TIGERS_EYE_LEGGINGS = register("tigers_eye_leggings", TIGERS_EYE_ARMOR_MATERIAL,
        EquipmentSlot.LEGS);
    TIGERS_EYE_BOOTS = register("tigers_eye_boots", TIGERS_EYE_ARMOR_MATERIAL, EquipmentSlot.FEET);

    // Experience
    EXPERIENCE_HELMET = register("experience_helmet", EXPERIENCE_ARMOR_MATERIAL,
        EquipmentSlot.HEAD);
    EXPERIENCE_CHESTPLATE = register("experience_chestplate", EXPERIENCE_ARMOR_MATERIAL,
        EquipmentSlot.CHEST);
    EXPERIENCE_LEGGINGS = register("experience_leggings", EXPERIENCE_ARMOR_MATERIAL,
        EquipmentSlot.LEGS);
    EXPERIENCE_BOOTS = register("experience_boots", EXPERIENCE_ARMOR_MATERIAL, EquipmentSlot.FEET);

    // Lava Eel
    LAVA_EEL_HELMET = register("lava_eel_helmet", LAVA_EEL_ARMOR_MATERIAL, EquipmentSlot.HEAD);
    LAVA_EEL_CHESTPLATE = register("lava_eel_chestplate", LAVA_EEL_ARMOR_MATERIAL,
        EquipmentSlot.CHEST);
    LAVA_EEL_LEGGINGS = register("lava_eel_leggings", LAVA_EEL_ARMOR_MATERIAL, EquipmentSlot.LEGS);
    LAVA_EEL_BOOTS = register("lava_eel_boots", LAVA_EEL_ARMOR_MATERIAL, EquipmentSlot.FEET);

    // Lapis
    LAPIS_LAZULI_HELMET = register("lapis_helmet", LAPIS_LAZULI_ARMOR_MATERIAL, EquipmentSlot.HEAD);
    LAPIS_LAZULI_CHESTPLATE = register("lapis_chestplate", LAPIS_LAZULI_ARMOR_MATERIAL,
        EquipmentSlot.CHEST);
    LAPIS_LAZULI_LEGGINGS = register("lapis_leggings", LAPIS_LAZULI_ARMOR_MATERIAL,
        EquipmentSlot.LEGS);
    LAPIS_LAZULI_BOOTS = register("lapis_boots", LAPIS_LAZULI_ARMOR_MATERIAL, EquipmentSlot.FEET);

    /*
      Spawn eggs
     */
    ENT_EGG = registerSpawnEgg("ent_spawn_egg", Entities.ENT);
    RED_ANT_EGG = registerSpawnEgg("red_ant_egg", Entities.ENT);
    BROWN_ANT_EGG = registerSpawnEgg("brown_ant_egg", Entities.ENT);
    RAINBOW_ANT_EGG = registerSpawnEgg("rainbow_ant_egg", Entities.ENT);
    UNSTABLE_ANT_EGG = registerSpawnEgg("unstable_ant_egg", Entities.ENT);
    TERMITE_EGG = registerSpawnEgg("termite_egg", Entities.ENT);
    HERCULES_BEETLE_EGG = registerSpawnEgg("hercules_beetle_egg", Entities.ENT);
    RUBY_BUG_EGG = registerSpawnEgg("ruby_bug_egg", Entities.ENT);
    EMERALD_GATOR_EGG = registerSpawnEgg("emerald_gator_egg", Entities.ENT);
    ROBO_SNIPER_EGG = registerSpawnEgg("robo_sniper_egg", Entities.ENT);
    BEAVER_EGG = registerSpawnEgg("beaver_egg", Entities.ENT);
    APPLE_COW_EGG = registerSpawnEgg("apple_cow_egg", Entities.ENT);
    GOLDEN_APPLE_COW_EGG = registerSpawnEgg("golden_apple_cow_egg", Entities.ENT);
    IRON_GOLEM_EGG = registerSpawnEgg("iron_golem_egg", EntityType.IRON_GOLEM, 0xe2dbd6, 0x74a332);
    SNOW_GOLEM_EGG = registerSpawnEgg("snow_golem_egg", EntityType.SNOW_GOLEM, 0xffffff, 0xe38a1d);
  }

  public static ArmorItem register(String identifier, ArmorMaterial armorMaterial,
      EquipmentSlot equipmentSlot) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new ArmorItem(armorMaterial, equipmentSlot,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
  }

  public static HoeItem registerHoe(String identifier, ToolMaterial toolMaterial, float damage,
      float attackSpeed) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new GenericHoeItem(toolMaterial, (int) damage, (float) attackSpeed,
            new FabricItemSettings().group(ItemGroup.TOOLS)));
  }

  public static AxeItem registerAxe(String identifier, ToolMaterial toolMaterial, float damage,
      float attackSpeed) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new GenericAxeItem(toolMaterial, (float) damage, (float) attackSpeed,
            new FabricItemSettings().group(ItemGroup.TOOLS)));
  }

  public static PickaxeItem registerPickaxe(String identifier, ToolMaterial toolMaterial,
      float damage, float attackSpeed) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new GenericPickaxeItem(toolMaterial, (int) damage, (float) attackSpeed,
            new FabricItemSettings().group(ItemGroup.TOOLS)));
  }

  public static ShovelItem registerShovel(String identifier, ToolMaterial toolMaterial,
      float damage, float attackSpeed) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new ShovelItem(toolMaterial, (float) damage, (float) attackSpeed,
            new FabricItemSettings().group(ItemGroup.TOOLS)));
  }

  public static SwordItem registerSword(String identifier, ToolMaterial toolMaterial, float damage,
      float attackSpeed) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new SwordItem(toolMaterial, (int) damage, attackSpeed,
            new FabricItemSettings().group(ItemGroup.COMBAT)));
  }

  public static Item registerFood(String identifier, FoodComponent foodComponent) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(foodComponent)));
  }

  public static SpawnEggItem registerSpawnEgg(String identifier, EntityType entityType,
      int primaryColor, int secondaryColor) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new SpawnEggItem(entityType, primaryColor, secondaryColor,
            new FabricItemSettings().group(ItemGroup.MISC)));
  }

  public static SpawnEggItem registerSpawnEgg(String identifier, EntityType entityType) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new SpawnEggItem(entityType, 0, 0, new FabricItemSettings().group(ItemGroup.MISC)));
  }

  public static Item register(String identifier, Item.Settings settings) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new Item(settings));
  }

  public static Item register(String identifier) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier),
        new Item(new FabricItemSettings().group(ItemGroup.MISC)));
  }

  public static Item register(String identifier, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(ChaosAwakens.modID, identifier), item);
  }

  @Override
  public void onInitialize() {
  }
}