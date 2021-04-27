package io.github.chaosawakens;

import java.util.ArrayList;
import java.util.List;

import io.github.chaosawakens.equipment.GenericArmor;
import io.github.chaosawakens.equipment.GenericAxe;
import io.github.chaosawakens.equipment.GenericHoe;
import io.github.chaosawakens.equipment.GenericPickaxe;
import io.github.chaosawakens.equipment.GenericShovel;
import io.github.chaosawakens.equipment.GenericSword;
import io.github.chaosawakens.items.GenericItem;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemShield;
import net.minecraft.util.datafix.fixes.SpawnEggNames;

/**
 * Class for item creation, such that the main class is not unreadable
 * @author invalid2
 */
public class ModItems
{
	
	/**
	 * List holding ALL mod items
	 */
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Misc items
	public static final Item AMETHYST = new GenericItem("amethyst"); 
	public static final Item RUBY = new GenericItem("ruby");
	public static final Item TIGERS_EYE = new GenericItem("tigers_eye");
	public static final Item TITANIUM_INGOT = new GenericItem("titanium_ingot");
	public static final Item TITANIUM_NUGGET = new GenericItem("titanium_nugget");
	public static final Item URANIUM_INGOT = new GenericItem("uranium_ingot");
	public static final Item URANIUM_NUGGET = new GenericItem("uranium_nugget");
	public static final Item ALUMINUM = new GenericItem("aluminum_ingot");
	public static final Item DRUID_KEY = new GenericItem("druid_key", 1);
	public static final Item BIG_BERTHA_BLADE = new GenericItem("big_bertha_blade", 1);
	public static final Item BIG_BERTHA_GUARD = new GenericItem("big_bertha_guard", 1);
	public static final Item BIG_BERTHA_HANDLE = new GenericItem("big_bertha_handle", 1);
	
	//public static final Item Oil = new Oil("Oil");
	//public static final Item Salt = new Salt("Salt"); //Ant Functionality Delayed
	
	/**
	 * Equipment
	 */
	
	/*
	 * Tools
	 */
	
	//Misc weapons
	public static final Item FAIRY_SWORD = new GenericSword("fairy_sword", ToolMaterials.FAIRY.getToolMaterial());
	public static final Item NIGHTMARE_SWORD = new GenericSword("nightmare_sword", ToolMaterials.NIGHTMARE.getToolMaterial());
	public static final Item POISON_SWORD = new GenericSword("poison_sword", ToolMaterials.POISON.getToolMaterial());
	public static final Item BIG_HAMMER = new GenericAxe("big_hammer", ToolMaterials.BIG_HAMMER.getToolMaterial());
	public static final Item BATTLE_AXE = new GenericAxe("battle_axe", ToolMaterials.BATTLE_AXE.getToolMaterial());
	public static final Item QUEEN_SCALE_BATTLE_AXE = new GenericAxe("queen_battle_axe", ToolMaterials.QUEEN_SCALE.getToolMaterial());
	public static final Item RAT_SWORD = new GenericSword("rat_sword", ToolMaterials.RAT.getToolMaterial());
	//public static final Item RAY_GUN = new GenericPickaxe("ray_gun", ToolMaterials.RAT.getToolMaterial());
	public static final Item BIG_BERTHA = new GenericSword("big_bertha", ToolMaterials.BIG_BERTHA.getToolMaterial());
	//public static final Item THUNDER_STAFF = new GenericSword("thunder_staff", ToolMaterials.EMERALD.getToolMaterial());
	public static final Item ROYAL_GUARDIAN_SWORD = new GenericSword("royal_guardian_sword", ToolMaterials.ROYAL_GUARDIAN.getToolMaterial());
	
	//Emerald stuff
	public static final Item EMERALD_SWORD = new GenericSword("emerald_sword", ToolMaterials.EMERALD.getToolMaterial());
	public static final Item EMERALD_PICKAXE = new GenericPickaxe("emerald_pickaxe", ToolMaterials.EMERALD.getToolMaterial());
	public static final Item EMERALD_AXE = new GenericAxe("emerald_axe", ToolMaterials.EMERALD.getToolMaterial());
	public static final Item EMERALD_SHOVEL = new GenericShovel("emerald_shovel", ToolMaterials.EMERALD.getToolMaterial());
	public static final Item EMERALD_HOE = new GenericHoe("emerald_hoe", ToolMaterials.EMERALD.getToolMaterial());
	
	//Amethyst Eye stuff
	public static final Item AMETHYST_SWORD = new GenericSword("amethyst_sword", ToolMaterials.AMETHYST.getToolMaterial());
	public static final Item AMETHYST_PICKAXE = new GenericPickaxe("amethyst_pickaxe", ToolMaterials.AMETHYST.getToolMaterial());
	public static final Item AMETHYST_AXE = new GenericAxe("amethyst_axe", ToolMaterials.AMETHYST.getToolMaterial());
	public static final Item AMETHYST_SHOVEL = new GenericShovel("amethyst_shovel", ToolMaterials.AMETHYST.getToolMaterial());
	public static final Item AMETHYST_HOE = new GenericHoe("amethyst_hoe", ToolMaterials.AMETHYST.getToolMaterial());
	
