package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelGuardian {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpu";
		else
			return "net/minecraft/client/model/ModelGuardian";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpu";
		else
			return "ModelGuardian";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpu;";
		else
			return "Lnet/minecraft/client/model/ModelGuardian;";
	}

	/**
	 * <p>
	 * Name: guardianEye
	 * </p>
	 */
	public static McObfPair field_178708_b = McMappingDatabase.getSRG("field_178708_b");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelGuardian.func_78087_a");

	/**
	 * <p>
	 * Name: guardianSpines
	 * </p>
	 */
	public static McObfPair field_178709_c = McMappingDatabase.getSRG("field_178709_c");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelGuardian.func_78088_a");

	/**
	 * <p>
	 * Name: guardianTail
	 * </p>
	 */
	public static McObfPair field_178707_d = McMappingDatabase.getSRG("field_178707_d");

	/**
	 * <p>
	 * Name: guardianBody
	 * </p>
	 */
	public static McObfPair field_178710_a = McMappingDatabase.getSRG("field_178710_a");

}
