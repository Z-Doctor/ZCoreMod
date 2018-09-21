package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICriterionInstance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "q";
		else
			return "net/minecraft/advancements/ICriterionInstance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "q";
		else
			return "ICriterionInstance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lq;";
		else
			return "Lnet/minecraft/advancements/ICriterionInstance;";
	}

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192244_a = McMappingDatabase.getSRG("ICriterionInstance.func_192244_a");

}
