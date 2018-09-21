package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FlatGeneratorInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbb";
		else
			return "net/minecraft/world/gen/FlatGeneratorInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbb";
		else
			return "FlatGeneratorInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbb;";
		else
			return "Lnet/minecraft/world/gen/FlatGeneratorInfo;";
	}

	/**
	 * <p>
	 * Name: setBiome
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82647_a = McMappingDatabase.getSRG("FlatGeneratorInfo.func_82647_a");

	/**
	 * <p>
	 * Name: getLayersFromString
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_180716_a = McMappingDatabase.getSRG("FlatGeneratorInfo.func_180716_a");

	/**
	 * <p>
	 * Name: flatLayers
	 * </p>
	 */
	public static McObfPair field_82655_a = McMappingDatabase.getSRG("field_82655_a");

	/**
	 * <p>
	 * Name: biomeToUse
	 * </p>
	 */
	public static McObfPair field_82654_c = McMappingDatabase.getSRG("field_82654_c");

	/**
	 * <p>
	 * Name: getLayerFromString
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;I)Lnet/minecraft/world/gen/FlatLayerInfo;]
	 * </p>
	 */
	public static McObfPair func_180715_a = McMappingDatabase.getSRG("FlatGeneratorInfo.func_180715_a");

	/**
	 * <p>
	 * Name: getWorldFeatures
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_82644_b = McMappingDatabase.getSRG("FlatGeneratorInfo.func_82644_b");

	/**
	 * <p>
	 * Name: worldFeatures
	 * </p>
	 */
	public static McObfPair field_82653_b = McMappingDatabase.getSRG("field_82653_b");

	/**
	 * <p>
	 * Name: getDefaultFlatGenerator
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/FlatGeneratorInfo;]
	 * </p>
	 */
	public static McObfPair func_82649_e = McMappingDatabase.getSRG("FlatGeneratorInfo.func_82649_e");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82648_a = McMappingDatabase.getSRG("FlatGeneratorInfo.func_82648_a");

	/**
	 * <p>
	 * Name: getFlatLayers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_82650_c = McMappingDatabase.getSRG("FlatGeneratorInfo.func_82650_c");

	/**
	 * <p>
	 * Name: createFlatGeneratorFromString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/gen/FlatGeneratorInfo;]
	 * </p>
	 */
	public static McObfPair func_82651_a = McMappingDatabase.getSRG("FlatGeneratorInfo.func_82651_a");

	/**
	 * <p>
	 * Name: updateLayers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82645_d = McMappingDatabase.getSRG("FlatGeneratorInfo.func_82645_d");

}
