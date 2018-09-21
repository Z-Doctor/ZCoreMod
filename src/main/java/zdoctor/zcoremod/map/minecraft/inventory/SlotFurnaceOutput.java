package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SlotFurnaceOutput {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "age";
		else
			return "net/minecraft/inventory/SlotFurnaceOutput";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "age";
		else
			return "SlotFurnaceOutput";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lage;";
		else
			return "Lnet/minecraft/inventory/SlotFurnaceOutput;";
	}

	/**
	 * <p>
	 * Name: onTake
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190901_a = McMappingDatabase.getSRG("SlotFurnaceOutput.func_190901_a");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;I)V]
	 * </p>
	 */
	public static McObfPair func_75210_a = McMappingDatabase.getSRG("SlotFurnaceOutput.func_75210_a");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_75208_c = McMappingDatabase.getSRG("SlotFurnaceOutput.func_75208_c");

	/**
	 * <p>
	 * Name: removeCount
	 * </p>
	 */
	public static McObfPair field_75228_b = McMappingDatabase.getSRG("field_75228_b");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_75229_a = McMappingDatabase.getSRG("field_75229_a");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_75209_a = McMappingDatabase.getSRG("SlotFurnaceOutput.func_75209_a");

	/**
	 * <p>
	 * Name: isItemValid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_75214_a = McMappingDatabase.getSRG("SlotFurnaceOutput.func_75214_a");

}
