package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySlime$AISlimeHop {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$c";
		else
			return "net/minecraft/entity/monster/EntitySlime$AISlimeHop";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$c";
		else
			return "EntitySlime$AISlimeHop";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladl$c;";
		else
			return "Lnet/minecraft/entity/monster/EntitySlime$AISlimeHop;";
	}

	/**
	 * <p>
	 * Name: slime
	 * </p>
	 */
	public static McObfPair field_179458_a = McMappingDatabase.getSRG("field_179458_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntitySlime$AISlimeHop.func_75250_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntitySlime$AISlimeHop.func_75246_d");

}
