package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySlime$AISlimeFaceRandom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$e";
		else
			return "net/minecraft/entity/monster/EntitySlime$AISlimeFaceRandom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$e";
		else
			return "EntitySlime$AISlimeFaceRandom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladl$e;";
		else
			return "Lnet/minecraft/entity/monster/EntitySlime$AISlimeFaceRandom;";
	}

	/**
	 * <p>
	 * Name: slime
	 * </p>
	 */
	public static McObfPair field_179461_a = McMappingDatabase.getSRG("field_179461_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntitySlime$AISlimeFaceRandom.func_75250_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntitySlime$AISlimeFaceRandom.func_75246_d");

	/**
	 * <p>
	 * Name: nextRandomizeTime
	 * </p>
	 */
	public static McObfPair field_179460_c = McMappingDatabase.getSRG("field_179460_c");

	/**
	 * <p>
	 * Name: chosenDegrees
	 * </p>
	 */
	public static McObfPair field_179459_b = McMappingDatabase.getSRG("field_179459_b");

}
