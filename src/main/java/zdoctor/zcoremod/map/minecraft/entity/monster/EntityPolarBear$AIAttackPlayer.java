package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPolarBear$AIAttackPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aae$a";
		else
			return "net/minecraft/entity/monster/EntityPolarBear$AIAttackPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aae$a";
		else
			return "EntityPolarBear$AIAttackPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laae$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityPolarBear$AIAttackPlayer;";
	}

	/**
	 * <p>
	 * Name: getTargetDistance
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111175_f = McMappingDatabase.getSRG("EntityPolarBear$AIAttackPlayer.func_111175_f");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityPolarBear$AIAttackPlayer.func_75250_a");

}
