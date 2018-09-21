package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandResultStats {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bp";
		else
			return "net/minecraft/command/CommandResultStats";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bp";
		else
			return "CommandResultStats";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbp;";
		else
			return "Lnet/minecraft/command/CommandResultStats;";
	}

	/**
	 * <p>
	 * Name: addAllStats
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandResultStats;)V]
	 * </p>
	 */
	public static McObfPair func_179671_a = McMappingDatabase.getSRG("CommandResultStats.func_179671_a");

	/**
	 * <p>
	 * Name: removeScoreBoardStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandResultStats;Lnet/minecraft/command/CommandResultStats$Type;)V]
	 * </p>
	 */
	public static McObfPair func_179669_a = McMappingDatabase.getSRG("CommandResultStats.func_179669_a");

	/**
	 * <p>
	 * Name: readStatsFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_179668_a = McMappingDatabase.getSRG("CommandResultStats.func_179668_a");

	/**
	 * <p>
	 * Name: objectives
	 * </p>
	 */
	public static McObfPair field_179673_d = McMappingDatabase.getSRG("field_179673_d");

	/**
	 * <p>
	 * Name: entitiesID
	 * </p>
	 */
	public static McObfPair field_179675_c = McMappingDatabase.getSRG("field_179675_c");

	/**
	 * <p>
	 * Name: setCommandStatForSender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/CommandResultStats$Type;I)V]
	 * </p>
	 */
	public static McObfPair func_184932_a = McMappingDatabase.getSRG("CommandResultStats.func_184932_a");

	/**
	 * <p>
	 * Name: NUM_RESULT_TYPES
	 * </p>
	 */
	public static McObfPair field_179676_a = McMappingDatabase.getSRG("field_179676_a");

	/**
	 * <p>
	 * Name: STRING_RESULT_TYPES
	 * </p>
	 */
	public static McObfPair field_179674_b = McMappingDatabase.getSRG("field_179674_b");

	/**
	 * <p>
	 * Name: setScoreBoardStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandResultStats;Lnet/minecraft/command/CommandResultStats$Type;Ljava/lang/String;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_179667_a = McMappingDatabase.getSRG("CommandResultStats.func_179667_a");

	/**
	 * <p>
	 * Name: writeStatsToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_179670_b = McMappingDatabase.getSRG("CommandResultStats.func_179670_b");

}
