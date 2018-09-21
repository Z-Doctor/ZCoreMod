package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementList$Listener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "j$a";
		else
			return "net/minecraft/advancements/AdvancementList$Listener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "j$a";
		else
			return "AdvancementList$Listener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lj$a;";
		else
			return "Lnet/minecraft/advancements/AdvancementList$Listener;";
	}

	/**
	 * <p>
	 * Name: nonRootAdvancementRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191929_d = McMappingDatabase.getSRG("AdvancementList$Listener.func_191929_d");

	/**
	 * <p>
	 * Name: rootAdvancementAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191931_a = McMappingDatabase.getSRG("AdvancementList$Listener.func_191931_a");

	/**
	 * <p>
	 * Name: rootAdvancementRemoved
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191928_b = McMappingDatabase.getSRG("AdvancementList$Listener.func_191928_b");

	/**
	 * <p>
	 * Name: advancementsCleared
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191930_a = McMappingDatabase.getSRG("AdvancementList$Listener.func_191930_a");

	/**
	 * <p>
	 * Name: nonRootAdvancementAdded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_191932_c = McMappingDatabase.getSRG("AdvancementList$Listener.func_191932_c");

}
