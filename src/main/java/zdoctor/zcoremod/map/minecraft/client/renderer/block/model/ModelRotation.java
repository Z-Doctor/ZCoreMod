package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelRotation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfz";
		else
			return "net/minecraft/client/renderer/block/model/ModelRotation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfz";
		else
			return "ModelRotation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfz;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelRotation;";
	}

	/**
	 * <p>
	 * Name: rotateFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_177523_a = McMappingDatabase.getSRG("ModelRotation.func_177523_a");

	/**
	 * <p>
	 * Name: getModelRotation
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/client/renderer/block/model/ModelRotation;]
	 * </p>
	 */
	public static McObfPair func_177524_a = McMappingDatabase.getSRG("ModelRotation.func_177524_a");

	/**
	 * <p>
	 * Name: matrix4d
	 * </p>
	 */
	public static McObfPair field_177544_s = McMappingDatabase.getSRG("field_177544_s");

	/**
	 * <p>
	 * Name: combinedXY
	 * </p>
	 */
	public static McObfPair field_177545_r = McMappingDatabase.getSRG("field_177545_r");

	/**
	 * <p>
	 * Name: quartersY
	 * </p>
	 */
	public static McObfPair field_177542_u = McMappingDatabase.getSRG("field_177542_u");

	/**
	 * <p>
	 * Name: quartersX
	 * </p>
	 */
	public static McObfPair field_177543_t = McMappingDatabase.getSRG("field_177543_t");

	/**
	 * <p>
	 * Name: getMatrix4d
	 * </p>
	 * <p>
	 * Desc: [()Lorg/lwjgl/util/vector/Matrix4f;]
	 * </p>
	 */
	public static McObfPair func_177525_a = McMappingDatabase.getSRG("ModelRotation.func_177525_a");

	/**
	 * <p>
	 * Name: MAP_ROTATIONS
	 * </p>
	 */
	public static McObfPair field_177546_q = McMappingDatabase.getSRG("field_177546_q");

	/**
	 * <p>
	 * Name: combineXY
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_177521_b = McMappingDatabase.getSRG("ModelRotation.func_177521_b");

	/**
	 * <p>
	 * Name: rotateVertex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;I)I]
	 * </p>
	 */
	public static McObfPair func_177520_a = McMappingDatabase.getSRG("ModelRotation.func_177520_a");

}
