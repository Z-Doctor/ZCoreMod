package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CraftPlanksStep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chu";
		else
			return "net/minecraft/client/tutorial/CraftPlanksStep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chu";
		else
			return "CraftPlanksStep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchu;";
		else
			return "Lnet/minecraft/client/tutorial/CraftPlanksStep;";
	}

	/**
	 * <p>
	 * Name: timeWaiting
	 * </p>
	 */
	public static McObfPair field_193290_e = McMappingDatabase.getSRG("field_193290_e");

	/**
	 * <p>
	 * Name: onStop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193248_b = McMappingDatabase.getSRG("CraftPlanksStep.func_193248_b");

	/**
	 * <p>
	 * Name: handleSetSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193252_a = McMappingDatabase.getSRG("CraftPlanksStep.func_193252_a");

	/**
	 * <p>
	 * Name: TITLE
	 * </p>
	 */
	public static McObfPair field_193286_a = McMappingDatabase.getSRG("field_193286_a");

	/**
	 * <p>
	 * Name: DESCRIPTION
	 * </p>
	 */
	public static McObfPair field_193287_b = McMappingDatabase.getSRG("field_193287_b");

	/**
	 * <p>
	 * Name: didPlayerCraftedPlanks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/EntityPlayerSP;)Z]
	 * </p>
	 */
	public static McObfPair func_194071_a = McMappingDatabase.getSRG("CraftPlanksStep.func_194071_a");

	/**
	 * <p>
	 * Name: tutorial
	 * </p>
	 */
	public static McObfPair field_193288_c = McMappingDatabase.getSRG("field_193288_c");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193245_a = McMappingDatabase.getSRG("CraftPlanksStep.func_193245_a");

	/**
	 * <p>
	 * Name: toast
	 * </p>
	 */
	public static McObfPair field_193289_d = McMappingDatabase.getSRG("field_193289_d");

}
