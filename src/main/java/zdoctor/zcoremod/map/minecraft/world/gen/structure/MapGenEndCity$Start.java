package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenEndCity$Start {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbh$a";
		else
			return "net/minecraft/world/gen/structure/MapGenEndCity$Start";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbh$a";
		else
			return "MapGenEndCity$Start";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbh$a;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenEndCity$Start;";
	}

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/ChunkGeneratorEnd;Ljava/util/Random;II)V]
	 * </p>
	 */
	public static McObfPair func_186162_a = McMappingDatabase.getSRG("MapGenEndCity$Start.func_186162_a");

	/**
	 * <p>
	 * Name: isSizeable
	 * </p>
	 */
	public static McObfPair field_186163_c = McMappingDatabase.getSRG("field_186163_c");

	/**
	 * <p>
	 * Name: isSizeableStructure
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75069_d = McMappingDatabase.getSRG("MapGenEndCity$Start.func_75069_d");

}
