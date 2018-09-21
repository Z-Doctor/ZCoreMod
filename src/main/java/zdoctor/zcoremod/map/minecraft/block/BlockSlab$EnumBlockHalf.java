package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSlab$EnumBlockHalf {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arf$a";
		else
			return "net/minecraft/block/BlockSlab$EnumBlockHalf";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arf$a";
		else
			return "BlockSlab$EnumBlockHalf";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larf$a;";
		else
			return "Lnet/minecraft/block/BlockSlab$EnumBlockHalf;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockSlab$EnumBlockHalf.func_176610_l");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176988_c = McMappingDatabase.getSRG("field_176988_c");

}
