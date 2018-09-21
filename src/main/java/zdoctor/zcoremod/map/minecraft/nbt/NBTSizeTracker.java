package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTSizeTracker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gh";
		else
			return "net/minecraft/nbt/NBTSizeTracker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gh";
		else
			return "NBTSizeTracker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgh;";
		else
			return "Lnet/minecraft/nbt/NBTSizeTracker;";
	}

	/**
	 * <p>
	 * Name: max
	 * </p>
	 */
	public static McObfPair field_152452_b = McMappingDatabase.getSRG("field_152452_b");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_152450_a = McMappingDatabase.getSRG("NBTSizeTracker.func_152450_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 */
	public static McObfPair field_152453_c = McMappingDatabase.getSRG("field_152453_c");

	/**
	 * <p>
	 * Name: INFINITE
	 * </p>
	 */
	public static McObfPair field_152451_a = McMappingDatabase.getSRG("field_152451_a");

}
