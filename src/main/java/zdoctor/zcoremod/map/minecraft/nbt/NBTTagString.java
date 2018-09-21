package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagString {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gm";
		else
			return "net/minecraft/nbt/NBTTagString";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gm";
		else
			return "NBTTagString";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgm;";
		else
			return "Lnet/minecraft/nbt/NBTTagString;";
	}

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagString.func_152446_a");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_74751_a = McMappingDatabase.getSRG("field_74751_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagString.func_74732_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagString.func_74734_a");

	/**
	 * <p>
	 * Name: hasNoTags
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82582_d = McMappingDatabase.getSRG("NBTTagString.func_82582_d");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150285_a_ = McMappingDatabase.getSRG("NBTTagString.func_150285_a_");

	/**
	 * <p>
	 * Name: quoteAndEscape
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193588_a = McMappingDatabase.getSRG("NBTTagString.func_193588_a");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagString;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagString.func_74737_b");

}
