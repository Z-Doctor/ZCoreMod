package zdoctor.zcoremod.map.minecraft.client.tutorial;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Tutorial {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chz";
		else
			return "net/minecraft/client/tutorial/Tutorial";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chz";
		else
			return "Tutorial";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchz;";
		else
			return "Lnet/minecraft/client/tutorial/Tutorial;";
	}

	/**
	 * <p>
	 * Name: setStep
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/tutorial/TutorialSteps;)V]
	 * </p>
	 */
	public static McObfPair func_193292_a = McMappingDatabase.getSRG("Tutorial.func_193292_a");

	/**
	 * <p>
	 * Name: handleMouse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/MouseHelper;)V]
	 * </p>
	 */
	public static McObfPair func_193299_a = McMappingDatabase.getSRG("Tutorial.func_193299_a");

	/**
	 * <p>
	 * Name: createKeybindComponent
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_193291_a = McMappingDatabase.getSRG("Tutorial.func_193291_a");

	/**
	 * <p>
	 * Name: onMouseHover
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/RayTraceResult;)V]
	 * </p>
	 */
	public static McObfPair func_193297_a = McMappingDatabase.getSRG("Tutorial.func_193297_a");

	/**
	 * <p>
	 * Name: minecraft
	 * </p>
	 */
	public static McObfPair field_193304_a = McMappingDatabase.getSRG("field_193304_a");

	/**
	 * <p>
	 * Name: onHitBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/WorldClient;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;F)V]
	 * </p>
	 */
	public static McObfPair func_193294_a = McMappingDatabase.getSRG("Tutorial.func_193294_a");

	/**
	 * <p>
	 * Name: handleSetSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_193301_a = McMappingDatabase.getSRG("Tutorial.func_193301_a");

	/**
	 * <p>
	 * Name: handleMovement
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/MovementInput;)V]
	 * </p>
	 */
	public static McObfPair func_193293_a = McMappingDatabase.getSRG("Tutorial.func_193293_a");

	/**
	 * <p>
	 * Name: getGameType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/GameType;]
	 * </p>
	 */
	public static McObfPair func_194072_f = McMappingDatabase.getSRG("Tutorial.func_194072_f");

	/**
	 * <p>
	 * Name: tutorialStep
	 * </p>
	 */
	public static McObfPair field_193305_b = McMappingDatabase.getSRG("field_193305_b");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193303_d = McMappingDatabase.getSRG("Tutorial.func_193303_d");

	/**
	 * <p>
	 * Name: reload
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193302_c = McMappingDatabase.getSRG("Tutorial.func_193302_c");

	/**
	 * <p>
	 * Name: getMinecraft
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/Minecraft;]
	 * </p>
	 */
	public static McObfPair func_193295_e = McMappingDatabase.getSRG("Tutorial.func_193295_e");

	/**
	 * <p>
	 * Name: stop
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193300_b = McMappingDatabase.getSRG("Tutorial.func_193300_b");

	/**
	 * <p>
	 * Name: openInventory
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193296_a = McMappingDatabase.getSRG("Tutorial.func_193296_a");

}
