package zdoctor.zcoremod.map.minecraft.entity.ai.attributes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IAttributeInstance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wd";
		else
			return "net/minecraft/entity/ai/attributes/IAttributeInstance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wd";
		else
			return "IAttributeInstance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwd;";
		else
			return "Lnet/minecraft/entity/ai/attributes/IAttributeInstance;";
	}

	/**
	 * <p>
	 * Name: removeAllModifiers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_142049_d = McMappingDatabase.getSRG("IAttributeInstance.func_142049_d");

	/**
	 * <p>
	 * Name: getModifiersByOperation
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_111130_a = McMappingDatabase.getSRG("IAttributeInstance.func_111130_a");

	/**
	 * <p>
	 * Name: getModifiers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_111122_c = McMappingDatabase.getSRG("IAttributeInstance.func_111122_c");

	/**
	 * <p>
	 * Name: removeModifier
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)V]
	 * </p>
	 */
	public static McObfPair func_188479_b = McMappingDatabase.getSRG("IAttributeInstance.func_188479_b");

	/**
	 * <p>
	 * Name: getBaseValue
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111125_b = McMappingDatabase.getSRG("IAttributeInstance.func_111125_b");

	/**
	 * <p>
	 * Name: getAttributeValue
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111126_e = McMappingDatabase.getSRG("IAttributeInstance.func_111126_e");

	/**
	 * <p>
	 * Name: removeModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AttributeModifier;)V]
	 * </p>
	 */
	public static McObfPair func_111124_b = McMappingDatabase.getSRG("IAttributeInstance.func_111124_b");

	/**
	 * <p>
	 * Name: hasModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AttributeModifier;)Z]
	 * </p>
	 */
	public static McObfPair func_180374_a = McMappingDatabase.getSRG("IAttributeInstance.func_180374_a");

	/**
	 * <p>
	 * Name: getAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/attributes/IAttribute;]
	 * </p>
	 */
	public static McObfPair func_111123_a = McMappingDatabase.getSRG("IAttributeInstance.func_111123_a");

	/**
	 * <p>
	 * Name: applyModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AttributeModifier;)V]
	 * </p>
	 */
	public static McObfPair func_111121_a = McMappingDatabase.getSRG("IAttributeInstance.func_111121_a");

	/**
	 * <p>
	 * Name: setBaseValue
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_111128_a = McMappingDatabase.getSRG("IAttributeInstance.func_111128_a");

	/**
	 * <p>
	 * Name: getModifier
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/entity/ai/attributes/AttributeModifier;]
	 * </p>
	 */
	public static McObfPair func_111127_a = McMappingDatabase.getSRG("IAttributeInstance.func_111127_a");

}
