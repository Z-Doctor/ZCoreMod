package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGhast$AIFireballAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acy$c";
		else
			return "net/minecraft/entity/monster/EntityGhast$AIFireballAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acy$c";
		else
			return "EntityGhast$AIFireballAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacy$c;";
		else
			return "Lnet/minecraft/entity/monster/EntityGhast$AIFireballAttack;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityGhast$AIFireballAttack.func_75246_d");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityGhast$AIFireballAttack.func_75249_e");

	/**
	 * <p>
	 * Name: attackTimer
	 * </p>
	 */
	public static McObfPair field_179471_a = McMappingDatabase.getSRG("field_179471_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityGhast$AIFireballAttack.func_75250_a");

	/**
	 * <p>
	 * Name: parentEntity
	 * </p>
	 */
	public static McObfPair field_179470_b = McMappingDatabase.getSRG("field_179470_b");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityGhast$AIFireballAttack.func_75251_c");

}
