package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStatePaletteRegistry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axu";
		else
			return "net/minecraft/world/chunk/BlockStatePaletteRegistry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axu";
		else
			return "BlockStatePaletteRegistry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxu;";
		else
			return "Lnet/minecraft/world/chunk/BlockStatePaletteRegistry;";
	}

	/**
	 * <p>
	 * Name: idFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)I]
	 * </p>
	 */
	public static McObfPair func_186041_a = McMappingDatabase.getSRG("BlockStatePaletteRegistry.func_186041_a");

	/**
	 * <p>
	 * Name: getSerializedSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186040_a = McMappingDatabase.getSRG("BlockStatePaletteRegistry.func_186040_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_186038_a = McMappingDatabase.getSRG("BlockStatePaletteRegistry.func_186038_a");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_186039_a = McMappingDatabase.getSRG("BlockStatePaletteRegistry.func_186039_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_186037_b = McMappingDatabase.getSRG("BlockStatePaletteRegistry.func_186037_b");

}
