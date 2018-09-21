package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAILookAtTradePlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xm";
		else
			return "net/minecraft/entity/ai/EntityAILookAtTradePlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xm";
		else
			return "EntityAILookAtTradePlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxm;";
		else
			return "Lnet/minecraft/entity/ai/EntityAILookAtTradePlayer;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityAILookAtTradePlayer.func_75250_a");

	/**
	 * <p>
	 * Name: villager
	 * </p>
	 */
	public static McObfPair field_75335_b = McMappingDatabase.getSRG("field_75335_b");

}
