package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPistonExtension$EnumPistonType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awk$a";
		else
			return "net/minecraft/block/BlockPistonExtension$EnumPistonType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awk$a";
		else
			return "BlockPistonExtension$EnumPistonType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawk$a;";
		else
			return "Lnet/minecraft/block/BlockPistonExtension$EnumPistonType;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockPistonExtension$EnumPistonType.func_176610_l");

	/**
	 * <p>
	 * Name: VARIANT
	 * </p>
	 */
	public static McObfPair field_176714_c = McMappingDatabase.getSRG("field_176714_c");

}
