package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenEndCity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbh";
		else
			return "net/minecraft/world/gen/structure/MapGenEndCity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbh";
		else
			return "MapGenEndCity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbh;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenEndCity;";
	}

	/**
	 * <p>
	 * Name: endProvider
	 * </p>
	 */
	public static McObfPair field_186133_d = McMappingDatabase.getSRG("field_186133_d");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("MapGenEndCity.func_180706_b");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("MapGenEndCity.func_143025_a");

	/**
	 * <p>
	 * Name: getYPosForStructure
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/world/gen/ChunkGeneratorEnd;)I]
	 * </p>
	 */
	public static McObfPair func_191070_b = McMappingDatabase.getSRG("MapGenEndCity.func_191070_b");

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("MapGenEndCity.func_75047_a");

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("MapGenEndCity.func_75049_b");

	/**
	 * <p>
	 * Name: minCitySeparation
	 * </p>
	 */
	public static McObfPair field_186132_b = McMappingDatabase.getSRG("field_186132_b");

	/**
	 * <p>
	 * Name: citySpacing
	 * </p>
	 */
	public static McObfPair field_186131_a = McMappingDatabase.getSRG("field_186131_a");

}
