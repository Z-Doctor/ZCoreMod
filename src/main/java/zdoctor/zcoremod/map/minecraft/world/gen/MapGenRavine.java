package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenRavine {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayv";
		else
			return "net/minecraft/world/gen/MapGenRavine";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayv";
		else
			return "MapGenRavine";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layv;";
		else
			return "Lnet/minecraft/world/gen/MapGenRavine;";
	}

	/**
	 * <p>
	 * Name: FLOWING_LAVA
	 * </p>
	 */
	public static McObfPair field_186135_a = McMappingDatabase.getSRG("field_186135_a");

	/**
	 * <p>
	 * Name: addTunnel
	 * </p>
	 * <p>
	 * Desc: [(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V]
	 * </p>
	 */
	public static McObfPair func_180707_a = McMappingDatabase.getSRG("MapGenRavine.func_180707_a");

	/**
	 * <p>
	 * Name: rs
	 * </p>
	 */
	public static McObfPair field_75046_d = McMappingDatabase.getSRG("field_75046_d");

	/**
	 * <p>
	 * Name: recursiveGenerate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_180701_a = McMappingDatabase.getSRG("MapGenRavine.func_180701_a");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_186136_b = McMappingDatabase.getSRG("field_186136_b");

}
