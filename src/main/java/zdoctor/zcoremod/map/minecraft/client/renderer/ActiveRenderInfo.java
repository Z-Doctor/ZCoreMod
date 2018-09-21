package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ActiveRenderInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhv";
		else
			return "net/minecraft/client/renderer/ActiveRenderInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhv";
		else
			return "ActiveRenderInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhv;";
		else
			return "Lnet/minecraft/client/renderer/ActiveRenderInfo;";
	}

	/**
	 * <p>
	 * Name: getBlockStateAtEntityViewpoint
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;F)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_186703_a = McMappingDatabase.getSRG("ActiveRenderInfo.func_186703_a");

	/**
	 * <p>
	 * Name: PROJECTION
	 * </p>
	 */
	public static McObfPair field_178813_c = McMappingDatabase.getSRG("field_178813_c");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_178811_e = McMappingDatabase.getSRG("field_178811_e");

	/**
	 * <p>
	 * Name: getRotationXZ
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_178809_c = McMappingDatabase.getSRG("ActiveRenderInfo.func_178809_c");

	/**
	 * <p>
	 * Name: rotationYZ
	 * </p>
	 */
	public static McObfPair field_74587_g = McMappingDatabase.getSRG("field_74587_g");

	/**
	 * <p>
	 * Name: rotationXZ
	 * </p>
	 */
	public static McObfPair field_74589_e = McMappingDatabase.getSRG("field_74589_e");

	/**
	 * <p>
	 * Name: projectViewFromEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;D)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_178806_a = McMappingDatabase.getSRG("ActiveRenderInfo.func_178806_a");

	/**
	 * <p>
	 * Name: getRotationX
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_178808_b = McMappingDatabase.getSRG("ActiveRenderInfo.func_178808_b");

	/**
	 * <p>
	 * Name: getRotationXY
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_178807_f = McMappingDatabase.getSRG("ActiveRenderInfo.func_178807_f");

	/**
	 * <p>
	 * Name: MODELVIEW
	 * </p>
	 */
	public static McObfPair field_178812_b = McMappingDatabase.getSRG("field_178812_b");

	/**
	 * <p>
	 * Name: OBJECTCOORDS
	 * </p>
	 */
	public static McObfPair field_178810_d = McMappingDatabase.getSRG("field_178810_d");

	/**
	 * <p>
	 * Name: getRotationZ
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_178803_d = McMappingDatabase.getSRG("ActiveRenderInfo.func_178803_d");

	/**
	 * <p>
	 * Name: VIEWPORT
	 * </p>
	 */
	public static McObfPair field_178814_a = McMappingDatabase.getSRG("field_178814_a");

	/**
	 * <p>
	 * Name: rotationZ
	 * </p>
	 */
	public static McObfPair field_74586_f = McMappingDatabase.getSRG("field_74586_f");

	/**
	 * <p>
	 * Name: rotationX
	 * </p>
	 */
	public static McObfPair field_74588_d = McMappingDatabase.getSRG("field_74588_d");

	/**
	 * <p>
	 * Name: rotationXY
	 * </p>
	 */
	public static McObfPair field_74596_h = McMappingDatabase.getSRG("field_74596_h");

	/**
	 * <p>
	 * Name: getRotationYZ
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_178805_e = McMappingDatabase.getSRG("ActiveRenderInfo.func_178805_e");

	/**
	 * <p>
	 * Name: updateRenderInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Z)V]
	 * </p>
	 */
	public static McObfPair func_74583_a = McMappingDatabase.getSRG("ActiveRenderInfo.func_74583_a");

}
