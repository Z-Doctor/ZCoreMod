package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DemoPlayerInteractionManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oj";
		else
			return "net/minecraft/server/management/DemoPlayerInteractionManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oj";
		else
			return "DemoPlayerInteractionManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loj;";
		else
			return "Lnet/minecraft/server/management/DemoPlayerInteractionManager;";
	}

	/**
	 * <p>
	 * Name: demoEndedReminder
	 * </p>
	 */
	public static McObfPair field_73104_e = McMappingDatabase.getSRG("field_73104_e");

	/**
	 * <p>
	 * Name: displayedIntro
	 * </p>
	 */
	public static McObfPair field_73105_c = McMappingDatabase.getSRG("field_73105_c");

	/**
	 * <p>
	 * Name: blockRemoving
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_180785_a = McMappingDatabase.getSRG("DemoPlayerInteractionManager.func_180785_a");

	/**
	 * <p>
	 * Name: gameModeTicks
	 * </p>
	 */
	public static McObfPair field_73102_f = McMappingDatabase.getSRG("field_73102_f");

	/**
	 * <p>
	 * Name: updateBlockRemoving
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73075_a = McMappingDatabase.getSRG("DemoPlayerInteractionManager.func_73075_a");

	/**
	 * <p>
	 * Name: sendDemoReminder
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73101_e = McMappingDatabase.getSRG("DemoPlayerInteractionManager.func_73101_e");

	/**
	 * <p>
	 * Name: onBlockClicked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_180784_a = McMappingDatabase.getSRG("DemoPlayerInteractionManager.func_180784_a");

	/**
	 * <p>
	 * Name: demoTimeExpired
	 * </p>
	 */
	public static McObfPair field_73103_d = McMappingDatabase.getSRG("field_73103_d");

	/**
	 * <p>
	 * Name: processRightClickBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_187251_a = McMappingDatabase.getSRG("DemoPlayerInteractionManager.func_187251_a");

	/**
	 * <p>
	 * Name: tryHarvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180237_b = McMappingDatabase.getSRG("DemoPlayerInteractionManager.func_180237_b");

	/**
	 * <p>
	 * Name: processRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_187250_a = McMappingDatabase.getSRG("DemoPlayerInteractionManager.func_187250_a");

}
