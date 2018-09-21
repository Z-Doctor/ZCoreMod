package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Rotation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atm";
		else
			return "net/minecraft/util/Rotation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atm";
		else
			return "Rotation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latm;";
		else
			return "Lnet/minecraft/util/Rotation;";
	}

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_185833_a = McMappingDatabase.getSRG("Rotation.func_185833_a");

	/**
	 * <p>
	 * Name: rotationNames
	 * </p>
	 */
	public static McObfPair field_185839_f = McMappingDatabase.getSRG("field_185839_f");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)Lnet/minecraft/util/Rotation;]
	 * </p>
	 */
	public static McObfPair func_185830_a = McMappingDatabase.getSRG("Rotation.func_185830_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_185838_e = McMappingDatabase.getSRG("field_185838_e");

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_185831_a = McMappingDatabase.getSRG("Rotation.func_185831_a");

}
