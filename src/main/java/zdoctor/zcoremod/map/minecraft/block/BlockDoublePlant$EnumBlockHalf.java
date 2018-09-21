package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockDoublePlant$EnumBlockHalf {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqb$a";
		else
			return "net/minecraft/block/BlockDoublePlant$EnumBlockHalf";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqb$a";
		else
			return "BlockDoublePlant$EnumBlockHalf";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqb$a;";
		else
			return "Lnet/minecraft/block/BlockDoublePlant$EnumBlockHalf;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockDoublePlant$EnumBlockHalf.func_176610_l");

}
