package zdoctor.zcoremod.map.minecraft.util.datafix;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IDataWalker {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sa";
		else
			return "net/minecraft/util/datafix/IDataWalker";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sa";
		else
			return "IDataWalker";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsa;";
		else
			return "Lnet/minecraft/util/datafix/IDataWalker;";
	}

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188266_a = McMappingDatabase.getSRG("IDataWalker.func_188266_a");

}
