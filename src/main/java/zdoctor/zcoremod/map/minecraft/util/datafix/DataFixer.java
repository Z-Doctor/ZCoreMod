package zdoctor.zcoremod.map.minecraft.util.datafix;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DataFixer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ry";
		else
			return "net/minecraft/util/datafix/DataFixer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ry";
		else
			return "DataFixer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lry;";
		else
			return "Lnet/minecraft/util/datafix/DataFixer;";
	}

	/**
	 * <p>
	 * Name: registerVanillaWalker
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IFixType;Lnet/minecraft/util/datafix/IDataWalker;)V]
	 * </p>
	 */
	public static McObfPair func_188255_a = McMappingDatabase.getSRG("DataFixer.func_188255_a");

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IFixType;Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188257_a = McMappingDatabase.getSRG("DataFixer.func_188257_a");

	/**
	 * <p>
	 * Name: fixMap
	 * </p>
	 */
	public static McObfPair field_188261_c = McMappingDatabase.getSRG("field_188261_c");

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IFixType;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188251_a = McMappingDatabase.getSRG("DataFixer.func_188251_a");

	/**
	 * <p>
	 * Name: getTypeList
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;Lnet/minecraft/util/datafix/IFixType;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188254_a = McMappingDatabase.getSRG("DataFixer.func_188254_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_188259_a = McMappingDatabase.getSRG("field_188259_a");

	/**
	 * <p>
	 * Name: processFixes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IFixType;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188252_b = McMappingDatabase.getSRG("DataFixer.func_188252_b");

	/**
	 * <p>
	 * Name: registerWalker
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/FixTypes;Lnet/minecraft/util/datafix/IDataWalker;)V]
	 * </p>
	 */
	public static McObfPair func_188258_a = McMappingDatabase.getSRG("DataFixer.func_188258_a");

	/**
	 * <p>
	 * Name: registerFix
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IFixType;Lnet/minecraft/util/datafix/IFixableData;)V]
	 * </p>
	 */
	public static McObfPair func_188256_a = McMappingDatabase.getSRG("DataFixer.func_188256_a");

	/**
	 * <p>
	 * Name: version
	 * </p>
	 */
	public static McObfPair field_188262_d = McMappingDatabase.getSRG("field_188262_d");

	/**
	 * <p>
	 * Name: walkerMap
	 * </p>
	 */
	public static McObfPair field_188260_b = McMappingDatabase.getSRG("field_188260_b");

	/**
	 * <p>
	 * Name: processWalkers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/IFixType;Lnet/minecraft/nbt/NBTTagCompound;I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188253_c = McMappingDatabase.getSRG("DataFixer.func_188253_c");

}
