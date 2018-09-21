package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRedSandstone$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atd$a";
		else
			return "net/minecraft/block/BlockRedSandstone$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atd$a";
		else
			return "BlockRedSandstone$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latd$a;";
		else
			return "Lnet/minecraft/block/BlockRedSandstone$EnumType;";
	}

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176832_e = McMappingDatabase.getSRG("field_176832_e");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176831_d = McMappingDatabase.getSRG("field_176831_d");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176828_c = McMappingDatabase.getSRG("BlockRedSandstone$EnumType.func_176828_c");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockRedSandstone$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176829_f = McMappingDatabase.getSRG("field_176829_f");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176827_a = McMappingDatabase.getSRG("BlockRedSandstone$EnumType.func_176827_a");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockRedSandstone$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176825_a = McMappingDatabase.getSRG("BlockRedSandstone$EnumType.func_176825_a");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176830_g = McMappingDatabase.getSRG("field_176830_g");

}
