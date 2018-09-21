package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityBed {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avi";
		else
			return "net/minecraft/tileentity/TileEntityBed";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avi";
		else
			return "TileEntityBed";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavi;";
		else
			return "Lnet/minecraft/tileentity/TileEntityBed;";
	}

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/EnumDyeColor;)V]
	 * </p>
	 */
	public static McObfPair func_193052_a = McMappingDatabase.getSRG("TileEntityBed.func_193052_a");

	/**
	 * <p>
	 * Name: isHeadPiece
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_193050_e = McMappingDatabase.getSRG("TileEntityBed.func_193050_e");

	/**
	 * <p>
	 * Name: setItemValues
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193051_a = McMappingDatabase.getSRG("TileEntityBed.func_193051_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityBed.func_189515_b");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityBed.func_189518_D_");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_193048_a = McMappingDatabase.getSRG("TileEntityBed.func_193048_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityBed.func_145839_a");

	/**
	 * <p>
	 * Name: getItemStack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_193049_f = McMappingDatabase.getSRG("TileEntityBed.func_193049_f");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_193053_a = McMappingDatabase.getSRG("field_193053_a");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntityBed.func_189517_E_");

}
