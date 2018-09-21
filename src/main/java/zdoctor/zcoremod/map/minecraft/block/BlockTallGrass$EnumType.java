package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockTallGrass$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aun$a";
		else
			return "net/minecraft/block/BlockTallGrass$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aun$a";
		else
			return "BlockTallGrass$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laun$a;";
		else
			return "Lnet/minecraft/block/BlockTallGrass$EnumType;";
	}

	/**
	 * <p>
	 * Name: getMeta
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177044_a = McMappingDatabase.getSRG("BlockTallGrass$EnumType.func_177044_a");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_177048_d = McMappingDatabase.getSRG("field_177048_d");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockTallGrass$EnumType;]
	 * </p>
	 */
	public static McObfPair func_177045_a = McMappingDatabase.getSRG("BlockTallGrass$EnumType.func_177045_a");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_177049_e = McMappingDatabase.getSRG("field_177049_e");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_177046_f = McMappingDatabase.getSRG("field_177046_f");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockTallGrass$EnumType.func_176610_l");

}
