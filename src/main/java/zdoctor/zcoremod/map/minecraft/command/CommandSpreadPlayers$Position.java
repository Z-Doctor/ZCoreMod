package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandSpreadPlayers$Position {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dn$a";
		else
			return "net/minecraft/command/CommandSpreadPlayers$Position";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "dn$a";
		else
			return "CommandSpreadPlayers$Position";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ldn$a;";
		else
			return "Lnet/minecraft/command/CommandSpreadPlayers$Position;";
	}

	/**
	 * <p>
	 * Name: getLength
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_111096_b = McMappingDatabase.getSRG("CommandSpreadPlayers$Position.func_111096_b");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_111101_a = McMappingDatabase.getSRG("field_111101_a");

	/**
	 * <p>
	 * Name: isSafe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Z]
	 * </p>
	 */
	public static McObfPair func_111098_b = McMappingDatabase.getSRG("CommandSpreadPlayers$Position.func_111098_b");

	/**
	 * <p>
	 * Name: normalize
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_111095_a = McMappingDatabase.getSRG("CommandSpreadPlayers$Position.func_111095_a");

	/**
	 * <p>
	 * Name: clamp
	 * </p>
	 * <p>
	 * Desc: [(DDDD)Z]
	 * </p>
	 */
	public static McObfPair func_111093_a = McMappingDatabase.getSRG("CommandSpreadPlayers$Position.func_111093_a");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_111100_b = McMappingDatabase.getSRG("field_111100_b");

	/**
	 * <p>
	 * Name: getSpawnY
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)I]
	 * </p>
	 */
	public static McObfPair func_111092_a = McMappingDatabase.getSRG("CommandSpreadPlayers$Position.func_111092_a");

	/**
	 * <p>
	 * Name: randomize
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;DDDD)V]
	 * </p>
	 */
	public static McObfPair func_111097_a = McMappingDatabase.getSRG("CommandSpreadPlayers$Position.func_111097_a");

	/**
	 * <p>
	 * Name: dist
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandSpreadPlayers$Position;)D]
	 * </p>
	 */
	public static McObfPair func_111099_a = McMappingDatabase.getSRG("CommandSpreadPlayers$Position.func_111099_a");

	/**
	 * <p>
	 * Name: moveAway
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandSpreadPlayers$Position;)V]
	 * </p>
	 */
	public static McObfPair func_111094_b = McMappingDatabase.getSRG("CommandSpreadPlayers$Position.func_111094_b");

}
