package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelSign {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqt";
		else
			return "net/minecraft/client/model/ModelSign";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqt";
		else
			return "ModelSign";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqt;";
		else
			return "Lnet/minecraft/client/model/ModelSign;";
	}

	/**
	 * <p>
	 * Name: signStick
	 * </p>
	 */
	public static McObfPair field_78165_b = McMappingDatabase.getSRG("field_78165_b");

	/**
	 * <p>
	 * Name: signBoard
	 * </p>
	 */
	public static McObfPair field_78166_a = McMappingDatabase.getSRG("field_78166_a");

	/**
	 * <p>
	 * Name: renderSign
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78164_a = McMappingDatabase.getSRG("ModelSign.func_78164_a");

}
