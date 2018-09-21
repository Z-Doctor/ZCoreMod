package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockDoublePlant$EnumPlantType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqb$b";
		else
			return "net/minecraft/block/BlockDoublePlant$EnumPlantType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aqb$b";
		else
			return "BlockDoublePlant$EnumPlantType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laqb$b;";
		else
			return "Lnet/minecraft/block/BlockDoublePlant$EnumPlantType;";
	}

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176941_g = McMappingDatabase.getSRG("field_176941_g");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockDoublePlant$EnumPlantType;]
	 * </p>
	 */
	public static McObfPair func_176938_a = McMappingDatabase.getSRG("BlockDoublePlant$EnumPlantType.func_176938_a");

	/**
	 * <p>
	 * Name: getMeta
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176936_a = McMappingDatabase.getSRG("BlockDoublePlant$EnumPlantType.func_176936_a");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176949_h = McMappingDatabase.getSRG("field_176949_h");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176947_j = McMappingDatabase.getSRG("field_176947_j");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176939_c = McMappingDatabase.getSRG("BlockDoublePlant$EnumPlantType.func_176939_c");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176950_i = McMappingDatabase.getSRG("field_176950_i");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockDoublePlant$EnumPlantType.func_176610_l");

}
