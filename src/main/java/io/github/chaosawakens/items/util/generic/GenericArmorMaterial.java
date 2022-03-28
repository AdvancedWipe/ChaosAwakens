package io.github.chaosawakens.items.util.generic;

import io.github.chaosawakens.items.Items;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class GenericArmorMaterial implements ArmorMaterial {

  private final int[] durability = new int[]{13, 15, 16, 11};
  private final int durabilityMod;
  private final int[] protection;
  private float toughness = 0.0f;
  private final int enchantability;
  private Ingredient repairIngredient;
  private final String name;
  private float knockbackResistance = 0.0f;
  private SoundEvent soundEvent = SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;

  public GenericArmorMaterial(int durabilityMod, int[] protection, int enchantability,
      float toughness, Ingredient repairIngredient, String name) {
    this.durabilityMod = durabilityMod;
    this.protection = protection;
    this.toughness = toughness;
    this.enchantability = enchantability;
    this.repairIngredient = repairIngredient;
    this.name = name;
  }

  public GenericArmorMaterial(int durabilityMod, int[] protection, int enchantability,
      float toughness, Ingredient repairIngredient, String name, float knockbackResistance) {
    this.durabilityMod = durabilityMod;
    this.protection = protection;
    this.toughness = toughness;
    this.enchantability = enchantability;
    this.repairIngredient = repairIngredient;
    this.name = name;
    this.knockbackResistance = knockbackResistance;
  }

  public GenericArmorMaterial(int durabilityMod, int[] protection, int enchantability,
      float toughness, Ingredient repairIngredient, String name, float knockbackResistance,
      SoundEvent soundEvent) {
    this.durabilityMod = durabilityMod;
    this.protection = protection;
    this.toughness = toughness;
    this.enchantability = enchantability;
    this.repairIngredient = repairIngredient;
    this.name = name;
    this.knockbackResistance = knockbackResistance;
    this.soundEvent = soundEvent;
  }

  public GenericArmorMaterial(int durabilityMod, int[] protection, int enchantability,
      float toughness, Ingredient repairIngredient, String name, SoundEvent soundEvent) {
    this.durabilityMod = durabilityMod;
    this.protection = protection;
    this.toughness = toughness;
    this.enchantability = enchantability;
    this.repairIngredient = repairIngredient;
    this.name = name;
    this.soundEvent = soundEvent;
  }

  @Override
  public int getDurability(EquipmentSlot slot) {
    return this.durability[slot.getEntitySlotId()] * durabilityMod;
  }

  @Override
  public int getProtectionAmount(EquipmentSlot slot) {
    return this.protection[slot.getEntitySlotId()];
  }

  @Override
  public int getEnchantability() {
    return this.enchantability;
  }

  @Override
  public SoundEvent getEquipSound() {
    return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return this.repairIngredient;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public float getToughness() {
    return this.toughness;
  }

  @Override
  public float getKnockbackResistance() {
    return this.knockbackResistance;
  }

  public SoundEvent getSoundEvent() {
    return this.soundEvent;
  }
}
