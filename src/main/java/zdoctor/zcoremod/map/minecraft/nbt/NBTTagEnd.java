package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagEnd {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ga";
		else
			return "net/minecraft/nbt/NBTTagEnd";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ga";
		else
			return "NBTTagEnd";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lga;";
		else
			return "Lnet/minecraft/nbt/NBTTagEnd;";
	}

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagEnd;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagEnd.func_74737_b");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagEnd.func_152446_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagEnd.func_74734_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagEnd.func_74732_a");

}
