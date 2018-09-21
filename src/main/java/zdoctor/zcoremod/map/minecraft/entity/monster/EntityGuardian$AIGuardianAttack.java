package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGuardian$AIGuardianAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ada$a";
		else
			return "net/minecraft/entity/monster/EntityGuardian$AIGuardianAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ada$a";
		else
			return "EntityGuardian$AIGuardianAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lada$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityGuardian$AIGuardianAttack;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityGuardian$AIGuardianAttack.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityGuardian$AIGuardianAttack.func_75250_a");

	/**
	 * <p>
	 * Name: guardian
	 * </p>
	 */
	public static McObfPair field_179456_a = McMappingDatabase.getSRG("field_179456_a");

	/**
	 * <p>
	 * Name: tickCounter
	 * </p>
	 */
	public static McObfPair field_179455_b = McMappingDatabase.getSRG("field_179455_b");

	/**
	 * <p>
	 * Name: isElder
	 * </p>
	 */
	public static McObfPair field_190881_c = McMappingDatabase.getSRG("field_190881_c");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityGuardian$AIGuardianAttack.func_75251_c");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityGuardian$AIGuardianAttack.func_75253_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityGuardian$AIGuardianAttack.func_75249_e");

}
