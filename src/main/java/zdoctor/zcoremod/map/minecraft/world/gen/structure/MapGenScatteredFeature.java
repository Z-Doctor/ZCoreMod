package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenScatteredFeature {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbq";
		else
			return "net/minecraft/world/gen/structure/MapGenScatteredFeature";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbq";
		else
			return "MapGenScatteredFeature";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbq;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenScatteredFeature;";
	}

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("MapGenScatteredFeature.func_180706_b");

	/**
	 * <p>
	 * Name: getMonsters
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_82667_a = McMappingDatabase.getSRG("MapGenScatteredFeature.func_82667_a");

	/**
	 * <p>
	 * Name: maxDistanceBetweenScatteredFeatures
	 * </p>
	 */
	public static McObfPair field_82669_g = McMappingDatabase.getSRG("field_82669_g");

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("MapGenScatteredFeature.func_75047_a");

	/**
	 * <p>
	 * Name: isSwampHut
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175798_a = McMappingDatabase.getSRG("MapGenScatteredFeature.func_175798_a");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("MapGenScatteredFeature.func_143025_a");

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("MapGenScatteredFeature.func_75049_b");

	/**
	 * <p>
	 * Name: minDistanceBetweenScatteredFeatures
	 * </p>
	 */
	public static McObfPair field_82670_h = McMappingDatabase.getSRG("field_82670_h");

	/**
	 * <p>
	 * Name: BIOMELIST
	 * </p>
	 */
	public static McObfPair field_75061_e = McMappingDatabase.getSRG("field_75061_e");

	/**
	 * <p>
	 * Name: monsters
	 * </p>
	 */
	public static McObfPair field_82668_f = McMappingDatabase.getSRG("field_82668_f");

}
