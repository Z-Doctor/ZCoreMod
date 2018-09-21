package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SlotMerchantResult {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agl";
		else
			return "net/minecraft/inventory/SlotMerchantResult";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agl";
		else
			return "SlotMerchantResult";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagl;";
		else
			return "Lnet/minecraft/inventory/SlotMerchantResult;";
	}

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_75232_b = McMappingDatabase.getSRG("field_75232_b");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_75210_a = McMappingDatabase.getSRG("SlotMerchantResult.func_75210_a");

	/**
	 * <p>
	 * Name: removeCount
	 * </p>
	 */
	public static McObfPair field_75231_g = McMappingDatabase.getSRG("field_75231_g");

	/**
	 * <p>
	 * Name: doTrade
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/MerchantRecipe;Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75230_a = McMappingDatabase.getSRG("SlotMerchantResult.func_75230_a");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_75208_c = McMappingDatabase.getSRG("SlotMerchantResult.func_75208_c");

	/**
	 * <p>
	 * Name: merchantInventory
	 * </p>
	 */
	public static McObfPair field_75233_a = McMappingDatabase.getSRG("field_75233_a");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_75209_a = McMappingDatabase.getSRG("SlotMerchantResult.func_75209_a");

	/**
	 * <p>
	 * Name: onTake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190901_a = McMappingDatabase.getSRG("SlotMerchantResult.func_190901_a");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("SlotMerchantResult.func_75214_a");

	/**
	 * <p>
	 * Name: merchant
	 * </p>
	 */
	public static McObfPair field_75234_h = McMappingDatabase.getSRG("field_75234_h");

}
