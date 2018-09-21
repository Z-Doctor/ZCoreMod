package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntitySign {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awc";
		else
			return "net/minecraft/tileentity/TileEntitySign";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awc";
		else
			return "TileEntitySign";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawc;";
		else
			return "Lnet/minecraft/tileentity/TileEntitySign;";
	}

	/**
	 * <p>
	 * Name: lineBeingEdited
	 * </p>
	 */
	public static McObfPair field_145918_i = McMappingDatabase.getSRG("field_145918_i");

	/**
	 * <p>
	 * Name: setEditable
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_145913_a = McMappingDatabase.getSRG("TileEntitySign.func_145913_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntitySign.func_189515_b");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntitySign.func_189518_D_");

	/**
	 * <p>
	 * Name: getStats
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/CommandResultStats;]
	 * </p>
	 */
	public static McObfPair func_174880_d = McMappingDatabase.getSRG("TileEntitySign.func_174880_d");

	/**
	 * <p>
	 * Name: stats
	 * </p>
	 */
	public static McObfPair field_174883_i = McMappingDatabase.getSRG("field_174883_i");

	/**
	 * <p>
	 * Name: getIsEditable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145914_a = McMappingDatabase.getSRG("TileEntitySign.func_145914_a");

	/**
	 * <p>
	 * Name: setWorldCreate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_190201_b = McMappingDatabase.getSRG("TileEntitySign.func_190201_b");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntitySign.func_145839_a");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntitySign.func_189517_E_");

	/**
	 * <p>
	 * Name: signText
	 * </p>
	 */
	public static McObfPair field_145915_a = McMappingDatabase.getSRG("field_145915_a");

	/**
	 * <p>
	 * Name: isEditable
	 * </p>
	 */
	public static McObfPair field_145916_j = McMappingDatabase.getSRG("field_145916_j");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_145917_k = McMappingDatabase.getSRG("field_145917_k");

	/**
	 * <p>
	 * Name: setPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_145912_a = McMappingDatabase.getSRG("TileEntitySign.func_145912_a");

	/**
	 * <p>
	 * Name: onlyOpsCanSetNbt
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183000_F = McMappingDatabase.getSRG("TileEntitySign.func_183000_F");

	/**
	 * <p>
	 * Name: executeCommand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_174882_b = McMappingDatabase.getSRG("TileEntitySign.func_174882_b");

	/**
	 * <p>
	 * Name: getPlayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_145911_b = McMappingDatabase.getSRG("TileEntitySign.func_145911_b");

}
