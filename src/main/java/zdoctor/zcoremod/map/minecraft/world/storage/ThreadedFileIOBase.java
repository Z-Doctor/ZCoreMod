package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ThreadedFileIOBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgx";
		else
			return "net/minecraft/world/storage/ThreadedFileIOBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgx";
		else
			return "ThreadedFileIOBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgx;";
		else
			return "Lnet/minecraft/world/storage/ThreadedFileIOBase;";
	}

	/**
	 * <p>
	 * Name: INSTANCE
	 * </p>
	 */
	public static McObfPair field_75741_a = McMappingDatabase.getSRG("field_75741_a");

	/**
	 * <p>
	 * Name: savedIOCounter
	 * </p>
	 */
	public static McObfPair field_75737_d = McMappingDatabase.getSRG("field_75737_d");

	/**
	 * <p>
	 * Name: waitForFinish
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75734_a = McMappingDatabase.getSRG("ThreadedFileIOBase.func_75734_a");

	/**
	 * <p>
	 * Name: queueIO
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/storage/IThreadedFileIO;)V]
	 * </p>
	 */
	public static McObfPair func_75735_a = McMappingDatabase.getSRG("ThreadedFileIOBase.func_75735_a");

	/**
	 * <p>
	 * Name: isThreadWaiting
	 * </p>
	 */
	public static McObfPair field_75738_e = McMappingDatabase.getSRG("field_75738_e");

	/**
	 * <p>
	 * Name: threadedIOQueue
	 * </p>
	 */
	public static McObfPair field_75739_b = McMappingDatabase.getSRG("field_75739_b");

	/**
	 * <p>
	 * Name: processQueue
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75736_b = McMappingDatabase.getSRG("ThreadedFileIOBase.func_75736_b");

	/**
	 * <p>
	 * Name: writeQueuedCounter
	 * </p>
	 */
	public static McObfPair field_75740_c = McMappingDatabase.getSRG("field_75740_c");

	/**
	 * <p>
	 * Name: getThreadedIOInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/ThreadedFileIOBase;]
	 * </p>
	 */
	public static McObfPair func_178779_a = McMappingDatabase.getSRG("ThreadedFileIOBase.func_178779_a");

}
