package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRedstoneTorch$Toggle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ath$a";
		else
			return "net/minecraft/block/BlockRedstoneTorch$Toggle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ath$a";
		else
			return "BlockRedstoneTorch$Toggle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lath$a;";
		else
			return "Lnet/minecraft/block/BlockRedstoneTorch$Toggle;";
	}

	/**
	 * <p>
	 * Name: time
	 * </p>
	 */
	public static McObfPair field_150844_d = McMappingDatabase.getSRG("field_150844_d");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_180111_a = McMappingDatabase.getSRG("field_180111_a");

}
