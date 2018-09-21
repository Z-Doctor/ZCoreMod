package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockWall$EnumType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auv$a";
		else
			return "net/minecraft/block/BlockWall$EnumType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auv$a";
		else
			return "BlockWall$EnumType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lauv$a;";
		else
			return "Lnet/minecraft/block/BlockWall$EnumType;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176664_e = McMappingDatabase.getSRG("field_176664_e");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_176661_f = McMappingDatabase.getSRG("field_176661_f");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_176666_c = McMappingDatabase.getSRG("field_176666_c");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_176663_d = McMappingDatabase.getSRG("field_176663_d");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockWall$EnumType.func_176610_l");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/block/BlockWall$EnumType;]
	 * </p>
	 */
	public static McObfPair func_176660_a = McMappingDatabase.getSRG("BlockWall$EnumType.func_176660_a");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176659_c = McMappingDatabase.getSRG("BlockWall$EnumType.func_176659_c");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_176657_a = McMappingDatabase.getSRG("BlockWall$EnumType.func_176657_a");

}
