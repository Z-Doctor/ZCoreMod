package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhz";
		else
			return "net/minecraft/client/renderer/RenderHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhz";
		else
			return "RenderHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhz;";
		else
			return "Lnet/minecraft/client/renderer/RenderHelper;";
	}

	/**
	 * <p>
	 * Name: enableGUIStandardItemLighting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74520_c = McMappingDatabase.getSRG("RenderHelper.func_74520_c");

	/**
	 * <p>
	 * Name: COLOR_BUFFER
	 * </p>
	 */
	public static McObfPair field_74522_a = McMappingDatabase.getSRG("field_74522_a");

	/**
	 * <p>
	 * Name: LIGHT1_POS
	 * </p>
	 */
	public static McObfPair field_82885_c = McMappingDatabase.getSRG("field_82885_c");

	/**
	 * <p>
	 * Name: setColorBuffer
	 * </p>
	 * <p>
	 * Desc: [(FFFF)Ljava/nio/FloatBuffer;]
	 * </p>
	 */
	public static McObfPair func_74521_a = McMappingDatabase.getSRG("RenderHelper.func_74521_a");

	/**
	 * <p>
	 * Name: enableStandardItemLighting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74519_b = McMappingDatabase.getSRG("RenderHelper.func_74519_b");

	/**
	 * <p>
	 * Name: setColorBuffer
	 * </p>
	 * <p>
	 * Desc: [(DDDD)Ljava/nio/FloatBuffer;]
	 * </p>
	 */
	public static McObfPair func_74517_a = McMappingDatabase.getSRG("RenderHelper.func_74517_a");

	/**
	 * <p>
	 * Name: LIGHT0_POS
	 * </p>
	 */
	public static McObfPair field_82884_b = McMappingDatabase.getSRG("field_82884_b");

	/**
	 * <p>
	 * Name: disableStandardItemLighting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74518_a = McMappingDatabase.getSRG("RenderHelper.func_74518_a");

}
