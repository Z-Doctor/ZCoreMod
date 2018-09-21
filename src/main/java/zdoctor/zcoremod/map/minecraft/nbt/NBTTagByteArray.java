package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagByteArray {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fw";
		else
			return "net/minecraft/nbt/NBTTagByteArray";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "fw";
		else
			return "NBTTagByteArray";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lfw;";
		else
			return "Lnet/minecraft/nbt/NBTTagByteArray;";
	}

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagByteArray.func_74734_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagByteArray.func_152446_a");

	/**
	 * <p>
	 * Name: toArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)[B]
	 * </p>
	 */
	public static McObfPair func_193589_a = McMappingDatabase.getSRG("NBTTagByteArray.func_193589_a");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagByteArray.func_74737_b");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_74754_a = McMappingDatabase.getSRG("field_74754_a");

	/**
	 * <p>
	 * Name: getByteArray
	 * </p>
	 * <p>
	 * Desc: [()[B]
	 * </p>
	 */
	public static McObfPair func_150292_c = McMappingDatabase.getSRG("NBTTagByteArray.func_150292_c");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagByteArray.func_74732_a");

}
