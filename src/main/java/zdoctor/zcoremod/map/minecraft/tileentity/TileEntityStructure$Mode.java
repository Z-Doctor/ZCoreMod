package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityStructure$Mode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awe$a";
		else
			return "net/minecraft/tileentity/TileEntityStructure$Mode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awe$a";
		else
			return "TileEntityStructure$Mode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawe$a;";
		else
			return "Lnet/minecraft/tileentity/TileEntityStructure$Mode;";
	}

	/**
	 * <p>
	 * Name: getModeId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_185110_a = McMappingDatabase.getSRG("TileEntityStructure$Mode.func_185110_a");

	/**
	 * <p>
	 * Name: modeName
	 * </p>
	 */
	public static McObfPair field_185116_f = McMappingDatabase.getSRG("field_185116_f");

	/**
	 * <p>
	 * Name: modeId
	 * </p>
	 */
	public static McObfPair field_185117_g = McMappingDatabase.getSRG("field_185117_g");

	/**
	 * <p>
	 * Name: getById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/tileentity/TileEntityStructure$Mode;]
	 * </p>
	 */
	public static McObfPair func_185108_a = McMappingDatabase.getSRG("TileEntityStructure$Mode.func_185108_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("TileEntityStructure$Mode.func_176610_l");

	/**
	 * <p>
	 * Name: MODES
	 * </p>
	 */
	public static McObfPair field_185115_e = McMappingDatabase.getSRG("field_185115_e");

}
