package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class NibbleArrayReader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axz";
		else
			return "net/minecraft/world/chunk/storage/NibbleArrayReader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axz";
		else
			return "NibbleArrayReader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxz;";
		else
			return "Lnet/minecraft/world/chunk/storage/NibbleArrayReader;";
	}

	/**
	 * <p>
	 * Name: depthBitsPlusFour
	 * </p>
	 */
	public static McObfPair field_76688_c = McMappingDatabase.getSRG("field_76688_c");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_76686_a = McMappingDatabase.getSRG("NibbleArrayReader.func_76686_a");

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_76689_a = McMappingDatabase.getSRG("field_76689_a");

	/**
	 * <p>
	 * Name: depthBits
	 * </p>
	 */
	public static McObfPair field_76687_b = McMappingDatabase.getSRG("field_76687_b");

}
