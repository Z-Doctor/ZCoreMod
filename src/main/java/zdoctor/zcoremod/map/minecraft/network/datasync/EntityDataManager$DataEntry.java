package zdoctor.zcoremod.map.minecraft.network.datasync;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityDataManager$DataEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nb$a";
		else
			return "net/minecraft/network/datasync/EntityDataManager$DataEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nb$a";
		else
			return "EntityDataManager$DataEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnb$a;";
		else
			return "Lnet/minecraft/network/datasync/EntityDataManager$DataEntry;";
	}

	/**
	 * <p>
	 * Name: dirty
	 * </p>
	 */
	public static McObfPair field_187213_c = McMappingDatabase.getSRG("field_187213_c");

	/**
	 * <p>
	 * Name: value
	 * </p>
	 */
	public static McObfPair field_187212_b = McMappingDatabase.getSRG("field_187212_b");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/datasync/EntityDataManager$DataEntry;]
	 * </p>
	 */
	public static McObfPair func_192735_d = McMappingDatabase.getSRG("EntityDataManager$DataEntry.func_192735_d");

	/**
	 * <p>
	 * Name: key
	 * </p>
	 */
	public static McObfPair field_187211_a = McMappingDatabase.getSRG("field_187211_a");

	/**
	 * <p>
	 * Name: getKey
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/datasync/DataParameter;]
	 * </p>
	 */
	public static McObfPair func_187205_a = McMappingDatabase.getSRG("EntityDataManager$DataEntry.func_187205_a");

	/**
	 * <p>
	 * Name: getValue
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_187206_b = McMappingDatabase.getSRG("EntityDataManager$DataEntry.func_187206_b");

	/**
	 * <p>
	 * Name: setValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_187210_a = McMappingDatabase.getSRG("EntityDataManager$DataEntry.func_187210_a");

	/**
	 * <p>
	 * Name: setDirty
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_187208_a = McMappingDatabase.getSRG("EntityDataManager$DataEntry.func_187208_a");

	/**
	 * <p>
	 * Name: isDirty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187209_c = McMappingDatabase.getSRG("EntityDataManager$DataEntry.func_187209_c");

}
