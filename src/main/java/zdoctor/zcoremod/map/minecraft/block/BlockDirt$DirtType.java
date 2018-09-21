package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockDirt$DirtType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apy$a";
		else
			return "net/minecraft/block/BlockDirt$DirtType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "apy$a";
		else
			return "BlockDirt$DirtType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapy$a;";
		else
			return "Lnet/minecraft/block/BlockDirt$DirtType;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176928_f = McMappingDatabase.getSRG("field_176928_f");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176925_a = McMappingDatabase.getSRG("BlockDirt$DirtType.func_176925_a");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176929_g = McMappingDatabase.getSRG("field_176929_g");

	/**
	 * <p>
	 * Name: METADATA_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176930_d = McMappingDatabase.getSRG("field_176930_d");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176927_c = McMappingDatabase.getSRG("BlockDirt$DirtType.func_176927_c");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockDirt$DirtType;]
	 * </p>
	 */
	public static McObfPair func_176924_a = McMappingDatabase.getSRG("BlockDirt$DirtType.func_176924_a");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_181066_d = McMappingDatabase.getSRG("BlockDirt$DirtType.func_181066_d");

	/**
	 * <p>
	 * Name: metadata
	 * </p>
	 */
	public static McObfPair field_176931_e = McMappingDatabase.getSRG("field_176931_e");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockDirt$DirtType.func_176610_l");

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_181067_h = McMappingDatabase.getSRG("field_181067_h");

}
