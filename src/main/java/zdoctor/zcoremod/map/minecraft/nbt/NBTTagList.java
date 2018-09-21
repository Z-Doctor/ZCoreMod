package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTTagList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ge";
		else
			return "net/minecraft/nbt/NBTTagList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ge";
		else
			return "NBTTagList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lge;";
		else
			return "Lnet/minecraft/nbt/NBTTagList;";
	}

	/**
	 * <p>
	 * Name: getFloatAt
	 * </p>
	 * <p>
	 * Desc: [(I)F]
	 * </p>
	 */
	public static McObfPair func_150308_e = McMappingDatabase.getSRG("NBTTagList.func_150308_e");

	/**
	 * <p>
	 * Name: getTagType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150303_d = McMappingDatabase.getSRG("NBTTagList.func_150303_d");

	/**
	 * <p>
	 * Name: tagType
	 * </p>
	 */
	public static McObfPair field_74746_b = McMappingDatabase.getSRG("field_74746_b");

	/**
	 * <p>
	 * Name: getDoubleAt
	 * </p>
	 * <p>
	 * Desc: [(I)D]
	 * </p>
	 */
	public static McObfPair func_150309_d = McMappingDatabase.getSRG("NBTTagList.func_150309_d");

	/**
	 * <p>
	 * Name: getIntArrayAt
	 * </p>
	 * <p>
	 * Desc: [(I)[I]
	 * </p>
	 */
	public static McObfPair func_150306_c = McMappingDatabase.getSRG("NBTTagList.func_150306_c");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/nbt/NBTBase;)V]
	 * </p>
	 */
	public static McObfPair func_150304_a = McMappingDatabase.getSRG("NBTTagList.func_150304_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTTagList.func_74732_a");

	/**
	 * <p>
	 * Name: getIntAt
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_186858_c = McMappingDatabase.getSRG("NBTTagList.func_186858_c");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTTagList.func_152446_a");

	/**
	 * <p>
	 * Name: removeTag
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_74744_a = McMappingDatabase.getSRG("NBTTagList.func_74744_a");

	/**
	 * <p>
	 * Name: hasNoTags
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82582_d = McMappingDatabase.getSRG("NBTTagList.func_82582_d");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_179238_g = McMappingDatabase.getSRG("NBTTagList.func_179238_g");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTTagList.func_74734_a");

	/**
	 * <p>
	 * Name: getCompoundTagAt
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_150305_b = McMappingDatabase.getSRG("NBTTagList.func_150305_b");

	/**
	 * <p>
	 * Name: appendTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTBase;)V]
	 * </p>
	 */
	public static McObfPair func_74742_a = McMappingDatabase.getSRG("NBTTagList.func_74742_a");

	/**
	 * <p>
	 * Name: tagList
	 * </p>
	 */
	public static McObfPair field_74747_a = McMappingDatabase.getSRG("field_74747_a");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;, ()Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTTagList.func_74737_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_179239_b = McMappingDatabase.getSRG("field_179239_b");

	/**
	 * <p>
	 * Name: tagCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_74745_c = McMappingDatabase.getSRG("NBTTagList.func_74745_c");

	/**
	 * <p>
	 * Name: getStringTagAt
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150307_f = McMappingDatabase.getSRG("NBTTagList.func_150307_f");

}
