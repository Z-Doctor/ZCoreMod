package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockDropper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqd";
		else
			return "net/minecraft/block/BlockDropper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqd";
		else
			return "BlockDropper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqd;";
		else
			return "Lnet/minecraft/block/BlockDropper;";
	}

	/**
	 * <p>
	 * Name: dispense
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_176439_d = McMappingDatabase.getSRG("BlockDropper.func_176439_d");

	/**
	 * <p>
	 * Name: dropBehavior
	 * </p>
	 */
	public static McObfPair field_149947_P = McMappingDatabase.getSRG("field_149947_P");

	/**
	 * <p>
	 * Name: createNewTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;I)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_149915_a = McMappingDatabase.getSRG("BlockDropper.func_149915_a");

	/**
	 * <p>
	 * Name: getBehavior
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/dispenser/IBehaviorDispenseItem;]
	 * </p>
	 */
	public static McObfPair func_149940_a = McMappingDatabase.getSRG("BlockDropper.func_149940_a");

}
