package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySquid$AIMoveRandom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaj$a";
		else
			return "net/minecraft/entity/passive/EntitySquid$AIMoveRandom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaj$a";
		else
			return "EntitySquid$AIMoveRandom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaj$a;";
		else
			return "Lnet/minecraft/entity/passive/EntitySquid$AIMoveRandom;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntitySquid$AIMoveRandom.func_75250_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntitySquid$AIMoveRandom.func_75246_d");

	/**
	 * <p>
	 * Name: squid
	 * </p>
	 */
	public static McObfPair field_179476_a = McMappingDatabase.getSRG("field_179476_a");

}
