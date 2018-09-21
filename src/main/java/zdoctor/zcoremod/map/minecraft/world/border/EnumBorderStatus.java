package zdoctor.zcoremod.map.minecraft.world.border;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EnumBorderStatus {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axm";
		else
			return "net/minecraft/world/border/EnumBorderStatus";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axm";
		else
			return "EnumBorderStatus";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxm;";
		else
			return "Lnet/minecraft/world/border/EnumBorderStatus;";
	}

	/**
	 * <p>
	 * Name: color
	 * </p>
	 */
	public static McObfPair field_177767_d = McMappingDatabase.getSRG("field_177767_d");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177766_a = McMappingDatabase.getSRG("EnumBorderStatus.func_177766_a");

}
