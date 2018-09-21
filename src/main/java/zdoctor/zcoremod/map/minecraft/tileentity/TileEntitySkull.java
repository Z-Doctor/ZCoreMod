package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntitySkull {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awd";
		else
			return "net/minecraft/tileentity/TileEntitySkull";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awd";
		else
			return "TileEntitySkull";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawd;";
		else
			return "Lnet/minecraft/tileentity/TileEntitySkull;";
	}

	/**
	 * <p>
	 * Name: skullRotation
	 * </p>
	 */
	public static McObfPair field_145910_i = McMappingDatabase.getSRG("field_145910_i");

	/**
	 * <p>
	 * Name: getPlayerProfile
	 * </p>
	 * <p>
	 * Desc: [()Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_152108_a = McMappingDatabase.getSRG("TileEntitySkull.func_152108_a");

	/**
	 * <p>
	 * Name: dragonAnimated
	 * </p>
	 */
	public static McObfPair field_184297_i = McMappingDatabase.getSRG("field_184297_i");

	/**
	 * <p>
	 * Name: updatePlayerProfile
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152109_d = McMappingDatabase.getSRG("TileEntitySkull.func_152109_d");

	/**
	 * <p>
	 * Name: getSkullType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145904_a = McMappingDatabase.getSRG("TileEntitySkull.func_145904_a");

	/**
	 * <p>
	 * Name: profileCache
	 * </p>
	 */
	public static McObfPair field_184298_j = McMappingDatabase.getSRG("field_184298_j");

	/**
	 * <p>
	 * Name: dragonAnimatedTicks
	 * </p>
	 */
	public static McObfPair field_184296_h = McMappingDatabase.getSRG("field_184296_h");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntitySkull.func_189515_b");

	/**
	 * <p>
	 * Name: setType
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_152107_a = McMappingDatabase.getSRG("TileEntitySkull.func_152107_a");

	/**
	 * <p>
	 * Name: updateGameprofile
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)Lcom/mojang/authlib/GameProfile;]
	 * </p>
	 */
	public static McObfPair func_174884_b = McMappingDatabase.getSRG("TileEntitySkull.func_174884_b");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntitySkull.func_73660_a");

	/**
	 * <p>
	 * Name: setProfileCache
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/management/PlayerProfileCache;)V]
	 * </p>
	 */
	public static McObfPair func_184293_a = McMappingDatabase.getSRG("TileEntitySkull.func_184293_a");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Mirror;)V]
	 * </p>
	 */
	public static McObfPair func_189668_a = McMappingDatabase.getSRG("TileEntitySkull.func_189668_a");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntitySkull.func_189518_D_");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntitySkull.func_189517_E_");

	/**
	 * <p>
	 * Name: playerProfile
	 * </p>
	 */
	public static McObfPair field_152110_j = McMappingDatabase.getSRG("field_152110_j");

	/**
	 * <p>
	 * Name: sessionService
	 * </p>
	 */
	public static McObfPair field_184299_k = McMappingDatabase.getSRG("field_184299_k");

	/**
	 * <p>
	 * Name: skullType
	 * </p>
	 */
	public static McObfPair field_145908_a = McMappingDatabase.getSRG("field_145908_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntitySkull.func_145839_a");

	/**
	 * <p>
	 * Name: getAnimationProgress
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_184295_a = McMappingDatabase.getSRG("TileEntitySkull.func_184295_a");

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)V]
	 * </p>
	 */
	public static McObfPair func_189667_a = McMappingDatabase.getSRG("TileEntitySkull.func_189667_a");

	/**
	 * <p>
	 * Name: setPlayerProfile
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/GameProfile;)V]
	 * </p>
	 */
	public static McObfPair func_152106_a = McMappingDatabase.getSRG("TileEntitySkull.func_152106_a");

	/**
	 * <p>
	 * Name: getSkullRotation
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145906_b = McMappingDatabase.getSRG("TileEntitySkull.func_145906_b");

	/**
	 * <p>
	 * Name: setSessionService
	 * </p>
	 * <p>
	 * Desc: [(Lcom/mojang/authlib/minecraft/MinecraftSessionService;)V]
	 * </p>
	 */
	public static McObfPair func_184294_a = McMappingDatabase.getSRG("TileEntitySkull.func_184294_a");

	/**
	 * <p>
	 * Name: setSkullRotation
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_145903_a = McMappingDatabase.getSRG("TileEntitySkull.func_145903_a");

}
