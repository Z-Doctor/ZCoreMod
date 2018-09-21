package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementCommand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "br";
		else
			return "net/minecraft/command/AdvancementCommand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "br";
		else
			return "AdvancementCommand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbr;";
		else
			return "Lnet/minecraft/command/AdvancementCommand;";
	}

	/**
	 * <p>
	 * Name: getRequiredPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82362_a = McMappingDatabase.getSRG("AdvancementCommand.func_82362_a");

	/**
	 * <p>
	 * Name: findAdvancement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Ljava/lang/String;)Lnet/minecraft/advancements/Advancement;]
	 * </p>
	 */
	public static McObfPair func_192551_a = McMappingDatabase.getSRG("AdvancementCommand.func_192551_a");

	/**
	 * <p>
	 * Name: getUsage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71518_a = McMappingDatabase.getSRG("AdvancementCommand.func_71518_a");

	/**
	 * <p>
	 * Name: getTabCompletions
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_184883_a = McMappingDatabase.getSRG("AdvancementCommand.func_184883_a");

	/**
	 * <p>
	 * Name: perform
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/command/AdvancementCommand$ActionType;Lnet/minecraft/command/AdvancementCommand$Mode;)V]
	 * </p>
	 */
	public static McObfPair func_193516_a = McMappingDatabase.getSRG("AdvancementCommand.func_193516_a");

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_184881_a = McMappingDatabase.getSRG("AdvancementCommand.func_184881_a");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_71517_b = McMappingDatabase.getSRG("AdvancementCommand.func_71517_b");

	/**
	 * <p>
	 * Name: testAdvancement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_192552_c = McMappingDatabase.getSRG("AdvancementCommand.func_192552_c");

	/**
	 * <p>
	 * Name: getAdvancementNames
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_193517_a = McMappingDatabase.getSRG("AdvancementCommand.func_193517_a");

	/**
	 * <p>
	 * Name: addChildren
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_193515_a = McMappingDatabase.getSRG("AdvancementCommand.func_193515_a");

	/**
	 * <p>
	 * Name: testCriterion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/advancements/Advancement;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_192554_c = McMappingDatabase.getSRG("AdvancementCommand.func_192554_c");

	/**
	 * <p>
	 * Name: isUsernameIndex
	 * </p>
	 * <p>
	 * Desc: [([Ljava/lang/String;I)Z]
	 * </p>
	 */
	public static McObfPair func_82358_a = McMappingDatabase.getSRG("AdvancementCommand.func_82358_a");

	/**
	 * <p>
	 * Name: getAdvancements
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Lnet/minecraft/command/AdvancementCommand$Mode;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_193514_a = McMappingDatabase.getSRG("AdvancementCommand.func_193514_a");

}
