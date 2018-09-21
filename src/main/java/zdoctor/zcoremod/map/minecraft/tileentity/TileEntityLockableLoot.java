package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityLockableLoot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awa";
		else
			return "net/minecraft/tileentity/TileEntityLockableLoot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awa";
		else
			return "TileEntityLockableLoot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawa;";
		else
			return "Lnet/minecraft/tileentity/TileEntityLockableLoot;";
	}

	/**
	 * <p>
	 * Name: getItems
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_190576_q = McMappingDatabase.getSRG("TileEntityLockableLoot.func_190576_q");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("TileEntityLockableLoot.func_174890_g");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("TileEntityLockableLoot.func_174889_b");

	/**
	 * <p>
	 * Name: customName
	 * </p>
	 */
	public static McObfPair field_190577_o = McMappingDatabase.getSRG("field_190577_o");

	/**
	 * <p>
	 * Name: setLootTable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;J)V]
	 * </p>
	 */
	public static McObfPair func_189404_a = McMappingDatabase.getSRG("TileEntityLockableLoot.func_189404_a");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("TileEntityLockableLoot.func_174887_a_");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("TileEntityLockableLoot.func_70300_a");

	/**
	 * <p>
	 * Name: lootTableSeed
	 * </p>
	 */
	public static McObfPair field_184285_n = McMappingDatabase.getSRG("field_184285_n");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("TileEntityLockableLoot.func_70298_a");

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("TileEntityLockableLoot.func_70299_a");

	/**
	 * <p>
	 * Name: setCustomName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_190575_a = McMappingDatabase.getSRG("TileEntityLockableLoot.func_190575_a");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("TileEntityLockableLoot.func_174886_c");

	/**
	 * <p>
	 * Name: fillWithLoot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_184281_d = McMappingDatabase.getSRG("TileEntityLockableLoot.func_184281_d");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184276_b = McMappingDatabase.getSRG("TileEntityLockableLoot.func_184276_b");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("TileEntityLockableLoot.func_174888_l");

	/**
	 * <p>
	 * Name: lootTable
	 * </p>
	 */
	public static McObfPair field_184284_m = McMappingDatabase.getSRG("field_184284_m");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("TileEntityLockableLoot.func_70301_a");

	/**
	 * <p>
	 * Name: checkLootAndWrite
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Z]
	 * </p>
	 */
	public static McObfPair func_184282_c = McMappingDatabase.getSRG("TileEntityLockableLoot.func_184282_c");

	/**
	 * <p>
	 * Name: checkLootAndRead
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Z]
	 * </p>
	 */
	public static McObfPair func_184283_b = McMappingDatabase.getSRG("TileEntityLockableLoot.func_184283_b");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("TileEntityLockableLoot.func_94041_b");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("TileEntityLockableLoot.func_70304_b");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("TileEntityLockableLoot.func_145818_k_");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("TileEntityLockableLoot.func_174885_b");

}
