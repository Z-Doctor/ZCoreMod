package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockQuartz$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ata$a";
		else
			return "net/minecraft/block/BlockQuartz$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ata$a";
		else
			return "BlockQuartz$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lata$a;";
		else
			return "Lnet/minecraft/block/BlockQuartz$EnumType;";
	}

	/**
	 * <p>
	 * Name: serializedName
	 * </p>
	 */
	public static McObfPair field_176805_h = McMappingDatabase.getSRG("field_176805_h");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockQuartz$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176797_f = McMappingDatabase.getSRG("field_176797_f");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176796_a = McMappingDatabase.getSRG("BlockQuartz$EnumType.func_176796_a");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176798_g = McMappingDatabase.getSRG("field_176798_g");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockQuartz$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176794_a = McMappingDatabase.getSRG("BlockQuartz$EnumType.func_176794_a");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176806_i = McMappingDatabase.getSRG("field_176806_i");

}
