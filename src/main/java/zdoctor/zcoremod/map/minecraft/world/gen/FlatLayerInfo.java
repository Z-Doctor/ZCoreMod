package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FlatLayerInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbc";
		else
			return "net/minecraft/world/gen/FlatLayerInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbc";
		else
			return "FlatLayerInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbc;";
		else
			return "Lnet/minecraft/world/gen/FlatLayerInfo;";
	}

	/**
	 * <p>
	 * Name: layerCount
	 * </p>
	 */
	public static McObfPair field_82664_a = McMappingDatabase.getSRG("field_82664_a");

	/**
	 * <p>
	 * Name: getMinY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82656_d = McMappingDatabase.getSRG("FlatLayerInfo.func_82656_d");

	/**
	 * <p>
	 * Name: setMinY
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82660_d = McMappingDatabase.getSRG("FlatLayerInfo.func_82660_d");

	/**
	 * <p>
	 * Name: layerMinimumY
	 * </p>
	 */
	public static McObfPair field_82661_d = McMappingDatabase.getSRG("field_82661_d");

	/**
	 * <p>
	 * Name: getLayerCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82657_a = McMappingDatabase.getSRG("FlatLayerInfo.func_82657_a");

	/**
	 * <p>
	 * Name: layerMaterial
	 * </p>
	 */
	public static McObfPair field_175901_b = McMappingDatabase.getSRG("field_175901_b");

	/**
	 * <p>
	 * Name: getLayerMaterialBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_151536_b = McMappingDatabase.getSRG("FlatLayerInfo.func_151536_b");

	/**
	 * <p>
	 * Name: getLayerMaterial
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_175900_c = McMappingDatabase.getSRG("FlatLayerInfo.func_175900_c");

	/**
	 * <p>
	 * Name: getFillBlockMeta
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82658_c = McMappingDatabase.getSRG("FlatLayerInfo.func_82658_c");

	/**
	 * <p>
	 * Name: version
	 * </p>
	 */
	public static McObfPair field_175902_a = McMappingDatabase.getSRG("field_175902_a");

}
