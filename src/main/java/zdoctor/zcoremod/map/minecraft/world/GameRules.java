package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameRules {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amr";
		else
			return "net/minecraft/world/GameRules";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amr";
		else
			return "GameRules";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamr;";
		else
			return "Lnet/minecraft/world/GameRules;";
	}

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_82767_a = McMappingDatabase.getSRG("GameRules.func_82767_a");

	/**
	 * <p>
	 * Name: getBoolean
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_82766_b = McMappingDatabase.getSRG("GameRules.func_82766_b");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)I]
	 * </p>
	 */
	public static McObfPair func_180263_c = McMappingDatabase.getSRG("GameRules.func_180263_c");

	/**
	 * <p>
	 * Name: areSameType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/world/GameRules$ValueType;)Z]
	 * </p>
	 */
	public static McObfPair func_180264_a = McMappingDatabase.getSRG("GameRules.func_180264_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_82768_a = McMappingDatabase.getSRG("GameRules.func_82768_a");

	/**
	 * <p>
	 * Name: setOrCreateGameRule
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_82764_b = McMappingDatabase.getSRG("GameRules.func_82764_b");

	/**
	 * <p>
	 * Name: rules
	 * </p>
	 */
	public static McObfPair field_82771_a = McMappingDatabase.getSRG("field_82771_a");

	/**
	 * <p>
	 * Name: addGameRule
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/String;Lnet/minecraft/world/GameRules$ValueType;)V]
	 * </p>
	 */
	public static McObfPair func_180262_a = McMappingDatabase.getSRG("GameRules.func_180262_a");

	/**
	 * <p>
	 * Name: hasRule
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_82765_e = McMappingDatabase.getSRG("GameRules.func_82765_e");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_82770_a = McMappingDatabase.getSRG("GameRules.func_82770_a");

	/**
	 * <p>
	 * Name: getRules
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_82763_b = McMappingDatabase.getSRG("GameRules.func_82763_b");

}
