package zdoctor.zcoremod.map.minecraft.client.renderer.block.statemap;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStateMapper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwp";
		else
			return "net/minecraft/client/renderer/block/statemap/BlockStateMapper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwp";
		else
			return "BlockStateMapper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwp;";
		else
			return "Lnet/minecraft/client/renderer/block/statemap/BlockStateMapper;";
	}

	/**
	 * <p>
	 * Name: registerBuiltInBlocks
	 * </p>
	 * <p>
	 * Desc: [([Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_178448_a = McMappingDatabase.getSRG("BlockStateMapper.func_178448_a");

	/**
	 * <p>
	 * Name: putAllStateModelLocations
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_178446_a = McMappingDatabase.getSRG("BlockStateMapper.func_178446_a");

	/**
	 * <p>
	 * Name: blockStateMap
	 * </p>
	 */
	public static McObfPair field_178450_a = McMappingDatabase.getSRG("field_178450_a");

	/**
	 * <p>
	 * Name: registerBlockStateMapper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Lnet/minecraft/client/renderer/block/statemap/IStateMapper;)V]
	 * </p>
	 */
	public static McObfPair func_178447_a = McMappingDatabase.getSRG("BlockStateMapper.func_178447_a");

	/**
	 * <p>
	 * Name: getVariants
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_188181_b = McMappingDatabase.getSRG("BlockStateMapper.func_188181_b");

	/**
	 * <p>
	 * Name: getBlockstateLocations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_188182_a = McMappingDatabase.getSRG("BlockStateMapper.func_188182_a");

	/**
	 * <p>
	 * Name: setBuiltInBlocks
	 * </p>
	 */
	public static McObfPair field_178449_b = McMappingDatabase.getSRG("field_178449_b");

}
