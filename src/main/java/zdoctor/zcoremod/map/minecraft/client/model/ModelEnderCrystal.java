package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelEnderCrystal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bro";
		else
			return "net/minecraft/client/model/ModelEnderCrystal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bro";
		else
			return "ModelEnderCrystal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbro;";
		else
			return "Lnet/minecraft/client/model/ModelEnderCrystal;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelEnderCrystal.func_78088_a");

	/**
	 * <p>
	 * Name: glass
	 * </p>
	 */
	public static McObfPair field_78228_b = McMappingDatabase.getSRG("field_78228_b");

	/**
	 * <p>
	 * Name: cube
	 * </p>
	 */
	public static McObfPair field_78230_a = McMappingDatabase.getSRG("field_78230_a");

	/**
	 * <p>
	 * Name: base
	 * </p>
	 */
	public static McObfPair field_78229_c = McMappingDatabase.getSRG("field_78229_c");

}
