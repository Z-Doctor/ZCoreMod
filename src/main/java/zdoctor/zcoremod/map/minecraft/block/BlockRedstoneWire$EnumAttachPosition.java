package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockRedstoneWire$EnumAttachPosition {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atf$a";
		else
			return "net/minecraft/block/BlockRedstoneWire$EnumAttachPosition";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atf$a";
		else
			return "BlockRedstoneWire$EnumAttachPosition";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latf$a;";
		else
			return "Lnet/minecraft/block/BlockRedstoneWire$EnumAttachPosition;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockRedstoneWire$EnumAttachPosition.func_176610_l");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176820_d = McMappingDatabase.getSRG("field_176820_d");

}
