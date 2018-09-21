package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlacedBlockTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aw$b";
		else
			return "net/minecraft/advancements/critereon/PlacedBlockTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aw$b";
		else
			return "PlacedBlockTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Law$b;";
		else
			return "Lnet/minecraft/advancements/critereon/PlacedBlockTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_193211_a = McMappingDatabase.getSRG("field_193211_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/WorldServer;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_193210_a = McMappingDatabase.getSRG("PlacedBlockTrigger$Instance.func_193210_a");

	/**
	 * <p>
	 * Name: location
	 * </p>
	 */
	public static McObfPair field_193213_c = McMappingDatabase.getSRG("field_193213_c");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_193214_d = McMappingDatabase.getSRG("field_193214_d");

	/**
	 * <p>
	 * Name: properties
	 * </p>
	 */
	public static McObfPair field_193212_b = McMappingDatabase.getSRG("field_193212_b");

}
