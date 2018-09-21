package zdoctor.zcoremod.map.minecraft.network.datasync;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityDataManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nb";
		else
			return "net/minecraft/network/datasync/EntityDataManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nb";
		else
			return "EntityDataManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnb;";
		else
			return "Lnet/minecraft/network/datasync/EntityDataManager;";
	}

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_187225_a = McMappingDatabase.getSRG("EntityDataManager.func_187225_a");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_187233_b = McMappingDatabase.getSRG("field_187233_b");

	/**
	 * <p>
	 * Name: writeEntries
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187229_a = McMappingDatabase.getSRG("EntityDataManager.func_187229_a");

	/**
	 * <p>
	 * Name: empty
	 * </p>
	 */
	public static McObfPair field_187236_e = McMappingDatabase.getSRG("field_187236_e");

	/**
	 * <p>
	 * Name: setEntryValue
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/EntityDataManager$DataEntry;Lnet/minecraft/network/datasync/EntityDataManager$DataEntry;)V]
	 * </p>
	 */
	public static McObfPair func_187224_a = McMappingDatabase.getSRG("EntityDataManager.func_187224_a");

	/**
	 * <p>
	 * Name: lock
	 * </p>
	 */
	public static McObfPair field_187235_d = McMappingDatabase.getSRG("field_187235_d");

	/**
	 * <p>
	 * Name: dirty
	 * </p>
	 */
	public static McObfPair field_187237_f = McMappingDatabase.getSRG("field_187237_f");

	/**
	 * <p>
	 * Name: createKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lnet/minecraft/network/datasync/DataSerializer;)Lnet/minecraft/network/datasync/DataParameter;]
	 * </p>
	 */
	public static McObfPair func_187226_a = McMappingDatabase.getSRG("EntityDataManager.func_187226_a");

	/**
	 * <p>
	 * Name: setDirty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_187217_b = McMappingDatabase.getSRG("EntityDataManager.func_187217_b");

	/**
	 * <p>
	 * Name: writeEntry
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;Lnet/minecraft/network/datasync/EntityDataManager$DataEntry;)V]
	 * </p>
	 */
	public static McObfPair func_187220_a = McMappingDatabase.getSRG("EntityDataManager.func_187220_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_190303_a = McMappingDatabase.getSRG("field_190303_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_187227_b = McMappingDatabase.getSRG("EntityDataManager.func_187227_b");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187228_d = McMappingDatabase.getSRG("EntityDataManager.func_187228_d");

	/**
	 * <p>
	 * Name: entries
	 * </p>
	 */
	public static McObfPair field_187234_c = McMappingDatabase.getSRG("field_187234_c");

	/**
	 * <p>
	 * Name: readEntries
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_187215_b = McMappingDatabase.getSRG("EntityDataManager.func_187215_b");

	/**
	 * <p>
	 * Name: setEntryValues
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_187218_a = McMappingDatabase.getSRG("EntityDataManager.func_187218_a");

	/**
	 * <p>
	 * Name: setEntry
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_187222_c = McMappingDatabase.getSRG("EntityDataManager.func_187222_c");

	/**
	 * <p>
	 * Name: NEXT_ID_MAP
	 * </p>
	 */
	public static McObfPair field_187232_a = McMappingDatabase.getSRG("field_187232_a");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_187214_a = McMappingDatabase.getSRG("EntityDataManager.func_187214_a");

	/**
	 * <p>
	 * Name: setClean
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187230_e = McMappingDatabase.getSRG("EntityDataManager.func_187230_e");

	/**
	 * <p>
	 * Name: getAll
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_187231_c = McMappingDatabase.getSRG("EntityDataManager.func_187231_c");

	/**
	 * <p>
	 * Name: getEntry
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)Lnet/minecraft/network/datasync/EntityDataManager$DataEntry;]
	 * </p>
	 */
	public static McObfPair func_187219_c = McMappingDatabase.getSRG("EntityDataManager.func_187219_c");

	/**
	 * <p>
	 * Name: getDirty
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_187221_b = McMappingDatabase.getSRG("EntityDataManager.func_187221_b");

	/**
	 * <p>
	 * Name: writeEntries
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_187216_a = McMappingDatabase.getSRG("EntityDataManager.func_187216_a");

	/**
	 * <p>
	 * Name: isDirty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_187223_a = McMappingDatabase.getSRG("EntityDataManager.func_187223_a");

}
