package zdoctor.zcoremod.map.minecraft.util.datafix.walkers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemStackDataLists {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tn";
		else
			return "net/minecraft/util/datafix/walkers/ItemStackDataLists";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tn";
		else
			return "ItemStackDataLists";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltn;";
		else
			return "Lnet/minecraft/util/datafix/walkers/ItemStackDataLists;";
	}

	/**
	 * <p>
	 * Name: matchingTags
	 * </p>
	 */
	public static McObfPair field_188275_a = McMappingDatabase.getSRG("field_188275_a");

	/**
	 * <p>
	 * Name: filteredProcess
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188271_b = McMappingDatabase.getSRG("ItemStackDataLists.func_188271_b");

}
