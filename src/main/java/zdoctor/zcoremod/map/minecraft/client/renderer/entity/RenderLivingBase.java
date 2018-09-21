package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderLivingBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caa";
		else
			return "net/minecraft/client/renderer/entity/RenderLivingBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caa";
		else
			return "RenderLivingBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcaa;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderLivingBase;";
	}

	/**
	 * <p>
	 * Name: handleRotationFloat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)F]
	 * </p>
	 */
	public static McObfPair func_77044_a = McMappingDatabase.getSRG("RenderLivingBase.func_77044_a");

	/**
	 * <p>
	 * Name: isVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_193115_c = McMappingDatabase.getSRG("RenderLivingBase.func_193115_c");

	/**
	 * <p>
	 * Name: renderLivingAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;DDD)V]
	 * </p>
	 */
	public static McObfPair func_77039_a = McMappingDatabase.getSRG("RenderLivingBase.func_77039_a");

	/**
	 * <p>
	 * Name: applyRotations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_77043_a = McMappingDatabase.getSRG("RenderLivingBase.func_77043_a");

	/**
	 * <p>
	 * Name: transformHeldFull3DItemLayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82422_c = McMappingDatabase.getSRG("RenderLivingBase.func_82422_c");

	/**
	 * <p>
	 * Name: unsetBrightness
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177091_f = McMappingDatabase.getSRG("RenderLivingBase.func_177091_f");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderLivingBase.func_77041_b");

	/**
	 * <p>
	 * Name: getDeathMaxRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)F]
	 * </p>
	 */
	public static McObfPair func_77037_a = McMappingDatabase.getSRG("RenderLivingBase.func_77037_a");

	/**
	 * <p>
	 * Name: getMainModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/model/ModelBase;]
	 * </p>
	 */
	public static McObfPair func_177087_b = McMappingDatabase.getSRG("RenderLivingBase.func_177087_b");

	/**
	 * <p>
	 * Name: canRenderName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z, (Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_177070_b = McMappingDatabase.getSRG("RenderLivingBase.func_177070_b");

	/**
	 * <p>
	 * Name: mainModel
	 * </p>
	 */
	public static McObfPair field_77045_g = McMappingDatabase.getSRG("field_77045_g");

	/**
	 * <p>
	 * Name: prepareScale
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)F]
	 * </p>
	 */
	public static McObfPair func_188322_c = McMappingDatabase.getSRG("RenderLivingBase.func_188322_c");

	/**
	 * <p>
	 * Name: addLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/entity/layers/LayerRenderer;)Z]
	 * </p>
	 */
	public static McObfPair func_177094_a = McMappingDatabase.getSRG("RenderLivingBase.func_177094_a");

	/**
	 * <p>
	 * Name: interpolateRotation
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_77034_a = McMappingDatabase.getSRG("RenderLivingBase.func_77034_a");

	/**
	 * <p>
	 * Name: getColorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FF)I]
	 * </p>
	 */
	public static McObfPair func_77030_a = McMappingDatabase.getSRG("RenderLivingBase.func_77030_a");

	/**
	 * <p>
	 * Name: renderLayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177093_a = McMappingDatabase.getSRG("RenderLivingBase.func_177093_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147923_a = McMappingDatabase.getSRG("field_147923_a");

	/**
	 * <p>
	 * Name: setDoRenderBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)Z]
	 * </p>
	 */
	public static McObfPair func_177090_c = McMappingDatabase.getSRG("RenderLivingBase.func_177090_c");

	/**
	 * <p>
	 * Name: layerRenderers
	 * </p>
	 */
	public static McObfPair field_177097_h = McMappingDatabase.getSRG("field_177097_h");

	/**
	 * <p>
	 * Name: renderName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDD)V, (Lnet/minecraft/entity/EntityLivingBase;DDD)V]
	 * </p>
	 */
	public static McObfPair func_177067_a = McMappingDatabase.getSRG("RenderLivingBase.func_177067_a");

	/**
	 * <p>
	 * Name: unsetScoreTeamColor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180565_e = McMappingDatabase.getSRG("RenderLivingBase.func_180565_e");

	/**
	 * <p>
	 * Name: getSwingProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)F]
	 * </p>
	 */
	public static McObfPair func_77040_d = McMappingDatabase.getSRG("RenderLivingBase.func_77040_d");

	/**
	 * <p>
	 * Name: renderModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_77036_a = McMappingDatabase.getSRG("RenderLivingBase.func_77036_a");

	/**
	 * <p>
	 * Name: renderMarker
	 * </p>
	 */
	public static McObfPair field_188323_j = McMappingDatabase.getSRG("field_188323_j");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderLivingBase.func_76986_a");

	/**
	 * <p>
	 * Name: setScoreTeamColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_177088_c = McMappingDatabase.getSRG("RenderLivingBase.func_177088_c");

	/**
	 * <p>
	 * Name: setBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FZ)Z]
	 * </p>
	 */
	public static McObfPair func_177092_a = McMappingDatabase.getSRG("RenderLivingBase.func_177092_a");

	/**
	 * <p>
	 * Name: brightnessBuffer
	 * </p>
	 */
	public static McObfPair field_177095_g = McMappingDatabase.getSRG("field_177095_g");

	/**
	 * <p>
	 * Name: TEXTURE_BRIGHTNESS
	 * </p>
	 */
	public static McObfPair field_177096_e = McMappingDatabase.getSRG("field_177096_e");

}
