package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CooldownTracker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aio";
		else
			return "net/minecraft/util/CooldownTracker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aio";
		else
			return "CooldownTracker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laio;";
		else
			return "Lnet/minecraft/util/CooldownTracker;";
	}

	/**
	 * <p>
	 * Name: removeCooldown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)V]
	 * </p>
	 */
	public static McObfPair func_185142_b = McMappingDatabase.getSRG("CooldownTracker.func_185142_b");

	/**
	 * <p>
	 * Name: notifyOnRemove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)V]
	 * </p>
	 */
	public static McObfPair func_185146_c = McMappingDatabase.getSRG("CooldownTracker.func_185146_c");

	/**
	 * <p>
	 * Name: getCooldown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;F)F]
	 * </p>
	 */
	public static McObfPair func_185143_a = McMappingDatabase.getSRG("CooldownTracker.func_185143_a");

	/**
	 * <p>
	 * Name: hasCooldown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Z]
	 * </p>
	 */
	public static McObfPair func_185141_a = McMappingDatabase.getSRG("CooldownTracker.func_185141_a");

	/**
	 * <p>
	 * Name: cooldowns
	 * </p>
	 */
	public static McObfPair field_185147_a = McMappingDatabase.getSRG("field_185147_a");

	/**
	 * <p>
	 * Name: notifyOnSet
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;I)V]
	 * </p>
	 */
	public static McObfPair func_185140_b = McMappingDatabase.getSRG("CooldownTracker.func_185140_b");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_185144_a = McMappingDatabase.getSRG("CooldownTracker.func_185144_a");

	/**
	 * <p>
	 * Name: ticks
	 * </p>
	 */
	public static McObfPair field_185148_b = McMappingDatabase.getSRG("field_185148_b");

	/**
	 * <p>
	 * Name: setCooldown
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;I)V]
	 * </p>
	 */
	public static McObfPair func_185145_a = McMappingDatabase.getSRG("CooldownTracker.func_185145_a");

}
