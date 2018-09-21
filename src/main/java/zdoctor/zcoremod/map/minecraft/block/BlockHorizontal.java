package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockHorizontal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arm";
		else
			return "net/minecraft/block/BlockHorizontal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arm";
		else
			return "BlockHorizontal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larm;";
		else
			return "Lnet/minecraft/block/BlockHorizontal;";
	}

	/**
	 * <p>
	 * Name: FACING
	 * </p>
	 */
	public static McObfPair field_185512_D = McMappingDatabase.getSRG("field_185512_D");

}
