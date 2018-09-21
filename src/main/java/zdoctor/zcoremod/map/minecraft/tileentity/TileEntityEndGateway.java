package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityEndGateway {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awf";
		else
			return "net/minecraft/tileentity/TileEntityEndGateway";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awf";
		else
			return "TileEntityEndGateway";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawf;";
		else
			return "Lnet/minecraft/tileentity/TileEntityEndGateway;";
	}

	/**
	 * <p>
	 * Name: findSpawnpointInChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_184307_a = McMappingDatabase.getSRG("TileEntityEndGateway.func_184307_a");

	/**
	 * <p>
	 * Name: getMaxRenderDistanceSquared
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_145833_n = McMappingDatabase.getSRG("TileEntityEndGateway.func_145833_n");

	/**
	 * <p>
	 * Name: createExitPortal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184312_b = McMappingDatabase.getSRG("TileEntityEndGateway.func_184312_b");

	/**
	 * <p>
	 * Name: teleportCooldown
	 * </p>
	 */
	public static McObfPair field_184316_g = McMappingDatabase.getSRG("field_184316_g");

	/**
	 * <p>
	 * Name: age
	 * </p>
	 */
	public static McObfPair field_184315_f = McMappingDatabase.getSRG("field_184315_f");

	/**
	 * <p>
	 * Name: getSpawnPercent
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_184302_e = McMappingDatabase.getSRG("TileEntityEndGateway.func_184302_e");

	/**
	 * <p>
	 * Name: shouldRenderFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_184313_a = McMappingDatabase.getSRG("TileEntityEndGateway.func_184313_a");

	/**
	 * <p>
	 * Name: receiveClientEvent
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_145842_c = McMappingDatabase.getSRG("TileEntityEndGateway.func_145842_c");

	/**
	 * <p>
	 * Name: isCoolingDown
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184310_d = McMappingDatabase.getSRG("TileEntityEndGateway.func_184310_d");

	/**
	 * <p>
	 * Name: teleportEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184306_a = McMappingDatabase.getSRG("TileEntityEndGateway.func_184306_a");

	/**
	 * <p>
	 * Name: findExitPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_184303_j = McMappingDatabase.getSRG("TileEntityEndGateway.func_184303_j");

	/**
	 * <p>
	 * Name: getChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_184301_a = McMappingDatabase.getSRG("TileEntityEndGateway.func_184301_a");

	/**
	 * <p>
	 * Name: findExitPortal
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184311_k = McMappingDatabase.getSRG("TileEntityEndGateway.func_184311_k");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_184314_a = McMappingDatabase.getSRG("field_184314_a");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityEndGateway.func_73660_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityEndGateway.func_145839_a");

	/**
	 * <p>
	 * Name: triggerCooldown
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184300_h = McMappingDatabase.getSRG("TileEntityEndGateway.func_184300_h");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityEndGateway.func_189518_D_");

	/**
	 * <p>
	 * Name: isSpawning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184309_b = McMappingDatabase.getSRG("TileEntityEndGateway.func_184309_b");

	/**
	 * <p>
	 * Name: findHighestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;IZ)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_184308_a = McMappingDatabase.getSRG("TileEntityEndGateway.func_184308_a");

	/**
	 * <p>
	 * Name: exitPortal
	 * </p>
	 */
	public static McObfPair field_184317_h = McMappingDatabase.getSRG("field_184317_h");

	/**
	 * <p>
	 * Name: setExactPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_190603_b = McMappingDatabase.getSRG("TileEntityEndGateway.func_190603_b");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntityEndGateway.func_189517_E_");

	/**
	 * <p>
	 * Name: getParticleAmount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184304_i = McMappingDatabase.getSRG("TileEntityEndGateway.func_184304_i");

	/**
	 * <p>
	 * Name: exactTeleport
	 * </p>
	 */
	public static McObfPair field_184318_i = McMappingDatabase.getSRG("field_184318_i");

	/**
	 * <p>
	 * Name: getCooldownPercent
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_184305_g = McMappingDatabase.getSRG("TileEntityEndGateway.func_184305_g");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityEndGateway.func_189515_b");

}
