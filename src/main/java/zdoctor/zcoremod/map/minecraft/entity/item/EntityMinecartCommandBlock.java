package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartCommandBlock {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afg";
		else
			return "net/minecraft/entity/item/EntityMinecartCommandBlock";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "afg";
		else
			return "EntityMinecartCommandBlock";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lafg;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartCommandBlock;";
	}

	/**
	 * <p>
	 * Name: LAST_OUTPUT
	 * </p>
	 */
	public static McObfPair field_184274_b = McMappingDatabase.getSRG("field_184274_b");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184264_v = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_184264_v");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_70088_a");

	/**
	 * <p>
	 * Name: commandBlockLogic
	 * </p>
	 */
	public static McObfPair field_145824_a = McMappingDatabase.getSRG("field_145824_a");

	/**
	 * <p>
	 * Name: registerFixesMinecartCommand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189670_a = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_189670_a");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_184230_a");

	/**
	 * <p>
	 * Name: COMMAND
	 * </p>
	 */
	public static McObfPair field_184273_a = McMappingDatabase.getSRG("field_184273_a");

	/**
	 * <p>
	 * Name: ignoreItemEntityData
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184213_bq = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_184213_bq");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_70014_b");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_184206_a");

	/**
	 * <p>
	 * Name: getCommandBlockLogic
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/tileentity/CommandBlockBaseLogic;]
	 * </p>
	 */
	public static McObfPair func_145822_e = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_145822_e");

	/**
	 * <p>
	 * Name: onActivatorRailPass
	 * </p>
	 * <p>
	 * Desc: [(IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_96095_a = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_96095_a");

	/**
	 * <p>
	 * Name: getDefaultDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180457_u = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_180457_u");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityMinecartCommandBlock.func_70037_a");

	/**
	 * <p>
	 * Name: activatorRailCooldown
	 * </p>
	 */
	public static McObfPair field_145823_b = McMappingDatabase.getSRG("field_145823_b");

}
