package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIFollowOwnerFlying {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xb";
		else
			return "net/minecraft/entity/ai/EntityAIFollowOwnerFlying";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "xb";
		else
			return "EntityAIFollowOwnerFlying";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lxb;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIFollowOwnerFlying;";
	}

	/**
	 * <p>
	 * Name: isTeleportFriendlyBlock
	 * </p>
	 * <p>
	 * Desc: [(IIIII)Z]
	 * </p>
	 */
	public static McObfPair func_192381_a = McMappingDatabase.getSRG("EntityAIFollowOwnerFlying.func_192381_a");

}
