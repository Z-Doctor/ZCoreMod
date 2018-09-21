package zdoctor.zcoremod.map.minecraft.util.datafix.walkers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Filtered {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "to";
		else
			return "net/minecraft/util/datafix/walkers/Filtered";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "to";
		else
			return "Filtered";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lto;";
		else
			return "Lnet/minecraft/util/datafix/walkers/Filtered;";
	}

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188266_a = McMappingDatabase.getSRG("Filtered.func_188266_a");

	/**
	 * <p>
	 * Name: filteredProcess
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188271_b = McMappingDatabase.getSRG("Filtered.func_188271_b");

	/**
	 * <p>
	 * Name: key
	 * </p>
	 */
	public static McObfPair field_188272_a = McMappingDatabase.getSRG("field_188272_a");

}
