package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSand$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atn$a";
		else
			return "net/minecraft/block/BlockSand$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atn$a";
		else
			return "BlockSand$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latn$a;";
		else
			return "Lnet/minecraft/block/BlockSand$EnumType;";
	}

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176695_c = McMappingDatabase.getSRG("field_176695_c");

	/**
	 * <p>
	 * Name: getDustColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_189865_a = McMappingDatabase.getSRG("BlockSand$EnumType.func_189865_a");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176685_d = McMappingDatabase.getSRG("BlockSand$EnumType.func_176685_d");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176688_a = McMappingDatabase.getSRG("BlockSand$EnumType.func_176688_a");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176692_d = McMappingDatabase.getSRG("field_176692_d");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_176687_c = McMappingDatabase.getSRG("BlockSand$EnumType.func_176687_c");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176693_e = McMappingDatabase.getSRG("field_176693_e");

	/**
	 * <p>
	 * Name: mapColor
	 * </p>
	 */
	public static McObfPair field_176690_f = McMappingDatabase.getSRG("field_176690_f");

	/**
	 * <p>
	 * Name: dustColor
	 * </p>
	 */
	public static McObfPair field_189866_h = McMappingDatabase.getSRG("field_189866_h");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockSand$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176686_a = McMappingDatabase.getSRG("BlockSand$EnumType.func_176686_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockSand$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176691_g = McMappingDatabase.getSRG("field_176691_g");

}
