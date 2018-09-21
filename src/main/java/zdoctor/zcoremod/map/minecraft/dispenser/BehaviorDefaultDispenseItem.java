package zdoctor.zcoremod.map.minecraft.dispenser;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BehaviorDefaultDispenseItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ex";
		else
			return "net/minecraft/dispenser/BehaviorDefaultDispenseItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ex";
		else
			return "BehaviorDefaultDispenseItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lex;";
		else
			return "Lnet/minecraft/dispenser/BehaviorDefaultDispenseItem;";
	}

	/**
	 * <p>
	 * Name: playDispenseSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;)V]
	 * </p>
	 */
	public static McObfPair func_82485_a = McMappingDatabase.getSRG("BehaviorDefaultDispenseItem.func_82485_a");

	/**
	 * <p>
	 * Name: doDispense
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V]
	 * </p>
	 */
	public static McObfPair func_82486_a = McMappingDatabase.getSRG("BehaviorDefaultDispenseItem.func_82486_a");

	/**
	 * <p>
	 * Name: spawnDispenseParticles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_82489_a = McMappingDatabase.getSRG("BehaviorDefaultDispenseItem.func_82489_a");

	/**
	 * <p>
	 * Name: getWorldEventDataFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_82488_a = McMappingDatabase.getSRG("BehaviorDefaultDispenseItem.func_82488_a");

	/**
	 * <p>
	 * Name: dispense
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82482_a = McMappingDatabase.getSRG("BehaviorDefaultDispenseItem.func_82482_a");

	/**
	 * <p>
	 * Name: dispenseStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_82487_b = McMappingDatabase.getSRG("BehaviorDefaultDispenseItem.func_82487_b");

}
