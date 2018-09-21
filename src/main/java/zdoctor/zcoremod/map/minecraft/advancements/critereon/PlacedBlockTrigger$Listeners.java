package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlacedBlockTrigger$Listeners {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aw$a";
		else
			return "net/minecraft/advancements/critereon/PlacedBlockTrigger$Listeners";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aw$a";
		else
			return "PlacedBlockTrigger$Listeners";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Law$a;";
		else
			return "Lnet/minecraft/advancements/critereon/PlacedBlockTrigger$Listeners;";
	}

	/**
	 * <p>
	 * Name: trigger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/WorldServer;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193489_a = McMappingDatabase.getSRG("PlacedBlockTrigger$Listeners.func_193489_a");

	/**
	 * <p>
	 * Name: playerAdvancements
	 * </p>
	 */
	public static McObfPair field_193491_a = McMappingDatabase.getSRG("field_193491_a");

	/**
	 * <p>
	 * Name: remove
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193487_b = McMappingDatabase.getSRG("PlacedBlockTrigger$Listeners.func_193487_b");

	/**
	 * <p>
	 * Name: listeners
	 * </p>
	 */
	public static McObfPair field_193492_b = McMappingDatabase.getSRG("field_193492_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193488_a = McMappingDatabase.getSRG("PlacedBlockTrigger$Listeners.func_193488_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/ICriterionTrigger$Listener;)V]
	 * </p>
	 */
	public static McObfPair func_193490_a = McMappingDatabase.getSRG("PlacedBlockTrigger$Listeners.func_193490_a");

}
