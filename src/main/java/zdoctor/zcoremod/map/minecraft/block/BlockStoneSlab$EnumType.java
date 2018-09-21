package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStoneSlab$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auk$a";
		else
			return "net/minecraft/block/BlockStoneSlab$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auk$a";
		else
			return "BlockStoneSlab$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lauk$a;";
		else
			return "Lnet/minecraft/block/BlockStoneSlab$EnumType;";
	}

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176640_i = McMappingDatabase.getSRG("field_176640_i");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176635_l = McMappingDatabase.getSRG("field_176635_l");

	/**
	 * <p>
	 * Name: mapColor
	 * </p>
	 */
	public static McObfPair field_181075_k = McMappingDatabase.getSRG("field_181075_k");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_181074_c = McMappingDatabase.getSRG("BlockStoneSlab$EnumType.func_181074_c");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockStoneSlab$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176625_a = McMappingDatabase.getSRG("BlockStoneSlab$EnumType.func_176625_a");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176624_a = McMappingDatabase.getSRG("BlockStoneSlab$EnumType.func_176624_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176638_k = McMappingDatabase.getSRG("field_176638_k");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176627_c = McMappingDatabase.getSRG("BlockStoneSlab$EnumType.func_176627_c");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176637_j = McMappingDatabase.getSRG("field_176637_j");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockStoneSlab$EnumType.func_176610_l");

}
