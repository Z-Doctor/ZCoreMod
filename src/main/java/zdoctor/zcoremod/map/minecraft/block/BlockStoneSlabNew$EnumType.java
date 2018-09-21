package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStoneSlabNew$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asi$a";
		else
			return "net/minecraft/block/BlockStoneSlabNew$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asi$a";
		else
			return "BlockStoneSlabNew$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasi$a;";
		else
			return "Lnet/minecraft/block/BlockStoneSlabNew$EnumType;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockStoneSlabNew$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_181068_c = McMappingDatabase.getSRG("BlockStoneSlabNew$EnumType.func_181068_c");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176921_b = McMappingDatabase.getSRG("field_176921_b");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176915_a = McMappingDatabase.getSRG("BlockStoneSlabNew$EnumType.func_176915_a");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockStoneSlabNew$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176916_a = McMappingDatabase.getSRG("BlockStoneSlabNew$EnumType.func_176916_a");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176922_c = McMappingDatabase.getSRG("field_176922_c");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176919_d = McMappingDatabase.getSRG("field_176919_d");

	/**
	 * <p>
	 * Name: mapColor
	 * </p>
	 */
	public static McObfPair field_181069_e = McMappingDatabase.getSRG("field_181069_e");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176918_c = McMappingDatabase.getSRG("BlockStoneSlabNew$EnumType.func_176918_c");

}
