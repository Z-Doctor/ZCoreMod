package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelChest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpl";
		else
			return "net/minecraft/client/model/ModelChest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpl";
		else
			return "ModelChest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpl;";
		else
			return "Lnet/minecraft/client/model/ModelChest;";
	}

	/**
	 * <p>
	 * Name: chestLid
	 * </p>
	 */
	public static McObfPair field_78234_a = McMappingDatabase.getSRG("field_78234_a");

	/**
	 * <p>
	 * Name: chestKnob
	 * </p>
	 */
	public static McObfPair field_78233_c = McMappingDatabase.getSRG("field_78233_c");

	/**
	 * <p>
	 * Name: renderAll
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78231_a = McMappingDatabase.getSRG("ModelChest.func_78231_a");

	/**
	 * <p>
	 * Name: chestBelow
	 * </p>
	 */
	public static McObfPair field_78232_b = McMappingDatabase.getSRG("field_78232_b");

}
