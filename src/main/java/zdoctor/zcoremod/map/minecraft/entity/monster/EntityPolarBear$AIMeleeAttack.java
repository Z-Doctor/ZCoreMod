package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPolarBear$AIMeleeAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aae$d";
		else
			return "net/minecraft/entity/monster/EntityPolarBear$AIMeleeAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aae$d";
		else
			return "EntityPolarBear$AIMeleeAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laae$d;";
		else
			return "Lnet/minecraft/entity/monster/EntityPolarBear$AIMeleeAttack;";
	}

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityPolarBear$AIMeleeAttack.func_75251_c");

	/**
	 * <p>
	 * Name: checkAndPerformAttack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;D)V]
	 * </p>
	 */
	public static McObfPair func_190102_a = McMappingDatabase.getSRG("EntityPolarBear$AIMeleeAttack.func_190102_a");

	/**
	 * <p>
	 * Name: getAttackReachSqr
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)D]
	 * </p>
	 */
	public static McObfPair func_179512_a = McMappingDatabase.getSRG("EntityPolarBear$AIMeleeAttack.func_179512_a");

}
