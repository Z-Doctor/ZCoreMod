package zdoctor.zcoremod.map.minecraft.entity.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityMinecartChest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aff";
		else
			return "net/minecraft/entity/item/EntityMinecartChest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aff";
		else
			return "EntityMinecartChest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laff;";
		else
			return "Lnet/minecraft/entity/item/EntityMinecartChest;";
	}

	/**
	 * <p>
	 * Name: getSizeInventory
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70302_i_ = McMappingDatabase.getSRG("EntityMinecartChest.func_70302_i_");

	/**
	 * <p>
	 * Name: killMinecart
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_94095_a = McMappingDatabase.getSRG("EntityMinecartChest.func_94095_a");

	/**
	 * <p>
	 * Name: getDefaultDisplayTile
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180457_u = McMappingDatabase.getSRG("EntityMinecartChest.func_180457_u");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityMinecart$Type;]
	 * </p>
	 */
	public static McObfPair func_184264_v = McMappingDatabase.getSRG("EntityMinecartChest.func_184264_v");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("EntityMinecartChest.func_174876_a");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("EntityMinecartChest.func_174875_k");

	/**
	 * <p>
	 * Name: getDefaultDisplayTileOffset
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94085_r = McMappingDatabase.getSRG("EntityMinecartChest.func_94085_r");

	/**
	 * <p>
	 * Name: registerFixesMinecartChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189681_a = McMappingDatabase.getSRG("EntityMinecartChest.func_189681_a");

}
