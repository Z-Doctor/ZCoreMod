package zdoctor.zcoremod.map.minecraft.client.renderer.block.statemap;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StateMapperBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwo";
		else
			return "net/minecraft/client/renderer/block/statemap/StateMapperBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwo";
		else
			return "StateMapperBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwo;";
		else
			return "Lnet/minecraft/client/renderer/block/statemap/StateMapperBase;";
	}

	/**
	 * <p>
	 * Name: mapStateModelLocations
	 * </p>
	 */
	public static McObfPair field_178133_b = McMappingDatabase.getSRG("field_178133_b");

	/**
	 * <p>
	 * Name: getPropertyName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/properties/IProperty;Ljava/lang/Comparable;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_187489_a = McMappingDatabase.getSRG("StateMapperBase.func_187489_a");

	/**
	 * <p>
	 * Name: getPropertyString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178131_a = McMappingDatabase.getSRG("StateMapperBase.func_178131_a");

	/**
	 * <p>
	 * Name: getModelResourceLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178132_a = McMappingDatabase.getSRG("StateMapperBase.func_178132_a");

	/**
	 * <p>
	 * Name: putStateModelLocations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_178130_a = McMappingDatabase.getSRG("StateMapperBase.func_178130_a");

}
