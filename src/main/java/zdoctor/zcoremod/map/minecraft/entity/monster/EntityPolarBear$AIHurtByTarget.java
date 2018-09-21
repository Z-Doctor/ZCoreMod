package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPolarBear$AIHurtByTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aae$c";
		else
			return "net/minecraft/entity/monster/EntityPolarBear$AIHurtByTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aae$c";
		else
			return "EntityPolarBear$AIHurtByTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laae$c;";
		else
			return "Lnet/minecraft/entity/monster/EntityPolarBear$AIHurtByTarget;";
	}

	/**
	 * <p>
	 * Name: setEntityAttackTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_179446_a = McMappingDatabase.getSRG("EntityPolarBear$AIHurtByTarget.func_179446_a");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityPolarBear$AIHurtByTarget.func_75249_e");

}
