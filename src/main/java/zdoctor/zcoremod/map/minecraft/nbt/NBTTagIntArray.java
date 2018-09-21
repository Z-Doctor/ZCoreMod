package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagIntArray {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gc";
		else
			return "net/minecraft/nbt/NBTTagIntArray";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gc";
		else
			return "NBTTagIntArray";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgc;";
		else
			return "Lnet/minecraft/nbt/NBTTagIntArray;";
	}

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagIntArray.func_152446_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagIntArray.func_74732_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagIntArray.func_74734_a");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagIntArray;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagIntArray.func_74737_b");

	/**
	 * <p>
	 * Name: toArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)[I]
	 * </p>
	 */
	public static McObfPair func_193584_a = McMappingDatabase.getSRG("NBTTagIntArray.func_193584_a");

	/**
	 * <p>
	 * Name: intArray
	 * </p>
	 */
	public static McObfPair field_74749_a = McMappingDatabase.getSRG("field_74749_a");

	/**
	 * <p>
	 * Name: getIntArray
	 * </p>
	 * <p>
	 * Desc: [()[I]
	 * </p>
	 */
	public static McObfPair func_150302_c = McMappingDatabase.getSRG("NBTTagIntArray.func_150302_c");

}
