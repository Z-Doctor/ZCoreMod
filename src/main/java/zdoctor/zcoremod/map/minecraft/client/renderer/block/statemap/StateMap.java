package zdoctor.zcoremod.map.minecraft.client.renderer.block.statemap;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StateMap {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwr";
		else
			return "net/minecraft/client/renderer/block/statemap/StateMap";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwr";
		else
			return "StateMap";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwr;";
		else
			return "Lnet/minecraft/client/renderer/block/statemap/StateMap;";
	}

	/**
	 * <p>
	 * Name: getModelResourceLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178132_a = McMappingDatabase.getSRG("StateMap.func_178132_a");

	/**
	 * <p>
	 * Name: suffix
	 * </p>
	 */
	public static McObfPair field_178141_c = McMappingDatabase.getSRG("field_178141_c");

	/**
	 * <p>
	 * Name: ignored
	 * </p>
	 */
	public static McObfPair field_178140_d = McMappingDatabase.getSRG("field_178140_d");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_178142_a = McMappingDatabase.getSRG("field_178142_a");

	/**
	 * <p>
	 * Name: removeName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/util/Map;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_187490_a = McMappingDatabase.getSRG("StateMap.func_187490_a");

}
