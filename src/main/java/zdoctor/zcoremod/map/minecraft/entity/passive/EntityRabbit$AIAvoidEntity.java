package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRabbit$AIAvoidEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$b";
		else
			return "net/minecraft/entity/passive/EntityRabbit$AIAvoidEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$b";
		else
			return "EntityRabbit$AIAvoidEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaf$b;";
		else
			return "Lnet/minecraft/entity/passive/EntityRabbit$AIAvoidEntity;";
	}

	/**
	 * <p>
	 * Name: rabbit
	 * </p>
	 */
	public static McObfPair field_179511_d = McMappingDatabase.getSRG("field_179511_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityRabbit$AIAvoidEntity.func_75250_a");

}
