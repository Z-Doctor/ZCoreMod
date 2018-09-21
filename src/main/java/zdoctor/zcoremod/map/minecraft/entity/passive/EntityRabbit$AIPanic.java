package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRabbit$AIPanic {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$f";
		else
			return "net/minecraft/entity/passive/EntityRabbit$AIPanic";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$f";
		else
			return "EntityRabbit$AIPanic";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaf$f;";
		else
			return "Lnet/minecraft/entity/passive/EntityRabbit$AIPanic;";
	}

	/**
	 * <p>
	 * Name: rabbit
	 * </p>
	 */
	public static McObfPair field_179486_b = McMappingDatabase.getSRG("field_179486_b");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityRabbit$AIPanic.func_75246_d");

}
