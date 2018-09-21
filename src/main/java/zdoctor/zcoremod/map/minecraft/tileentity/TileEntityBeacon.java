package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityBeacon {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avh";
		else
			return "net/minecraft/tileentity/TileEntityBeacon";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avh";
		else
			return "TileEntityBeacon";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavh;";
		else
			return "Lnet/minecraft/tileentity/TileEntityBeacon;";
	}

	/**
	 * <p>
	 * Name: beamRenderCounter
	 * </p>
	 */
	public static McObfPair field_146016_i = McMappingDatabase.getSRG("field_146016_i");

	/**
	 * <p>
	 * Name: secondaryEffect
	 * </p>
	 */
	public static McObfPair field_146010_n = McMappingDatabase.getSRG("field_146010_n");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityBeacon.func_145839_a");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("TileEntityBeacon.func_174875_k");

	/**
	 * <p>
	 * Name: setInventorySlotContents
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_70299_a = McMappingDatabase.getSRG("TileEntityBeacon.func_70299_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityBeacon.func_70005_c_");

	/**
	 * <p>
	 * Name: getStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70301_a = McMappingDatabase.getSRG("TileEntityBeacon.func_70301_a");

	/**
	 * <p>
	 * Name: levels
	 * </p>
	 */
	public static McObfPair field_146012_l = McMappingDatabase.getSRG("field_146012_l");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("TileEntityBeacon.func_145818_k_");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("TileEntityBeacon.func_174876_a");

	/**
	 * <p>
	 * Name: VALID_EFFECTS
	 * </p>
	 */
	public static McObfPair field_184280_f = McMappingDatabase.getSRG("field_184280_f");

	/**
	 * <p>
	 * Name: canExtractItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180461_b = McMappingDatabase.getSRG("TileEntityBeacon.func_180461_b");

	/**
	 * <p>
	 * Name: beamSegments
	 * </p>
	 */
	public static McObfPair field_174909_f = McMappingDatabase.getSRG("field_174909_f");

	/**
	 * <p>
	 * Name: isBeaconEffect
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_184279_f = McMappingDatabase.getSRG("TileEntityBeacon.func_184279_f");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("TileEntityBeacon.func_174889_b");

	/**
	 * <p>
	 * Name: isItemValidForSlot
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_94041_b = McMappingDatabase.getSRG("TileEntityBeacon.func_94041_b");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("TileEntityBeacon.func_174888_l");

	/**
	 * <p>
	 * Name: addEffectsToPlayers
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146000_x = McMappingDatabase.getSRG("TileEntityBeacon.func_146000_x");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityBeacon.func_189518_D_");

	/**
	 * <p>
	 * Name: updateSegmentColors
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_146003_y = McMappingDatabase.getSRG("TileEntityBeacon.func_146003_y");

	/**
	 * <p>
	 * Name: getField
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_174887_a_ = McMappingDatabase.getSRG("TileEntityBeacon.func_174887_a_");

	/**
	 * <p>
	 * Name: getSlotsForFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)[I]
	 * </p>
	 */
	public static McObfPair func_180463_a = McMappingDatabase.getSRG("TileEntityBeacon.func_180463_a");

	/**
	 * <p>
	 * Name: updateBeacon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174908_m = McMappingDatabase.getSRG("TileEntityBeacon.func_174908_m");

	/**
	 * <p>
	 * Name: isComplete
	 * </p>
	 */
	public static McObfPair field_146015_k = McMappingDatabase.getSRG("field_146015_k");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityBeacon.func_73660_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("TileEntityBeacon.func_191420_l");

	/**
	 * <p>
	 * Name: getMaxRenderDistanceSquared
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_145833_n = McMappingDatabase.getSRG("TileEntityBeacon.func_145833_n");

	/**
	 * <p>
	 * Name: primaryEffect
	 * </p>
	 */
	public static McObfPair field_146013_m = McMappingDatabase.getSRG("field_146013_m");

	/**
	 * <p>
	 * Name: canInsertItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180462_a = McMappingDatabase.getSRG("TileEntityBeacon.func_180462_a");

	/**
	 * <p>
	 * Name: shouldBeamRender
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_146002_i = McMappingDatabase.getSRG("TileEntityBeacon.func_146002_i");

	/**
	 * <p>
	 * Name: decrStackSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70298_a = McMappingDatabase.getSRG("TileEntityBeacon.func_70298_a");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("TileEntityBeacon.func_174886_c");

	/**
	 * <p>
	 * Name: setField
	 * </p>
	 * <p>
	 * Desc: [(II)V]
	 * </p>
	 */
	public static McObfPair func_174885_b = McMappingDatabase.getSRG("TileEntityBeacon.func_174885_b");

	/**
	 * <p>
	 * Name: getFieldCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_174890_g = McMappingDatabase.getSRG("TileEntityBeacon.func_174890_g");

	/**
	 * <p>
	 * Name: EFFECTS_LIST
	 * </p>
	 */
	public static McObfPair field_146009_a = McMappingDatabase.getSRG("field_146009_a");

	/**
	 * <p>
	 * Name: receiveClientEvent
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_145842_c = McMappingDatabase.getSRG("TileEntityBeacon.func_145842_c");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityBeacon.func_189515_b");

	/**
	 * <p>
	 * Name: getLevels
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_191979_s = McMappingDatabase.getSRG("TileEntityBeacon.func_191979_s");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("TileEntityBeacon.func_70302_i_");

	/**
	 * <p>
	 * Name: beamRenderScale
	 * </p>
	 */
	public static McObfPair field_146014_j = McMappingDatabase.getSRG("field_146014_j");

	/**
	 * <p>
	 * Name: setName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145999_a = McMappingDatabase.getSRG("TileEntityBeacon.func_145999_a");

	/**
	 * <p>
	 * Name: payment
	 * </p>
	 */
	public static McObfPair field_146011_o = McMappingDatabase.getSRG("field_146011_o");

	/**
	 * <p>
	 * Name: isUsableByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_70300_a = McMappingDatabase.getSRG("TileEntityBeacon.func_70300_a");

	/**
	 * <p>
	 * Name: removeStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_70304_b = McMappingDatabase.getSRG("TileEntityBeacon.func_70304_b");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntityBeacon.func_189517_E_");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("TileEntityBeacon.func_70297_j_");

	/**
	 * <p>
	 * Name: getBeamSegments
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_174907_n = McMappingDatabase.getSRG("TileEntityBeacon.func_174907_n");

	/**
	 * <p>
	 * Name: customName
	 * </p>
	 */
	public static McObfPair field_146008_p = McMappingDatabase.getSRG("field_146008_p");

}
