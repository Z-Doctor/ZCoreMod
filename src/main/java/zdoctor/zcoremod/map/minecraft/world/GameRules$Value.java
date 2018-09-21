package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameRules$Value {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amr$a";
		else
			return "net/minecraft/world/GameRules$Value";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amr$a";
		else
			return "GameRules$Value";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamr$a;";
		else
			return "Lnet/minecraft/world/GameRules$Value;";
	}

	/**
	 * <p>
	 * Name: valueBoolean
	 * </p>
	 */
	public static McObfPair field_82760_b = McMappingDatabase.getSRG("field_82760_b");

	/**
	 * <p>
	 * Name: getBoolean
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82758_b = McMappingDatabase.getSRG("GameRules$Value.func_82758_b");

	/**
	 * <p>
	 * Name: getString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_82756_a = McMappingDatabase.getSRG("GameRules$Value.func_82756_a");

	/**
	 * <p>
	 * Name: type
	 * </p>
	 */
	public static McObfPair field_180256_e = McMappingDatabase.getSRG("field_180256_e");

	/**
	 * <p>
	 * Name: setValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_82757_a = McMappingDatabase.getSRG("GameRules$Value.func_82757_a");

	/**
	 * <p>
	 * Name: valueInteger
	 * </p>
	 */
	public static McObfPair field_82761_c = McMappingDatabase.getSRG("field_82761_c");

	/**
	 * <p>
	 * Name: getType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameRules$ValueType;]
	 * </p>
	 */
	public static McObfPair func_180254_e = McMappingDatabase.getSRG("GameRules$Value.func_180254_e");

	/**
	 * <p>
	 * Name: getInt
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_180255_c = McMappingDatabase.getSRG("GameRules$Value.func_180255_c");

	/**
	 * <p>
	 * Name: valueDouble
	 * </p>
	 */
	public static McObfPair field_82759_d = McMappingDatabase.getSRG("field_82759_d");

	/**
	 * <p>
	 * Name: valueString
	 * </p>
	 */
	public static McObfPair field_82762_a = McMappingDatabase.getSRG("field_82762_a");

}
