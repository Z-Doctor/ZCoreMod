package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAITasks$EntityAITaskEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xf$a";
		else
			return "net/minecraft/entity/ai/EntityAITasks$EntityAITaskEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xf$a";
		else
			return "EntityAITasks$EntityAITaskEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxf$a;";
		else
			return "Lnet/minecraft/entity/ai/EntityAITasks$EntityAITaskEntry;";
	}

	/**
	 * <p>
	 * Name: using
	 * </p>
	 */
	public static McObfPair field_188524_c = McMappingDatabase.getSRG("field_188524_c");

	/**
	 * <p>
	 * Name: action
	 * </p>
	 */
	public static McObfPair field_75733_a = McMappingDatabase.getSRG("field_75733_a");

	/**
	 * <p>
	 * Name: priority
	 * </p>
	 */
	public static McObfPair field_75731_b = McMappingDatabase.getSRG("field_75731_b");

}
