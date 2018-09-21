package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICriterionTrigger$Listener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "p$a";
		else
			return "net/minecraft/advancements/ICriterionTrigger$Listener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "p$a";
		else
			return "ICriterionTrigger$Listener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lp$a;";
		else
			return "Lnet/minecraft/advancements/ICriterionTrigger$Listener;";
	}

	/**
	 * <p>
	 * Name: criterionName
	 * </p>
	 */
	public static McObfPair field_192162_c = McMappingDatabase.getSRG("field_192162_c");

	/**
	 * <p>
	 * Name: advancement
	 * </p>
	 */
	public static McObfPair field_192161_b = McMappingDatabase.getSRG("field_192161_b");

	/**
	 * <p>
	 * Name: grantCriterion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/PlayerAdvancements;)V]
	 * </p>
	 */
	public static McObfPair func_192159_a = McMappingDatabase.getSRG("ICriterionTrigger$Listener.func_192159_a");

	/**
	 * <p>
	 * Name: getCriterionInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/ICriterionInstance;]
	 * </p>
	 */
	public static McObfPair func_192158_a = McMappingDatabase.getSRG("ICriterionTrigger$Listener.func_192158_a");

	/**
	 * <p>
	 * Name: criterionInstance
	 * </p>
	 */
	public static McObfPair field_192160_a = McMappingDatabase.getSRG("field_192160_a");

}
