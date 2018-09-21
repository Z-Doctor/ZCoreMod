package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockFlower$EnumFlowerColor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqr$b";
		else
			return "net/minecraft/block/BlockFlower$EnumFlowerColor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqr$b";
		else
			return "BlockFlower$EnumFlowerColor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqr$b;";
		else
			return "Lnet/minecraft/block/BlockFlower$EnumFlowerColor;";
	}

	/**
	 * <p>
	 * Name: getBlock
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/BlockFlower;]
	 * </p>
	 */
	public static McObfPair func_180346_a = McMappingDatabase.getSRG("BlockFlower$EnumFlowerColor.func_180346_a");

}
