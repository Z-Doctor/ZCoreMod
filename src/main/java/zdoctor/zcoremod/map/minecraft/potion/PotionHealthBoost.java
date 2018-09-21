package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionHealthBoost {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ux";
		else
			return "net/minecraft/potion/PotionHealthBoost";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ux";
		else
			return "PotionHealthBoost";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lux;";
		else
			return "Lnet/minecraft/potion/PotionHealthBoost;";
	}

	/**
	 * <p>
	 * Name: removeAttributesModifiersFromEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;I)V]
	 * </p>
	 */
	public static McObfPair func_111187_a = McMappingDatabase.getSRG("PotionHealthBoost.func_111187_a");

}
