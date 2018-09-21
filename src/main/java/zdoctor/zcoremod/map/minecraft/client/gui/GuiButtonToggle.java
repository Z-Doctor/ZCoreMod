package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiButtonToggle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjt";
		else
			return "net/minecraft/client/gui/GuiButtonToggle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bjt";
		else
			return "GuiButtonToggle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbjt;";
		else
			return "Lnet/minecraft/client/gui/GuiButtonToggle;";
	}

	/**
	 * <p>
	 * Name: yTexStart
	 * </p>
	 */
	public static McObfPair field_191757_r = McMappingDatabase.getSRG("field_191757_r");

	/**
	 * <p>
	 * Name: initTextureValues
	 * </p>
	 * <p>
	 * Desc: [(IIIILnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_191751_a = McMappingDatabase.getSRG("GuiButtonToggle.func_191751_a");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_191752_c = McMappingDatabase.getSRG("GuiButtonToggle.func_191752_c");

	/**
	 * <p>
	 * Name: xDiffTex
	 * </p>
	 */
	public static McObfPair field_191758_s = McMappingDatabase.getSRG("field_191758_s");

	/**
	 * <p>
	 * Name: resourceLocation
	 * </p>
	 */
	public static McObfPair field_191760_o = McMappingDatabase.getSRG("field_191760_o");

	/**
	 * <p>
	 * Name: yDiffTex
	 * </p>
	 */
	public static McObfPair field_191759_t = McMappingDatabase.getSRG("field_191759_t");

	/**
	 * <p>
	 * Name: setStateTriggered
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_191753_b = McMappingDatabase.getSRG("GuiButtonToggle.func_191753_b");

	/**
	 * <p>
	 * Name: isStateTriggered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191754_c = McMappingDatabase.getSRG("GuiButtonToggle.func_191754_c");

	/**
	 * <p>
	 * Name: xTexStart
	 * </p>
	 */
	public static McObfPair field_191756_q = McMappingDatabase.getSRG("field_191756_q");

	/**
	 * <p>
	 * Name: drawButton
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/Minecraft;IIF)V]
	 * </p>
	 */
	public static McObfPair func_191745_a = McMappingDatabase.getSRG("GuiButtonToggle.func_191745_a");

	/**
	 * <p>
	 * Name: stateTriggered
	 * </p>
	 */
	public static McObfPair field_191755_p = McMappingDatabase.getSRG("field_191755_p");

}