	//Tiger's Eye stuff
	public static final Item TIGERS_EYE_SWORD = new GenericSword("tigers_eye_sword", ToolMaterials.TIGERS_EYE.getToolMaterial());
	public static final Item TIGERS_EYE_PICKAXE = new GenericPickaxe("tigers_eye_pickaxe", ToolMaterials.TIGERS_EYE.getToolMaterial());
	public static final Item TIGERS_EYE_AXE = new GenericAxe("tigers_eye_axe", ToolMaterials.TIGERS_EYE.getToolMaterial());
	public static final Item TIGERS_EYE_SHOVEL = new GenericShovel("tigers_eye_shovel", ToolMaterials.TIGERS_EYE.getToolMaterial());
	public static final Item TIGERS_EYE_HOE = new GenericHoe("tigers_eye_hoe", ToolMaterials.TIGERS_EYE.getToolMaterial());
	
	//Ruby stuff
	public static final Item RUBY_SWORD = new GenericSword("ruby_sword", ToolMaterials.RUBY.getToolMaterial());
	public static final Item RUBY_PICKAXE = new GenericPickaxe("ruby_pickaxe", ToolMaterials.RUBY.getToolMaterial());
	public static final Item RUBY_AXE = new GenericAxe("ruby_axe", ToolMaterials.RUBY.getToolMaterial());
	public static final Item RUBY_SHOVEL = new GenericShovel("ruby_shovel", ToolMaterials.RUBY.getToolMaterial());
	public static final Item RUBY_HOE = new GenericHoe("ruby_hoe", ToolMaterials.RUBY.getToolMaterial());
	
	//Experience stuff
	public static final Item EXPERIENCE_SWORD = new GenericSword("experience_sword", ToolMaterials.RUBY.getToolMaterial());
	public static final Item EXPERIENCE_PICKAXE = new GenericPickaxe("experience_pickaxe", ToolMaterials.RUBY.getToolMaterial());
	public static final Item EXPERIENCE_AXE = new GenericAxe("experience_axe", ToolMaterials.RUBY.getToolMaterial());
	public static final Item EXPERIENCE_SHOVEL = new GenericShovel("experience_shovel", ToolMaterials.RUBY.getToolMaterial());
	public static final Item EXPERIENCE_HOE = new GenericHoe("experience_hoe", ToolMaterials.RUBY.getToolMaterial());
	
	//Optimised stuff
	public static final Item OPTIMISED_MINERS_PICKAXE = new GenericPickaxe("optimised_miners_pickaxe", ToolMaterials.OPTIMISED.getToolMaterial());
	public static final Item OPTIMISED_TRENCH_DIGGERS_SHOVEL = new GenericShovel("optimised_trench_diggers_shovel", ToolMaterials.OPTIMISED.getToolMaterial());
	
	//Ultimate stuff
	public static final Item ULTIMATE_SWORD = new GenericSword("ultimate_sword", ToolMaterials.RUBY.getToolMaterial());
	public static final Item ULTIMATE_PICKAXE = new GenericPickaxe("ultimate_pickaxe", ToolMaterials.RUBY.getToolMaterial());
	public static final Item ULTIMATE_AXE = new GenericAxe("ultimate_axe", ToolMaterials.RUBY.getToolMaterial());
	public static final Item ULTIMATE_SHOVEL = new GenericShovel("ultimate_shovel", ToolMaterials.RUBY.getToolMaterial());
	public static final Item ULTIMATE_HOE = new GenericHoe("ultimate_hoe", ToolMaterials.RUBY.getToolMaterial());
	
	/*
	 * Armors
	 */
	
