package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Advancement {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "i";
		else
			return "net/minecraft/advancements/Advancement";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "i";
		else
			return "Advancement";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Li;";
		else
			return "Lnet/minecraft/advancements/Advancement;";
	}

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/Advancement$Builder;]
	 * </p>
	 */
	public static McObfPair func_192075_a = McMappingDatabase.getSRG("Advancement.func_192075_a");

	/**
	 * <p>
	 * Name: children
	 * </p>
	 */
	public static McObfPair field_192082_g = McMappingDatabase.getSRG("field_192082_g");

	/**
	 * <p>
	 * Name: getCriteria
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_192073_f = McMappingDatabase.getSRG("Advancement.func_192073_f");

	/**
	 * <p>
	 * Name: getRequirements
	 * </p>
	 * <p>
	 * Desc: [()[[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_192074_h = McMappingDatabase.getSRG("Advancement.func_192074_h");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_192079_d = McMappingDatabase.getSRG("field_192079_d");

	/**
	 * <p>
	 * Name: getDisplay
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/DisplayInfo;]
	 * </p>
	 */
	public static McObfPair func_192068_c = McMappingDatabase.getSRG("Advancement.func_192068_c");

	/**
	 * <p>
	 * Name: requirements
	 * </p>
	 */
	public static McObfPair field_192081_f = McMappingDatabase.getSRG("field_192081_f");

	/**
	 * <p>
	 * Name: display
	 * </p>
	 */
	public static McObfPair field_192077_b = McMappingDatabase.getSRG("field_192077_b");

	/**
	 * <p>
	 * Name: addChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_192071_a = McMappingDatabase.getSRG("Advancement.func_192071_a");

	/**
	 * <p>
	 * Name: rewards
	 * </p>
	 */
	public static McObfPair field_192078_c = McMappingDatabase.getSRG("field_192078_c");

	/**
	 * <p>
	 * Name: getDisplayText
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_193123_j = McMappingDatabase.getSRG("Advancement.func_193123_j");

	/**
	 * <p>
	 * Name: parent
	 * </p>
	 */
	public static McObfPair field_192076_a = McMappingDatabase.getSRG("field_192076_a");

	/**
	 * <p>
	 * Name: criteria
	 * </p>
	 */
	public static McObfPair field_192080_e = McMappingDatabase.getSRG("field_192080_e");

	/**
	 * <p>
	 * Name: getRequirementCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_193124_g = McMappingDatabase.getSRG("Advancement.func_193124_g");

	/**
	 * <p>
	 * Name: displayText
	 * </p>
	 */
	public static McObfPair field_193125_h = McMappingDatabase.getSRG("field_193125_h");

	/**
	 * <p>
	 * Name: getChildren
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_192069_e = McMappingDatabase.getSRG("Advancement.func_192069_e");

	/**
	 * <p>
	 * Name: getParent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/Advancement;]
	 * </p>
	 */
	public static McObfPair func_192070_b = McMappingDatabase.getSRG("Advancement.func_192070_b");

	/**
	 * <p>
	 * Name: getRewards
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/advancements/AdvancementRewards;]
	 * </p>
	 */
	public static McObfPair func_192072_d = McMappingDatabase.getSRG("Advancement.func_192072_d");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_192067_g = McMappingDatabase.getSRG("Advancement.func_192067_g");

}
