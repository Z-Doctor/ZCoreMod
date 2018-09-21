package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIZombieAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yq";
		else
			return "net/minecraft/entity/ai/EntityAIZombieAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yq";
		else
			return "EntityAIZombieAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyq;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIZombieAttack;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityAIZombieAttack.func_75246_d");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityAIZombieAttack.func_75251_c");

	/**
	 * <p>
	 * Name: zombie
	 * </p>
	 */
	public static McObfPair field_188494_h = McMappingDatabase.getSRG("field_188494_h");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityAIZombieAttack.func_75249_e");

	/**
	 * <p>
	 * Name: raiseArmTicks
	 * </p>
	 */
	public static McObfPair field_188495_i = McMappingDatabase.getSRG("field_188495_i");

}
