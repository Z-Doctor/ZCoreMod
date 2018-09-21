package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagByte {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fx";
		else
			return "net/minecraft/nbt/NBTTagByte";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fx";
		else
			return "NBTTagByte";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfx;";
		else
			return "Lnet/minecraft/nbt/NBTTagByte;";
	}

	/**
	 * <p>
	 * Name: getDouble
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_150286_g = McMappingDatabase.getSRG("NBTTagByte.func_150286_g");

	/**
	 * <p>
	 * Name: getLong
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_150291_c = McMappingDatabase.getSRG("NBTTagByte.func_150291_c");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_74756_a = McMappingDatabase.getSRG("field_74756_a");

	/**
	 * <p>
	 * Name: getShort
	 * </p>
	 * <p>
	 * Desc: [()S]
	 * </p>
	 */
	public static McObfPair func_150289_e = McMappingDatabase.getSRG("NBTTagByte.func_150289_e");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagByte.func_74732_a");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagByte;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagByte.func_74737_b");

	/**
	 * <p>
	 * Name: getByte
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_150290_f = McMappingDatabase.getSRG("NBTTagByte.func_150290_f");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagByte.func_152446_a");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150287_d = McMappingDatabase.getSRG("NBTTagByte.func_150287_d");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagByte.func_74734_a");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_150288_h = McMappingDatabase.getSRG("NBTTagByte.func_150288_h");

}
