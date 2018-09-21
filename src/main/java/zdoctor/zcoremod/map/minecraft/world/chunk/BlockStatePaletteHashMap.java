package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStatePaletteHashMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axv";
		else
			return "net/minecraft/world/chunk/BlockStatePaletteHashMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axv";
		else
			return "BlockStatePaletteHashMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxv;";
		else
			return "Lnet/minecraft/world/chunk/BlockStatePaletteHashMap;";
	}

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_186037_b = McMappingDatabase.getSRG("BlockStatePaletteHashMap.func_186037_b");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_186038_a = McMappingDatabase.getSRG("BlockStatePaletteHashMap.func_186038_a");

	/**
	 * <p>
	 * Name: getSerializedSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186040_a = McMappingDatabase.getSRG("BlockStatePaletteHashMap.func_186040_a");

	/**
	 * <p>
	 * Name: paletteResizer
	 * </p>
	 */
	public static McObfPair field_186047_b = McMappingDatabase.getSRG("field_186047_b");

	/**
	 * <p>
	 * Name: statePaletteMap
	 * </p>
	 */
	public static McObfPair field_186046_a = McMappingDatabase.getSRG("field_186046_a");

	/**
	 * <p>
	 * Name: bits
	 * </p>
	 */
	public static McObfPair field_186048_c = McMappingDatabase.getSRG("field_186048_c");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_186039_a = McMappingDatabase.getSRG("BlockStatePaletteHashMap.func_186039_a");

	/**
	 * <p>
	 * Name: idFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_186041_a = McMappingDatabase.getSRG("BlockStatePaletteHashMap.func_186041_a");

}
