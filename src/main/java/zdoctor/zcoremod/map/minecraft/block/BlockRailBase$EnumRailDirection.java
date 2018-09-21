package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRailBase$EnumRailDirection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aos$b";
		else
			return "net/minecraft/block/BlockRailBase$EnumRailDirection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aos$b";
		else
			return "BlockRailBase$EnumRailDirection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laos$b;";
		else
			return "Lnet/minecraft/block/BlockRailBase$EnumRailDirection;";
	}

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockRailBase$EnumRailDirection;]
	 * </p>
	 */
	public static McObfPair func_177016_a = McMappingDatabase.getSRG("BlockRailBase$EnumRailDirection.func_177016_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_177028_m = McMappingDatabase.getSRG("field_177028_m");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockRailBase$EnumRailDirection.func_176610_l");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_177030_k = McMappingDatabase.getSRG("field_177030_k");

	/**
	 * <p>
	 * Name: isAscending
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177018_c = McMappingDatabase.getSRG("BlockRailBase$EnumRailDirection.func_177018_c");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177015_a = McMappingDatabase.getSRG("BlockRailBase$EnumRailDirection.func_177015_a");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_177027_l = McMappingDatabase.getSRG("field_177027_l");

}
