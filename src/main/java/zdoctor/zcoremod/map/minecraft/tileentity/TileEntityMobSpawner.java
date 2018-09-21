package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityMobSpawner {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avy";
		else
			return "net/minecraft/tileentity/TileEntityMobSpawner";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avy";
		else
			return "TileEntityMobSpawner";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavy;";
		else
			return "Lnet/minecraft/tileentity/TileEntityMobSpawner;";
	}

	/**
	 * <p>
	 * Name: onlyOpsCanSetNbt
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183000_F = McMappingDatabase.getSRG("TileEntityMobSpawner.func_183000_F");

	/**
	 * <p>
	 * Name: getSpawnerBaseLogic
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/MobSpawnerBaseLogic;]
	 * </p>
	 */
	public static McObfPair func_145881_a = McMappingDatabase.getSRG("TileEntityMobSpawner.func_145881_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityMobSpawner.func_189515_b");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityMobSpawner.func_189518_D_");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntityMobSpawner.func_189517_E_");

	/**
	 * <p>
	 * Name: registerFixesMobSpawner
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189684_a = McMappingDatabase.getSRG("TileEntityMobSpawner.func_189684_a");

	/**
	 * <p>
	 * Name: spawnerLogic
	 * </p>
	 */
	public static McObfPair field_145882_a = McMappingDatabase.getSRG("field_145882_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityMobSpawner.func_145839_a");

	/**
	 * <p>
	 * Name: receiveClientEvent
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_145842_c = McMappingDatabase.getSRG("TileEntityMobSpawner.func_145842_c");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityMobSpawner.func_73660_a");

}
