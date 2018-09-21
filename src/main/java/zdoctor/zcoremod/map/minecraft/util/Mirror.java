package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Mirror {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ary";
		else
			return "net/minecraft/util/Mirror";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ary";
		else
			return "Mirror";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lary;";
		else
			return "Lnet/minecraft/util/Mirror;";
	}

	/**
	 * <p>
	 * Name: mirrorNames
	 * </p>
	 */
	public static McObfPair field_185808_e = McMappingDatabase.getSRG("field_185808_e");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_185803_b = McMappingDatabase.getSRG("Mirror.func_185803_b");

	/**
	 * <p>
	 * Name: toRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/Rotation;]
	 * </p>
	 */
	public static McObfPair func_185800_a = McMappingDatabase.getSRG("Mirror.func_185800_a");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_185807_d = McMappingDatabase.getSRG("field_185807_d");

	/**
	 * <p>
	 * Name: mirrorRotation
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_185802_a = McMappingDatabase.getSRG("Mirror.func_185802_a");

}
