package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockMelon {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arx";
		else
			return "net/minecraft/block/BlockMelon";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arx";
		else
			return "BlockMelon";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larx;";
		else
			return "Lnet/minecraft/block/BlockMelon;";
	}

	/**
	 * <p>
	 * Name: quantityDroppedWithBonus
	 * </p>
	 * <p>
	 * Desc: [(ILjava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149679_a = McMappingDatabase.getSRG("BlockMelon.func_149679_a");

	/**
	 * <p>
	 * Name: quantityDropped
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149745_a = McMappingDatabase.getSRG("BlockMelon.func_149745_a");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockMelon.func_180660_a");

}
