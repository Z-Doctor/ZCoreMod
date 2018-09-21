package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITutorialStep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cia";
		else
			return "net/minecraft/client/tutorial/ITutorialStep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cia";
		else
			return "ITutorialStep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcia;";
		else
			return "Lnet/minecraft/client/tutorial/ITutorialStep;";
	}

	/**
	 * <p>
	 * Name: onHitBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;F)V]
	 * </p>
	 */
	public static McObfPair func_193250_a = McMappingDatabase.getSRG("ITutorialStep.func_193250_a");

	/**
	 * <p>
	 * Name: handleMouse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/MouseHelper;)V]
	 * </p>
	 */
	public static McObfPair func_193249_a = McMappingDatabase.getSRG("ITutorialStep.func_193249_a");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193251_c = McMappingDatabase.getSRG("ITutorialStep.func_193251_c");

	/**
	 * <p>
	 * Name: onMouseHover
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_193246_a = McMappingDatabase.getSRG("ITutorialStep.func_193246_a");

	/**
	 * <p>
	 * Name: handleMovement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/MovementInput;)V]
	 * </p>
	 */
	public static McObfPair func_193247_a = McMappingDatabase.getSRG("ITutorialStep.func_193247_a");

	/**
	 * <p>
	 * Name: onStop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193248_b = McMappingDatabase.getSRG("ITutorialStep.func_193248_b");

	/**
	 * <p>
	 * Name: handleSetSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193252_a = McMappingDatabase.getSRG("ITutorialStep.func_193252_a");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193245_a = McMappingDatabase.getSRG("ITutorialStep.func_193245_a");

}
