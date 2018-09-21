package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagLongArray {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gf";
		else
			return "net/minecraft/nbt/NBTTagLongArray";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gf";
		else
			return "NBTTagLongArray";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgf;";
		else
			return "Lnet/minecraft/nbt/NBTTagLongArray;";
	}

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagLongArray;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagLongArray.func_74737_b");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagLongArray.func_74732_a");

	/**
	 * <p>
	 * Name: toArray
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)[J]
	 * </p>
	 */
	public static McObfPair func_193586_a = McMappingDatabase.getSRG("NBTTagLongArray.func_193586_a");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_193587_b = McMappingDatabase.getSRG("field_193587_b");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagLongArray.func_74734_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagLongArray.func_152446_a");

}
