package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockStoneBrick$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aui$a";
		else
			return "net/minecraft/block/BlockStoneBrick$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aui$a";
		else
			return "BlockStoneBrick$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laui$a;";
		else
			return "Lnet/minecraft/block/BlockStoneBrick$EnumType;";
	}

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176615_f = McMappingDatabase.getSRG("field_176615_f");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176612_a = McMappingDatabase.getSRG("BlockStoneBrick$EnumType.func_176612_a");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176618_e = McMappingDatabase.getSRG("field_176618_e");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockStoneBrick$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockStoneBrick$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176613_a = McMappingDatabase.getSRG("BlockStoneBrick$EnumType.func_176613_a");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176614_c = McMappingDatabase.getSRG("BlockStoneBrick$EnumType.func_176614_c");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176616_g = McMappingDatabase.getSRG("field_176616_g");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176622_h = McMappingDatabase.getSRG("field_176622_h");

}
