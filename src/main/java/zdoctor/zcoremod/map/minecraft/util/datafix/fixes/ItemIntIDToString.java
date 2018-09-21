package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemIntIDToString {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sz";
		else
			return "net/minecraft/util/datafix/fixes/ItemIntIDToString";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sz";
		else
			return "ItemIntIDToString";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsz;";
		else
			return "Lnet/minecraft/util/datafix/fixes/ItemIntIDToString;";
	}

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("ItemIntIDToString.func_188216_a");

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("ItemIntIDToString.func_188217_a");

	/**
	 * <p>
	 * Name: ID_MAP
	 * </p>
	 */
	public static McObfPair field_188221_a = McMappingDatabase.getSRG("field_188221_a");

}
