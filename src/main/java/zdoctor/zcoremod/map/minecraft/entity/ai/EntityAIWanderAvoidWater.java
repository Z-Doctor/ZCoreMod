package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAIWanderAvoidWater {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yp";
		else
			return "net/minecraft/entity/ai/EntityAIWanderAvoidWater";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yp";
		else
			return "EntityAIWanderAvoidWater";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyp;";
		else
			return "Lnet/minecraft/entity/ai/EntityAIWanderAvoidWater;";
	}

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_190864_f = McMappingDatabase.getSRG("EntityAIWanderAvoidWater.func_190864_f");

	/**
	 * <p>
	 * Name: probability
	 * </p>
	 */
	public static McObfPair field_190865_h = McMappingDatabase.getSRG("field_190865_h");

}
