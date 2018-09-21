package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockYellowFlower {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ave";
		else
			return "net/minecraft/block/BlockYellowFlower";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ave";
		else
			return "BlockYellowFlower";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lave;";
		else
			return "Lnet/minecraft/block/BlockYellowFlower;";
	}

	/**
	 * <p>
	 * Name: getBlockType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/BlockFlower$EnumFlowerColor;]
	 * </p>
	 */
	public static McObfPair func_176495_j = McMappingDatabase.getSRG("BlockYellowFlower.func_176495_j");

}
