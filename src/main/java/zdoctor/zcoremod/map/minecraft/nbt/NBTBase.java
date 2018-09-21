package zdoctor.zcoremod.map.minecraft.nbt;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NBTBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gn";
		else
			return "net/minecraft/nbt/NBTBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "gn";
		else
			return "NBTBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lgn;";
		else
			return "Lnet/minecraft/nbt/NBTBase;";
	}

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataInput;ILnet/minecraft/nbt/NBTSizeTracker;)V]
	 * </p>
	 */
	public static McObfPair func_152446_a = McMappingDatabase.getSRG("NBTBase.func_152446_a");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_74737_b = McMappingDatabase.getSRG("NBTBase.func_74737_b");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150285_a_ = McMappingDatabase.getSRG("NBTBase.func_150285_a_");

	/**
	 * <p>
	 * Name: getTagTypeName
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193581_j = McMappingDatabase.getSRG("NBTBase.func_193581_j");

	/**
	 * <p>
	 * Name: hasNoTags
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82582_d = McMappingDatabase.getSRG("NBTBase.func_82582_d");

	/**
	 * <p>
	 * Name: NBT_TYPES
	 * </p>
	 */
	public static McObfPair field_82578_b = McMappingDatabase.getSRG("field_82578_b");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/DataOutput;)V]
	 * </p>
	 */
	public static McObfPair func_74734_a = McMappingDatabase.getSRG("NBTBase.func_74734_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_74732_a = McMappingDatabase.getSRG("NBTBase.func_74732_a");

	/**
	 * <p>
	 * Name: createNewByType
	 * </p>
	 * <p>
	 * Desc: [(B)Lnet/minecraft/nbt/NBTBase;]
	 * </p>
	 */
	public static McObfPair func_150284_a = McMappingDatabase.getSRG("NBTBase.func_150284_a");

}
