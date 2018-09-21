package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class OpenInventoryStep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chx";
		else
			return "net/minecraft/client/tutorial/OpenInventoryStep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chx";
		else
			return "OpenInventoryStep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchx;";
		else
			return "Lnet/minecraft/client/tutorial/OpenInventoryStep;";
	}

	/**
	 * <p>
	 * Name: tutorial
	 * </p>
	 */
	public static McObfPair field_193283_c = McMappingDatabase.getSRG("field_193283_c");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193251_c = McMappingDatabase.getSRG("OpenInventoryStep.func_193251_c");

	/**
	 * <p>
	 * Name: DESCRIPTION
	 * </p>
	 */
	public static McObfPair field_193282_b = McMappingDatabase.getSRG("field_193282_b");

	/**
	 * <p>
	 * Name: onStop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193248_b = McMappingDatabase.getSRG("OpenInventoryStep.func_193248_b");

	/**
	 * <p>
	 * Name: TITLE
	 * </p>
	 */
	public static McObfPair field_193281_a = McMappingDatabase.getSRG("field_193281_a");

	/**
	 * <p>
	 * Name: toast
	 * </p>
	 */
	public static McObfPair field_193284_d = McMappingDatabase.getSRG("field_193284_d");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193245_a = McMappingDatabase.getSRG("OpenInventoryStep.func_193245_a");

	/**
	 * <p>
	 * Name: timeWaiting
	 * </p>
	 */
	public static McObfPair field_193285_e = McMappingDatabase.getSRG("field_193285_e");

}
