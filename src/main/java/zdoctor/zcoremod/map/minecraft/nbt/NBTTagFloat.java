package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagFloat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gb";
		else
			return "net/minecraft/nbt/NBTTagFloat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gb";
		else
			return "NBTTagFloat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgb;";
		else
			return "Lnet/minecraft/nbt/NBTTagFloat;";
	}

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagFloat.func_74734_a");

	/**
	 * <p>
	 * Name: getLong
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_150291_c = McMappingDatabase.getSRG("NBTTagFloat.func_150291_c");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagFloat.func_74732_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagFloat.func_152446_a");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagFloat;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagFloat.func_74737_b");

	/**
	 * <p>
	 * Name: getShort
	 * </p>
	 * <p>
	 * Desc: [()S]
	 * </p>
	 */
	public static McObfPair func_150289_e = McMappingDatabase.getSRG("NBTTagFloat.func_150289_e");

	/**
	 * <p>
	 * Name: getByte
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_150290_f = McMappingDatabase.getSRG("NBTTagFloat.func_150290_f");

	/**
	 * <p>
	 * Name: getDouble
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_150286_g = McMappingDatabase.getSRG("NBTTagFloat.func_150286_g");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_74750_a = McMappingDatabase.getSRG("field_74750_a");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150287_d = McMappingDatabase.getSRG("NBTTagFloat.func_150287_d");

	/**
	 * <p>
	 * Name: getFloat
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_150288_h = McMappingDatabase.getSRG("NBTTagFloat.func_150288_h");

}
