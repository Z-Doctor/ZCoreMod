package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IThreadedFileIO {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgy";
		else
			return "net/minecraft/world/storage/IThreadedFileIO";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bgy";
		else
			return "IThreadedFileIO";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbgy;";
		else
			return "Lnet/minecraft/world/storage/IThreadedFileIO;";
	}

	/**
	 * <p>
	 * Name: writeNextIO
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75814_c = McMappingDatabase.getSRG("IThreadedFileIO.func_75814_c");

}
