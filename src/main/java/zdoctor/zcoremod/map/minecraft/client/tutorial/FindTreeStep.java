package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FindTreeStep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chv";
		else
			return "net/minecraft/client/tutorial/FindTreeStep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chv";
		else
			return "FindTreeStep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchv;";
		else
			return "Lnet/minecraft/client/tutorial/FindTreeStep;";
	}

	/**
	 * <p>
	 * Name: DESCRIPTION
	 * </p>
	 */
	public static McObfPair field_193270_c = McMappingDatabase.getSRG("field_193270_c");

	/**
	 * <p>
	 * Name: onMouseHover
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_193246_a = McMappingDatabase.getSRG("FindTreeStep.func_193246_a");

	/**
	 * <p>
	 * Name: toast
	 * </p>
	 */
	public static McObfPair field_193272_e = McMappingDatabase.getSRG("field_193272_e");

	/**
	 * <p>
	 * Name: timeWaiting
	 * </p>
	 */
	public static McObfPair field_193273_f = McMappingDatabase.getSRG("field_193273_f");

	/**
	 * <p>
	 * Name: TITLE
	 * </p>
	 */
	public static McObfPair field_193269_b = McMappingDatabase.getSRG("field_193269_b");

	/**
	 * <p>
	 * Name: onStop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193248_b = McMappingDatabase.getSRG("FindTreeStep.func_193248_b");

	/**
	 * <p>
	 * Name: hasPunchedTreesPreviously
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/EntityPlayerSP;)Z]
	 * </p>
	 */
	public static McObfPair func_194070_a = McMappingDatabase.getSRG("FindTreeStep.func_194070_a");

	/**
	 * <p>
	 * Name: handleSetSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193252_a = McMappingDatabase.getSRG("FindTreeStep.func_193252_a");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193245_a = McMappingDatabase.getSRG("FindTreeStep.func_193245_a");

	/**
	 * <p>
	 * Name: tutorial
	 * </p>
	 */
	public static McObfPair field_193271_d = McMappingDatabase.getSRG("field_193271_d");

	/**
	 * <p>
	 * Name: TREE_BLOCKS
	 * </p>
	 */
	public static McObfPair field_193268_a = McMappingDatabase.getSRG("field_193268_a");

}
