package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSilverfish$EnumType$5 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asa$a$5";
		else
			return "net/minecraft/block/BlockSilverfish$EnumType$5";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asa$a$5";
		else
			return "BlockSilverfish$EnumType$5";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasa$a$5;";
		else
			return "Lnet/minecraft/block/BlockSilverfish$EnumType$5;";
	}

	/**
	 * <p>
	 * Name: getModelBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176883_d = McMappingDatabase.getSRG("BlockSilverfish$EnumType$5.func_176883_d");

}
