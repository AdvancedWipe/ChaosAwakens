package io.github.chaosawakens.common.blocks.tileentities.spawner;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.world.Difficulty;
import net.minecraft.world.IServerWorld;
import net.minecraft.world.server.ServerWorld;

public abstract class TileEntityBossSpawner<T extends MobEntity> extends TileEntity implements ITickableTileEntity {
	
	protected static final int SHORT_RANGE = 9, LONG_RANGE = 50;
	
	protected final EntityType<T> entityType;
	protected boolean spawnedBoss = false;
	
	protected TileEntityBossSpawner(TileEntityType<?> type, EntityType<T> entityType) {
		super(type);
		this.entityType = entityType;
	}
	
	public boolean anyPlayerInRange() {
		assert level != null;
		return level.hasNearbyAlivePlayer(worldPosition.getX() + 0.5D, worldPosition.getY() + 0.5D, worldPosition.getZ() + 0.5D, getRange());
	}
	
	@Override
	public void tick() {
		if (spawnedBoss || !anyPlayerInRange()) 
			return;
		
		assert level != null;
		if (level.isClientSide) {
			// particles
			double rx = worldPosition.getX() + level.random.nextFloat();
			double ry = worldPosition.getY() + level.random.nextFloat();
			double rz = worldPosition.getZ() + level.random.nextFloat();
			level.addParticle(ParticleTypes.SMOKE, rx, ry, rz, 0.0D, 0.0D, 0.0D);
			level.addParticle(ParticleTypes.FLAME, rx, ry, rz, 0.0D, 0.0D, 0.0D);
		} else {
			if (level.getDifficulty() != Difficulty.PEACEFUL) {
				if (spawnMyBoss((ServerWorld) level)) {
					level.destroyBlock(worldPosition, false);
					spawnedBoss = true;
				}
			}
		}
	}
	
	protected boolean spawnMyBoss(IServerWorld world) {
		// create creature
		T myCreature = makeMyCreature();
		
		myCreature.moveTo(worldPosition, world.getLevel().random.nextFloat() * 360F, 0.0F);
		myCreature.finalizeSpawn(world, world.getCurrentDifficultyAt(worldPosition), SpawnReason.SPAWNER, null, null);
		
		// set creature's home to this
		initializeCreature(myCreature);
		
		// spawn it
		return world.addFreshEntity(myCreature);
	}
	
	protected void initializeCreature(T myCreature) {
		myCreature.restrictTo(worldPosition, 46);
	}
	
	protected int getRange() {
		return SHORT_RANGE;
	}
	
	protected T makeMyCreature() {
		assert level != null;
		return entityType.create(level);
	}
}