	//Emerald set
	public static final ItemArmor EMERALD_HELMET = new GenericArmor("emerald_helmet", ArmorMaterials.EMERALD.getArmorMaterial(), 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor EMERALD_CHESTPLATE = new GenericArmor("emerald_chestplate", ArmorMaterials.EMERALD.getArmorMaterial(), 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor EMERALD_LEGGINGS = new GenericArmor("emerald_leggings", ArmorMaterials.EMERALD.getArmorMaterial(), 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor EMERALD_BOOTS = new GenericArmor("emerald_boots", ArmorMaterials.EMERALD.getArmorMaterial(), 1, EntityEquipmentSlot.FEET);
	
	//Amethyst set
	public static final ItemArmor AMETHYST_HELMET = new GenericArmor("amethyst_helmet", ArmorMaterials.AMETHYST.getArmorMaterial(), 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor AMETHYST_CHESTPLATE = new GenericArmor("amethyst_chestplate", ArmorMaterials.AMETHYST.getArmorMaterial(), 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor AMETHYST_LEGGINGS = new GenericArmor("amethyst_leggings", ArmorMaterials.AMETHYST.getArmorMaterial(), 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor AMETHYST_BOOTS = new GenericArmor("amethyst_boots", ArmorMaterials.AMETHYST.getArmorMaterial(), 1, EntityEquipmentSlot.FEET);
	
	//Tiger's Eye set
	public static final ItemArmor TIGEREYE_HELMET = new GenericArmor("tigers_eye_helmet", ArmorMaterials.TIGERS_EYE.getArmorMaterial(), 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor TIGEREYE_CHESTPLATE = new GenericArmor("tigers_eye_chestplate", ArmorMaterials.TIGERS_EYE.getArmorMaterial(), 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor TIGEREYE_LEGGINGS = new GenericArmor("tigers_eye_leggings", ArmorMaterials.TIGERS_EYE.getArmorMaterial(), 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor TIGEREYE_BOOTS = new GenericArmor("tigers_eye_boots", ArmorMaterials.TIGERS_EYE.getArmorMaterial(), 1, EntityEquipmentSlot.FEET);
	
	//Ruby set
	public static final ItemArmor RUBY_HELMET = new GenericArmor("ruby_helmet", ArmorMaterials.RUBY.getArmorMaterial(), 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor RUBY_CHESTPLATE = new GenericArmor("ruby_chestplate", ArmorMaterials.RUBY.getArmorMaterial(), 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor RUBY_LEGGINGS = new GenericArmor("ruby_leggings", ArmorMaterials.RUBY.getArmorMaterial(), 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor RUBY_BOOTS = new GenericArmor("ruby_boots", ArmorMaterials.RUBY.getArmorMaterial(), 1, EntityEquipmentSlot.FEET);
	
	//Experience set
	public static final ItemArmor EXPERIENCE_HELMET = new GenericArmor("experience_helmet", ArmorMaterials.EXPERIENCE.getArmorMaterial(), 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor EXPERIENCE_CHESTPLATE = new GenericArmor("experience_chestplate", ArmorMaterials.EXPERIENCE.getArmorMaterial(), 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor EXPERIENCE_LEGGINGS = new GenericArmor("experience_leggings", ArmorMaterials.EXPERIENCE.getArmorMaterial(), 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor EXPERIENCE_BOOTS = new GenericArmor("experience_boots", ArmorMaterials.EXPERIENCE.getArmorMaterial(), 1, EntityEquipmentSlot.FEET);
	
	//Ultimate set
	public static final ItemArmor ULTIMATE_HELMET = new GenericArmor("ultimate_helmet", ArmorMaterials.ULTIMATE.getArmorMaterial(), 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor ULTIMATE_CHESTPLATE = new GenericArmor("ultimate_chestplate", ArmorMaterials.ULTIMATE.getArmorMaterial(), 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor ULTIMATE_LEGGINGS = new GenericArmor("ultimate_leggings", ArmorMaterials.ULTIMATE.getArmorMaterial(), 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor ULTIMATE_BOOTS = new GenericArmor("ultimate_boots", ArmorMaterials.ULTIMATE.getArmorMaterial(), 1, EntityEquipmentSlot.FEET);
	
	//Royal Guardian set
	public static final ItemArmor ROYAL_GUARDIAN_HELMET = new GenericArmor("royal_guardian_helmet", ArmorMaterials.ROYAL_GUARDIAN.getArmorMaterial(), 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor ROYAL_GUARDIAN_CHESTPLATE = new GenericArmor("royal_guardian_chestplate", ArmorMaterials.ROYAL_GUARDIAN.getArmorMaterial(), 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor ROYAL_GUARDIAN_LEGGINGS = new GenericArmor("royal_guardian_leggings", ArmorMaterials.ROYAL_GUARDIAN.getArmorMaterial(), 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor ROYAL_GUARDIAN_BOOTS = new GenericArmor("royal_guardian_boots", ArmorMaterials.ROYAL_GUARDIAN.getArmorMaterial(), 1, EntityEquipmentSlot.FEET);
	
	//Queen set
	public static final ItemArmor QUEEN_SCALE_HELMET = new GenericArmor("queen_scale_helmet", ArmorMaterials.QUEEN_SCALE.getArmorMaterial(), 1, EntityEquipmentSlot.HEAD);
	public static final ItemArmor QUEEN_SCALE_CHESTPLATE = new GenericArmor("queen_scale_chestplate", ArmorMaterials.QUEEN_SCALE.getArmorMaterial(), 1, EntityEquipmentSlot.CHEST);
	public static final ItemArmor QUEEN_SCALE_LEGGINGS = new GenericArmor("queen_scale_leggings", ArmorMaterials.QUEEN_SCALE.getArmorMaterial(), 2, EntityEquipmentSlot.LEGS);
	public static final ItemArmor QUEEN_SCALE_BOOTS = new GenericArmor("queen_scale_boots", ArmorMaterials.QUEEN_SCALE.getArmorMaterial(), 1, EntityEquipmentSlot.FEET);
	
	public ModItems() {}
}
