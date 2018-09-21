package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IThreadListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tr";
		else
			return "net/minecraft/util/IThreadListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tr";
		else
			return "IThreadListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltr;";
		else
			return "Lnet/minecraft/util/IThreadListener;";
	}

	/**
	 * <p>
	 * Name: addScheduledTask
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Runnable;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_152344_a = McMappingDatabase.getSRG("IThreadListener.func_152344_a");

	/**
	 * <p>
	 * Name: isCallingFromMinecraftThread
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152345_ab = McMappingDatabase.getSRG("IThreadListener.func_152345_ab");

}
