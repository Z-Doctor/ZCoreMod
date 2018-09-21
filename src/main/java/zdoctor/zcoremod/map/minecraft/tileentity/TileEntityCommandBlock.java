package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityCommandBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avm";
		else
			return "net/minecraft/tileentity/TileEntityCommandBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avm";
		else
			return "TileEntityCommandBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavm;";
		else
			return "Lnet/minecraft/tileentity/TileEntityCommandBlock;";
	}

	/**
	 * <p>
	 * Name: validate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145829_t = McMappingDatabase.getSRG("TileEntityCommandBlock.func_145829_t");

	/**
	 * <p>
	 * Name: isAuto
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184254_e = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184254_e");

	/**
	 * <p>
	 * Name: isConditionMet
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184256_g = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184256_g");

	/**
	 * <p>
	 * Name: onlyOpsCanSetNbt
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183000_F = McMappingDatabase.getSRG("TileEntityCommandBlock.func_183000_F");

	/**
	 * <p>
	 * Name: commandBlockLogic
	 * </p>
	 */
	public static McObfPair field_145994_a = McMappingDatabase.getSRG("field_145994_a");

	/**
	 * <p>
	 * Name: getMode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/TileEntityCommandBlock$Mode;]
	 * </p>
	 */
	public static McObfPair func_184251_i = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184251_i");

	/**
	 * <p>
	 * Name: getCommandResultStats
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/CommandResultStats;]
	 * </p>
	 */
	public static McObfPair func_175124_c = McMappingDatabase.getSRG("TileEntityCommandBlock.func_175124_c");

	/**
	 * <p>
	 * Name: isPowered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184255_d = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184255_d");

	/**
	 * <p>
	 * Name: sendToClient
	 * </p>
	 */
	public static McObfPair field_184262_h = McMappingDatabase.getSRG("field_184262_h");

	/**
	 * <p>
	 * Name: setAuto
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184253_b = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184253_b");

	/**
	 * <p>
	 * Name: powered
	 * </p>
	 */
	public static McObfPair field_184259_a = McMappingDatabase.getSRG("field_184259_a");

	/**
	 * <p>
	 * Name: setConditionMet
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184249_c = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184249_c");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityCommandBlock.func_189518_D_");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityCommandBlock.func_189515_b");

	/**
	 * <p>
	 * Name: conditionMet
	 * </p>
	 */
	public static McObfPair field_184261_g = McMappingDatabase.getSRG("field_184261_g");

	/**
	 * <p>
	 * Name: getCommandBlockLogic
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/CommandBlockBaseLogic;]
	 * </p>
	 */
	public static McObfPair func_145993_a = McMappingDatabase.getSRG("TileEntityCommandBlock.func_145993_a");

	/**
	 * <p>
	 * Name: isConditional
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184258_j = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184258_j");

	/**
	 * <p>
	 * Name: setSendToClient
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184252_d = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184252_d");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityCommandBlock.func_145839_a");

	/**
	 * <p>
	 * Name: auto
	 * </p>
	 */
	public static McObfPair field_184260_f = McMappingDatabase.getSRG("field_184260_f");

	/**
	 * <p>
	 * Name: isSendToClient
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184257_h = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184257_h");

	/**
	 * <p>
	 * Name: setPowered
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184250_a = McMappingDatabase.getSRG("TileEntityCommandBlock.func_184250_a");

}
