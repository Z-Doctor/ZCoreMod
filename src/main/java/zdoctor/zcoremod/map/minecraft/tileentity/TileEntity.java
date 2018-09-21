package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avj";
		else
			return "net/minecraft/tileentity/TileEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avj";
		else
			return "TileEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavj;";
		else
			return "Lnet/minecraft/tileentity/TileEntity;";
	}

	/**
	 * <p>
	 * Name: tileEntityInvalid
	 * </p>
	 */
	public static McObfPair field_145846_f = McMappingDatabase.getSRG("field_145846_f");

	/**
	 * <p>
	 * Name: getBlockType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_145838_q = McMappingDatabase.getSRG("TileEntity.func_145838_q");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntity.func_189518_D_");

	/**
	 * <p>
	 * Name: blockType
	 * </p>
	 */
	public static McObfPair field_145854_h = McMappingDatabase.getSRG("field_145854_h");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_145850_b = McMappingDatabase.getSRG("field_145850_b");

	/**
	 * <p>
	 * Name: receiveClientEvent
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_145842_c = McMappingDatabase.getSRG("TileEntity.func_145842_c");

	/**
	 * <p>
	 * Name: setWorldCreate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_190201_b = McMappingDatabase.getSRG("TileEntity.func_190201_b");

	/**
	 * <p>
	 * Name: updateContainingBlockInfo
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145836_u = McMappingDatabase.getSRG("TileEntity.func_145836_u");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_190560_a = McMappingDatabase.getSRG("TileEntity.func_190560_a");

	/**
	 * <p>
	 * Name: getMaxRenderDistanceSquared
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_145833_n = McMappingDatabase.getSRG("TileEntity.func_145833_n");

	/**
	 * <p>
	 * Name: blockMetadata
	 * </p>
	 */
	public static McObfPair field_145847_g = McMappingDatabase.getSRG("field_145847_g");

	/**
	 * <p>
	 * Name: onlyOpsCanSetNbt
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_183000_F = McMappingDatabase.getSRG("TileEntity.func_183000_F");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_174877_v = McMappingDatabase.getSRG("TileEntity.func_174877_v");

	/**
	 * <p>
	 * Name: validate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145829_t = McMappingDatabase.getSRG("TileEntity.func_145829_t");

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)V]
	 * </p>
	 */
	public static McObfPair func_189667_a = McMappingDatabase.getSRG("TileEntity.func_189667_a");

	/**
	 * <p>
	 * Name: hasWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145830_o = McMappingDatabase.getSRG("TileEntity.func_145830_o");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_145831_w = McMappingDatabase.getSRG("TileEntity.func_145831_w");

	/**
	 * <p>
	 * Name: getKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_190559_a = McMappingDatabase.getSRG("TileEntity.func_190559_a");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntity.func_189517_E_");

	/**
	 * <p>
	 * Name: addInfoToCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/crash/CrashReportCategory;)V]
	 * </p>
	 */
	public static McObfPair func_145828_a = McMappingDatabase.getSRG("TileEntity.func_145828_a");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_190562_f = McMappingDatabase.getSRG("field_190562_f");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("TileEntity.func_145748_c_");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Mirror;)V]
	 * </p>
	 */
	public static McObfPair func_189668_a = McMappingDatabase.getSRG("TileEntity.func_189668_a");

	/**
	 * <p>
	 * Name: setWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_145834_a = McMappingDatabase.getSRG("TileEntity.func_145834_a");

	/**
	 * <p>
	 * Name: getDistanceSq
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_145835_a = McMappingDatabase.getSRG("TileEntity.func_145835_a");

	/**
	 * <p>
	 * Name: getBlockMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145832_p = McMappingDatabase.getSRG("TileEntity.func_145832_p");

	/**
	 * <p>
	 * Name: markDirty
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70296_d = McMappingDatabase.getSRG("TileEntity.func_70296_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_145852_a = McMappingDatabase.getSRG("field_145852_a");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_190200_a = McMappingDatabase.getSRG("TileEntity.func_190200_a");

	/**
	 * <p>
	 * Name: invalidate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145843_s = McMappingDatabase.getSRG("TileEntity.func_145843_s");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntity.func_189515_b");

	/**
	 * <p>
	 * Name: writeInternal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189516_d = McMappingDatabase.getSRG("TileEntity.func_189516_d");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntity.func_145839_a");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_174878_a = McMappingDatabase.getSRG("TileEntity.func_174878_a");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_174879_c = McMappingDatabase.getSRG("field_174879_c");

	/**
	 * <p>
	 * Name: isInvalid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145837_r = McMappingDatabase.getSRG("TileEntity.func_145837_r");

}
