package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStatePaletteLinear {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axy";
		else
			return "net/minecraft/world/chunk/BlockStatePaletteLinear";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axy";
		else
			return "BlockStatePaletteLinear";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxy;";
		else
			return "Lnet/minecraft/world/chunk/BlockStatePaletteLinear;";
	}

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_186039_a = McMappingDatabase.getSRG("BlockStatePaletteLinear.func_186039_a");

	/**
	 * <p>
	 * Name: states
	 * </p>
	 */
	public static McObfPair field_186042_a = McMappingDatabase.getSRG("field_186042_a");

	/**
	 * <p>
	 * Name: arraySize
	 * </p>
	 */
	public static McObfPair field_186045_d = McMappingDatabase.getSRG("field_186045_d");

	/**
	 * <p>
	 * Name: idFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_186041_a = McMappingDatabase.getSRG("BlockStatePaletteLinear.func_186041_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_186037_b = McMappingDatabase.getSRG("BlockStatePaletteLinear.func_186037_b");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_186038_a = McMappingDatabase.getSRG("BlockStatePaletteLinear.func_186038_a");

	/**
	 * <p>
	 * Name: resizeHandler
	 * </p>
	 */
	public static McObfPair field_186043_b = McMappingDatabase.getSRG("field_186043_b");

	/**
	 * <p>
	 * Name: getSerializedSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186040_a = McMappingDatabase.getSRG("BlockStatePaletteLinear.func_186040_a");

	/**
	 * <p>
	 * Name: bits
	 * </p>
	 */
	public static McObfPair field_186044_c = McMappingDatabase.getSRG("field_186044_c");

}
