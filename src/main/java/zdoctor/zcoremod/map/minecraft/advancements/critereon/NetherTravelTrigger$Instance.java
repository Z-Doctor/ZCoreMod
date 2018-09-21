package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetherTravelTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "av$b";
		else
			return "net/minecraft/advancements/critereon/NetherTravelTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "av$b";
		else
			return "NetherTravelTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lav$b;";
		else
			return "Lnet/minecraft/advancements/critereon/NetherTravelTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;Lnet/minecraft/util/math/Vec3d;DDD)Z]
	 * </p>
	 */
	public static McObfPair func_193206_a = McMappingDatabase.getSRG("NetherTravelTrigger$Instance.func_193206_a");

	/**
	 * <p>
	 * Name: exited
	 * </p>
	 */
	public static McObfPair field_193208_b = McMappingDatabase.getSRG("field_193208_b");

	/**
	 * <p>
	 * Name: distance
	 * </p>
	 */
	public static McObfPair field_193209_c = McMappingDatabase.getSRG("field_193209_c");

	/**
	 * <p>
	 * Name: entered
	 * </p>
	 */
	public static McObfPair field_193207_a = McMappingDatabase.getSRG("field_193207_a");

}
