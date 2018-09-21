package zdoctor.zcoremod.map.minecraft.util.datafix;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DataFixesManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rz";
		else
			return "net/minecraft/util/datafix/DataFixesManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rz";
		else
			return "DataFixesManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrz;";
		else
			return "Lnet/minecraft/util/datafix/DataFixesManager;";
	}

	/**
	 * <p>
	 * Name: registerFixes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_188276_a = McMappingDatabase.getSRG("DataFixesManager.func_188276_a");

	/**
	 * <p>
	 * Name: processInventory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;ILjava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188278_b = McMappingDatabase.getSRG("DataFixesManager.func_188278_b");

	/**
	 * <p>
	 * Name: createFixer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/datafix/DataFixer;]
	 * </p>
	 */
	public static McObfPair func_188279_a = McMappingDatabase.getSRG("DataFixesManager.func_188279_a");

	/**
	 * <p>
	 * Name: processItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IDataFixer;Lnet/minecraft/nbt/NBTTagCompound;ILjava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188277_a = McMappingDatabase.getSRG("DataFixesManager.func_188277_a");

}
