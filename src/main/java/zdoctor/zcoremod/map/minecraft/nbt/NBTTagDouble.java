package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagDouble {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fz";
		else
			return "net/minecraft/nbt/NBTTagDouble";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fz";
		else
			return "NBTTagDouble";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfz;";
		else
			return "Lnet/minecraft/nbt/NBTTagDouble;";
	}

	/**
	 * <p>
	 * Name: getByte
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_150290_f = McMappingDatabase.getSRG("NBTTagDouble.func_150290_f");

	/**
	 * <p>
	 * Name: getDouble
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_150286_g = McMappingDatabase.getSRG("NBTTagDouble.func_150286_g");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagDouble.func_74732_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagDouble.func_152446_a");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_74755_a = McMappingDatabase.getSRG("field_74755_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagDouble.func_74734_a");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150287_d = McMappingDatabase.getSRG("NBTTagDouble.func_150287_d");

	/**
	 * <p>
	 * Name: getShort
	 * </p>
	 * <p>
	 * Desc: [()S]
	 * </p>
	 */
	public static McObfPair func_150289_e = McMappingDatabase.getSRG("NBTTagDouble.func_150289_e");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagDouble;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagDouble.func_74737_b");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_150288_h = McMappingDatabase.getSRG("NBTTagDouble.func_150288_h");

	/**
	 * <p>
	 * Name: getLong
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_150291_c = McMappingDatabase.getSRG("NBTTagDouble.func_150291_c");

}
