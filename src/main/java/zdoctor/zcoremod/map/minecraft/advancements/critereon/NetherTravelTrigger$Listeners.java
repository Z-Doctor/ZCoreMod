package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NetherTravelTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "av$a";
		else
			return "net/minecraft/advancements/critereon/NetherTravelTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "av$a";
		else
			return "NetherTravelTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lav$a;";
		else
			return "Lnet/minecraft/advancements/critereon/NetherTravelTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_193486_b = McMappingDatabase.getSRG("field_193486_b");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_193485_a = McMappingDatabase.getSRG("field_193485_a");

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;Lnet/minecraft/util/math/Vec3d;DDD)V]
	 * </p>
	 */
	public static McObfPair func_193483_a = McMappingDatabase.getSRG("NetherTravelTrigger$Listeners.func_193483_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193484_a = McMappingDatabase.getSRG("NetherTravelTrigger$Listeners.func_193484_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193481_b = McMappingDatabase.getSRG("NetherTravelTrigger$Listeners.func_193481_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193482_a = McMappingDatabase.getSRG("NetherTravelTrigger$Listeners.func_193482_a");

}
