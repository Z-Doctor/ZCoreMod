package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityChest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avl";
		else
			return "net/minecraft/tileentity/TileEntityChest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avl";
		else
			return "TileEntityChest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavl;";
		else
			return "Lnet/minecraft/tileentity/TileEntityChest;";
	}

	/**
	 * <p>
	 * Name: isChestAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_174912_b = McMappingDatabase.getSRG("TileEntityChest.func_174912_b");

	/**
	 * <p>
	 * Name: getChestType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/BlockChest$Type;]
	 * </p>
	 */
	public static McObfPair func_145980_j = McMappingDatabase.getSRG("TileEntityChest.func_145980_j");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174889_b = McMappingDatabase.getSRG("TileEntityChest.func_174889_b");

	/**
	 * <p>
	 * Name: adjacentChestZPos
	 * </p>
	 */
	public static McObfPair field_145988_l = McMappingDatabase.getSRG("field_145988_l");

	/**
	 * <p>
	 * Name: lidAngle
	 * </p>
	 */
	public static McObfPair field_145989_m = McMappingDatabase.getSRG("field_145989_m");

	/**
	 * <p>
	 * Name: setNeighbor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityChest;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_174910_a = McMappingDatabase.getSRG("TileEntityChest.func_174910_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_191420_l = McMappingDatabase.getSRG("TileEntityChest.func_191420_l");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityChest.func_73660_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityChest.func_70005_c_");

	/**
	 * <p>
	 * Name: ticksSinceSync
	 * </p>
	 */
	public static McObfPair field_145983_q = McMappingDatabase.getSRG("field_145983_q");

	/**
	 * <p>
	 * Name: numPlayersUsing
	 * </p>
	 */
	public static McObfPair field_145987_o = McMappingDatabase.getSRG("field_145987_o");

	/**
	 * <p>
	 * Name: registerFixesChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189677_a = McMappingDatabase.getSRG("TileEntityChest.func_189677_a");

	/**
	 * <p>
	 * Name: adjacentChestXNeg
	 * </p>
	 */
	public static McObfPair field_145991_k = McMappingDatabase.getSRG("field_145991_k");

	/**
	 * <p>
	 * Name: chestContents
	 * </p>
	 */
	public static McObfPair field_145985_p = McMappingDatabase.getSRG("field_145985_p");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("TileEntityChest.func_70302_i_");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityChest.func_145839_a");

	/**
	 * <p>
	 * Name: adjacentChestChecked
	 * </p>
	 */
	public static McObfPair field_145984_a = McMappingDatabase.getSRG("field_145984_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityChest.func_189515_b");

	/**
	 * <p>
	 * Name: closeInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_174886_c = McMappingDatabase.getSRG("TileEntityChest.func_174886_c");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("TileEntityChest.func_174875_k");

	/**
	 * <p>
	 * Name: adjacentChestXPos
	 * </p>
	 */
	public static McObfPair field_145990_j = McMappingDatabase.getSRG("field_145990_j");

	/**
	 * <p>
	 * Name: invalidate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145843_s = McMappingDatabase.getSRG("TileEntityChest.func_145843_s");

	/**
	 * <p>
	 * Name: getInventoryStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70297_j_ = McMappingDatabase.getSRG("TileEntityChest.func_70297_j_");

	/**
	 * <p>
	 * Name: checkForAdjacentChests
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145979_i = McMappingDatabase.getSRG("TileEntityChest.func_145979_i");

	/**
	 * <p>
	 * Name: prevLidAngle
	 * </p>
	 */
	public static McObfPair field_145986_n = McMappingDatabase.getSRG("field_145986_n");

	/**
	 * <p>
	 * Name: getAdjacentChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/tileentity/TileEntityChest;]
	 * </p>
	 */
	public static McObfPair func_174911_a = McMappingDatabase.getSRG("TileEntityChest.func_174911_a");

	/**
	 * <p>
	 * Name: receiveClientEvent
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_145842_c = McMappingDatabase.getSRG("TileEntityChest.func_145842_c");

	/**
	 * <p>
	 * Name: updateContainingBlockInfo
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145836_u = McMappingDatabase.getSRG("TileEntityChest.func_145836_u");

	/**
	 * <p>
	 * Name: adjacentChestZNeg
	 * </p>
	 */
	public static McObfPair field_145992_i = McMappingDatabase.getSRG("field_145992_i");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("TileEntityChest.func_174876_a");

	/**
	 * <p>
	 * Name: getItems
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/NonNullList;]
	 * </p>
	 */
	public static McObfPair func_190576_q = McMappingDatabase.getSRG("TileEntityChest.func_190576_q");

	/**
	 * <p>
	 * Name: cachedChestType
	 * </p>
	 */
	public static McObfPair field_145982_r = McMappingDatabase.getSRG("field_145982_r");

}
