package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRedstoneComparator$Mode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "app$a";
		else
			return "net/minecraft/block/BlockRedstoneComparator$Mode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "app$a";
		else
			return "BlockRedstoneComparator$Mode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lapp$a;";
		else
			return "Lnet/minecraft/block/BlockRedstoneComparator$Mode;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_177041_c = McMappingDatabase.getSRG("field_177041_c");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockRedstoneComparator$Mode.func_176610_l");

}
