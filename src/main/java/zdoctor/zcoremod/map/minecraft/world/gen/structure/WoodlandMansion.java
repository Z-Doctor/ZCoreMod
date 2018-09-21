package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcc";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcc";
		else
			return "WoodlandMansion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcc;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansion;";
	}

	/**
	 * <p>
	 * Name: canSpawnStructureAtCoords
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_75047_a = McMappingDatabase.getSRG("WoodlandMansion.func_75047_a");

	/**
	 * <p>
	 * Name: getNearestStructurePos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180706_b = McMappingDatabase.getSRG("WoodlandMansion.func_180706_b");

	/**
	 * <p>
	 * Name: featureSpacing
	 * </p>
	 */
	public static McObfPair field_191073_b = McMappingDatabase.getSRG("field_191073_b");

	/**
	 * <p>
	 * Name: ALLOWED_BIOMES
	 * </p>
	 */
	public static McObfPair field_191072_a = McMappingDatabase.getSRG("field_191072_a");

	/**
	 * <p>
	 * Name: getStructureName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_143025_a = McMappingDatabase.getSRG("WoodlandMansion.func_143025_a");

	/**
	 * <p>
	 * Name: provider
	 * </p>
	 */
	public static McObfPair field_191075_h = McMappingDatabase.getSRG("field_191075_h");

	/**
	 * <p>
	 * Name: minFeatureSeparation
	 * </p>
	 */
	public static McObfPair field_191074_d = McMappingDatabase.getSRG("field_191074_d");

	/**
	 * <p>
	 * Name: getStructureStart
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/gen/structure/StructureStart;]
	 * </p>
	 */
	public static McObfPair func_75049_b = McMappingDatabase.getSRG("WoodlandMansion.func_75049_b");

}
