package zdoctor.zcoremod.map.minecraft.util.datafix.walkers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemStackData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tk";
		else
			return "net/minecraft/util/datafix/walkers/ItemStackData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tk";
		else
			return "ItemStackData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltk;";
		else
			return "Lnet/minecraft/util/datafix/walkers/ItemStackData;";
	}

	/**
	 * <p>
	 * Name: matchingTags
	 * </p>
	 */
	public static McObfPair field_188274_a = McMappingDatabase.getSRG("field_188274_a");

	/**
	 * <p>
	 * Name: filteredProcess
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188271_b = McMappingDatabase.getSRG("ItemStackData.func_188271_b");

}
