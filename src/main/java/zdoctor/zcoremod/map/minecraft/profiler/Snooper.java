package zdoctor.zcoremod.map.minecraft.profiler;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Snooper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ul";
		else
			return "net/minecraft/profiler/Snooper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ul";
		else
			return "Snooper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lul;";
		else
			return "Lnet/minecraft/profiler/Snooper;";
	}

	/**
	 * <p>
	 * Name: uniqueID
	 * </p>
	 */
	public static McObfPair field_76480_b = McMappingDatabase.getSRG("field_76480_b");

	/**
	 * <p>
	 * Name: addMemoryStatsToSnooper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76471_b = McMappingDatabase.getSRG("Snooper.func_76471_b");

	/**
	 * <p>
	 * Name: snooperStats
	 * </p>
	 */
	public static McObfPair field_152773_a = McMappingDatabase.getSRG("field_152773_a");

	/**
	 * <p>
	 * Name: threadTrigger
	 * </p>
	 */
	public static McObfPair field_76479_e = McMappingDatabase.getSRG("field_76479_e");

	/**
	 * <p>
	 * Name: addStatToSnooper
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_152767_b = McMappingDatabase.getSRG("Snooper.func_152767_b");

	/**
	 * <p>
	 * Name: clientStats
	 * </p>
	 */
	public static McObfPair field_152774_b = McMappingDatabase.getSRG("field_152774_b");

	/**
	 * <p>
	 * Name: addJvmArgsToSnooper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76467_g = McMappingDatabase.getSRG("Snooper.func_76467_g");

	/**
	 * <p>
	 * Name: stopSnooper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76470_e = McMappingDatabase.getSRG("Snooper.func_76470_e");

	/**
	 * <p>
	 * Name: syncLock
	 * </p>
	 */
	public static McObfPair field_76476_f = McMappingDatabase.getSRG("field_76476_f");

	/**
	 * <p>
	 * Name: minecraftStartTimeMilis
	 * </p>
	 */
	public static McObfPair field_98224_g = McMappingDatabase.getSRG("field_98224_g");

	/**
	 * <p>
	 * Name: playerStatsCollector
	 * </p>
	 */
	public static McObfPair field_76478_d = McMappingDatabase.getSRG("field_76478_d");

	/**
	 * <p>
	 * Name: getMinecraftStartTimeMillis
	 * </p>
	 * <p>
	 * Desc: [()J]
	 * </p>
	 */
	public static McObfPair func_130105_g = McMappingDatabase.getSRG("Snooper.func_130105_g");

	/**
	 * <p>
	 * Name: getCurrentStats
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Map;]
	 * </p>
	 */
	public static McObfPair func_76465_c = McMappingDatabase.getSRG("Snooper.func_76465_c");

	/**
	 * <p>
	 * Name: addClientStat
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_152768_a = McMappingDatabase.getSRG("Snooper.func_152768_a");

	/**
	 * <p>
	 * Name: isRunning
	 * </p>
	 */
	public static McObfPair field_76477_g = McMappingDatabase.getSRG("field_76477_g");

	/**
	 * <p>
	 * Name: isSnooperRunning
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76468_d = McMappingDatabase.getSRG("Snooper.func_76468_d");

	/**
	 * <p>
	 * Name: getUniqueID
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_80006_f = McMappingDatabase.getSRG("Snooper.func_80006_f");

	/**
	 * <p>
	 * Name: startSnooper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_76463_a = McMappingDatabase.getSRG("Snooper.func_76463_a");

	/**
	 * <p>
	 * Name: addOSData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152766_h = McMappingDatabase.getSRG("Snooper.func_152766_h");

	/**
	 * <p>
	 * Name: selfCounter
	 * </p>
	 */
	public static McObfPair field_76483_h = McMappingDatabase.getSRG("field_76483_h");

	/**
	 * <p>
	 * Name: serverUrl
	 * </p>
	 */
	public static McObfPair field_76481_c = McMappingDatabase.getSRG("field_76481_c");

}
