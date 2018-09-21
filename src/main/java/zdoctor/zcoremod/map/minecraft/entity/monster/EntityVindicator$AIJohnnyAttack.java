package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVindicator$AIJohnnyAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adq$a";
		else
			return "net/minecraft/entity/monster/EntityVindicator$AIJohnnyAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adq$a";
		else
			return "EntityVindicator$AIJohnnyAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladq$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityVindicator$AIJohnnyAttack;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityVindicator$AIJohnnyAttack.func_75250_a");

}
