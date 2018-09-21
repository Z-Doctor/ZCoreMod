package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvu";
		else
			return "net/minecraft/client/renderer/block/model/ModelBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvu";
		else
			return "ModelBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvu;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelBlock;";
	}

	/**
	 * <p>
	 * Name: getOverrideLocations
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_187965_e = McMappingDatabase.getSRG("ModelBlock.func_187965_e");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/renderer/block/model/ModelBlock;]
	 * </p>
	 */
	public static McObfPair func_178294_a = McMappingDatabase.getSRG("ModelBlock.func_178294_a");

	/**
	 * <p>
	 * Name: getParentFromMap
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)V]
	 * </p>
	 */
	public static McObfPair func_178299_a = McMappingDatabase.getSRG("ModelBlock.func_178299_a");

	/**
	 * <p>
	 * Name: deserialize
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/Reader;)Lnet/minecraft/client/renderer/block/model/ModelBlock;]
	 * </p>
	 */
	public static McObfPair func_178307_a = McMappingDatabase.getSRG("ModelBlock.func_178307_a");

	/**
	 * <p>
	 * Name: hasParent
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178295_k = McMappingDatabase.getSRG("ModelBlock.func_178295_k");

	/**
	 * <p>
	 * Name: isResolved
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178303_d = McMappingDatabase.getSRG("ModelBlock.func_178303_d");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_178317_b = McMappingDatabase.getSRG("field_178317_b");

	/**
	 * <p>
	 * Name: overrides
	 * </p>
	 */
	public static McObfPair field_187968_k = McMappingDatabase.getSRG("field_187968_k");

	/**
	 * <p>
	 * Name: getElements
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178298_a = McMappingDatabase.getSRG("ModelBlock.func_178298_a");

	/**
	 * <p>
	 * Name: isGui3d
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178311_c = McMappingDatabase.getSRG("ModelBlock.func_178311_c");

	/**
	 * <p>
	 * Name: isAmbientOcclusion
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178309_b = McMappingDatabase.getSRG("ModelBlock.func_178309_b");

	/**
	 * <p>
	 * Name: gui3d
	 * </p>
	 */
	public static McObfPair field_178321_h = McMappingDatabase.getSRG("field_178321_h");

	/**
	 * <p>
	 * Name: isTexturePresent
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_178300_b = McMappingDatabase.getSRG("ModelBlock.func_178300_b");

	/**
	 * <p>
	 * Name: textures
	 * </p>
	 */
	public static McObfPair field_178318_c = McMappingDatabase.getSRG("field_178318_c");

	/**
	 * <p>
	 * Name: getOverrides
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_187966_f = McMappingDatabase.getSRG("ModelBlock.func_187966_f");

	/**
	 * <p>
	 * Name: resolveTextureName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178308_c = McMappingDatabase.getSRG("ModelBlock.func_178308_c");

	/**
	 * <p>
	 * Name: startsWithHash
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_178304_d = McMappingDatabase.getSRG("ModelBlock.func_178304_d");

	/**
	 * <p>
	 * Name: elements
	 * </p>
	 */
	public static McObfPair field_178314_g = McMappingDatabase.getSRG("field_178314_g");

	/**
	 * <p>
	 * Name: checkModelHierarchy
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)V]
	 * </p>
	 */
	public static McObfPair func_178312_b = McMappingDatabase.getSRG("ModelBlock.func_178312_b");

	/**
	 * <p>
	 * Name: parentLocation
	 * </p>
	 */
	public static McObfPair field_178316_e = McMappingDatabase.getSRG("field_178316_e");

	/**
	 * <p>
	 * Name: SERIALIZER
	 * </p>
	 */
	public static McObfPair field_178319_a = McMappingDatabase.getSRG("field_178319_a");

	/**
	 * <p>
	 * Name: getAllTransforms
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms;]
	 * </p>
	 */
	public static McObfPair func_181682_g = McMappingDatabase.getSRG("ModelBlock.func_181682_g");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_178315_d = McMappingDatabase.getSRG("field_178315_d");

	/**
	 * <p>
	 * Name: ambientOcclusion
	 * </p>
	 */
	public static McObfPair field_178322_i = McMappingDatabase.getSRG("field_178322_i");

	/**
	 * <p>
	 * Name: createOverrides
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ItemOverrideList;]
	 * </p>
	 */
	public static McObfPair func_187967_g = McMappingDatabase.getSRG("ModelBlock.func_187967_g");

	/**
	 * <p>
	 * Name: getParentLocation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178305_e = McMappingDatabase.getSRG("ModelBlock.func_178305_e");

	/**
	 * <p>
	 * Name: getTransform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)Lnet/minecraft/client/renderer/block/model/ItemTransformVec3f;]
	 * </p>
	 */
	public static McObfPair func_181681_a = McMappingDatabase.getSRG("ModelBlock.func_181681_a");

	/**
	 * <p>
	 * Name: cameraTransforms
	 * </p>
	 */
	public static McObfPair field_178320_j = McMappingDatabase.getSRG("field_178320_j");

	/**
	 * <p>
	 * Name: resolveTextureName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/client/renderer/block/model/ModelBlock$Bookkeep;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_178302_a = McMappingDatabase.getSRG("ModelBlock.func_178302_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_178313_f = McMappingDatabase.getSRG("field_178313_f");

	/**
	 * <p>
	 * Name: getRootModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ModelBlock;]
	 * </p>
	 */
	public static McObfPair func_178310_f = McMappingDatabase.getSRG("ModelBlock.func_178310_f");

}
