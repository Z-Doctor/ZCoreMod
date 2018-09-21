package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityBlaze$AIFireballAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acq$a";
		else
			return "net/minecraft/entity/monster/EntityBlaze$AIFireballAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acq$a";
		else
			return "EntityBlaze$AIFireballAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacq$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityBlaze$AIFireballAttack;";
	}

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityBlaze$AIFireballAttack.func_75249_e");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityBlaze$AIFireballAttack.func_75250_a");

	/**
	 * <p>
	 * Name: blaze
	 * </p>
	 */
	public static McObfPair field_179469_a = McMappingDatabase.getSRG("field_179469_a");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityBlaze$AIFireballAttack.func_75246_d");

	/**
	 * <p>
	 * Name: attackTime
	 * </p>
	 */
	public static McObfPair field_179468_c = McMappingDatabase.getSRG("field_179468_c");

	/**
	 * <p>
	 * Name: getFollowDistance
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_191523_f = McMappingDatabase.getSRG("EntityBlaze$AIFireballAttack.func_191523_f");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityBlaze$AIFireballAttack.func_75251_c");

	/**
	 * <p>
	 * Name: attackStep
	 * </p>
	 */
	public static McObfPair field_179467_b = McMappingDatabase.getSRG("field_179467_b");

}
