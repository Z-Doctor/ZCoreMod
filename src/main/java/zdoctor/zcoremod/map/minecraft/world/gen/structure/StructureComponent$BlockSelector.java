package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureComponent$BlockSelector {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbx$a";
		else
			return "net/minecraft/world/gen/structure/StructureComponent$BlockSelector";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbx$a";
		else
			return "StructureComponent$BlockSelector";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbx$a;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureComponent$BlockSelector;";
	}

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180780_a = McMappingDatabase.getSRG("StructureComponent$BlockSelector.func_180780_a");

	/**
	 * <p>
	 * Name: blockstate
	 * </p>
	 */
	public static McObfPair field_151562_a = McMappingDatabase.getSRG("field_151562_a");

	/**
	 * <p>
	 * Name: selectBlocks
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_75062_a = McMappingDatabase.getSRG("StructureComponent$BlockSelector.func_75062_a");

}
