package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartMobSpawner {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afl";
		else
			return "net/minecraft/entity/item/EntityMinecartMobSpawner";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afl";
		else
			return "EntityMinecartMobSpawner";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafl;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartMobSpawner;";
	}

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityMinecartMobSpawner.func_70014_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityMinecartMobSpawner.func_70037_a");

	/**
	 * <p>
	 * Name: getDefaultDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180457_u = McMappingDatabase.getSRG("EntityMinecartMobSpawner.func_180457_u");

	/**
	 * <p>
	 * Name: mobSpawnerLogic
	 * </p>
	 */
	public static McObfPair field_98040_a = McMappingDatabase.getSRG("field_98040_a");

	/**
	 * <p>
	 * Name: registerFixesMinecartMobSpawner
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189672_a = McMappingDatabase.getSRG("EntityMinecartMobSpawner.func_189672_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184264_v = McMappingDatabase.getSRG("EntityMinecartMobSpawner.func_184264_v");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityMinecartMobSpawner.func_70071_h_");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityMinecartMobSpawner.func_70103_a");

}
