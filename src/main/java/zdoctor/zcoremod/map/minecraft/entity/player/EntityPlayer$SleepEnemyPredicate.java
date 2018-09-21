package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPlayer$SleepEnemyPredicate {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed$c";
		else
			return "net/minecraft/entity/player/EntityPlayer$SleepEnemyPredicate";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed$c";
		else
			return "EntityPlayer$SleepEnemyPredicate";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laed$c;";
		else
			return "Lnet/minecraft/entity/player/EntityPlayer$SleepEnemyPredicate;";
	}

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_192387_a = McMappingDatabase.getSRG("field_192387_a");

}
