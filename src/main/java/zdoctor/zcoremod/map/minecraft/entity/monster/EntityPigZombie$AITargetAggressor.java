package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPigZombie$AITargetAggressor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adf$a";
		else
			return "net/minecraft/entity/monster/EntityPigZombie$AITargetAggressor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adf$a";
		else
			return "EntityPigZombie$AITargetAggressor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladf$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityPigZombie$AITargetAggressor;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityPigZombie$AITargetAggressor.func_75250_a");

}
