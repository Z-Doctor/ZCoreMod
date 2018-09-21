package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bev";
		else
			return "net/minecraft/world/storage/MapData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bev";
		else
			return "MapData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbev;";
		else
			return "Lnet/minecraft/world/storage/MapData;";
	}

	/**
	 * <p>
	 * Name: updateMapData
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_176053_a = McMappingDatabase.getSRG("MapData.func_176053_a");

	/**
	 * <p>
	 * Name: mapDecorations
	 * </p>
	 */
	public static McObfPair field_76203_h = McMappingDatabase.getSRG("field_76203_h");

	/**
	 * <p>
	 * Name: getMapPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/network/Packet;]
	 * </p>
	 */
	public static McObfPair func_176052_a = McMappingDatabase.getSRG("MapData.func_176052_a");

	/**
	 * <p>
	 * Name: playersHashMap
	 * </p>
	 */
	public static McObfPair field_76202_j = McMappingDatabase.getSRG("field_76202_j");

	/**
	 * <p>
	 * Name: unlimitedTracking
	 * </p>
	 */
	public static McObfPair field_191096_f = McMappingDatabase.getSRG("field_191096_f");

	/**
	 * <p>
	 * Name: scale
	 * </p>
	 */
	public static McObfPair field_76197_d = McMappingDatabase.getSRG("field_76197_d");

	/**
	 * <p>
	 * Name: colors
	 * </p>
	 */
	public static McObfPair field_76198_e = McMappingDatabase.getSRG("field_76198_e");

	/**
	 * <p>
	 * Name: addTargetDecoration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/math/BlockPos;Ljava/lang/String;Lnet/minecraft/world/storage/MapDecoration$Type;)V]
	 * </p>
	 */
	public static McObfPair func_191094_a = McMappingDatabase.getSRG("MapData.func_191094_a");

	/**
	 * <p>
	 * Name: dimension
	 * </p>
	 */
	public static McObfPair field_76200_c = McMappingDatabase.getSRG("field_76200_c");

	/**
	 * <p>
	 * Name: updateVisiblePlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_76191_a = McMappingDatabase.getSRG("MapData.func_76191_a");

	/**
	 * <p>
	 * Name: xCenter
	 * </p>
	 */
	public static McObfPair field_76201_a = McMappingDatabase.getSRG("field_76201_a");

	/**
	 * <p>
	 * Name: getMapInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/world/storage/MapData$MapInfo;]
	 * </p>
	 */
	public static McObfPair func_82568_a = McMappingDatabase.getSRG("MapData.func_82568_a");

	/**
	 * <p>
	 * Name: updateDecorations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/MapDecoration$Type;Lnet/minecraft/world/World;Ljava/lang/String;DDD)V]
	 * </p>
	 */
	public static McObfPair func_191095_a = McMappingDatabase.getSRG("MapData.func_191095_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_76184_a = McMappingDatabase.getSRG("MapData.func_76184_a");

	/**
	 * <p>
	 * Name: zCenter
	 * </p>
	 */
	public static McObfPair field_76199_b = McMappingDatabase.getSRG("field_76199_b");

	/**
	 * <p>
	 * Name: trackingPosition
	 * </p>
	 */
	public static McObfPair field_186210_e = McMappingDatabase.getSRG("field_186210_e");

	/**
	 * <p>
	 * Name: calculateMapCenter
	 * </p>
	 * <p>
	 * Desc: [(DDI)V]
	 * </p>
	 */
	public static McObfPair func_176054_a = McMappingDatabase.getSRG("MapData.func_176054_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189551_b = McMappingDatabase.getSRG("MapData.func_189551_b");

	/**
	 * <p>
	 * Name: playersArrayList
	 * </p>
	 */
	public static McObfPair field_76196_g = McMappingDatabase.getSRG("field_76196_g");

}
