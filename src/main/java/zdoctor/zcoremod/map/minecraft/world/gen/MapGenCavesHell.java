package zdoctor.zcoremod.map.minecraft.world.gen;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenCavesHell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azc";
		else
			return "net/minecraft/world/gen/MapGenCavesHell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azc";
		else
			return "MapGenCavesHell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazc;";
		else
			return "Lnet/minecraft/world/gen/MapGenCavesHell;";
	}

	/**
	 * <p>
	 * Name: recursiveGenerate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IIIILnet/minecraft/world/chunk/ChunkPrimer;)V]
	 * </p>
	 */
	public static McObfPair func_180701_a = McMappingDatabase.getSRG("MapGenCavesHell.func_180701_a");

	/**
	 * <p>
	 * Name: AIR
	 * </p>
	 */
	public static McObfPair field_186130_a = McMappingDatabase.getSRG("field_186130_a");

	/**
	 * <p>
	 * Name: addTunnel
	 * </p>
	 * <p>
	 * Desc: [(JIILnet/minecraft/world/chunk/ChunkPrimer;DDDFFFIID)V]
	 * </p>
	 */
	public static McObfPair func_180704_a = McMappingDatabase.getSRG("MapGenCavesHell.func_180704_a");

	/**
	 * <p>
	 * Name: addRoom
	 * </p>
	 * <p>
	 * Desc: [(JIILnet/minecraft/world/chunk/ChunkPrimer;DDD)V]
	 * </p>
	 */
	public static McObfPair func_180705_a = McMappingDatabase.getSRG("MapGenCavesHell.func_180705_a");

}
