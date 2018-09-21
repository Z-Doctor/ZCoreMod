package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityStructure {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awe";
		else
			return "net/minecraft/tileentity/TileEntityStructure";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awe";
		else
			return "TileEntityStructure";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawe;";
		else
			return "Lnet/minecraft/tileentity/TileEntityStructure;";
	}

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntityStructure.func_189517_E_");

	/**
	 * <p>
	 * Name: isPowered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189722_G = McMappingDatabase.getSRG("TileEntityStructure.func_189722_G");

	/**
	 * <p>
	 * Name: isStructureLoadable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189709_F = McMappingDatabase.getSRG("TileEntityStructure.func_189709_F");

	/**
	 * <p>
	 * Name: size
	 * </p>
	 */
	public static McObfPair field_184424_i = McMappingDatabase.getSRG("field_184424_i");

	/**
	 * <p>
	 * Name: save
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184419_m = McMappingDatabase.getSRG("TileEntityStructure.func_184419_m");

	/**
	 * <p>
	 * Name: setIntegrity
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_189718_a = McMappingDatabase.getSRG("TileEntityStructure.func_189718_a");

	/**
	 * <p>
	 * Name: detectSize
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184417_l = McMappingDatabase.getSRG("TileEntityStructure.func_184417_l");

	/**
	 * <p>
	 * Name: getSeed
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_189719_o = McMappingDatabase.getSRG("TileEntityStructure.func_189719_o");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("TileEntityStructure.func_145748_c_");

	/**
	 * <p>
	 * Name: updateBlockState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189704_J = McMappingDatabase.getSRG("TileEntityStructure.func_189704_J");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_184426_k = McMappingDatabase.getSRG("field_184426_k");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityStructure.func_189518_D_");

	/**
	 * <p>
	 * Name: showsBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189721_I = McMappingDatabase.getSRG("TileEntityStructure.func_189721_I");

	/**
	 * <p>
	 * Name: writeCoordinates
	 * </p>
	 * <p>
	 * Desc: [(Lio/netty/buffer/ByteBuf;)V]
	 * </p>
	 */
	public static McObfPair func_189705_a = McMappingDatabase.getSRG("TileEntityStructure.func_189705_a");

	/**
	 * <p>
	 * Name: save
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_189712_b = McMappingDatabase.getSRG("TileEntityStructure.func_189712_b");

	/**
	 * <p>
	 * Name: integrity
	 * </p>
	 */
	public static McObfPair field_189730_q = McMappingDatabase.getSRG("field_189730_q");

	/**
	 * <p>
	 * Name: seed
	 * </p>
	 */
	public static McObfPair field_189731_r = McMappingDatabase.getSRG("field_189731_r");

	/**
	 * <p>
	 * Name: setShowAir
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_189703_e = McMappingDatabase.getSRG("TileEntityStructure.func_189703_e");

	/**
	 * <p>
	 * Name: author
	 * </p>
	 */
	public static McObfPair field_184421_f = McMappingDatabase.getSRG("field_184421_f");

	/**
	 * <p>
	 * Name: calculateEnclosingBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Ljava/util/List;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_184416_a = McMappingDatabase.getSRG("TileEntityStructure.func_184416_a");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 */
	public static McObfPair field_184425_j = McMappingDatabase.getSRG("field_184425_j");

	/**
	 * <p>
	 * Name: getRotation
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/Rotation;]
	 * </p>
	 */
	public static McObfPair func_189726_i = McMappingDatabase.getSRG("TileEntityStructure.func_189726_i");

	/**
	 * <p>
	 * Name: setIgnoresEntities
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184406_a = McMappingDatabase.getSRG("TileEntityStructure.func_184406_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityStructure.func_189515_b");

	/**
	 * <p>
	 * Name: showBoundingBox
	 * </p>
	 */
	public static McObfPair field_189729_p = McMappingDatabase.getSRG("field_189729_p");

	/**
	 * <p>
	 * Name: setShowBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_189710_f = McMappingDatabase.getSRG("TileEntityStructure.func_189710_f");

	/**
	 * <p>
	 * Name: showsAir
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189707_H = McMappingDatabase.getSRG("TileEntityStructure.func_189707_H");

	/**
	 * <p>
	 * Name: setSeed
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_189725_a = McMappingDatabase.getSRG("TileEntityStructure.func_189725_a");

	/**
	 * <p>
	 * Name: setMode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityStructure$Mode;)V]
	 * </p>
	 */
	public static McObfPair func_184405_a = McMappingDatabase.getSRG("TileEntityStructure.func_184405_a");

	/**
	 * <p>
	 * Name: setSize
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184409_c = McMappingDatabase.getSRG("TileEntityStructure.func_184409_c");

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_189714_c = McMappingDatabase.getSRG("TileEntityStructure.func_189714_c");

	/**
	 * <p>
	 * Name: ignoresEntities
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_189713_m = McMappingDatabase.getSRG("TileEntityStructure.func_189713_m");

	/**
	 * <p>
	 * Name: filterRelatedCornerBlocks
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184415_a = McMappingDatabase.getSRG("TileEntityStructure.func_184415_a");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_189708_j = McMappingDatabase.getSRG("TileEntityStructure.func_189708_j");

	/**
	 * <p>
	 * Name: load
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184412_n = McMappingDatabase.getSRG("TileEntityStructure.func_184412_n");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_184420_a = McMappingDatabase.getSRG("field_184420_a");

	/**
	 * <p>
	 * Name: getIntegrity
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_189702_n = McMappingDatabase.getSRG("TileEntityStructure.func_189702_n");

	/**
	 * <p>
	 * Name: mode
	 * </p>
	 */
	public static McObfPair field_184427_l = McMappingDatabase.getSRG("field_184427_l");

	/**
	 * <p>
	 * Name: setPowered
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_189723_d = McMappingDatabase.getSRG("TileEntityStructure.func_189723_d");

	/**
	 * <p>
	 * Name: setRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)V]
	 * </p>
	 */
	public static McObfPair func_184408_a = McMappingDatabase.getSRG("TileEntityStructure.func_184408_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityStructure.func_145839_a");

	/**
	 * <p>
	 * Name: showAir
	 * </p>
	 */
	public static McObfPair field_189728_o = McMappingDatabase.getSRG("field_189728_o");

	/**
	 * <p>
	 * Name: getNearbyCornerBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184418_a = McMappingDatabase.getSRG("TileEntityStructure.func_184418_a");

	/**
	 * <p>
	 * Name: metadata
	 * </p>
	 */
	public static McObfPair field_184422_g = McMappingDatabase.getSRG("field_184422_g");

	/**
	 * <p>
	 * Name: setMirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Mirror;)V]
	 * </p>
	 */
	public static McObfPair func_184411_a = McMappingDatabase.getSRG("TileEntityStructure.func_184411_a");

	/**
	 * <p>
	 * Name: getMirror
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/Mirror;]
	 * </p>
	 */
	public static McObfPair func_189716_h = McMappingDatabase.getSRG("TileEntityStructure.func_189716_h");

	/**
	 * <p>
	 * Name: createdBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_189720_a = McMappingDatabase.getSRG("TileEntityStructure.func_189720_a");

	/**
	 * <p>
	 * Name: ignoreEntities
	 * </p>
	 */
	public static McObfPair field_184428_m = McMappingDatabase.getSRG("field_184428_m");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_184423_h = McMappingDatabase.getSRG("field_184423_h");

	/**
	 * <p>
	 * Name: unloadStructure
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189706_E = McMappingDatabase.getSRG("TileEntityStructure.func_189706_E");

	/**
	 * <p>
	 * Name: powered
	 * </p>
	 */
	public static McObfPair field_189727_n = McMappingDatabase.getSRG("field_189727_n");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_189711_e = McMappingDatabase.getSRG("TileEntityStructure.func_189711_e");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_189715_d = McMappingDatabase.getSRG("TileEntityStructure.func_189715_d");

	/**
	 * <p>
	 * Name: getMode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/TileEntityStructure$Mode;]
	 * </p>
	 */
	public static McObfPair func_189700_k = McMappingDatabase.getSRG("TileEntityStructure.func_189700_k");

	/**
	 * <p>
	 * Name: setName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184404_a = McMappingDatabase.getSRG("TileEntityStructure.func_184404_a");

	/**
	 * <p>
	 * Name: getStructureSize
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_189717_g = McMappingDatabase.getSRG("TileEntityStructure.func_189717_g");

	/**
	 * <p>
	 * Name: usedBy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_189701_a = McMappingDatabase.getSRG("TileEntityStructure.func_189701_a");

	/**
	 * <p>
	 * Name: nextMode
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189724_l = McMappingDatabase.getSRG("TileEntityStructure.func_189724_l");

	/**
	 * <p>
	 * Name: setMetadata
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184410_b = McMappingDatabase.getSRG("TileEntityStructure.func_184410_b");

	/**
	 * <p>
	 * Name: setPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184414_b = McMappingDatabase.getSRG("TileEntityStructure.func_184414_b");

}
