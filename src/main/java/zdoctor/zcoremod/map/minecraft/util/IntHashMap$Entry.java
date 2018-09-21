package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntHashMap$Entry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rg$a";
		else
			return "net/minecraft/util/IntHashMap$Entry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rg$a";
		else
			return "IntHashMap$Entry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrg$a;";
		else
			return "Lnet/minecraft/util/IntHashMap$Entry;";
	}

	/**
	 * <p>
	 * Name: slotHash
	 * </p>
	 */
	public static McObfPair field_76032_d = McMappingDatabase.getSRG("field_76032_d");

	/**
	 * <p>
	 * Name: getHash
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76031_a = McMappingDatabase.getSRG("IntHashMap$Entry.func_76031_a");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_76030_b = McMappingDatabase.getSRG("IntHashMap$Entry.func_76030_b");

	/**
	 * <p>
	 * Name: nextEntry
	 * </p>
	 */
	public static McObfPair field_76034_c = McMappingDatabase.getSRG("field_76034_c");

	/**
	 * <p>
	 * Name: valueEntry
	 * </p>
	 */
	public static McObfPair field_76033_b = McMappingDatabase.getSRG("field_76033_b");

	/**
	 * <p>
	 * Name: hashEntry
	 * </p>
	 */
	public static McObfPair field_76035_a = McMappingDatabase.getSRG("field_76035_a");

}
