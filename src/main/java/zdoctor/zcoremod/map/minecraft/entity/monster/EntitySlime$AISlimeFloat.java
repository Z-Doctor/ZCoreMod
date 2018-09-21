package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySlime$AISlimeFloat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$b";
		else
			return "net/minecraft/entity/monster/EntitySlime$AISlimeFloat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$b";
		else
			return "EntitySlime$AISlimeFloat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladl$b;";
		else
			return "Lnet/minecraft/entity/monster/EntitySlime$AISlimeFloat;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntitySlime$AISlimeFloat.func_75246_d");

	/**
	 * <p>
	 * Name: slime
	 * </p>
	 */
	public static McObfPair field_179457_a = McMappingDatabase.getSRG("field_179457_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntitySlime$AISlimeFloat.func_75250_a");

}
