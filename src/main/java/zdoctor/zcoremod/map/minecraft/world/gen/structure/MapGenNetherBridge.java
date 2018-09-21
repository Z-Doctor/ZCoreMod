package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenNetherBridge {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbm";
		else
			return "net/minecraft/world/gen/structure/MapGenNetherBridge";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbm";
		else
			return "MapGenNetherBridge";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbm;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenNetherBridge;";
	}

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("MapGenNetherBridge.func_75049_b");

	/**
	 * <p>
	 * Name: spawnList
	 * </p>
	 */
	public static McObfPair field_75060_e = McMappingDatabase.getSRG("field_75060_e");

	/**
	 * <p>
	 * Name: getSpawnList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_75059_a = McMappingDatabase.getSRG("MapGenNetherBridge.func_75059_a");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("MapGenNetherBridge.func_180706_b");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("MapGenNetherBridge.func_143025_a");

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("MapGenNetherBridge.func_75047_a");

}
