package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBlaze {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpi";
		else
			return "net/minecraft/client/model/ModelBlaze";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bpi";
		else
			return "ModelBlaze";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbpi;";
		else
			return "Lnet/minecraft/client/model/ModelBlaze;";
	}

	/**
	 * <p>
	 * Name: blazeSticks
	 * </p>
	 */
	public static McObfPair field_78106_a = McMappingDatabase.getSRG("field_78106_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelBlaze.func_78087_a");

	/**
	 * <p>
	 * Name: blazeHead
	 * </p>
	 */
	public static McObfPair field_78105_b = McMappingDatabase.getSRG("field_78105_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelBlaze.func_78088_a");

}
