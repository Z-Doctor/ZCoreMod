package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagCompound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fy";
		else
			return "net/minecraft/nbt/NBTTagCompound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fy";
		else
			return "NBTTagCompound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfy;";
		else
			return "Lnet/minecraft/nbt/NBTTagCompound;";
	}

	/**
	 * <p>
	 * Name: createCrashReport
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;ILjava/lang/ClassCastException;)Lnet/minecraft/crash/CrashReport;]
	 * </p>
	 */
	public static McObfPair func_82581_a = McMappingDatabase.getSRG("NBTTagCompound.func_82581_a");

	/**
	 * <p>
	 * Name: setShort
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;S)V]
	 * </p>
	 */
	public static McObfPair func_74777_a = McMappingDatabase.getSRG("NBTTagCompound.func_74777_a");

	/**
	 * <p>
	 * Name: merge
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_179237_a = McMappingDatabase.getSRG("NBTTagCompound.func_179237_a");

	/**
	 * <p>
	 * Name: setInteger
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)V]
	 * </p>
	 */
	public static McObfPair func_74768_a = McMappingDatabase.getSRG("NBTTagCompound.func_74768_a");

	/**
	 * <p>
	 * Name: handleEscape
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193582_s = McMappingDatabase.getSRG("NBTTagCompound.func_193582_s");

	/**
	 * <p>
	 * Name: getTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_74781_a = McMappingDatabase.getSRG("NBTTagCompound.func_74781_a");

	/**
	 * <p>
	 * Name: setTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;)V]
	 * </p>
	 */
	public static McObfPair func_74782_a = McMappingDatabase.getSRG("NBTTagCompound.func_74782_a");

	/**
	 * <p>
	 * Name: setUniqueId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/util/UUID;)V]
	 * </p>
	 */
	public static McObfPair func_186854_a = McMappingDatabase.getSRG("NBTTagCompound.func_186854_a");

	/**
	 * <p>
	 * Name: hasNoTags
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82582_d = McMappingDatabase.getSRG("NBTTagCompound.func_82582_d");

	/**
	 * <p>
	 * Name: getIntArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)[I]
	 * </p>
	 */
	public static McObfPair func_74759_k = McMappingDatabase.getSRG("NBTTagCompound.func_74759_k");

	/**
	 * <p>
	 * Name: setByteArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;[B)V]
	 * </p>
	 */
	public static McObfPair func_74773_a = McMappingDatabase.getSRG("NBTTagCompound.func_74773_a");

	/**
	 * <p>
	 * Name: getTagId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)B]
	 * </p>
	 */
	public static McObfPair func_150299_b = McMappingDatabase.getSRG("NBTTagCompound.func_150299_b");

	/**
	 * <p>
	 * Name: removeTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_82580_o = McMappingDatabase.getSRG("NBTTagCompound.func_82580_o");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagCompound.func_152446_a");

	/**
	 * <p>
	 * Name: setByte
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;B)V]
	 * </p>
	 */
	public static McObfPair func_74774_a = McMappingDatabase.getSRG("NBTTagCompound.func_74774_a");

	/**
	 * <p>
	 * Name: getByteArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)[B]
	 * </p>
	 */
	public static McObfPair func_74770_j = McMappingDatabase.getSRG("NBTTagCompound.func_74770_j");

	/**
	 * <p>
	 * Name: tagMap
	 * </p>
	 */
	public static McObfPair field_74784_a = McMappingDatabase.getSRG("field_74784_a");

	/**
	 * <p>
	 * Name: getByte
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)B]
	 * </p>
	 */
	public static McObfPair func_74771_c = McMappingDatabase.getSRG("NBTTagCompound.func_74771_c");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagCompound.func_74737_b");

	/**
	 * <p>
	 * Name: getLong
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)J]
	 * </p>
	 */
	public static McObfPair func_74763_f = McMappingDatabase.getSRG("NBTTagCompound.func_74763_f");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_191551_b = McMappingDatabase.getSRG("field_191551_b");

	/**
	 * <p>
	 * Name: hasKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_74764_b = McMappingDatabase.getSRG("NBTTagCompound.func_74764_b");

	/**
	 * <p>
	 * Name: getDouble
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)D]
	 * </p>
	 */
	public static McObfPair func_74769_h = McMappingDatabase.getSRG("NBTTagCompound.func_74769_h");

	/**
	 * <p>
	 * Name: setString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_74778_a = McMappingDatabase.getSRG("NBTTagCompound.func_74778_a");

	/**
	 * <p>
	 * Name: getUniqueId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/UUID;]
	 * </p>
	 */
	public static McObfPair func_186857_a = McMappingDatabase.getSRG("NBTTagCompound.func_186857_a");

	/**
	 * <p>
	 * Name: getCompoundTag
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_74775_l = McMappingDatabase.getSRG("NBTTagCompound.func_74775_l");

	/**
	 * <p>
	 * Name: readNBT
	 * </p>
	 * <p>
	 * Desc: [(BLjava/lang/String;Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_152449_a = McMappingDatabase.getSRG("NBTTagCompound.func_152449_a");

	/**
	 * <p>
	 * Name: setDouble
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;D)V]
	 * </p>
	 */
	public static McObfPair func_74780_a = McMappingDatabase.getSRG("NBTTagCompound.func_74780_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagCompound.func_74732_a");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_74779_i = McMappingDatabase.getSRG("NBTTagCompound.func_74779_i");

	/**
	 * <p>
	 * Name: setLong
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;J)V]
	 * </p>
	 */
	public static McObfPair func_74772_a = McMappingDatabase.getSRG("NBTTagCompound.func_74772_a");

	/**
	 * <p>
	 * Name: SIMPLE_VALUE
	 * </p>
	 */
	public static McObfPair field_193583_c = McMappingDatabase.getSRG("field_193583_c");

	/**
	 * <p>
	 * Name: getKeySet
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_150296_c = McMappingDatabase.getSRG("NBTTagCompound.func_150296_c");

	/**
	 * <p>
	 * Name: getShort
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)S]
	 * </p>
	 */
	public static McObfPair func_74765_d = McMappingDatabase.getSRG("NBTTagCompound.func_74765_d");

	/**
	 * <p>
	 * Name: readKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;Lnet/minecraft/nbt/NBTSizeTracker;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_152448_b = McMappingDatabase.getSRG("NBTTagCompound.func_152448_b");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)F]
	 * </p>
	 */
	public static McObfPair func_74760_g = McMappingDatabase.getSRG("NBTTagCompound.func_74760_g");

	/**
	 * <p>
	 * Name: getSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_186856_d = McMappingDatabase.getSRG("NBTTagCompound.func_186856_d");

	/**
	 * <p>
	 * Name: hasUniqueId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_186855_b = McMappingDatabase.getSRG("NBTTagCompound.func_186855_b");

	/**
	 * <p>
	 * Name: getTagList
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_150295_c = McMappingDatabase.getSRG("NBTTagCompound.func_150295_c");

	/**
	 * <p>
	 * Name: getInteger
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_74762_e = McMappingDatabase.getSRG("NBTTagCompound.func_74762_e");

	/**
	 * <p>
	 * Name: setIntArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;[I)V]
	 * </p>
	 */
	public static McObfPair func_74783_a = McMappingDatabase.getSRG("NBTTagCompound.func_74783_a");

	/**
	 * <p>
	 * Name: setBoolean
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Z)V]
	 * </p>
	 */
	public static McObfPair func_74757_a = McMappingDatabase.getSRG("NBTTagCompound.func_74757_a");

	/**
	 * <p>
	 * Name: writeEntry
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_150298_a = McMappingDatabase.getSRG("NBTTagCompound.func_150298_a");

	/**
	 * <p>
	 * Name: getBoolean
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_74767_n = McMappingDatabase.getSRG("NBTTagCompound.func_74767_n");

	/**
	 * <p>
	 * Name: readType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;Lnet/minecraft/nbt/NBTSizeTracker;)B]
	 * </p>
	 */
	public static McObfPair func_152447_a = McMappingDatabase.getSRG("NBTTagCompound.func_152447_a");

	/**
	 * <p>
	 * Name: hasKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;I)Z]
	 * </p>
	 */
	public static McObfPair func_150297_b = McMappingDatabase.getSRG("NBTTagCompound.func_150297_b");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagCompound.func_74734_a");

	/**
	 * <p>
	 * Name: setFloat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;F)V]
	 * </p>
	 */
	public static McObfPair func_74776_a = McMappingDatabase.getSRG("NBTTagCompound.func_74776_a");

}
