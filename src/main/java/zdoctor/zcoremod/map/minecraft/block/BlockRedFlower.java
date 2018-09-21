package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRedFlower {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atc";
		else
			return "net/minecraft/block/BlockRedFlower";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atc";
		else
			return "BlockRedFlower";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latc;";
		else
			return "Lnet/minecraft/block/BlockRedFlower;";
	}

	/**
	 * <p>
	 * Name: getBlockType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/BlockFlower$EnumFlowerColor;]
	 * </p>
	 */
	public static McObfPair func_176495_j = McMappingDatabase.getSRG("BlockRedFlower.func_176495_j");

}
