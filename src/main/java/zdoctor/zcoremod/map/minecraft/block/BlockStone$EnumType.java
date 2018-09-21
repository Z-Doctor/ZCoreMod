package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStone$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auh$a";
		else
			return "net/minecraft/block/BlockStone$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auh$a";
		else
			return "BlockStone$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lauh$a;";
		else
			return "Lnet/minecraft/block/BlockStone$EnumType;";
	}

	/**
	 * <p>
	 * Name: mapColor
	 * </p>
	 */
	public static McObfPair field_181073_l = McMappingDatabase.getSRG("field_181073_l");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176653_j = McMappingDatabase.getSRG("field_176653_j");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockStone$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176643_a = McMappingDatabase.getSRG("BlockStone$EnumType.func_176643_a");

	/**
	 * <p>
	 * Name: isNatural
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190912_e = McMappingDatabase.getSRG("BlockStone$EnumType.func_190912_e");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockStone$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_181072_c = McMappingDatabase.getSRG("BlockStone$EnumType.func_181072_c");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176644_c = McMappingDatabase.getSRG("BlockStone$EnumType.func_176644_c");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176654_k = McMappingDatabase.getSRG("field_176654_k");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176655_h = McMappingDatabase.getSRG("field_176655_h");

	/**
	 * <p>
	 * Name: isNatural
	 * </p>
	 */
	public static McObfPair field_190913_m = McMappingDatabase.getSRG("field_190913_m");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176656_i = McMappingDatabase.getSRG("field_176656_i");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176642_a = McMappingDatabase.getSRG("BlockStone$EnumType.func_176642_a");

}
