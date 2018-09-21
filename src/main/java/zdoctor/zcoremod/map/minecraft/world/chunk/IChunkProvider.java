package zdoctor.zcoremod.map.minecraft.world.chunk;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IChunkProvider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axr";
		else
			return "net/minecraft/world/chunk/IChunkProvider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axr";
		else
			return "IChunkProvider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxr;";
		else
			return "Lnet/minecraft/world/chunk/IChunkProvider;";
	}

	/**
	 * <p>
	 * Name: provideChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_186025_d = McMappingDatabase.getSRG("IChunkProvider.func_186025_d");

	/**
	 * <p>
	 * Name: getLoadedChunk
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_186026_b = McMappingDatabase.getSRG("IChunkProvider.func_186026_b");

	/**
	 * <p>
	 * Name: isChunkGeneratedAt
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_191062_e = McMappingDatabase.getSRG("IChunkProvider.func_191062_e");

	/**
	 * <p>
	 * Name: makeString
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_73148_d = McMappingDatabase.getSRG("IChunkProvider.func_73148_d");

	/**
	 * <p>
	 * Name: tick
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_73156_b = McMappingDatabase.getSRG("IChunkProvider.func_73156_b");

}
