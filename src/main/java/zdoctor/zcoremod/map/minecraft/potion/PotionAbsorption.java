package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionAbsorption {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uv";
		else
			return "net/minecraft/potion/PotionAbsorption";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uv";
		else
			return "PotionAbsorption";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luv;";
		else
			return "Lnet/minecraft/potion/PotionAbsorption;";
	}

	/**
	 * <p>
	 * Name: removeAttributesModifiersFromEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;I)V]
	 * </p>
	 */
	public static McObfPair func_111187_a = McMappingDatabase.getSRG("PotionAbsorption.func_111187_a");

	/**
	 * <p>
	 * Name: applyAttributesModifiersToEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/ai/attributes/AbstractAttributeMap;I)V]
	 * </p>
	 */
	public static McObfPair func_111185_a = McMappingDatabase.getSRG("PotionAbsorption.func_111185_a");

}
