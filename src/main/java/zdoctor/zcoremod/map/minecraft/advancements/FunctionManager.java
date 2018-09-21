package zdoctor.zcoremod.map.minecraft.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FunctionManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nt";
		else
			return "net/minecraft/advancements/FunctionManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nt";
		else
			return "FunctionManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnt;";
		else
			return "Lnet/minecraft/advancements/FunctionManager;";
	}

	/**
	 * <p>
	 * Name: execute
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/FunctionObject;Lnet/minecraft/command/ICommandSender;)I]
	 * </p>
	 */
	public static McObfPair func_194019_a = McMappingDatabase.getSRG("FunctionManager.func_194019_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_193067_a = McMappingDatabase.getSRG("field_193067_a");

	/**
	 * <p>
	 * Name: getFunctions
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_193066_d = McMappingDatabase.getSRG("FunctionManager.func_193066_d");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_193069_c = McMappingDatabase.getSRG("field_193069_c");

	/**
	 * <p>
	 * Name: getFunction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/command/FunctionObject;]
	 * </p>
	 */
	public static McObfPair func_193058_a = McMappingDatabase.getSRG("FunctionManager.func_193058_a");

	/**
	 * <p>
	 * Name: isExecuting
	 * </p>
	 */
	public static McObfPair field_194021_h = McMappingDatabase.getSRG("field_194021_h");

	/**
	 * <p>
	 * Name: functions
	 * </p>
	 */
	public static McObfPair field_193070_d = McMappingDatabase.getSRG("field_193070_d");

	/**
	 * <p>
	 * Name: gameLoopFunction
	 * </p>
	 */
	public static McObfPair field_193072_f = McMappingDatabase.getSRG("field_193072_f");

	/**
	 * <p>
	 * Name: functionDir
	 * </p>
	 */
	public static McObfPair field_193068_b = McMappingDatabase.getSRG("field_193068_b");

	/**
	 * <p>
	 * Name: getCommandManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/ICommandManager;]
	 * </p>
	 */
	public static McObfPair func_193062_a = McMappingDatabase.getSRG("FunctionManager.func_193062_a");

	/**
	 * <p>
	 * Name: getMaxCommandChainLength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_193065_c = McMappingDatabase.getSRG("FunctionManager.func_193065_c");

	/**
	 * <p>
	 * Name: commandQueue
	 * </p>
	 */
	public static McObfPair field_194020_g = McMappingDatabase.getSRG("field_194020_g");

	/**
	 * <p>
	 * Name: currentGameLoopFunctionId
	 * </p>
	 */
	public static McObfPair field_193071_e = McMappingDatabase.getSRG("field_193071_e");

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("FunctionManager.func_73660_a");

	/**
	 * <p>
	 * Name: reload
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193059_f = McMappingDatabase.getSRG("FunctionManager.func_193059_f");

	/**
	 * <p>
	 * Name: loadFunctions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_193061_h = McMappingDatabase.getSRG("FunctionManager.func_193061_h");

	/**
	 * <p>
	 * Name: gameLoopFunctionSender
	 * </p>
	 */
	public static McObfPair field_193073_g = McMappingDatabase.getSRG("field_193073_g");

}
