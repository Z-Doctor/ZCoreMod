package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RegionFile$ChunkBuffer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayj$a";
		else
			return "net/minecraft/world/chunk/storage/RegionFile$ChunkBuffer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayj$a";
		else
			return "RegionFile$ChunkBuffer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layj$a;";
		else
			return "Lnet/minecraft/world/chunk/storage/RegionFile$ChunkBuffer;";
	}

	/**
	 * <p>
	 * Name: chunkX
	 * </p>
	 */
	public static McObfPair field_76722_b = McMappingDatabase.getSRG("field_76722_b");

	/**
	 * <p>
	 * Name: chunkZ
	 * </p>
	 */
	public static McObfPair field_76723_c = McMappingDatabase.getSRG("field_76723_c");

}
