package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPigZombie$AIHurtByAggressor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adf$b";
		else
			return "net/minecraft/entity/monster/EntityPigZombie$AIHurtByAggressor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adf$b";
		else
			return "EntityPigZombie$AIHurtByAggressor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladf$b;";
		else
			return "Lnet/minecraft/entity/monster/EntityPigZombie$AIHurtByAggressor;";
	}

	/**
	 * <p>
	 * Name: setEntityAttackTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_179446_a = McMappingDatabase.getSRG("EntityPigZombie$AIHurtByAggressor.func_179446_a");

}
