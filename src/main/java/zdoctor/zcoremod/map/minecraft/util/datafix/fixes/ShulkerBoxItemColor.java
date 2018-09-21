package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ShulkerBoxItemColor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tb";
		else
			return "net/minecraft/util/datafix/fixes/ShulkerBoxItemColor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tb";
		else
			return "ShulkerBoxItemColor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltb;";
		else
			return "Lnet/minecraft/util/datafix/fixes/ShulkerBoxItemColor;";
	}

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("ShulkerBoxItemColor.func_188216_a");

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("ShulkerBoxItemColor.func_188217_a");

	/**
	 * <p>
	 * Name: NAMES_BY_COLOR
	 * </p>
	 */
	public static McObfPair field_191278_a = McMappingDatabase.getSRG("field_191278_a");

}
