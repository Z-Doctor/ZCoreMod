package zdoctor.zcoremod.map.minecraft.util.datafix;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IDataFixer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rx";
		else
			return "net/minecraft/util/datafix/IDataFixer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rx";
		else
			return "IDataFixer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrx;";
		else
			return "Lnet/minecraft/util/datafix/IDataFixer;";
	}

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IFixType;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188251_a = McMappingDatabase.getSRG("IDataFixer.func_188251_a");

}
