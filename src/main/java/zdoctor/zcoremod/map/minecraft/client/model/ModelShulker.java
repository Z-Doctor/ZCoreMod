package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelShulker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqs";
		else
			return "net/minecraft/client/model/ModelShulker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqs";
		else
			return "ModelShulker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqs;";
		else
			return "Lnet/minecraft/client/model/ModelShulker;";
	}

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelShulker.func_78087_a");

	/**
	 * <p>
	 * Name: lid
	 * </p>
	 */
	public static McObfPair field_187068_c = McMappingDatabase.getSRG("field_187068_c");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelShulker.func_78088_a");

	/**
	 * <p>
	 * Name: base
	 * </p>
	 */
	public static McObfPair field_187067_b = McMappingDatabase.getSRG("field_187067_b");

	/**
	 * <p>
	 * Name: head
	 * </p>
	 */
	public static McObfPair field_187066_a = McMappingDatabase.getSRG("field_187066_a");

}
