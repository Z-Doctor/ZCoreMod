package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces$Start {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$k";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces$Start";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$k";
		else
			return "StructureVillagePieces$Start";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb$k;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;";
	}

	/**
	 * <p>
	 * Name: pendingRoads
	 * </p>
	 */
	public static McObfPair field_74930_j = McMappingDatabase.getSRG("field_74930_j");

	/**
	 * <p>
	 * Name: lastPlaced
	 * </p>
	 */
	public static McObfPair field_74926_d = McMappingDatabase.getSRG("field_74926_d");

	/**
	 * <p>
	 * Name: biomeProvider
	 * </p>
	 */
	public static McObfPair field_74929_a = McMappingDatabase.getSRG("field_74929_a");

	/**
	 * <p>
	 * Name: structureVillageWeightedPieceList
	 * </p>
	 */
	public static McObfPair field_74931_h = McMappingDatabase.getSRG("field_74931_h");

	/**
	 * <p>
	 * Name: pendingHouses
	 * </p>
	 */
	public static McObfPair field_74932_i = McMappingDatabase.getSRG("field_74932_i");

	/**
	 * <p>
	 * Name: terrainType
	 * </p>
	 */
	public static McObfPair field_74928_c = McMappingDatabase.getSRG("field_74928_c");

}
