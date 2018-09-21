package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockLog$EnumAxis {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arv$a";
		else
			return "net/minecraft/block/BlockLog$EnumAxis";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "arv$a";
		else
			return "BlockLog$EnumAxis";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Larv$a;";
		else
			return "Lnet/minecraft/block/BlockLog$EnumAxis;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176874_e = McMappingDatabase.getSRG("field_176874_e");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockLog$EnumAxis.func_176610_l");

	/**
	 * <p>
	 * Name: fromFacingAxis
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing$Axis;)Lnet/minecraft/block/BlockLog$EnumAxis;]
	 * </p>
	 */
	public static McObfPair func_176870_a = McMappingDatabase.getSRG("BlockLog$EnumAxis.func_176870_a");

}
