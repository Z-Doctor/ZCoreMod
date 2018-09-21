package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartFurnace {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afi";
		else
			return "net/minecraft/entity/item/EntityMinecartFurnace";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afi";
		else
			return "EntityMinecartFurnace";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafi;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartFurnace;";
	}

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityMinecartFurnace.func_70037_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityMinecartFurnace.func_70014_b");

	/**
	 * <p>
	 * Name: getMaximumSpeed
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_174898_m = McMappingDatabase.getSRG("EntityMinecartFurnace.func_174898_m");

	/**
	 * <p>
	 * Name: pushZ
	 * </p>
	 */
	public static McObfPair field_94109_b = McMappingDatabase.getSRG("field_94109_b");

	/**
	 * <p>
	 * Name: getDefaultDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180457_u = McMappingDatabase.getSRG("EntityMinecartFurnace.func_180457_u");

	/**
	 * <p>
	 * Name: applyDrag
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94101_h = McMappingDatabase.getSRG("EntityMinecartFurnace.func_94101_h");

	/**
	 * <p>
	 * Name: fuel
	 * </p>
	 */
	public static McObfPair field_94110_c = McMappingDatabase.getSRG("field_94110_c");

	/**
	 * <p>
	 * Name: killMinecart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_94095_a = McMappingDatabase.getSRG("EntityMinecartFurnace.func_94095_a");

	/**
	 * <p>
	 * Name: moveAlongTrack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_180460_a = McMappingDatabase.getSRG("EntityMinecartFurnace.func_180460_a");

	/**
	 * <p>
	 * Name: pushX
	 * </p>
	 */
	public static McObfPair field_94111_a = McMappingDatabase.getSRG("field_94111_a");

	/**
	 * <p>
	 * Name: registerFixesMinecartFurnace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189671_a = McMappingDatabase.getSRG("EntityMinecartFurnace.func_189671_a");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184264_v = McMappingDatabase.getSRG("EntityMinecartFurnace.func_184264_v");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityMinecartFurnace.func_70071_h_");

	/**
	 * <p>
	 * Name: POWERED
	 * </p>
	 */
	public static McObfPair field_184275_c = McMappingDatabase.getSRG("field_184275_c");

	/**
	 * <p>
	 * Name: setMinecartPowered
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_94107_f = McMappingDatabase.getSRG("EntityMinecartFurnace.func_94107_f");

	/**
	 * <p>
	 * Name: isMinecartPowered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_94108_c = McMappingDatabase.getSRG("EntityMinecartFurnace.func_94108_c");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityMinecartFurnace.func_184230_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityMinecartFurnace.func_70088_a");

}
