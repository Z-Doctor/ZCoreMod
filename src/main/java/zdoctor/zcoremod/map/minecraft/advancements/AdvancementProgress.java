package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementProgress {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "k";
		else
			return "net/minecraft/advancements/AdvancementProgress";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "k";
		else
			return "AdvancementProgress";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lk;";
		else
			return "Lnet/minecraft/advancements/AdvancementProgress;";
	}

	/**
	 * <p>
	 * Name: grantCriterion
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_192109_a = McMappingDatabase.getSRG("AdvancementProgress.func_192109_a");

	/**
	 * <p>
	 * Name: fromNetwork
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Lnet/minecraft/advancements/AdvancementProgress;]
	 * </p>
	 */
	public static McObfPair func_192100_b = McMappingDatabase.getSRG("AdvancementProgress.func_192100_b");

	/**
	 * <p>
	 * Name: getCompletedCriteria
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_192102_e = McMappingDatabase.getSRG("AdvancementProgress.func_192102_e");

	/**
	 * <p>
	 * Name: getPercent
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_192103_c = McMappingDatabase.getSRG("AdvancementProgress.func_192103_c");

	/**
	 * <p>
	 * Name: getCriterionProgress
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/advancements/CriterionProgress;]
	 * </p>
	 */
	public static McObfPair func_192106_c = McMappingDatabase.getSRG("AdvancementProgress.func_192106_c");

	/**
	 * <p>
	 * Name: getProgressText
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_193126_d = McMappingDatabase.getSRG("AdvancementProgress.func_193126_d");

	/**
	 * <p>
	 * Name: getRemaningCriteria
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_192107_d = McMappingDatabase.getSRG("AdvancementProgress.func_192107_d");

	/**
	 * <p>
	 * Name: serializeToNetwork
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_192104_a = McMappingDatabase.getSRG("AdvancementProgress.func_192104_a");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;[[Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_192099_a = McMappingDatabase.getSRG("AdvancementProgress.func_192099_a");

	/**
	 * <p>
	 * Name: isDone
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192105_a = McMappingDatabase.getSRG("AdvancementProgress.func_192105_a");

	/**
	 * <p>
	 * Name: revokeCriterion
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_192101_b = McMappingDatabase.getSRG("AdvancementProgress.func_192101_b");

	/**
	 * <p>
	 * Name: requirements
	 * </p>
	 */
	public static McObfPair field_192111_b = McMappingDatabase.getSRG("field_192111_b");

	/**
	 * <p>
	 * Name: getFirstProgressDate
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Date;]
	 * </p>
	 */
	public static McObfPair func_193128_g = McMappingDatabase.getSRG("AdvancementProgress.func_193128_g");

	/**
	 * <p>
	 * Name: criteria
	 * </p>
	 */
	public static McObfPair field_192110_a = McMappingDatabase.getSRG("field_192110_a");

	/**
	 * <p>
	 * Name: countCompletedRequirements
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_194032_h = McMappingDatabase.getSRG("AdvancementProgress.func_194032_h");

	/**
	 * <p>
	 * Name: hasProgress
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192108_b = McMappingDatabase.getSRG("AdvancementProgress.func_192108_b");

}
