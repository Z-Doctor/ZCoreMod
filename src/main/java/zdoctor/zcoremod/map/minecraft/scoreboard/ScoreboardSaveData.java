package zdoctor.zcoremod.map.minecraft.scoreboard;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScoreboardSaveData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhl";
		else
			return "net/minecraft/scoreboard/ScoreboardSaveData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhl";
		else
			return "ScoreboardSaveData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhl;";
		else
			return "Lnet/minecraft/scoreboard/ScoreboardSaveData;";
	}

	/**
	 * <p>
	 * Name: readDisplayConfig
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_96504_c = McMappingDatabase.getSRG("ScoreboardSaveData.func_96504_c");

	/**
	 * <p>
	 * Name: setScoreboard
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/Scoreboard;)V]
	 * </p>
	 */
	public static McObfPair func_96499_a = McMappingDatabase.getSRG("ScoreboardSaveData.func_96499_a");

	/**
	 * <p>
	 * Name: readObjectives
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagList;)V]
	 * </p>
	 */
	public static McObfPair func_96501_b = McMappingDatabase.getSRG("ScoreboardSaveData.func_96501_b");

	/**
	 * <p>
	 * Name: scoresToNbt
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_96503_e = McMappingDatabase.getSRG("ScoreboardSaveData.func_96503_e");

	/**
	 * <p>
	 * Name: delayedInitNbt
	 * </p>
	 */
	public static McObfPair field_96506_b = McMappingDatabase.getSRG("field_96506_b");

	/**
	 * <p>
	 * Name: teamsToNbt
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_96496_a = McMappingDatabase.getSRG("ScoreboardSaveData.func_96496_a");

	/**
	 * <p>
	 * Name: loadTeamPlayers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/scoreboard/ScorePlayerTeam;Lnet/minecraft/nbt/NBTTagList;)V]
	 * </p>
	 */
	public static McObfPair func_96502_a = McMappingDatabase.getSRG("ScoreboardSaveData.func_96502_a");

	/**
	 * <p>
	 * Name: readTeams
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagList;)V]
	 * </p>
	 */
	public static McObfPair func_96498_a = McMappingDatabase.getSRG("ScoreboardSaveData.func_96498_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_76184_a = McMappingDatabase.getSRG("ScoreboardSaveData.func_76184_a");

	/**
	 * <p>
	 * Name: fillInDisplaySlots
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_96497_d = McMappingDatabase.getSRG("ScoreboardSaveData.func_96497_d");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_189551_b = McMappingDatabase.getSRG("ScoreboardSaveData.func_189551_b");

	/**
	 * <p>
	 * Name: objectivesToNbt
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_96505_b = McMappingDatabase.getSRG("ScoreboardSaveData.func_96505_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151481_a = McMappingDatabase.getSRG("field_151481_a");

	/**
	 * <p>
	 * Name: readScores
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagList;)V]
	 * </p>
	 */
	public static McObfPair func_96500_c = McMappingDatabase.getSRG("ScoreboardSaveData.func_96500_c");

	/**
	 * <p>
	 * Name: scoreboard
	 * </p>
	 */
	public static McObfPair field_96507_a = McMappingDatabase.getSRG("field_96507_a");

}
