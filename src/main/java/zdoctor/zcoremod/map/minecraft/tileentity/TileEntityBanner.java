package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityBanner {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avf";
		else
			return "net/minecraft/tileentity/TileEntityBanner";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avf";
		else
			return "TileEntityBanner";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavf;";
		else
			return "Lnet/minecraft/tileentity/TileEntityBanner;";
	}

	/**
	 * <p>
	 * Name: removeBannerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_175117_e = McMappingDatabase.getSRG("TileEntityBanner.func_175117_e");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190615_l = McMappingDatabase.getSRG("TileEntityBanner.func_190615_l");

	/**
	 * <p>
	 * Name: setItemValues
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Z)V]
	 * </p>
	 */
	public static McObfPair func_175112_a = McMappingDatabase.getSRG("TileEntityBanner.func_175112_a");

	/**
	 * <p>
	 * Name: patterns
	 * </p>
	 */
	public static McObfPair field_175118_f = McMappingDatabase.getSRG("field_175118_f");

	/**
	 * <p>
	 * Name: getPatternList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175114_c = McMappingDatabase.getSRG("TileEntityBanner.func_175114_c");

	/**
	 * <p>
	 * Name: patternResourceLocation
	 * </p>
	 */
	public static McObfPair field_175121_j = McMappingDatabase.getSRG("field_175121_j");

	/**
	 * <p>
	 * Name: hasCustomName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_145818_k_ = McMappingDatabase.getSRG("TileEntityBanner.func_145818_k_");

	/**
	 * <p>
	 * Name: patternList
	 * </p>
	 */
	public static McObfPair field_175122_h = McMappingDatabase.getSRG("field_175122_h");

	/**
	 * <p>
	 * Name: getUpdateTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189517_E_ = McMappingDatabase.getSRG("TileEntityBanner.func_189517_E_");

	/**
	 * <p>
	 * Name: getPatterns
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_175113_c = McMappingDatabase.getSRG("TileEntityBanner.func_175113_c");

	/**
	 * <p>
	 * Name: initializeBannerData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175109_g = McMappingDatabase.getSRG("TileEntityBanner.func_175109_g");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("TileEntityBanner.func_145748_c_");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_145839_a = McMappingDatabase.getSRG("TileEntityBanner.func_145839_a");

	/**
	 * <p>
	 * Name: patternDataSet
	 * </p>
	 */
	public static McObfPair field_175119_g = McMappingDatabase.getSRG("field_175119_g");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntityBanner.func_70005_c_");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_190617_a = McMappingDatabase.getSRG("field_190617_a");

	/**
	 * <p>
	 * Name: getColorList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175110_d = McMappingDatabase.getSRG("TileEntityBanner.func_175110_d");

	/**
	 * <p>
	 * Name: getUpdatePacket
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/play/server/SPacketUpdateTileEntity;]
	 * </p>
	 */
	public static McObfPair func_189518_D_ = McMappingDatabase.getSRG("TileEntityBanner.func_189518_D_");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189515_b = McMappingDatabase.getSRG("TileEntityBanner.func_189515_b");

	/**
	 * <p>
	 * Name: colorList
	 * </p>
	 */
	public static McObfPair field_175123_i = McMappingDatabase.getSRG("field_175123_i");

	/**
	 * <p>
	 * Name: getPatternResourceLocation
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_175116_e = McMappingDatabase.getSRG("TileEntityBanner.func_175116_e");

	/**
	 * <p>
	 * Name: baseColor
	 * </p>
	 */
	public static McObfPair field_175120_a = McMappingDatabase.getSRG("field_175120_a");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_190616_d = McMappingDatabase.getSRG("TileEntityBanner.func_190616_d");

}
