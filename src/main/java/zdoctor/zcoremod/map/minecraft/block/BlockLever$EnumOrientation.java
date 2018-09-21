package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockLever$EnumOrientation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "art$a";
		else
			return "net/minecraft/block/BlockLever$EnumOrientation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "art$a";
		else
			return "BlockLever$EnumOrientation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lart$a;";
		else
			return "Lnet/minecraft/block/BlockLever$EnumOrientation;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockLever$EnumOrientation.func_176610_l");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockLever$EnumOrientation;]
	 * </p>
	 */
	public static McObfPair func_176853_a = McMappingDatabase.getSRG("BlockLever$EnumOrientation.func_176853_a");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176855_a = McMappingDatabase.getSRG("BlockLever$EnumOrientation.func_176855_a");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176869_i = McMappingDatabase.getSRG("field_176869_i");

	/**
	 * <p>
	 * Name: facing
	 * </p>
	 */
	public static McObfPair field_176864_l = McMappingDatabase.getSRG("field_176864_l");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176867_k = McMappingDatabase.getSRG("field_176867_k");

	/**
	 * <p>
	 * Name: forFacings
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/block/BlockLever$EnumOrientation;]
	 * </p>
	 */
	public static McObfPair func_176856_a = McMappingDatabase.getSRG("BlockLever$EnumOrientation.func_176856_a");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176866_j = McMappingDatabase.getSRG("field_176866_j");

	/**
	 * <p>
	 * Name: getFacing
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_176852_c = McMappingDatabase.getSRG("BlockLever$EnumOrientation.func_176852_c");

}
