package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenStronghold {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbs";
		else
			return "net/minecraft/world/gen/structure/MapGenStronghold";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbs";
		else
			return "MapGenStronghold";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbs;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenStronghold;";
	}

	/**
	 * <p>
	 * Name: spread
	 * </p>
	 */
	public static McObfPair field_82672_i = McMappingDatabase.getSRG("field_82672_i");

	/**
	 * <p>
	 * Name: structureCoords
	 * </p>
	 */
	public static McObfPair field_75057_g = McMappingDatabase.getSRG("field_75057_g");

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("MapGenStronghold.func_75047_a");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("MapGenStronghold.func_180706_b");

	/**
	 * <p>
	 * Name: distance
	 * </p>
	 */
	public static McObfPair field_82671_h = McMappingDatabase.getSRG("field_82671_h");

	/**
	 * <p>
	 * Name: generatePositions
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_189104_c = McMappingDatabase.getSRG("MapGenStronghold.func_189104_c");

	/**
	 * <p>
	 * Name: allowedBiomes
	 * </p>
	 */
	public static McObfPair field_151546_e = McMappingDatabase.getSRG("field_151546_e");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("MapGenStronghold.func_143025_a");

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("MapGenStronghold.func_75049_b");

	/**
	 * <p>
	 * Name: ranBiomeCheck
	 * </p>
	 */
	public static McObfPair field_75056_f = McMappingDatabase.getSRG("field_75056_f");

}
