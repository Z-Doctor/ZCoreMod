package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractCriterionInstance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "u";
		else
			return "net/minecraft/advancements/critereon/AbstractCriterionInstance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "u";
		else
			return "AbstractCriterionInstance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lu;";
		else
			return "Lnet/minecraft/advancements/critereon/AbstractCriterionInstance;";
	}

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192244_a = McMappingDatabase.getSRG("AbstractCriterionInstance.func_192244_a");

	/**
	 * <p>
	 * Name: criterion
	 * </p>
	 */
	public static McObfPair field_192245_a = McMappingDatabase.getSRG("field_192245_a");

}
