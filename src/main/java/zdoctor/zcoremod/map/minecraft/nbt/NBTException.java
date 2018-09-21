package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTException {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "go";
		else
			return "net/minecraft/nbt/NBTException";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "go";
		else
			return "NBTException";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgo;";
		else
			return "Lnet/minecraft/nbt/NBTException;";
	}

	/**
	 * <p>
	 * Name: slice
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193592_a = McMappingDatabase.getSRG("NBTException.func_193592_a");

}
