package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NextTickListEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anf";
		else
			return "net/minecraft/world/NextTickListEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anf";
		else
			return "NextTickListEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanf;";
		else
			return "Lnet/minecraft/world/NextTickListEntry;";
	}

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_180282_a = McMappingDatabase.getSRG("field_180282_a");

	/**
	 * <p>
	 * Name: priority
	 * </p>
	 */
	public static McObfPair field_82754_f = McMappingDatabase.getSRG("field_82754_f");

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_151352_g = McMappingDatabase.getSRG("field_151352_g");

	/**
	 * <p>
	 * Name: scheduledTime
	 * </p>
	 */
	public static McObfPair field_77180_e = McMappingDatabase.getSRG("field_77180_e");

	/**
	 * <p>
	 * Name: setPriority
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82753_a = McMappingDatabase.getSRG("NextTickListEntry.func_82753_a");

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_151351_a = McMappingDatabase.getSRG("NextTickListEntry.func_151351_a");

	/**
	 * <p>
	 * Name: setScheduledTime
	 * </p>
	 * <p>
	 * Desc: [(J)Lnet/minecraft/world/NextTickListEntry;]
	 * </p>
	 */
	public static McObfPair func_77176_a = McMappingDatabase.getSRG("NextTickListEntry.func_77176_a");

	/**
	 * <p>
	 * Name: tickEntryID
	 * </p>
	 */
	public static McObfPair field_77178_g = McMappingDatabase.getSRG("field_77178_g");

	/**
	 * <p>
	 * Name: nextTickEntryID
	 * </p>
	 */
	public static McObfPair field_77177_f = McMappingDatabase.getSRG("field_77177_f");

}
