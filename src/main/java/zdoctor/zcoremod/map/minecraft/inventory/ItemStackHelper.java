package zdoctor.zcoremod.map.minecraft.inventory;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemStackHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tw";
		else
			return "net/minecraft/inventory/ItemStackHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tw";
		else
			return "ItemStackHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltw;";
		else
			return "Lnet/minecraft/inventory/ItemStackHelper;";
	}

	/**
	 * <p>
	 * Name: loadAllItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_191283_b = McMappingDatabase.getSRG("ItemStackHelper.func_191283_b");

	/**
	 * <p>
	 * Name: saveAllItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/util/NonNullList;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_191282_a = McMappingDatabase.getSRG("ItemStackHelper.func_191282_a");

	/**
	 * <p>
	 * Name: saveAllItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/util/NonNullList;Z)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_191281_a = McMappingDatabase.getSRG("ItemStackHelper.func_191281_a");

	/**
	 * <p>
	 * Name: getAndRemove
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_188383_a = McMappingDatabase.getSRG("ItemStackHelper.func_188383_a");

	/**
	 * <p>
	 * Name: getAndSplit
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_188382_a = McMappingDatabase.getSRG("ItemStackHelper.func_188382_a");

}
