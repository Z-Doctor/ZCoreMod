package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelWither {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brj";
		else
			return "net/minecraft/client/model/ModelWither";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brj";
		else
			return "ModelWither";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrj;";
		else
			return "Lnet/minecraft/client/model/ModelWither;";
	}

	/**
	 * <p>
	 * Name: upperBodyParts
	 * </p>
	 */
	public static McObfPair field_82905_a = McMappingDatabase.getSRG("field_82905_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelWither.func_78087_a");

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelWither.func_78086_a");

	/**
	 * <p>
	 * Name: heads
	 * </p>
	 */
	public static McObfPair field_82904_b = McMappingDatabase.getSRG("field_82904_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelWither.func_78088_a");

}
