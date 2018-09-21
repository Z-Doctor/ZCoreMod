package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPrismarine$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asx$a";
		else
			return "net/minecraft/block/BlockPrismarine$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asx$a";
		else
			return "BlockPrismarine$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasx$a;";
		else
			return "Lnet/minecraft/block/BlockPrismarine$EnumType;";
	}

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176813_d = McMappingDatabase.getSRG("field_176813_d");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176809_c = McMappingDatabase.getSRG("BlockPrismarine$EnumType.func_176809_c");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176812_g = McMappingDatabase.getSRG("field_176812_g");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockPrismarine$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176807_a = McMappingDatabase.getSRG("BlockPrismarine$EnumType.func_176807_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176811_f = McMappingDatabase.getSRG("field_176811_f");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176814_e = McMappingDatabase.getSRG("field_176814_e");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockPrismarine$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176810_a = McMappingDatabase.getSRG("BlockPrismarine$EnumType.func_176810_a");

}
