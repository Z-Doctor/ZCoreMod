package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buq";
		else
			return "net/minecraft/client/renderer/EntityRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buq";
		else
			return "EntityRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuq;";
		else
			return "Lnet/minecraft/client/renderer/EntityRenderer;";
	}

	/**
	 * <p>
	 * Name: drawNameplate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/FontRenderer;Ljava/lang/String;FFFIFFZZ)V]
	 * </p>
	 */
	public static McObfPair func_189692_a = McMappingDatabase.getSRG("EntityRenderer.func_189692_a");

	/**
	 * <p>
	 * Name: resourceManager
	 * </p>
	 */
	public static McObfPair field_147711_ac = McMappingDatabase.getSRG("field_147711_ac");

	/**
	 * <p>
	 * Name: torchFlickerDX
	 * </p>
	 */
	public static McObfPair field_175075_L = McMappingDatabase.getSRG("field_175075_L");

	/**
	 * <p>
	 * Name: fogColorBuffer
	 * </p>
	 */
	public static McObfPair field_78521_m = McMappingDatabase.getSRG("field_78521_m");

	/**
	 * <p>
	 * Name: SHADER_COUNT
	 * </p>
	 */
	public static McObfPair field_147708_e = McMappingDatabase.getSRG("field_147708_e");

	/**
	 * <p>
	 * Name: getMouseOver
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78473_a = McMappingDatabase.getSRG("EntityRenderer.func_78473_a");

	/**
	 * <p>
	 * Name: updateLightmap
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78472_g = McMappingDatabase.getSRG("EntityRenderer.func_78472_g");

	/**
	 * <p>
	 * Name: fogColor1
	 * </p>
	 */
	public static McObfPair field_78539_ae = McMappingDatabase.getSRG("field_78539_ae");

	/**
	 * <p>
	 * Name: thirdPersonDistancePrev
	 * </p>
	 */
	public static McObfPair field_78491_C = McMappingDatabase.getSRG("field_78491_C");

	/**
	 * <p>
	 * Name: itemActivationOffY
	 * </p>
	 */
	public static McObfPair field_190569_ae = McMappingDatabase.getSRG("field_190569_ae");

	/**
	 * <p>
	 * Name: debugViewDirection
	 * </p>
	 */
	public static McObfPair field_175079_V = McMappingDatabase.getSRG("field_175079_V");

	/**
	 * <p>
	 * Name: setupFog
	 * </p>
	 * <p>
	 * Desc: [(IF)V]
	 * </p>
	 */
	public static McObfPair func_78468_a = McMappingDatabase.getSRG("EntityRenderer.func_78468_a");

	/**
	 * <p>
	 * Name: addRainParticles
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78484_h = McMappingDatabase.getSRG("EntityRenderer.func_78484_h");

	/**
	 * <p>
	 * Name: cameraYaw
	 * </p>
	 */
	public static McObfPair field_78502_W = McMappingDatabase.getSRG("field_78502_W");

	/**
	 * <p>
	 * Name: smoothCamFilterX
	 * </p>
	 */
	public static McObfPair field_78498_J = McMappingDatabase.getSRG("field_78498_J");

	/**
	 * <p>
	 * Name: lightmapUpdateNeeded
	 * </p>
	 */
	public static McObfPair field_78536_aa = McMappingDatabase.getSRG("field_78536_aa");

	/**
	 * <p>
	 * Name: setupFogColor
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_191514_d = McMappingDatabase.getSRG("EntityRenderer.func_191514_d");

	/**
	 * <p>
	 * Name: getShaderGroup
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/shader/ShaderGroup;]
	 * </p>
	 */
	public static McObfPair func_147706_e = McMappingDatabase.getSRG("EntityRenderer.func_147706_e");

	/**
	 * <p>
	 * Name: applyBobbing
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78475_f = McMappingDatabase.getSRG("EntityRenderer.func_78475_f");

	/**
	 * <p>
	 * Name: fovModifierHand
	 * </p>
	 */
	public static McObfPair field_78507_R = McMappingDatabase.getSRG("field_78507_R");

	/**
	 * <p>
	 * Name: renderHand
	 * </p>
	 * <p>
	 * Desc: [(FI)V]
	 * </p>
	 */
	public static McObfPair func_78476_b = McMappingDatabase.getSRG("EntityRenderer.func_78476_b");

	/**
	 * <p>
	 * Name: shaderIndex
	 * </p>
	 */
	public static McObfPair field_147713_ae = McMappingDatabase.getSRG("field_147713_ae");

	/**
	 * <p>
	 * Name: debugView
	 * </p>
	 */
	public static McObfPair field_175078_W = McMappingDatabase.getSRG("field_175078_W");

	/**
	 * <p>
	 * Name: renderWorld
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_78471_a = McMappingDatabase.getSRG("EntityRenderer.func_78471_a");

	/**
	 * <p>
	 * Name: rainXCoords
	 * </p>
	 */
	public static McObfPair field_175076_N = McMappingDatabase.getSRG("field_175076_N");

	/**
	 * <p>
	 * Name: isShaderActive
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_147702_a = McMappingDatabase.getSRG("EntityRenderer.func_147702_a");

	/**
	 * <p>
	 * Name: getMapItemRenderer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/MapItemRenderer;]
	 * </p>
	 */
	public static McObfPair func_147701_i = McMappingDatabase.getSRG("EntityRenderer.func_147701_i");

	/**
	 * <p>
	 * Name: updateFogColor
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78466_h = McMappingDatabase.getSRG("EntityRenderer.func_78466_h");

	/**
	 * <p>
	 * Name: farPlaneDistance
	 * </p>
	 */
	public static McObfPair field_78530_s = McMappingDatabase.getSRG("field_78530_s");

	/**
	 * <p>
	 * Name: updateShaderGroupSize
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_147704_a = McMappingDatabase.getSRG("EntityRenderer.func_147704_a");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("EntityRenderer.func_110549_a");

	/**
	 * <p>
	 * Name: itemActivationItem
	 * </p>
	 */
	public static McObfPair field_190566_ab = McMappingDatabase.getSRG("field_190566_ab");

	/**
	 * <p>
	 * Name: renderHand
	 * </p>
	 */
	public static McObfPair field_175074_C = McMappingDatabase.getSRG("field_175074_C");

	/**
	 * <p>
	 * Name: rainSoundCounter
	 * </p>
	 */
	public static McObfPair field_78534_ac = McMappingDatabase.getSRG("field_78534_ac");

	/**
	 * <p>
	 * Name: switchUseShader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175071_c = McMappingDatabase.getSRG("EntityRenderer.func_175071_c");

	/**
	 * <p>
	 * Name: disableLightmap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175072_h = McMappingDatabase.getSRG("EntityRenderer.func_175072_h");

	/**
	 * <p>
	 * Name: RAIN_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110924_q = McMappingDatabase.getSRG("field_110924_q");

	/**
	 * <p>
	 * Name: smoothCamFilterY
	 * </p>
	 */
	public static McObfPair field_78499_K = McMappingDatabase.getSRG("field_78499_K");

	/**
	 * <p>
	 * Name: anaglyphField
	 * </p>
	 */
	public static McObfPair field_78515_b = McMappingDatabase.getSRG("field_78515_b");

	/**
	 * <p>
	 * Name: smoothCamPartialTicks
	 * </p>
	 */
	public static McObfPair field_78492_L = McMappingDatabase.getSRG("field_78492_L");

	/**
	 * <p>
	 * Name: thirdPersonDistance
	 * </p>
	 */
	public static McObfPair field_78490_B = McMappingDatabase.getSRG("field_78490_B");

	/**
	 * <p>
	 * Name: enableLightmap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180436_i = McMappingDatabase.getSRG("EntityRenderer.func_180436_i");

	/**
	 * <p>
	 * Name: shaderGroup
	 * </p>
	 */
	public static McObfPair field_147707_d = McMappingDatabase.getSRG("field_147707_d");

	/**
	 * <p>
	 * Name: fogColorRed
	 * </p>
	 */
	public static McObfPair field_175080_Q = McMappingDatabase.getSRG("field_175080_Q");

	/**
	 * <p>
	 * Name: loadEntityShader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_175066_a = McMappingDatabase.getSRG("EntityRenderer.func_175066_a");

	/**
	 * <p>
	 * Name: fovModifierHandPrev
	 * </p>
	 */
	public static McObfPair field_78506_S = McMappingDatabase.getSRG("field_78506_S");

	/**
	 * <p>
	 * Name: createWorldIcon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184373_n = McMappingDatabase.getSRG("EntityRenderer.func_184373_n");

	/**
	 * <p>
	 * Name: hurtCameraEffect
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78482_e = McMappingDatabase.getSRG("EntityRenderer.func_78482_e");

	/**
	 * <p>
	 * Name: mouseFilterXAxis
	 * </p>
	 */
	public static McObfPair field_78527_v = McMappingDatabase.getSRG("field_78527_v");

	/**
	 * <p>
	 * Name: anaglyphEnable
	 * </p>
	 */
	public static McObfPair field_78517_a = McMappingDatabase.getSRG("field_78517_a");

	/**
	 * <p>
	 * Name: pointedEntity
	 * </p>
	 */
	public static McObfPair field_78528_u = McMappingDatabase.getSRG("field_78528_u");

	/**
	 * <p>
	 * Name: updateCameraAndRender
	 * </p>
	 * <p>
	 * Desc: [(FJ)V]
	 * </p>
	 */
	public static McObfPair func_181560_a = McMappingDatabase.getSRG("EntityRenderer.func_181560_a");

	/**
	 * <p>
	 * Name: displayItemActivation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_190565_a = McMappingDatabase.getSRG("EntityRenderer.func_190565_a");

	/**
	 * <p>
	 * Name: prevFrameTime
	 * </p>
	 */
	public static McObfPair field_78508_Y = McMappingDatabase.getSRG("field_78508_Y");

	/**
	 * <p>
	 * Name: rainYCoords
	 * </p>
	 */
	public static McObfPair field_175077_O = McMappingDatabase.getSRG("field_175077_O");

	/**
	 * <p>
	 * Name: smoothCamYaw
	 * </p>
	 */
	public static McObfPair field_78496_H = McMappingDatabase.getSRG("field_78496_H");

	/**
	 * <p>
	 * Name: useShader
	 * </p>
	 */
	public static McObfPair field_175083_ad = McMappingDatabase.getSRG("field_175083_ad");

	/**
	 * <p>
	 * Name: rendererUpdateCount
	 * </p>
	 */
	public static McObfPair field_78529_t = McMappingDatabase.getSRG("field_78529_t");

	/**
	 * <p>
	 * Name: renderItemActivation
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_190563_a = McMappingDatabase.getSRG("EntityRenderer.func_190563_a");

	/**
	 * <p>
	 * Name: itemActivationTicks
	 * </p>
	 */
	public static McObfPair field_190567_ac = McMappingDatabase.getSRG("field_190567_ac");

	/**
	 * <p>
	 * Name: stopUseShader
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_181022_b = McMappingDatabase.getSRG("EntityRenderer.func_181022_b");

	/**
	 * <p>
	 * Name: bossColorModifierPrev
	 * </p>
	 */
	public static McObfPair field_82832_V = McMappingDatabase.getSRG("field_82832_V");

	/**
	 * <p>
	 * Name: lightmapColors
	 * </p>
	 */
	public static McObfPair field_78504_Q = McMappingDatabase.getSRG("field_78504_Q");

	/**
	 * <p>
	 * Name: cameraPitch
	 * </p>
	 */
	public static McObfPair field_78509_X = McMappingDatabase.getSRG("field_78509_X");

	/**
	 * <p>
	 * Name: cloudFog
	 * </p>
	 */
	public static McObfPair field_78500_U = McMappingDatabase.getSRG("field_78500_U");

	/**
	 * <p>
	 * Name: itemActivationOffX
	 * </p>
	 */
	public static McObfPair field_190568_ad = McMappingDatabase.getSRG("field_190568_ad");

	/**
	 * <p>
	 * Name: renderWorldPass
	 * </p>
	 * <p>
	 * Desc: [(IFJ)V]
	 * </p>
	 */
	public static McObfPair func_175068_a = McMappingDatabase.getSRG("EntityRenderer.func_175068_a");

	/**
	 * <p>
	 * Name: getNightVisionBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)F]
	 * </p>
	 */
	public static McObfPair func_180438_a = McMappingDatabase.getSRG("EntityRenderer.func_180438_a");

	/**
	 * <p>
	 * Name: SNOW_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110923_r = McMappingDatabase.getSRG("field_110923_r");

	/**
	 * <p>
	 * Name: setupOverlayRendering
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78478_c = McMappingDatabase.getSRG("EntityRenderer.func_78478_c");

	/**
	 * <p>
	 * Name: drawBlockOutline
	 * </p>
	 */
	public static McObfPair field_175073_D = McMappingDatabase.getSRG("field_175073_D");

	/**
	 * <p>
	 * Name: bossColorModifier
	 * </p>
	 */
	public static McObfPair field_82831_U = McMappingDatabase.getSRG("field_82831_U");

	/**
	 * <p>
	 * Name: renderCloudsCheck
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/RenderGlobal;FIDDD)V]
	 * </p>
	 */
	public static McObfPair func_180437_a = McMappingDatabase.getSRG("EntityRenderer.func_180437_a");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_78531_r = McMappingDatabase.getSRG("field_78531_r");

	/**
	 * <p>
	 * Name: updateFovModifierHand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78477_e = McMappingDatabase.getSRG("EntityRenderer.func_78477_e");

	/**
	 * <p>
	 * Name: fogColorGreen
	 * </p>
	 */
	public static McObfPair field_175082_R = McMappingDatabase.getSRG("field_175082_R");

	/**
	 * <p>
	 * Name: itemRenderer
	 * </p>
	 */
	public static McObfPair field_78516_c = McMappingDatabase.getSRG("field_78516_c");

	/**
	 * <p>
	 * Name: updateTorchFlicker
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78470_f = McMappingDatabase.getSRG("EntityRenderer.func_78470_f");

	/**
	 * <p>
	 * Name: orientCamera
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78467_g = McMappingDatabase.getSRG("EntityRenderer.func_78467_g");

	/**
	 * <p>
	 * Name: renderEndNanoTime
	 * </p>
	 */
	public static McObfPair field_78510_Z = McMappingDatabase.getSRG("field_78510_Z");

	/**
	 * <p>
	 * Name: updateRenderer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78464_a = McMappingDatabase.getSRG("EntityRenderer.func_78464_a");

	/**
	 * <p>
	 * Name: cameraZoom
	 * </p>
	 */
	public static McObfPair field_78503_V = McMappingDatabase.getSRG("field_78503_V");

	/**
	 * <p>
	 * Name: locationLightMap
	 * </p>
	 */
	public static McObfPair field_110922_T = McMappingDatabase.getSRG("field_110922_T");

	/**
	 * <p>
	 * Name: renderRainSnow
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78474_d = McMappingDatabase.getSRG("EntityRenderer.func_78474_d");

	/**
	 * <p>
	 * Name: renderStreamIndicator
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_152430_c = McMappingDatabase.getSRG("EntityRenderer.func_152430_c");

	/**
	 * <p>
	 * Name: mouseFilterYAxis
	 * </p>
	 */
	public static McObfPair field_78526_w = McMappingDatabase.getSRG("field_78526_w");

	/**
	 * <p>
	 * Name: isDrawBlockOutline
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175070_n = McMappingDatabase.getSRG("EntityRenderer.func_175070_n");

	/**
	 * <p>
	 * Name: loadShader
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_175069_a = McMappingDatabase.getSRG("EntityRenderer.func_175069_a");

	/**
	 * <p>
	 * Name: mapItemRenderer
	 * </p>
	 */
	public static McObfPair field_147709_v = McMappingDatabase.getSRG("field_147709_v");

	/**
	 * <p>
	 * Name: setupCameraTransform
	 * </p>
	 * <p>
	 * Desc: [(FI)V]
	 * </p>
	 */
	public static McObfPair func_78479_a = McMappingDatabase.getSRG("EntityRenderer.func_78479_a");

	/**
	 * <p>
	 * Name: fogColor2
	 * </p>
	 */
	public static McObfPair field_78535_ad = McMappingDatabase.getSRG("field_78535_ad");

	/**
	 * <p>
	 * Name: frameCount
	 * </p>
	 */
	public static McObfPair field_175084_ae = McMappingDatabase.getSRG("field_175084_ae");

	/**
	 * <p>
	 * Name: lightmapTexture
	 * </p>
	 */
	public static McObfPair field_78513_d = McMappingDatabase.getSRG("field_78513_d");

	/**
	 * <p>
	 * Name: smoothCamPitch
	 * </p>
	 */
	public static McObfPair field_78497_I = McMappingDatabase.getSRG("field_78497_I");

	/**
	 * <p>
	 * Name: torchFlickerX
	 * </p>
	 */
	public static McObfPair field_78514_e = McMappingDatabase.getSRG("field_78514_e");

	/**
	 * <p>
	 * Name: resetData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190564_k = McMappingDatabase.getSRG("EntityRenderer.func_190564_k");

	/**
	 * <p>
	 * Name: setFogColorBuffer
	 * </p>
	 * <p>
	 * Desc: [(FFFF)Ljava/nio/FloatBuffer;]
	 * </p>
	 */
	public static McObfPair func_78469_a = McMappingDatabase.getSRG("EntityRenderer.func_78469_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147710_q = McMappingDatabase.getSRG("field_147710_q");

	/**
	 * <p>
	 * Name: getFOVModifier
	 * </p>
	 * <p>
	 * Desc: [(FZ)F]
	 * </p>
	 */
	public static McObfPair func_78481_a = McMappingDatabase.getSRG("EntityRenderer.func_78481_a");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_78537_ab = McMappingDatabase.getSRG("field_78537_ab");

	/**
	 * <p>
	 * Name: SHADERS_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147712_ad = McMappingDatabase.getSRG("field_147712_ad");

	/**
	 * <p>
	 * Name: timeWorldIcon
	 * </p>
	 */
	public static McObfPair field_184374_E = McMappingDatabase.getSRG("field_184374_E");

	/**
	 * <p>
	 * Name: fogColorBlue
	 * </p>
	 */
	public static McObfPair field_175081_S = McMappingDatabase.getSRG("field_175081_S");

}
