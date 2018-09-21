package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapData$MapInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bev$a";
		else
			return "net/minecraft/world/storage/MapData$MapInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bev$a";
		else
			return "MapData$MapInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbev$a;";
		else
			return "Lnet/minecraft/world/storage/MapData$MapInfo;";
	}

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_76211_a = McMappingDatabase.getSRG("field_76211_a");

	/**
	 * <p>
	 * Name: step
	 * </p>
	 */
	public static McObfPair field_82569_d = McMappingDatabase.getSRG("field_82569_d");

	/**
	 * <p>
	 * Name: maxX
	 * </p>
	 */
	public static McObfPair field_176104_g = McMappingDatabase.getSRG("field_176104_g");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 */
	public static McObfPair field_176109_i = McMappingDatabase.getSRG("field_176109_i");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_176102_a = McMappingDatabase.getSRG("MapData$MapInfo.func_176102_a");

	/**
	 * <p>
	 * Name: minY
	 * </p>
	 */
	public static McObfPair field_176103_f = McMappingDatabase.getSRG("field_176103_f");

	/**
	 * <p>
	 * Name: maxY
	 * </p>
	 */
	public static McObfPair field_176108_h = McMappingDatabase.getSRG("field_176108_h");

	/**
	 * <p>
	 * Name: isDirty
	 * </p>
	 */
	public static McObfPair field_176105_d = McMappingDatabase.getSRG("field_176105_d");

	/**
	 * <p>
	 * Name: minX
	 * </p>
	 */
	public static McObfPair field_176106_e = McMappingDatabase.getSRG("field_176106_e");

	/**
	 * <p>
	 * Name: getPacket
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/network/Packet;]
	 * </p>
	 */
	public static McObfPair func_176101_a = McMappingDatabase.getSRG("MapData$MapInfo.func_176101_a");

}
