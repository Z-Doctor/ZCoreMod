package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemCameraTransforms {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwc";
		else
			return "net/minecraft/client/renderer/block/model/ItemCameraTransforms";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwc";
		else
			return "ItemCameraTransforms";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwc;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms;";
	}

	/**
	 * <p>
	 * Name: gui
	 * </p>
	 */
	public static McObfPair field_178354_e = McMappingDatabase.getSRG("field_178354_e");

	/**
	 * <p>
	 * Name: getTransform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)Lnet/minecraft/client/renderer/block/model/ItemTransformVec3f;]
	 * </p>
	 */
	public static McObfPair func_181688_b = McMappingDatabase.getSRG("ItemCameraTransforms.func_181688_b");

	/**
	 * <p>
	 * Name: hasCustomTransform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)Z]
	 * </p>
	 */
	public static McObfPair func_181687_c = McMappingDatabase.getSRG("ItemCameraTransforms.func_181687_c");

	/**
	 * <p>
	 * Name: firstperson_right
	 * </p>
	 */
	public static McObfPair field_188039_n = McMappingDatabase.getSRG("field_188039_n");

	/**
	 * <p>
	 * Name: offsetScaleY
	 * </p>
	 */
	public static McObfPair field_181697_i = McMappingDatabase.getSRG("field_181697_i");

	/**
	 * <p>
	 * Name: applyTransform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V]
	 * </p>
	 */
	public static McObfPair func_181689_a = McMappingDatabase.getSRG("ItemCameraTransforms.func_181689_a");

	/**
	 * <p>
	 * Name: thirdperson_right
	 * </p>
	 */
	public static McObfPair field_188037_l = McMappingDatabase.getSRG("field_188037_l");

	/**
	 * <p>
	 * Name: DEFAULT
	 * </p>
	 */
	public static McObfPair field_178357_a = McMappingDatabase.getSRG("field_178357_a");

	/**
	 * <p>
	 * Name: offsetScaleZ
	 * </p>
	 */
	public static McObfPair field_181698_j = McMappingDatabase.getSRG("field_181698_j");

	/**
	 * <p>
	 * Name: offsetRotationY
	 * </p>
	 */
	public static McObfPair field_181694_f = McMappingDatabase.getSRG("field_181694_f");

	/**
	 * <p>
	 * Name: firstperson_left
	 * </p>
	 */
	public static McObfPair field_188038_m = McMappingDatabase.getSRG("field_188038_m");

	/**
	 * <p>
	 * Name: makeQuaternion
	 * </p>
	 * <p>
	 * Desc: [(FFF)Lorg/lwjgl/util/vector/Quaternion;]
	 * </p>
	 */
	public static McObfPair func_188035_a = McMappingDatabase.getSRG("ItemCameraTransforms.func_188035_a");

	/**
	 * <p>
	 * Name: thirdperson_left
	 * </p>
	 */
	public static McObfPair field_188036_k = McMappingDatabase.getSRG("field_188036_k");

	/**
	 * <p>
	 * Name: offsetTranslateY
	 * </p>
	 */
	public static McObfPair field_181691_c = McMappingDatabase.getSRG("field_181691_c");

	/**
	 * <p>
	 * Name: offsetTranslateX
	 * </p>
	 */
	public static McObfPair field_181690_b = McMappingDatabase.getSRG("field_181690_b");

	/**
	 * <p>
	 * Name: offsetRotationX
	 * </p>
	 */
	public static McObfPair field_181693_e = McMappingDatabase.getSRG("field_181693_e");

	/**
	 * <p>
	 * Name: fixed
	 * </p>
	 */
	public static McObfPair field_181700_p = McMappingDatabase.getSRG("field_181700_p");

	/**
	 * <p>
	 * Name: offsetTranslateZ
	 * </p>
	 */
	public static McObfPair field_181692_d = McMappingDatabase.getSRG("field_181692_d");

	/**
	 * <p>
	 * Name: applyTransformSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ItemTransformVec3f;Z)V]
	 * </p>
	 */
	public static McObfPair func_188034_a = McMappingDatabase.getSRG("ItemCameraTransforms.func_188034_a");

	/**
	 * <p>
	 * Name: offsetScaleX
	 * </p>
	 */
	public static McObfPair field_181696_h = McMappingDatabase.getSRG("field_181696_h");

	/**
	 * <p>
	 * Name: offsetRotationZ
	 * </p>
	 */
	public static McObfPair field_181695_g = McMappingDatabase.getSRG("field_181695_g");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_178353_d = McMappingDatabase.getSRG("field_178353_d");

	/**
	 * <p>
	 * Name: ground
	 * </p>
	 */
	public static McObfPair field_181699_o = McMappingDatabase.getSRG("field_181699_o");

}
