package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonument {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbo";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonument";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbo";
		else
			return "StructureOceanMonument";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbo;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonument;";
	}

	/**
	 * <p>
	 * Name: WATER_BIOMES
	 * </p>
	 */
	public static McObfPair field_175802_d = McMappingDatabase.getSRG("field_175802_d");

	/**
	 * <p>
	 * Name: separation
	 * </p>
	 */
	public static McObfPair field_175801_g = McMappingDatabase.getSRG("field_175801_g");

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("StructureOceanMonument.func_75049_b");

	/**
	 * <p>
	 * Name: SPAWN_BIOMES
	 * </p>
	 */
	public static McObfPair field_186134_b = McMappingDatabase.getSRG("field_186134_b");

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("StructureOceanMonument.func_75047_a");

	/**
	 * <p>
	 * Name: MONUMENT_ENEMIES
	 * </p>
	 */
	public static McObfPair field_175803_h = McMappingDatabase.getSRG("field_175803_h");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("StructureOceanMonument.func_180706_b");

	/**
	 * <p>
	 * Name: getMonsters
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175799_b = McMappingDatabase.getSRG("StructureOceanMonument.func_175799_b");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("StructureOceanMonument.func_143025_a");

	/**
	 * <p>
	 * Name: spacing
	 * </p>
	 */
	public static McObfPair field_175800_f = McMappingDatabase.getSRG("field_175800_f");

}
