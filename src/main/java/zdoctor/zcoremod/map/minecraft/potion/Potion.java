package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Potion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uz";
		else
			return "net/minecraft/potion/Potion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uz";
		else
			return "Potion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luz;";
		else
			return "Lnet/minecraft/potion/Potion;";
	}

	/**
	 * <p>
	 * Name: registerPotions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188411_k = McMappingDatabase.getSRG("Potion.func_188411_k");

	/**
	 * <p>
	 * Name: setIconIndex
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_76399_b = McMappingDatabase.getSRG("Potion.func_76399_b");

	/**
	 * <p>
	 * Name: isBadEffect
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76398_f = McMappingDatabase.getSRG("Potion.func_76398_f");

	/**
	 * <p>
	 * Name: removeAttributesModifiersFromEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;I)V]
	 * </p>
	 */
	public static McObfPair func_111187_a = McMappingDatabase.getSRG("Potion.func_111187_a");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_188414_b = McMappingDatabase.getSRG("field_188414_b");

	/**
	 * <p>
	 * Name: statusIconIndex
	 * </p>
	 */
	public static McObfPair field_76417_J = McMappingDatabase.getSRG("field_76417_J");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76393_a = McMappingDatabase.getSRG("Potion.func_76393_a");

	/**
	 * <p>
	 * Name: getAttributeModifierMap
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_111186_k = McMappingDatabase.getSRG("Potion.func_111186_k");

	/**
	 * <p>
	 * Name: isReady
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_76397_a = McMappingDatabase.getSRG("Potion.func_76397_a");

	/**
	 * <p>
	 * Name: getPotionById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_188412_a = McMappingDatabase.getSRG("Potion.func_188412_a");

	/**
	 * <p>
	 * Name: attributeModifierMap
	 * </p>
	 */
	public static McObfPair field_111188_I = McMappingDatabase.getSRG("field_111188_I");

	/**
	 * <p>
	 * Name: performEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;I)V]
	 * </p>
	 */
	public static McObfPair func_76394_a = McMappingDatabase.getSRG("Potion.func_76394_a");

	/**
	 * <p>
	 * Name: liquidColor
	 * </p>
	 */
	public static McObfPair field_76414_N = McMappingDatabase.getSRG("field_76414_N");

	/**
	 * <p>
	 * Name: affectEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/EntityLivingBase;ID)V]
	 * </p>
	 */
	public static McObfPair func_180793_a = McMappingDatabase.getSRG("Potion.func_180793_a");

	/**
	 * <p>
	 * Name: getLiquidColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76401_j = McMappingDatabase.getSRG("Potion.func_76401_j");

	/**
	 * <p>
	 * Name: applyAttributesModifiersToEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;I)V]
	 * </p>
	 */
	public static McObfPair func_111185_a = McMappingDatabase.getSRG("Potion.func_111185_a");

	/**
	 * <p>
	 * Name: effectiveness
	 * </p>
	 */
	public static McObfPair field_76412_L = McMappingDatabase.getSRG("field_76412_L");

	/**
	 * <p>
	 * Name: getIdFromPotion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/Potion;)I]
	 * </p>
	 */
	public static McObfPair func_188409_a = McMappingDatabase.getSRG("Potion.func_188409_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_76416_I = McMappingDatabase.getSRG("field_76416_I");

	/**
	 * <p>
	 * Name: registerPotionAttributeModifier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/ai/attributes/IAttribute;Ljava/lang/String;DI)Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_111184_a = McMappingDatabase.getSRG("Potion.func_111184_a");

	/**
	 * <p>
	 * Name: isBadEffect
	 * </p>
	 */
	public static McObfPair field_76418_K = McMappingDatabase.getSRG("field_76418_K");

	/**
	 * <p>
	 * Name: beneficial
	 * </p>
	 */
	public static McObfPair field_188415_h = McMappingDatabase.getSRG("field_188415_h");

	/**
	 * <p>
	 * Name: getStatusIconIndex
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76392_e = McMappingDatabase.getSRG("Potion.func_76392_e");

	/**
	 * <p>
	 * Name: hasStatusIcon
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76400_d = McMappingDatabase.getSRG("Potion.func_76400_d");

	/**
	 * <p>
	 * Name: setEffectiveness
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_76404_a = McMappingDatabase.getSRG("Potion.func_76404_a");

	/**
	 * <p>
	 * Name: isBeneficial
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188408_i = McMappingDatabase.getSRG("Potion.func_188408_i");

	/**
	 * <p>
	 * Name: getPotionDurationString
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;F)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_188410_a = McMappingDatabase.getSRG("Potion.func_188410_a");

	/**
	 * <p>
	 * Name: setBeneficial
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_188413_j = McMappingDatabase.getSRG("Potion.func_188413_j");

	/**
	 * <p>
	 * Name: setPotionName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_76390_b = McMappingDatabase.getSRG("Potion.func_76390_b");

	/**
	 * <p>
	 * Name: isInstant
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76403_b = McMappingDatabase.getSRG("Potion.func_76403_b");

	/**
	 * <p>
	 * Name: getAttributeModifierAmount
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/ai/attributes/AttributeModifier;)D]
	 * </p>
	 */
	public static McObfPair func_111183_a = McMappingDatabase.getSRG("Potion.func_111183_a");

	/**
	 * <p>
	 * Name: getPotionFromResourceLocation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_180142_b = McMappingDatabase.getSRG("Potion.func_180142_b");

}
