package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySlime$AISlimeAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$a";
		else
			return "net/minecraft/entity/monster/EntitySlime$AISlimeAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adl$a";
		else
			return "EntitySlime$AISlimeAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladl$a;";
		else
			return "Lnet/minecraft/entity/monster/EntitySlime$AISlimeAttack;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntitySlime$AISlimeAttack.func_75250_a");

	/**
	 * <p>
	 * Name: slime
	 * </p>
	 */
	public static McObfPair field_179466_a = McMappingDatabase.getSRG("field_179466_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntitySlime$AISlimeAttack.func_75246_d");

	/**
	 * <p>
	 * Name: growTieredTimer
	 * </p>
	 */
	public static McObfPair field_179465_b = McMappingDatabase.getSRG("field_179465_b");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntitySlime$AISlimeAttack.func_75253_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntitySlime$AISlimeAttack.func_75249_e");

}
