package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityFlowerPot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avt";
		else
			return "net/minecraft/tileentity/TileEntityFlowerPot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avt";
		else
			return "TileEntityFlowerPot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavt;";
		else
			return "Lnet/minecraft/tileentity/TileEntityFlowerPot;";
	}

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityFlowerPot.func_145839_a");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityFlowerPot.func_189518_D_");

	/**
	 * <p>
	 * Name: registerFixesFlowerPot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189699_a = McMappingDatabase.getSRG("TileEntityFlowerPot.func_189699_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityFlowerPot.func_189515_b");

	/**
	 * <p>
	 * Name: getFlowerItemStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184403_b = McMappingDatabase.getSRG("TileEntityFlowerPot.func_184403_b");

	/**
	 * <p>
	 * Name: flowerPotData
	 * </p>
	 */
	public static McObfPair field_145968_i = McMappingDatabase.getSRG("field_145968_i");

	/**
	 * <p>
	 * Name: getFlowerPotItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_145965_a = McMappingDatabase.getSRG("TileEntityFlowerPot.func_145965_a");

	/**
	 * <p>
	 * Name: flowerPotItem
	 * </p>
	 */
	public static McObfPair field_145967_a = McMappingDatabase.getSRG("field_145967_a");

	/**
	 * <p>
	 * Name: getFlowerPotData
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145966_b = McMappingDatabase.getSRG("TileEntityFlowerPot.func_145966_b");

	/**
	 * <p>
	 * Name: setItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_190614_a = McMappingDatabase.getSRG("TileEntityFlowerPot.func_190614_a");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntityFlowerPot.func_189517_E_");

}
