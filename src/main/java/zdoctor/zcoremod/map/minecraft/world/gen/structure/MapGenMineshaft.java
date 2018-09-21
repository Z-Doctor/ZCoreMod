package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenMineshaft {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbj";
		else
			return "net/minecraft/world/gen/structure/MapGenMineshaft";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbj";
		else
			return "MapGenMineshaft";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbj;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenMineshaft;";
	}

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("MapGenMineshaft.func_75049_b");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("MapGenMineshaft.func_180706_b");

	/**
	 * <p>
	 * Name: chance
	 * </p>
	 */
	public static McObfPair field_82673_e = McMappingDatabase.getSRG("field_82673_e");

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("MapGenMineshaft.func_75047_a");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("MapGenMineshaft.func_143025_a");

}
