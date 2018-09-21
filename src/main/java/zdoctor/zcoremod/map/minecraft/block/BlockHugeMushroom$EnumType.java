package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockHugeMushroom$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arn$a";
		else
			return "net/minecraft/block/BlockHugeMushroom$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arn$a";
		else
			return "BlockHugeMushroom$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larn$a;";
		else
			return "Lnet/minecraft/block/BlockHugeMushroom$EnumType;";
	}

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176896_a = McMappingDatabase.getSRG("BlockHugeMushroom$EnumType.func_176896_a");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockHugeMushroom$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176895_a = McMappingDatabase.getSRG("BlockHugeMushroom$EnumType.func_176895_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176914_p = McMappingDatabase.getSRG("field_176914_p");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockHugeMushroom$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176905_n = McMappingDatabase.getSRG("field_176905_n");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176906_o = McMappingDatabase.getSRG("field_176906_o");

}
