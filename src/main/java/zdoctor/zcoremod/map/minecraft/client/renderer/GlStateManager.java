package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus";
		else
			return "net/minecraft/client/renderer/GlStateManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus";
		else
			return "GlStateManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager;";
	}

	/**
	 * <p>
	 * Name: glEnd
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187437_J = McMappingDatabase.getSRG("GlStateManager.func_187437_J");

	/**
	 * <p>
	 * Name: glDrawArrays
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_187439_f = McMappingDatabase.getSRG("GlStateManager.func_187439_f");

	/**
	 * <p>
	 * Name: glGetError
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_187434_L = McMappingDatabase.getSRG("GlStateManager.func_187434_L");

	/**
	 * <p>
	 * Name: disableLight
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179122_b = McMappingDatabase.getSRG("GlStateManager.func_179122_b");

	/**
	 * <p>
	 * Name: glColorPointer
	 * </p>
	 * <p>
	 * Desc: [(IIILjava/nio/ByteBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187400_c = McMappingDatabase.getSRG("GlStateManager.func_187400_c");

	/**
	 * <p>
	 * Name: glVertex3f
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_187435_e = McMappingDatabase.getSRG("GlStateManager.func_187435_e");

	/**
	 * <p>
	 * Name: colorState
	 * </p>
	 */
	public static McObfPair field_179170_t = McMappingDatabase.getSRG("field_179170_t");

	/**
	 * <p>
	 * Name: callList
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179148_o = McMappingDatabase.getSRG("GlStateManager.func_179148_o");

	/**
	 * <p>
	 * Name: scale
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_179152_a = McMappingDatabase.getSRG("GlStateManager.func_179152_a");

	/**
	 * <p>
	 * Name: alphaFunc
	 * </p>
	 * <p>
	 * Desc: [(IF)V]
	 * </p>
	 */
	public static McObfPair func_179092_a = McMappingDatabase.getSRG("GlStateManager.func_179092_a");

	/**
	 * <p>
	 * Name: glNormal3f
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_187432_a = McMappingDatabase.getSRG("GlStateManager.func_187432_a");

	/**
	 * <p>
	 * Name: disableColorMaterial
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179119_h = McMappingDatabase.getSRG("GlStateManager.func_179119_h");

	/**
	 * <p>
	 * Name: enableColorLogic
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179115_u = McMappingDatabase.getSRG("GlStateManager.func_179115_u");

	/**
	 * <p>
	 * Name: BUF_FLOAT_4
	 * </p>
	 */
	public static McObfPair field_187451_b = McMappingDatabase.getSRG("field_187451_b");

	/**
	 * <p>
	 * Name: texGenCoord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$TexGen;)Lnet/minecraft/client/renderer/GlStateManager$TexGenCoord;]
	 * </p>
	 */
	public static McObfPair func_179125_c = McMappingDatabase.getSRG("GlStateManager.func_179125_c");

	/**
	 * <p>
	 * Name: cullState
	 * </p>
	 */
	public static McObfPair field_179167_h = McMappingDatabase.getSRG("field_179167_h");

	/**
	 * <p>
	 * Name: setFog
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179093_d = McMappingDatabase.getSRG("GlStateManager.func_179093_d");

	/**
	 * <p>
	 * Name: fogState
	 * </p>
	 */
	public static McObfPair field_179155_g = McMappingDatabase.getSRG("field_179155_g");

	/**
	 * <p>
	 * Name: lightingState
	 * </p>
	 */
	public static McObfPair field_179158_b = McMappingDatabase.getSRG("field_179158_b");

	/**
	 * <p>
	 * Name: enableDepth
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179126_j = McMappingDatabase.getSRG("GlStateManager.func_179126_j");

	/**
	 * <p>
	 * Name: colorMaskState
	 * </p>
	 */
	public static McObfPair field_179171_s = McMappingDatabase.getSRG("field_179171_s");

	/**
	 * <p>
	 * Name: cullFace
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179107_e = McMappingDatabase.getSRG("GlStateManager.func_179107_e");

	/**
	 * <p>
	 * Name: depthFunc
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179143_c = McMappingDatabase.getSRG("GlStateManager.func_179143_c");

	/**
	 * <p>
	 * Name: shadeModel
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179103_j = McMappingDatabase.getSRG("GlStateManager.func_179103_j");

	/**
	 * <p>
	 * Name: blendFunc
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_179112_b = McMappingDatabase.getSRG("GlStateManager.func_179112_b");

	/**
	 * <p>
	 * Name: disableFog
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179106_n = McMappingDatabase.getSRG("GlStateManager.func_179106_n");

	/**
	 * <p>
	 * Name: disableAlpha
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179118_c = McMappingDatabase.getSRG("GlStateManager.func_179118_c");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_179111_a = McMappingDatabase.getSRG("GlStateManager.func_179111_a");

	/**
	 * <p>
	 * Name: translate
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_179109_b = McMappingDatabase.getSRG("GlStateManager.func_179109_b");

	/**
	 * <p>
	 * Name: glGenLists
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_187442_t = McMappingDatabase.getSRG("GlStateManager.func_187442_t");

	/**
	 * <p>
	 * Name: enableBlend
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179147_l = McMappingDatabase.getSRG("GlStateManager.func_179147_l");

	/**
	 * <p>
	 * Name: enableOutlineMode
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187431_e = McMappingDatabase.getSRG("GlStateManager.func_187431_e");

	/**
	 * <p>
	 * Name: enablePolygonOffset
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179088_q = McMappingDatabase.getSRG("GlStateManager.func_179088_q");

	/**
	 * <p>
	 * Name: glTexImage2D
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187419_a = McMappingDatabase.getSRG("GlStateManager.func_187419_a");

	/**
	 * <p>
	 * Name: enableAlpha
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179141_d = McMappingDatabase.getSRG("GlStateManager.func_179141_d");

	/**
	 * <p>
	 * Name: glFog
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187402_b = McMappingDatabase.getSRG("GlStateManager.func_187402_b");

	/**
	 * <p>
	 * Name: activeTextureUnit
	 * </p>
	 */
	public static McObfPair field_179162_o = McMappingDatabase.getSRG("field_179162_o");

	/**
	 * <p>
	 * Name: disableTexGenCoord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$TexGen;)V]
	 * </p>
	 */
	public static McObfPair func_179100_b = McMappingDatabase.getSRG("GlStateManager.func_179100_b");

	/**
	 * <p>
	 * Name: glLineWidth
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_187441_d = McMappingDatabase.getSRG("GlStateManager.func_187441_d");

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Quaternion;)V]
	 * </p>
	 */
	public static McObfPair func_187444_a = McMappingDatabase.getSRG("GlStateManager.func_187444_a");

	/**
	 * <p>
	 * Name: setActiveTexture
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179138_g = McMappingDatabase.getSRG("GlStateManager.func_179138_g");

	/**
	 * <p>
	 * Name: glGetString
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_187416_u = McMappingDatabase.getSRG("GlStateManager.func_187416_u");

	/**
	 * <p>
	 * Name: loadIdentity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179096_D = McMappingDatabase.getSRG("GlStateManager.func_179096_D");

	/**
	 * <p>
	 * Name: colorMask
	 * </p>
	 * <p>
	 * Desc: [(ZZZZ)V]
	 * </p>
	 */
	public static McObfPair func_179135_a = McMappingDatabase.getSRG("GlStateManager.func_179135_a");

	/**
	 * <p>
	 * Name: lightState
	 * </p>
	 */
	public static McObfPair field_179159_c = McMappingDatabase.getSRG("field_179159_c");

	/**
	 * <p>
	 * Name: disableNormalize
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179133_A = McMappingDatabase.getSRG("GlStateManager.func_179133_A");

	/**
	 * <p>
	 * Name: glTexParameteri
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_187421_b = McMappingDatabase.getSRG("GlStateManager.func_187421_b");

	/**
	 * <p>
	 * Name: glBegin
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187447_r = McMappingDatabase.getSRG("GlStateManager.func_187447_r");

	/**
	 * <p>
	 * Name: glNormalPointer
	 * </p>
	 * <p>
	 * Desc: [(IILjava/nio/ByteBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187446_a = McMappingDatabase.getSRG("GlStateManager.func_187446_a");

	/**
	 * <p>
	 * Name: enableFog
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179127_m = McMappingDatabase.getSRG("GlStateManager.func_179127_m");

	/**
	 * <p>
	 * Name: multMatrix
	 * </p>
	 * <p>
	 * Desc: [(Ljava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_179110_a = McMappingDatabase.getSRG("GlStateManager.func_179110_a");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179086_m = McMappingDatabase.getSRG("GlStateManager.func_179086_m");

	/**
	 * <p>
	 * Name: blendState
	 * </p>
	 */
	public static McObfPair field_179157_e = McMappingDatabase.getSRG("field_179157_e");

	/**
	 * <p>
	 * Name: disableLighting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179140_f = McMappingDatabase.getSRG("GlStateManager.func_179140_f");

	/**
	 * <p>
	 * Name: activeShadeModel
	 * </p>
	 */
	public static McObfPair field_179173_q = McMappingDatabase.getSRG("field_179173_q");

	/**
	 * <p>
	 * Name: glCopyTexSubImage2D
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIII)V]
	 * </p>
	 */
	public static McObfPair func_187443_a = McMappingDatabase.getSRG("GlStateManager.func_187443_a");

	/**
	 * <p>
	 * Name: cullFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$CullFace;)V]
	 * </p>
	 */
	public static McObfPair func_187407_a = McMappingDatabase.getSRG("GlStateManager.func_187407_a");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_179124_c = McMappingDatabase.getSRG("GlStateManager.func_179124_c");

	/**
	 * <p>
	 * Name: setFogDensity
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_179095_a = McMappingDatabase.getSRG("GlStateManager.func_179095_a");

	/**
	 * <p>
	 * Name: disableColorLogic
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179134_v = McMappingDatabase.getSRG("GlStateManager.func_179134_v");

	/**
	 * <p>
	 * Name: disableOutlineMode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187417_n = McMappingDatabase.getSRG("GlStateManager.func_187417_n");

	/**
	 * <p>
	 * Name: textureState
	 * </p>
	 */
	public static McObfPair field_179174_p = McMappingDatabase.getSRG("field_179174_p");

	/**
	 * <p>
	 * Name: glGetTexLevelParameteri
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_187411_c = McMappingDatabase.getSRG("GlStateManager.func_187411_c");

	/**
	 * <p>
	 * Name: enableColorMaterial
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179142_g = McMappingDatabase.getSRG("GlStateManager.func_179142_g");

	/**
	 * <p>
	 * Name: disableTexture2D
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179090_x = McMappingDatabase.getSRG("GlStateManager.func_179090_x");

	/**
	 * <p>
	 * Name: enableLight
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179085_a = McMappingDatabase.getSRG("GlStateManager.func_179085_a");

	/**
	 * <p>
	 * Name: glReadPixels
	 * </p>
	 * <p>
	 * Desc: [(IIIIIILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187413_a = McMappingDatabase.getSRG("GlStateManager.func_187413_a");

	/**
	 * <p>
	 * Name: colorMaterial
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_179104_a = McMappingDatabase.getSRG("GlStateManager.func_179104_a");

	/**
	 * <p>
	 * Name: glVertexPointer
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_187420_d = McMappingDatabase.getSRG("GlStateManager.func_187420_d");

	/**
	 * <p>
	 * Name: generateTexture
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179146_y = McMappingDatabase.getSRG("GlStateManager.func_179146_y");

	/**
	 * <p>
	 * Name: glDisableClientState
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187429_p = McMappingDatabase.getSRG("GlStateManager.func_187429_p");

	/**
	 * <p>
	 * Name: setFogStart
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_179102_b = McMappingDatabase.getSRG("GlStateManager.func_179102_b");

	/**
	 * <p>
	 * Name: clearState
	 * </p>
	 */
	public static McObfPair field_179163_l = McMappingDatabase.getSRG("field_179163_l");

	/**
	 * <p>
	 * Name: resetColor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179117_G = McMappingDatabase.getSRG("GlStateManager.func_179117_G");

	/**
	 * <p>
	 * Name: enableNormalize
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179108_z = McMappingDatabase.getSRG("GlStateManager.func_179108_z");

	/**
	 * <p>
	 * Name: scale
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_179139_a = McMappingDatabase.getSRG("GlStateManager.func_179139_a");

	/**
	 * <p>
	 * Name: glTexSubImage2D
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187414_b = McMappingDatabase.getSRG("GlStateManager.func_187414_b");

	/**
	 * <p>
	 * Name: matrixMode
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179128_n = McMappingDatabase.getSRG("GlStateManager.func_179128_n");

	/**
	 * <p>
	 * Name: viewport
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_179083_b = McMappingDatabase.getSRG("GlStateManager.func_179083_b");

	/**
	 * <p>
	 * Name: glTexEnvf
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_187436_a = McMappingDatabase.getSRG("GlStateManager.func_187436_a");

	/**
	 * <p>
	 * Name: doPolygonOffset
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_179136_a = McMappingDatabase.getSRG("GlStateManager.func_179136_a");

	/**
	 * <p>
	 * Name: glEnableClientState
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187410_q = McMappingDatabase.getSRG("GlStateManager.func_187410_q");

	/**
	 * <p>
	 * Name: disableBlend
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179084_k = McMappingDatabase.getSRG("GlStateManager.func_179084_k");

	/**
	 * <p>
	 * Name: alphaState
	 * </p>
	 */
	public static McObfPair field_179160_a = McMappingDatabase.getSRG("field_179160_a");

	/**
	 * <p>
	 * Name: disableDepth
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179097_i = McMappingDatabase.getSRG("GlStateManager.func_179097_i");

	/**
	 * <p>
	 * Name: glFogi
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_187412_c = McMappingDatabase.getSRG("GlStateManager.func_187412_c");

	/**
	 * <p>
	 * Name: disableCull
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179129_p = McMappingDatabase.getSRG("GlStateManager.func_179129_p");

	/**
	 * <p>
	 * Name: setFog
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$FogMode;)V]
	 * </p>
	 */
	public static McObfPair func_187430_a = McMappingDatabase.getSRG("GlStateManager.func_187430_a");

	/**
	 * <p>
	 * Name: rescaleNormalState
	 * </p>
	 */
	public static McObfPair field_179172_r = McMappingDatabase.getSRG("field_179172_r");

	/**
	 * <p>
	 * Name: glTexEnvi
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_187399_a = McMappingDatabase.getSRG("GlStateManager.func_187399_a");

	/**
	 * <p>
	 * Name: popMatrix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179121_F = McMappingDatabase.getSRG("GlStateManager.func_179121_F");

	/**
	 * <p>
	 * Name: translate
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_179137_b = McMappingDatabase.getSRG("GlStateManager.func_179137_b");

	/**
	 * <p>
	 * Name: glGetInteger
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187445_a = McMappingDatabase.getSRG("GlStateManager.func_187445_a");

	/**
	 * <p>
	 * Name: normalizeState
	 * </p>
	 */
	public static McObfPair field_179161_n = McMappingDatabase.getSRG("field_179161_n");

	/**
	 * <p>
	 * Name: texGen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$TexGen;ILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_179105_a = McMappingDatabase.getSRG("GlStateManager.func_179105_a");

	/**
	 * <p>
	 * Name: disableBlendProfile
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$Profile;)V]
	 * </p>
	 */
	public static McObfPair func_187440_b = McMappingDatabase.getSRG("GlStateManager.func_187440_b");

	/**
	 * <p>
	 * Name: enableRescaleNormal
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179091_B = McMappingDatabase.getSRG("GlStateManager.func_179091_B");

	/**
	 * <p>
	 * Name: glVertexPointer
	 * </p>
	 * <p>
	 * Desc: [(IIILjava/nio/ByteBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187427_b = McMappingDatabase.getSRG("GlStateManager.func_187427_b");

	/**
	 * <p>
	 * Name: glTexCoordPointer
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_187405_c = McMappingDatabase.getSRG("GlStateManager.func_187405_c");

	/**
	 * <p>
	 * Name: glBlendEquation
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_187398_d = McMappingDatabase.getSRG("GlStateManager.func_187398_d");

	/**
	 * <p>
	 * Name: glTexParameterf
	 * </p>
	 * <p>
	 * Desc: [(IIF)V]
	 * </p>
	 */
	public static McObfPair func_187403_b = McMappingDatabase.getSRG("GlStateManager.func_187403_b");

	/**
	 * <p>
	 * Name: tryBlendFuncSeparate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V]
	 * </p>
	 */
	public static McObfPair func_187428_a = McMappingDatabase.getSRG("GlStateManager.func_187428_a");

	/**
	 * <p>
	 * Name: glTexCoordPointer
	 * </p>
	 * <p>
	 * Desc: [(IIILjava/nio/ByteBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187404_a = McMappingDatabase.getSRG("GlStateManager.func_187404_a");

	/**
	 * <p>
	 * Name: glGetTexImage
	 * </p>
	 * <p>
	 * Desc: [(IIIILjava/nio/IntBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187433_a = McMappingDatabase.getSRG("GlStateManager.func_187433_a");

	/**
	 * <p>
	 * Name: pushMatrix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179094_E = McMappingDatabase.getSRG("GlStateManager.func_179094_E");

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_179114_b = McMappingDatabase.getSRG("GlStateManager.func_179114_b");

	/**
	 * <p>
	 * Name: stencilState
	 * </p>
	 */
	public static McObfPair field_179164_m = McMappingDatabase.getSRG("field_179164_m");

	/**
	 * <p>
	 * Name: enableTexGenCoord
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$TexGen;)V]
	 * </p>
	 */
	public static McObfPair func_179087_a = McMappingDatabase.getSRG("GlStateManager.func_179087_a");

	/**
	 * <p>
	 * Name: texGenState
	 * </p>
	 */
	public static McObfPair field_179166_k = McMappingDatabase.getSRG("field_179166_k");

	/**
	 * <p>
	 * Name: popAttrib
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179099_b = McMappingDatabase.getSRG("GlStateManager.func_179099_b");

	/**
	 * <p>
	 * Name: disablePolygonOffset
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179113_r = McMappingDatabase.getSRG("GlStateManager.func_179113_r");

	/**
	 * <p>
	 * Name: texGen
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$TexGen;I)V]
	 * </p>
	 */
	public static McObfPair func_179149_a = McMappingDatabase.getSRG("GlStateManager.func_179149_a");

	/**
	 * <p>
	 * Name: glDeleteLists
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_187449_e = McMappingDatabase.getSRG("GlStateManager.func_187449_e");

	/**
	 * <p>
	 * Name: enableTexture2D
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179098_w = McMappingDatabase.getSRG("GlStateManager.func_179098_w");

	/**
	 * <p>
	 * Name: colorLogicState
	 * </p>
	 */
	public static McObfPair field_179165_j = McMappingDatabase.getSRG("field_179165_j");

	/**
	 * <p>
	 * Name: blendFunc
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$SourceFactor;Lnet/minecraft/client/renderer/GlStateManager$DestFactor;)V]
	 * </p>
	 */
	public static McObfPair func_187401_a = McMappingDatabase.getSRG("GlStateManager.func_187401_a");

	/**
	 * <p>
	 * Name: glLight
	 * </p>
	 * <p>
	 * Desc: [(IILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187438_a = McMappingDatabase.getSRG("GlStateManager.func_187438_a");

	/**
	 * <p>
	 * Name: clearDepth
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_179151_a = McMappingDatabase.getSRG("GlStateManager.func_179151_a");

	/**
	 * <p>
	 * Name: glGetInteger
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_187397_v = McMappingDatabase.getSRG("GlStateManager.func_187397_v");

	/**
	 * <p>
	 * Name: clearColor
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_179082_a = McMappingDatabase.getSRG("GlStateManager.func_179082_a");

	/**
	 * <p>
	 * Name: quatToGlMatrix
	 * </p>
	 * <p>
	 * Desc: [(Ljava/nio/FloatBuffer;Lorg/lwjgl/util/vector/Quaternion;)Ljava/nio/FloatBuffer;]
	 * </p>
	 */
	public static McObfPair func_187418_a = McMappingDatabase.getSRG("GlStateManager.func_187418_a");

	/**
	 * <p>
	 * Name: ortho
	 * </p>
	 * <p>
	 * Desc: [(DDDDDD)V]
	 * </p>
	 */
	public static McObfPair func_179130_a = McMappingDatabase.getSRG("GlStateManager.func_179130_a");

	/**
	 * <p>
	 * Name: deleteTexture
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179150_h = McMappingDatabase.getSRG("GlStateManager.func_179150_h");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 * <p>
	 * Desc: [(FFFF)V]
	 * </p>
	 */
	public static McObfPair func_179131_c = McMappingDatabase.getSRG("GlStateManager.func_179131_c");

	/**
	 * <p>
	 * Name: glEndList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187415_K = McMappingDatabase.getSRG("GlStateManager.func_187415_K");

	/**
	 * <p>
	 * Name: glColorPointer
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_187406_e = McMappingDatabase.getSRG("GlStateManager.func_187406_e");

	/**
	 * <p>
	 * Name: pushAttrib
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179123_a = McMappingDatabase.getSRG("GlStateManager.func_179123_a");

	/**
	 * <p>
	 * Name: polygonOffsetState
	 * </p>
	 */
	public static McObfPair field_179168_i = McMappingDatabase.getSRG("field_179168_i");

	/**
	 * <p>
	 * Name: glNewList
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_187423_f = McMappingDatabase.getSRG("GlStateManager.func_187423_f");

	/**
	 * <p>
	 * Name: glLightModel
	 * </p>
	 * <p>
	 * Desc: [(ILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187424_a = McMappingDatabase.getSRG("GlStateManager.func_187424_a");

	/**
	 * <p>
	 * Name: BUF_FLOAT_16
	 * </p>
	 */
	public static McObfPair field_187450_a = McMappingDatabase.getSRG("field_187450_a");

	/**
	 * <p>
	 * Name: colorMaterialState
	 * </p>
	 */
	public static McObfPair field_179156_d = McMappingDatabase.getSRG("field_179156_d");

	/**
	 * <p>
	 * Name: tryBlendFuncSeparate
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_179120_a = McMappingDatabase.getSRG("GlStateManager.func_179120_a");

	/**
	 * <p>
	 * Name: glTexEnv
	 * </p>
	 * <p>
	 * Desc: [(IILjava/nio/FloatBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187448_b = McMappingDatabase.getSRG("GlStateManager.func_187448_b");

	/**
	 * <p>
	 * Name: depthState
	 * </p>
	 */
	public static McObfPair field_179154_f = McMappingDatabase.getSRG("field_179154_f");

	/**
	 * <p>
	 * Name: colorLogicOp
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179116_f = McMappingDatabase.getSRG("GlStateManager.func_179116_f");

	/**
	 * <p>
	 * Name: depthMask
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_179132_a = McMappingDatabase.getSRG("GlStateManager.func_179132_a");

	/**
	 * <p>
	 * Name: bindTexture
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_179144_i = McMappingDatabase.getSRG("GlStateManager.func_179144_i");

	/**
	 * <p>
	 * Name: glPolygonMode
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_187409_d = McMappingDatabase.getSRG("GlStateManager.func_187409_d");

	/**
	 * <p>
	 * Name: enableLighting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179145_e = McMappingDatabase.getSRG("GlStateManager.func_179145_e");

	/**
	 * <p>
	 * Name: colorLogicOp
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$LogicOp;)V]
	 * </p>
	 */
	public static McObfPair func_187422_a = McMappingDatabase.getSRG("GlStateManager.func_187422_a");

	/**
	 * <p>
	 * Name: glPixelStorei
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_187425_g = McMappingDatabase.getSRG("GlStateManager.func_187425_g");

	/**
	 * <p>
	 * Name: glTexCoord2f
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_187426_b = McMappingDatabase.getSRG("GlStateManager.func_187426_b");

	/**
	 * <p>
	 * Name: setFogEnd
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_179153_c = McMappingDatabase.getSRG("GlStateManager.func_179153_c");

	/**
	 * <p>
	 * Name: enableBlendProfile
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/GlStateManager$Profile;)V]
	 * </p>
	 */
	public static McObfPair func_187408_a = McMappingDatabase.getSRG("GlStateManager.func_187408_a");

	/**
	 * <p>
	 * Name: enableCull
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179089_o = McMappingDatabase.getSRG("GlStateManager.func_179089_o");

	/**
	 * <p>
	 * Name: disableRescaleNormal
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179101_C = McMappingDatabase.getSRG("GlStateManager.func_179101_C");

}
