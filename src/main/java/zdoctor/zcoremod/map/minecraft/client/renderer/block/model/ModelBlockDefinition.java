package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBlockDefinition {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvv";
		else
			return "net/minecraft/client/renderer/block/model/ModelBlockDefinition";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvv";
		else
			return "ModelBlockDefinition";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvv;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelBlockDefinition;";
	}

	/**
	 * <p>
	 * Name: multipart
	 * </p>
	 */
	public static McObfPair field_188005_c = McMappingDatabase.getSRG("field_188005_c");

	/**
	 * <p>
	 * Name: mapVariants
	 * </p>
	 */
	public static McObfPair field_178332_b = McMappingDatabase.getSRG("field_178332_b");

	/**
	 * <p>
	 * Name: getVariant
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/renderer/block/model/VariantList;]
	 * </p>
	 */
	public static McObfPair func_188004_c = McMappingDatabase.getSRG("ModelBlockDefinition.func_188004_c");

	/**
	 * <p>
	 * Name: GSON
	 * </p>
	 */
	public static McObfPair field_178333_a = McMappingDatabase.getSRG("field_178333_a");

	/**
	 * <p>
	 * Name: parseFromReader
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/Reader;)Lnet/minecraft/client/renderer/block/model/ModelBlockDefinition;]
	 * </p>
	 */
	public static McObfPair func_178331_a = McMappingDatabase.getSRG("ModelBlockDefinition.func_178331_a");

	/**
	 * <p>
	 * Name: getMultipartData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/multipart/Multipart;]
	 * </p>
	 */
	public static McObfPair func_188001_c = McMappingDatabase.getSRG("ModelBlockDefinition.func_188001_c");

	/**
	 * <p>
	 * Name: hasMultipartData
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188002_b = McMappingDatabase.getSRG("ModelBlockDefinition.func_188002_b");

	/**
	 * <p>
	 * Name: getMultipartVariants
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_188003_a = McMappingDatabase.getSRG("ModelBlockDefinition.func_188003_a");

	/**
	 * <p>
	 * Name: hasVariant
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_188000_b = McMappingDatabase.getSRG("ModelBlockDefinition.func_188000_b");

}
