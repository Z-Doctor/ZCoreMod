package zdoctor.zcoremod.map.minecraft.client.renderer.color;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockColors {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bik";
		else
			return "net/minecraft/client/renderer/color/BlockColors";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bik";
		else
			return "BlockColors";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbik;";
		else
			return "Lnet/minecraft/client/renderer/color/BlockColors;";
	}

	/**
	 * <p>
	 * Name: mapBlockColors
	 * </p>
	 */
	public static McObfPair field_186725_a = McMappingDatabase.getSRG("field_186725_a");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/color/BlockColors;]
	 * </p>
	 */
	public static McObfPair func_186723_a = McMappingDatabase.getSRG("BlockColors.func_186723_a");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_189991_a = McMappingDatabase.getSRG("BlockColors.func_189991_a");

	/**
	 * <p>
	 * Name: registerBlockColorHandler
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/color/IBlockColor;[Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_186722_a = McMappingDatabase.getSRG("BlockColors.func_186722_a");

	/**
	 * <p>
	 * Name: colorMultiplier
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_186724_a = McMappingDatabase.getSRG("BlockColors.func_186724_a");

}
