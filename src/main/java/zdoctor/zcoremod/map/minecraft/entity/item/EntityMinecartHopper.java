package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartHopper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afj";
		else
			return "net/minecraft/entity/item/EntityMinecartHopper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afj";
		else
			return "EntityMinecartHopper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafj;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartHopper;";
	}

	/**
	 * <p>
	 * Name: setBlocked
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_96110_f = McMappingDatabase.getSRG("EntityMinecartHopper.func_96110_f");

	/**
	 * <p>
	 * Name: getZPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96108_aC = McMappingDatabase.getSRG("EntityMinecartHopper.func_96108_aC");

	/**
	 * <p>
	 * Name: lastPosition
	 * </p>
	 */
	public static McObfPair field_174900_c = McMappingDatabase.getSRG("field_174900_c");

	/**
	 * <p>
	 * Name: isBlocked
	 * </p>
	 */
	public static McObfPair field_96113_a = McMappingDatabase.getSRG("field_96113_a");

	/**
	 * <p>
	 * Name: getDefaultDisplayTileOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94085_r = McMappingDatabase.getSRG("EntityMinecartHopper.func_94085_r");

	/**
	 * <p>
	 * Name: getDefaultDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180457_u = McMappingDatabase.getSRG("EntityMinecartHopper.func_180457_u");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_145831_w = McMappingDatabase.getSRG("EntityMinecartHopper.func_145831_w");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184264_v = McMappingDatabase.getSRG("EntityMinecartHopper.func_184264_v");

	/**
	 * <p>
	 * Name: setTransferTicker
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_98042_n = McMappingDatabase.getSRG("EntityMinecartHopper.func_98042_n");

	/**
	 * <p>
	 * Name: getBlocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96111_ay = McMappingDatabase.getSRG("EntityMinecartHopper.func_96111_ay");

	/**
	 * <p>
	 * Name: getXPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96107_aA = McMappingDatabase.getSRG("EntityMinecartHopper.func_96107_aA");

	/**
	 * <p>
	 * Name: captureDroppedItems
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_96112_aD = McMappingDatabase.getSRG("EntityMinecartHopper.func_96112_aD");

	/**
	 * <p>
	 * Name: transferTicker
	 * </p>
	 */
	public static McObfPair field_98044_b = McMappingDatabase.getSRG("field_98044_b");

	/**
	 * <p>
	 * Name: getYPos
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_96109_aB = McMappingDatabase.getSRG("EntityMinecartHopper.func_96109_aB");

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("EntityMinecartHopper.func_70302_i_");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityMinecartHopper.func_70071_h_");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("EntityMinecartHopper.func_174876_a");

	/**
	 * <p>
	 * Name: onActivatorRailPass
	 * </p>
	 * <p>
	 * Desc: [(IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_96095_a = McMappingDatabase.getSRG("EntityMinecartHopper.func_96095_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityMinecartHopper.func_70037_a");

	/**
	 * <p>
	 * Name: registerFixesMinecartHopper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189682_a = McMappingDatabase.getSRG("EntityMinecartHopper.func_189682_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityMinecartHopper.func_70014_b");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityMinecartHopper.func_184230_a");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("EntityMinecartHopper.func_174875_k");

	/**
	 * <p>
	 * Name: killMinecart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_94095_a = McMappingDatabase.getSRG("EntityMinecartHopper.func_94095_a");

	/**
	 * <p>
	 * Name: canTransfer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_98043_aE = McMappingDatabase.getSRG("EntityMinecartHopper.func_98043_aE");

}
