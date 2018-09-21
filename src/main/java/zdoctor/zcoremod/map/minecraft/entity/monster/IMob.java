package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IMob {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acw";
		else
			return "net/minecraft/entity/monster/IMob";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acw";
		else
			return "IMob";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacw;";
		else
			return "Lnet/minecraft/entity/monster/IMob;";
	}

	/**
	 * <p>
	 * Name: MOB_SELECTOR
	 * </p>
	 */
	public static McObfPair field_82192_a = McMappingDatabase.getSRG("field_82192_a");

	/**
	 * <p>
	 * Name: VISIBLE_MOB_SELECTOR
	 * </p>
	 */
	public static McObfPair field_175450_e = McMappingDatabase.getSRG("field_175450_e");

}
