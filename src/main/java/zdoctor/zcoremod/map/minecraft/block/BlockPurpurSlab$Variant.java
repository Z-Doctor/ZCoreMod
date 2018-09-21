package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPurpurSlab$Variant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asz$c";
		else
			return "net/minecraft/block/BlockPurpurSlab$Variant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asz$c";
		else
			return "BlockPurpurSlab$Variant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasz$c;";
		else
			return "Lnet/minecraft/block/BlockPurpurSlab$Variant;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockPurpurSlab$Variant.func_176610_l");

}
