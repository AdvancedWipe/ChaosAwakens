package io.github.chaosawakens.registry;

import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.entity.*;
import io.github.chaosawakens.entity.projectile.UltimateArrowEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.world.gen.Heightmap;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ModEntityTypes {
	
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, ChaosAwakens.MODID);
	
	private static final List<EntityType<?>> ALL = new ArrayList<>();
	// ENTITY TYPES
	// Ent
	public static final RegistryObject<EntityType<EntEntity>> ENT = ENTITY_TYPES.register("ent",
			() -> EntityType.Builder.create(EntEntity::new, EntityClassification.MONSTER)
				.size(2.5f, 3.125f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "ent").toString()));
	
	// Hercules Beetle
	public static final RegistryObject<EntityType<HerculesBeetleEntity>> HERCULES_BEETLE = ENTITY_TYPES.register("hercules_beetle",
			() -> EntityType.Builder.create(HerculesBeetleEntity::new, EntityClassification.MONSTER)
				.size(4.5f, 3.125f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "hercules_beetle").toString()));
	
	// Ruby Bug
	public static final RegistryObject<EntityType<RubyBugEntity>> RUBY_BUG = ENTITY_TYPES.register("ruby_bug",
			() -> EntityType.Builder.create(RubyBugEntity::new, EntityClassification.CREATURE)
				.size(0.5f, 0.5f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "ruby_bug").toString()));
	
	// Apple Cows
	public static final RegistryObject<EntityType<AppleCowEntity>> APPLE_COW = ENTITY_TYPES.register("apple_cow",
			() -> EntityType.Builder.create(AppleCowEntity::new, EntityClassification.CREATURE)
				.size(0.9F, 1.4F)
				.trackingRange(10)// Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "apple_cow").toString()));
	public static final RegistryObject<EntityType<GoldenAppleCowEntity>> GOLDEN_APPLE_COW = ENTITY_TYPES.register("golden_apple_cow",
			() -> EntityType.Builder.create(GoldenAppleCowEntity::new, EntityClassification.CREATURE)
				.size(0.9F, 1.4F)
				.trackingRange(10)// Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "golden_apple_cow").toString()));
	
	// Ants
	public static final RegistryObject<EntityType<BrownAntEntity>> BROWN_ANT = ENTITY_TYPES.register("brown_ant",
			() -> EntityType.Builder.create(BrownAntEntity::new, EntityClassification.CREATURE)
				.size(0.25f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "brown_ant").toString()));
	
	public static final RegistryObject<EntityType<RainbowAntEntity>> RAINBOW_ANT = ENTITY_TYPES.register("rainbow_ant",
			() -> EntityType.Builder.create(RainbowAntEntity::new, EntityClassification.CREATURE)
				.size(0.25f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "rainbow_ant").toString()));
	
	public static final RegistryObject<EntityType<RedAntEntity>> RED_ANT = ENTITY_TYPES.register("red_ant",
			() -> EntityType.Builder.create(RedAntEntity::new, EntityClassification.MONSTER)
				.size(0.25f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "red_ant").toString()));
	public static final RegistryObject<EntityType<UnstableAntEntity>> UNSTABLE_ANT = ENTITY_TYPES.register("unstable_ant",
			() -> EntityType.Builder.create(UnstableAntEntity::new, EntityClassification.CREATURE)
				.size(0.25f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "unstable_ant").toString()));
	
	// Termite
	public static final RegistryObject<EntityType<TermiteEntity>> TERMITE = ENTITY_TYPES.register("termite",
			() -> EntityType.Builder.create(TermiteEntity::new, EntityClassification.CREATURE)
				.size(0.5f, 0.25f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "termite").toString()));
	
	// Beaver
	public static final RegistryObject<EntityType<BeaverEntity>> BEAVER = ENTITY_TYPES.register("beaver",
			() -> EntityType.Builder.create(BeaverEntity::new, EntityClassification.CREATURE)
				.size(0.75f, 0.7f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "beaver").toString()));
	
	// Emerald Gator
	public static final RegistryObject<EntityType<EmeraldGatorEntity>> EMERALD_GATOR = ENTITY_TYPES.register("emerald_gator",
			() -> EntityType.Builder.create(EmeraldGatorEntity::new, EntityClassification.CREATURE)
				.size(1.5f, 1.0f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "emerald_gator").toString()));
	
	// Robo Sniper
	public static final RegistryObject<EntityType<RoboSniperEntity>> ROBO_SNIPER = ENTITY_TYPES.register("robo_sniper",
			() -> EntityType.Builder.create(RoboSniperEntity::new, EntityClassification.MONSTER)
				.size(1.0f, 1.5f) // Hitbox Size ()
				.build(new ResourceLocation(ChaosAwakens.MODID, "robo_sniper").toString()));
	
	// Arrow
	public static final RegistryObject<EntityType<UltimateArrowEntity>> ULTIMATE_ARROW = ENTITY_TYPES.register("ultimate_arrow",
			() -> EntityType.Builder.<UltimateArrowEntity>create(UltimateArrowEntity::new, EntityClassification.MISC)
				.size(0.5F, 0.5F).trackingRange(4).updateInterval(20)
				.build(new ResourceLocation(ChaosAwakens.MODID, "ultimate_arrow").toString()));
	
	//"The method build(ResourceLocation, EntityType.Builder<E>) from the type ModEntityTypes is never used locally", so whats it for ???
	@SuppressWarnings("unchecked")
	private static <E extends Entity> EntityType<E> build(ResourceLocation id, EntityType.Builder<E> builder) {
		boolean cache = SharedConstants.useDatafixers;
		SharedConstants.useDatafixers = false;
		EntityType<E> ret = (EntityType<E>) builder.build(id.toString()).setRegistryName(id);
		SharedConstants.useDatafixers = cache;
		ALL.add(ret);
		return ret;
	}
	
	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> evt) {
		evt.getRegistry().registerAll(ALL.toArray(new EntityType<?>[0]));
		
		EntitySpawnPlacementRegistry.register(ENT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(HERCULES_BEETLE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(RUBY_BUG.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(APPLE_COW.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(GOLDEN_APPLE_COW.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(BROWN_ANT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(RAINBOW_ANT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(RED_ANT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(UNSTABLE_ANT.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canSpawnOn);
		EntitySpawnPlacementRegistry.register(TERMITE.get(), EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canSpawnOn);
	}
}