package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenVillage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bca";
		else
			return "net/minecraft/world/gen/structure/MapGenVillage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bca";
		else
			return "MapGenVillage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbca;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenVillage;";
	}

	/**
	 * <p>
	 * Name: size
	 * </p>
	 */
	public static McObfPair field_75054_f = McMappingDatabase.getSRG("field_75054_f");

	/**
	 * <p>
	 * Name: VILLAGE_SPAWN_BIOMES
	 * </p>
	 */
	public static McObfPair field_75055_e = McMappingDatabase.getSRG("field_75055_e");

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("MapGenVillage.func_75047_a");

	/**
	 * <p>
	 * Name: minTownSeparation
	 * </p>
	 */
	public static McObfPair field_82666_h = McMappingDatabase.getSRG("field_82666_h");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("MapGenVillage.func_143025_a");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("MapGenVillage.func_180706_b");

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("MapGenVillage.func_75049_b");

	/**
	 * <p>
	 * Name: distance
	 * </p>
	 */
	public static McObfPair field_82665_g = McMappingDatabase.getSRG("field_82665_g");

}
