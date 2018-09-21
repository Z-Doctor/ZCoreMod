package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SlotCrafting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ago";
		else
			return "net/minecraft/inventory/SlotCrafting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ago";
		else
			return "SlotCrafting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lago;";
		else
			return "Lnet/minecraft/inventory/SlotCrafting;";
	}

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("SlotCrafting.func_75214_a");

	/**
	 * <p>
	 * Name: craftMatrix
	 * </p>
	 */
	public static McObfPair field_75239_a = McMappingDatabase.getSRG("field_75239_a");

	/**
	 * <p>
	 * Name: onSwapCraft
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190900_b = McMappingDatabase.getSRG("SlotCrafting.func_190900_b");

	/**
	 * <p>
	 * Name: amountCrafted
	 * </p>
	 */
	public static McObfPair field_75237_g = McMappingDatabase.getSRG("field_75237_g");

	/**
	 * <p>
	 * Name: onTake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190901_a = McMappingDatabase.getSRG("SlotCrafting.func_190901_a");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_75208_c = McMappingDatabase.getSRG("SlotCrafting.func_75208_c");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_75238_b = McMappingDatabase.getSRG("field_75238_b");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_75210_a = McMappingDatabase.getSRG("SlotCrafting.func_75210_a");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_75209_a = McMappingDatabase.getSRG("SlotCrafting.func_75209_a");

}
