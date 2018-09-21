package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartContainer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afh";
		else
			return "net/minecraft/entity/item/EntityMinecartContainer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afh";
		else
			return "EntityMinecartContainer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafh;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartContainer;";
	}

	/**
	 * <p>
	 * Name: killMinecart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_94095_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_94095_a");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("EntityMinecartContainer.func_70304_b");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_70300_a");

	/**
	 * <p>
	 * Name: applyDrag
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94101_h = McMappingDatabase.getSRG("EntityMinecartContainer.func_94101_h");

	/**
	 * <p>
	 * Name: setDead
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70106_y = McMappingDatabase.getSRG("EntityMinecartContainer.func_70106_y");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityMinecartContainer.func_70014_b");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("EntityMinecartContainer.func_70297_j_");

	/**
	 * <p>
	 * Name: setLockCode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/LockCode;)V]
	 * </p>
	 */
	public static McObfPair func_174892_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_174892_a");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70296_d = McMappingDatabase.getSRG("EntityMinecartContainer.func_70296_d");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("EntityMinecartContainer.func_174890_g");

	/**
	 * <p>
	 * Name: changeDimension
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184204_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_184204_a");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("EntityMinecartContainer.func_174888_l");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("EntityMinecartContainer.func_174887_a_");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184276_b = McMappingDatabase.getSRG("EntityMinecartContainer.func_184276_b");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("EntityMinecartContainer.func_94041_b");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("EntityMinecartContainer.func_174889_b");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_184230_a");

	/**
	 * <p>
	 * Name: dropContentsWhenDead
	 * </p>
	 */
	public static McObfPair field_94112_b = McMappingDatabase.getSRG("field_94112_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_70037_a");

	/**
	 * <p>
	 * Name: minecartContainerItems
	 * </p>
	 */
	public static McObfPair field_94113_a = McMappingDatabase.getSRG("field_94113_a");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("EntityMinecartContainer.func_174885_b");

	/**
	 * <p>
	 * Name: addLoot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_184288_f = McMappingDatabase.getSRG("EntityMinecartContainer.func_184288_f");

	/**
	 * <p>
	 * Name: getLockCode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/LockCode;]
	 * </p>
	 */
	public static McObfPair func_174891_i = McMappingDatabase.getSRG("EntityMinecartContainer.func_174891_i");

	/**
	 * <p>
	 * Name: setLootTable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;J)V]
	 * </p>
	 */
	public static McObfPair func_184289_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_184289_a");

	/**
	 * <p>
	 * Name: lootTable
	 * </p>
	 */
	public static McObfPair field_184290_c = McMappingDatabase.getSRG("field_184290_c");

	/**
	 * <p>
	 * Name: lootTableSeed
	 * </p>
	 */
	public static McObfPair field_184291_d = McMappingDatabase.getSRG("field_184291_d");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("EntityMinecartContainer.func_174886_c");

	/**
	 * <p>
	 * Name: setDropItemsWhenDead
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184174_b = McMappingDatabase.getSRG("EntityMinecartContainer.func_184174_b");

	/**
	 * <p>
	 * Name: isLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174893_q_ = McMappingDatabase.getSRG("EntityMinecartContainer.func_174893_q_");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_70298_a");

	/**
	 * <p>
	 * Name: addDataFixers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_190574_b = McMappingDatabase.getSRG("EntityMinecartContainer.func_190574_b");

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_70299_a");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("EntityMinecartContainer.func_70301_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("EntityMinecartContainer.func_191420_l");

}
