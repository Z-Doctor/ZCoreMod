package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockGlowstone {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ara";
		else
			return "net/minecraft/block/BlockGlowstone";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ara";
		else
			return "BlockGlowstone";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lara;";
		else
			return "Lnet/minecraft/block/BlockGlowstone;";
	}

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_180659_g = McMappingDatabase.getSRG("BlockGlowstone.func_180659_g");

	/**
	 * <p>
	 * Name: quantityDroppedWithBonus
	 * </p>
	 * <p>
	 * Desc: [(ILjava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149679_a = McMappingDatabase.getSRG("BlockGlowstone.func_149679_a");

	/**
	 * <p>
	 * Name: quantityDropped
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_149745_a = McMappingDatabase.getSRG("BlockGlowstone.func_149745_a");

	/**
	 * <p>
	 * Name: getItemDropped
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_180660_a = McMappingDatabase.getSRG("BlockGlowstone.func_180660_a");

}
