package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandGameRule {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cl";
		else
			return "net/minecraft/command/CommandGameRule";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cl";
		else
			return "CommandGameRule";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcl;";
		else
			return "Lnet/minecraft/command/CommandGameRule;";
	}

	/**
	 * <p>
	 * Name: getOverWorldGameRules
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Lnet/minecraft/world/GameRules;]
	 * </p>
	 */
	public static McObfPair func_184897_a = McMappingDatabase.getSRG("CommandGameRule.func_184897_a");

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("CommandGameRule.func_82362_a");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("CommandGameRule.func_71518_a");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("CommandGameRule.func_184883_a");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("CommandGameRule.func_184881_a");

	/**
	 * <p>
	 * Name: notifyGameRuleChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/GameRules;Ljava/lang/String;Lnet/minecraft/server/MinecraftServer;)V]
	 * </p>
	 */
	public static McObfPair func_184898_a = McMappingDatabase.getSRG("CommandGameRule.func_184898_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("CommandGameRule.func_71517_b");

}
