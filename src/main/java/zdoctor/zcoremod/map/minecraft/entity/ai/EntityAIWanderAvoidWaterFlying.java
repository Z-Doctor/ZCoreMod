package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIWanderAvoidWaterFlying {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yo";
		else
			return "net/minecraft/entity/ai/EntityAIWanderAvoidWaterFlying";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yo";
		else
			return "EntityAIWanderAvoidWaterFlying";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyo;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIWanderAvoidWaterFlying;";
	}

	/**
	 * <p>
	 * Name: getTreePos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_192385_j = McMappingDatabase.getSRG("EntityAIWanderAvoidWaterFlying.func_192385_j");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_190864_f = McMappingDatabase.getSRG("EntityAIWanderAvoidWaterFlying.func_190864_f");

}
