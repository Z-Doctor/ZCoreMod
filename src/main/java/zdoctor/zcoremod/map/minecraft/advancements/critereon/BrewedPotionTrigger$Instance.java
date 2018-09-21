package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BrewedPotionTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "w$b";
		else
			return "net/minecraft/advancements/critereon/BrewedPotionTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "w$b";
		else
			return "BrewedPotionTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lw$b;";
		else
			return "Lnet/minecraft/advancements/critereon/BrewedPotionTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: potion
	 * </p>
	 */
	public static McObfPair field_192251_a = McMappingDatabase.getSRG("field_192251_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionType;)Z]
	 * </p>
	 */
	public static McObfPair func_192250_a = McMappingDatabase.getSRG("BrewedPotionTrigger$Instance.func_192250_a");

}
