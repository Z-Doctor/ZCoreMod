package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockDirectional {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apx";
		else
			return "net/minecraft/block/BlockDirectional";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apx";
		else
			return "BlockDirectional";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapx;";
		else
			return "Lnet/minecraft/block/BlockDirectional;";
	}

	/**
	 * <p>
	 * Name: FACING
	 * </p>
	 */
	public static McObfPair field_176387_N = McMappingDatabase.getSRG("field_176387_N");

}
