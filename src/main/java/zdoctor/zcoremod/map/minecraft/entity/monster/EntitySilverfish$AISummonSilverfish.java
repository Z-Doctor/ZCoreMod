package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySilverfish$AISummonSilverfish {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adj$b";
		else
			return "net/minecraft/entity/monster/EntitySilverfish$AISummonSilverfish";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adj$b";
		else
			return "EntitySilverfish$AISummonSilverfish";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladj$b;";
		else
			return "Lnet/minecraft/entity/monster/EntitySilverfish$AISummonSilverfish;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntitySilverfish$AISummonSilverfish.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntitySilverfish$AISummonSilverfish.func_75250_a");

	/**
	 * <p>
	 * Name: notifyHurt
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_179462_f = McMappingDatabase.getSRG("EntitySilverfish$AISummonSilverfish.func_179462_f");

	/**
	 * <p>
	 * Name: lookForFriends
	 * </p>
	 */
	public static McObfPair field_179463_b = McMappingDatabase.getSRG("field_179463_b");

	/**
	 * <p>
	 * Name: silverfish
	 * </p>
	 */
	public static McObfPair field_179464_a = McMappingDatabase.getSRG("field_179464_a");

}
