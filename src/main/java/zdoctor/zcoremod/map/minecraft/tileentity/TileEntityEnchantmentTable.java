package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityEnchantmentTable {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avr";
		else
			return "net/minecraft/tileentity/TileEntityEnchantmentTable";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avr";
		else
			return "TileEntityEnchantmentTable";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavr;";
		else
			return "Lnet/minecraft/tileentity/TileEntityEnchantmentTable;";
	}

	/**
	 * <p>
	 * Name: rand
	 * </p>
	 */
	public static McObfPair field_145923_r = McMappingDatabase.getSRG("field_145923_r");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_73660_a");

	/**
	 * <p>
	 * Name: customName
	 * </p>
	 */
	public static McObfPair field_145922_s = McMappingDatabase.getSRG("field_145922_s");

	/**
	 * <p>
	 * Name: getGuiID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_174875_k = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_174875_k");

	/**
	 * <p>
	 * Name: tRot
	 * </p>
	 */
	public static McObfPair field_145924_q = McMappingDatabase.getSRG("field_145924_q");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_70005_c_");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_145818_k_");

	/**
	 * <p>
	 * Name: bookRotationPrev
	 * </p>
	 */
	public static McObfPair field_145925_p = McMappingDatabase.getSRG("field_145925_p");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_189515_b");

	/**
	 * <p>
	 * Name: bookSpread
	 * </p>
	 */
	public static McObfPair field_145930_m = McMappingDatabase.getSRG("field_145930_m");

	/**
	 * <p>
	 * Name: tickCount
	 * </p>
	 */
	public static McObfPair field_145926_a = McMappingDatabase.getSRG("field_145926_a");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_145748_c_");

	/**
	 * <p>
	 * Name: pageFlip
	 * </p>
	 */
	public static McObfPair field_145933_i = McMappingDatabase.getSRG("field_145933_i");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_145839_a");

	/**
	 * <p>
	 * Name: pageFlipPrev
	 * </p>
	 */
	public static McObfPair field_145931_j = McMappingDatabase.getSRG("field_145931_j");

	/**
	 * <p>
	 * Name: bookSpreadPrev
	 * </p>
	 */
	public static McObfPair field_145927_n = McMappingDatabase.getSRG("field_145927_n");

	/**
	 * <p>
	 * Name: setCustomName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145920_a = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_145920_a");

	/**
	 * <p>
	 * Name: bookRotation
	 * </p>
	 */
	public static McObfPair field_145928_o = McMappingDatabase.getSRG("field_145928_o");

	/**
	 * <p>
	 * Name: flipA
	 * </p>
	 */
	public static McObfPair field_145929_l = McMappingDatabase.getSRG("field_145929_l");

	/**
	 * <p>
	 * Name: flipT
	 * </p>
	 */
	public static McObfPair field_145932_k = McMappingDatabase.getSRG("field_145932_k");

	/**
	 * <p>
	 * Name: createContainer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/InventoryPlayer;Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/inventory/Container;]
	 * </p>
	 */
	public static McObfPair func_174876_a = McMappingDatabase.getSRG("TileEntityEnchantmentTable.func_174876_a");

}
