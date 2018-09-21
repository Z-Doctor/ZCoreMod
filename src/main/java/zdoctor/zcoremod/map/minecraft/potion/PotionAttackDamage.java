package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionAttackDamage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uw";
		else
			return "net/minecraft/potion/PotionAttackDamage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uw";
		else
			return "PotionAttackDamage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luw;";
		else
			return "Lnet/minecraft/potion/PotionAttackDamage;";
	}

	/**
	 * <p>
	 * Name: bonusPerLevel
	 * </p>
	 */
	public static McObfPair field_188416_a = McMappingDatabase.getSRG("field_188416_a");

	/**
	 * <p>
	 * Name: getAttributeModifierAmount
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/ai/attributes/AttributeModifier;)D]
	 * </p>
	 */
	public static McObfPair func_111183_a = McMappingDatabase.getSRG("PotionAttackDamage.func_111183_a");

}
