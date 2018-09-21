package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CriterionProgress {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "o";
		else
			return "net/minecraft/advancements/CriterionProgress";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "o";
		else
			return "CriterionProgress";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lo;";
		else
			return "Lnet/minecraft/advancements/CriterionProgress;";
	}

	/**
	 * <p>
	 * Name: advancementProgress
	 * </p>
	 */
	public static McObfPair field_192156_b = McMappingDatabase.getSRG("field_192156_b");

	/**
	 * <p>
	 * Name: obtain
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192153_b = McMappingDatabase.getSRG("CriterionProgress.func_192153_b");

	/**
	 * <p>
	 * Name: obtained
	 * </p>
	 */
	public static McObfPair field_192157_c = McMappingDatabase.getSRG("field_192157_c");

	/**
	 * <p>
	 * Name: isObtained
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_192151_a = McMappingDatabase.getSRG("CriterionProgress.func_192151_a");

	/**
	 * <p>
	 * Name: serialize
	 * </p>
	 * <p>
	 * Desc: [()Lcom/google/gson/JsonElement;]
	 * </p>
	 */
	public static McObfPair func_192148_e = McMappingDatabase.getSRG("CriterionProgress.func_192148_e");

	/**
	 * <p>
	 * Name: getObtained
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Date;]
	 * </p>
	 */
	public static McObfPair func_193140_d = McMappingDatabase.getSRG("CriterionProgress.func_193140_d");

	/**
	 * <p>
	 * Name: fromDateTime
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/AdvancementProgress;Ljava/lang/String;)Lnet/minecraft/advancements/CriterionProgress;]
	 * </p>
	 */
	public static McObfPair func_192152_a = McMappingDatabase.getSRG("CriterionProgress.func_192152_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;Lnet/minecraft/advancements/AdvancementProgress;)Lnet/minecraft/advancements/CriterionProgress;]
	 * </p>
	 */
	public static McObfPair func_192149_a = McMappingDatabase.getSRG("CriterionProgress.func_192149_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_192150_a = McMappingDatabase.getSRG("CriterionProgress.func_192150_a");

	/**
	 * <p>
	 * Name: DATE_TIME_FORMATTER
	 * </p>
	 */
	public static McObfPair field_192155_a = McMappingDatabase.getSRG("field_192155_a");

	/**
	 * <p>
	 * Name: reset
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_192154_c = McMappingDatabase.getSRG("CriterionProgress.func_192154_c");

}
