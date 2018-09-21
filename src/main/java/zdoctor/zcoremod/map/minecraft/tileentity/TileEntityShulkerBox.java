package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityShulkerBox {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awb";
		else
			return "net/minecraft/tileentity/TileEntityShulkerBox";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awb";
		else
			return "TileEntityShulkerBox";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawb;";
		else
			return "Lnet/minecraft/tileentity/TileEntityShulkerBox;";
	}

	/**
	 * <p>
	 * Name: progressOld
	 * </p>
	 */
	public static McObfPair field_190601_k = McMappingDatabase.getSRG("field_190601_k");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityShulkerBox.func_189518_D_");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("TileEntityShulkerBox.func_174886_c");

	/**
	 * <p>
	 * Name: clear
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_174888_l = McMappingDatabase.getSRG("TileEntityShulkerBox.func_174888_l");

	/**
	 * <p>
	 * Name: canExtractItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180461_b = McMappingDatabase.getSRG("TileEntityShulkerBox.func_180461_b");

	/**
	 * <p>
	 * Name: loadFromNbt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_190586_e = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190586_e");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_145839_a");

	/**
	 * <p>
	 * Name: isCleared
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190590_r = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190590_r");

	/**
	 * <p>
	 * Name: receiveClientEvent
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_145842_c = McMappingDatabase.getSRG("TileEntityShulkerBox.func_145842_c");

	/**
	 * <p>
	 * Name: items
	 * </p>
	 */
	public static McObfPair field_190596_f = McMappingDatabase.getSRG("field_190596_f");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_174876_a");

	/**
	 * <p>
	 * Name: openCount
	 * </p>
	 */
	public static McObfPair field_190598_h = McMappingDatabase.getSRG("field_190598_h");

	/**
	 * <p>
	 * Name: hasBeenCleared
	 * </p>
	 */
	public static McObfPair field_190597_g = McMappingDatabase.getSRG("field_190597_g");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_73660_a");

	/**
	 * <p>
	 * Name: getSlotsForFace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)[I]
	 * </p>
	 */
	public static McObfPair func_180463_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_180463_a");

	/**
	 * <p>
	 * Name: destroyedByCreativePlayer
	 * </p>
	 */
	public static McObfPair field_190594_p = McMappingDatabase.getSRG("field_190594_p");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("TileEntityShulkerBox.func_191420_l");

	/**
	 * <p>
	 * Name: saveToNbt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_190580_f = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190580_f");

	/**
	 * <p>
	 * Name: shouldDrop
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190582_F = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190582_F");

	/**
	 * <p>
	 * Name: registerFixesShulkerBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190593_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190593_a");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("TileEntityShulkerBox.func_70297_j_");

	/**
	 * <p>
	 * Name: SLOTS
	 * </p>
	 */
	public static McObfPair field_190595_a = McMappingDatabase.getSRG("field_190595_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityShulkerBox.func_70005_c_");

	/**
	 * <p>
	 * Name: setDestroyedByCreativePlayer
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_190579_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190579_a");

	/**
	 * <p>
	 * Name: getItems
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_190576_q = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190576_q");

	/**
	 * <p>
	 * Name: getAnimationStatus
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/TileEntityShulkerBox$AnimationStatus;]
	 * </p>
	 */
	public static McObfPair func_190591_p = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190591_p");

	/**
	 * <p>
	 * Name: canInsertItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumFacing;)Z]
	 * </p>
	 */
	public static McObfPair func_180462_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_180462_a");

	/**
	 * <p>
	 * Name: getProgress
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_190585_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190585_a");

	/**
	 * <p>
	 * Name: updateAnimation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190583_o = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190583_o");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("TileEntityShulkerBox.func_70302_i_");

	/**
	 * <p>
	 * Name: moveCollidedEntities
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190589_G = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190589_G");

	/**
	 * <p>
	 * Name: isDestroyedByCreativePlayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190581_E = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190581_E");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityShulkerBox.func_189515_b");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("TileEntityShulkerBox.func_174889_b");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_190602_l = McMappingDatabase.getSRG("field_190602_l");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("TileEntityShulkerBox.func_174875_k");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_190584_a = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190584_a");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_190592_s = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190592_s");

	/**
	 * <p>
	 * Name: progress
	 * </p>
	 */
	public static McObfPair field_190600_j = McMappingDatabase.getSRG("field_190600_j");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_190587_b = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190587_b");

	/**
	 * <p>
	 * Name: getTopBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_190588_c = McMappingDatabase.getSRG("TileEntityShulkerBox.func_190588_c");

	/**
	 * <p>
	 * Name: animationStatus
	 * </p>
	 */
	public static McObfPair field_190599_i = McMappingDatabase.getSRG("field_190599_i");

}
