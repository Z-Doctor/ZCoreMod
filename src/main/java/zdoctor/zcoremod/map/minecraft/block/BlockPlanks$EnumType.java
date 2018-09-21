package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPlanks$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asr$a";
		else
			return "net/minecraft/block/BlockPlanks$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "asr$a";
		else
			return "BlockPlanks$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lasr$a;";
		else
			return "Lnet/minecraft/block/BlockPlanks$EnumType;";
	}

	/**
	 * <p>
	 * Name: mapColor
	 * </p>
	 */
	public static McObfPair field_181071_k = McMappingDatabase.getSRG("field_181071_k");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockPlanks$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176842_g = McMappingDatabase.getSRG("field_176842_g");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176840_c = McMappingDatabase.getSRG("BlockPlanks$EnumType.func_176840_c");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176850_h = McMappingDatabase.getSRG("field_176850_h");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176848_j = McMappingDatabase.getSRG("field_176848_j");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176839_a = McMappingDatabase.getSRG("BlockPlanks$EnumType.func_176839_a");

	/**
	 * <p>
	 * Name: getMapColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/MapColor;]
	 * </p>
	 */
	public static McObfPair func_181070_c = McMappingDatabase.getSRG("BlockPlanks$EnumType.func_181070_c");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176851_i = McMappingDatabase.getSRG("field_176851_i");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockPlanks$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176837_a = McMappingDatabase.getSRG("BlockPlanks$EnumType.func_176837_a");

}
