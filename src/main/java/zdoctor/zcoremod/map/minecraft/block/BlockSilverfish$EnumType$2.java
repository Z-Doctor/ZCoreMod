package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSilverfish$EnumType$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asa$a$2";
		else
			return "net/minecraft/block/BlockSilverfish$EnumType$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asa$a$2";
		else
			return "BlockSilverfish$EnumType$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasa$a$2;";
		else
			return "Lnet/minecraft/block/BlockSilverfish$EnumType$2;";
	}

	/**
	 * <p>
	 * Name: getModelBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_176883_d = McMappingDatabase.getSRG("BlockSilverfish$EnumType$2.func_176883_d");

}
