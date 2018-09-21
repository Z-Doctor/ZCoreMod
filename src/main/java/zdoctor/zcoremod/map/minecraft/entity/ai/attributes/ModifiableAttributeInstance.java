package zdoctor.zcoremod.map.minecraft.entity.ai.attributes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModifiableAttributeInstance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wh";
		else
			return "net/minecraft/entity/ai/attributes/ModifiableAttributeInstance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "wh";
		else
			return "ModifiableAttributeInstance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lwh;";
		else
			return "Lnet/minecraft/entity/ai/attributes/ModifiableAttributeInstance;";
	}

	/**
	 * <p>
	 * Name: removeAllModifiers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_142049_d = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_142049_d");

	/**
	 * <p>
	 * Name: cachedValue
	 * </p>
	 */
	public static McObfPair field_111139_h = McMappingDatabase.getSRG("field_111139_h");

	/**
	 * <p>
	 * Name: flagForUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_111131_f = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111131_f");

	/**
	 * <p>
	 * Name: baseValue
	 * </p>
	 */
	public static McObfPair field_111132_f = McMappingDatabase.getSRG("field_111132_f");

	/**
	 * <p>
	 * Name: applyModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AttributeModifier;)V]
	 * </p>
	 */
	public static McObfPair func_111121_a = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111121_a");

	/**
	 * <p>
	 * Name: removeModifier
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)V]
	 * </p>
	 */
	public static McObfPair func_188479_b = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_188479_b");

	/**
	 * <p>
	 * Name: mapByUUID
	 * </p>
	 */
	public static McObfPair field_111135_e = McMappingDatabase.getSRG("field_111135_e");

	/**
	 * <p>
	 * Name: hasModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AttributeModifier;)Z]
	 * </p>
	 */
	public static McObfPair func_180374_a = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_180374_a");

	/**
	 * <p>
	 * Name: getModifiers
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_111122_c = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111122_c");

	/**
	 * <p>
	 * Name: genericAttribute
	 * </p>
	 */
	public static McObfPair field_111136_b = McMappingDatabase.getSRG("field_111136_b");

	/**
	 * <p>
	 * Name: getAttributeValue
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111126_e = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111126_e");

	/**
	 * <p>
	 * Name: removeModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/AttributeModifier;)V]
	 * </p>
	 */
	public static McObfPair func_111124_b = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111124_b");

	/**
	 * <p>
	 * Name: needsUpdate
	 * </p>
	 */
	public static McObfPair field_111133_g = McMappingDatabase.getSRG("field_111133_g");

	/**
	 * <p>
	 * Name: getAppliedModifiers
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_180375_b = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_180375_b");

	/**
	 * <p>
	 * Name: computeValue
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111129_g = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111129_g");

	/**
	 * <p>
	 * Name: getModifier
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/entity/ai/attributes/AttributeModifier;]
	 * </p>
	 */
	public static McObfPair func_111127_a = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111127_a");

	/**
	 * <p>
	 * Name: attributeMap
	 * </p>
	 */
	public static McObfPair field_111138_a = McMappingDatabase.getSRG("field_111138_a");

	/**
	 * <p>
	 * Name: getAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/attributes/IAttribute;]
	 * </p>
	 */
	public static McObfPair func_111123_a = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111123_a");

	/**
	 * <p>
	 * Name: mapByName
	 * </p>
	 */
	public static McObfPair field_111134_d = McMappingDatabase.getSRG("field_111134_d");

	/**
	 * <p>
	 * Name: getModifiersByOperation
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/util/Collection;]
	 * </p>
	 */
	public static McObfPair func_111130_a = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111130_a");

	/**
	 * <p>
	 * Name: setBaseValue
	 * </p>
	 * <p>
	 * Desc: [(D)V]
	 * </p>
	 */
	public static McObfPair func_111128_a = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111128_a");

	/**
	 * <p>
	 * Name: mapByOperation
	 * </p>
	 */
	public static McObfPair field_111137_c = McMappingDatabase.getSRG("field_111137_c");

	/**
	 * <p>
	 * Name: getBaseValue
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111125_b = McMappingDatabase.getSRG("ModifiableAttributeInstance.func_111125_b");

}
