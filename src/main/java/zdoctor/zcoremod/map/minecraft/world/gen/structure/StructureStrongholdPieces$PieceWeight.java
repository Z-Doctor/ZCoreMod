package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$PieceWeight {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$f";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$PieceWeight";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$f";
		else
			return "StructureStrongholdPieces$PieceWeight";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$f;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$PieceWeight;";
	}

	/**
	 * <p>
	 * Name: pieceClass
	 * </p>
	 */
	public static McObfPair field_75194_a = McMappingDatabase.getSRG("field_75194_a");

	/**
	 * <p>
	 * Name: canSpawnMoreStructures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75190_a = McMappingDatabase.getSRG("StructureStrongholdPieces$PieceWeight.func_75190_a");

	/**
	 * <p>
	 * Name: canSpawnMoreStructuresOfType
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_75189_a = McMappingDatabase.getSRG("StructureStrongholdPieces$PieceWeight.func_75189_a");

	/**
	 * <p>
	 * Name: instancesLimit
	 * </p>
	 */
	public static McObfPair field_75191_d = McMappingDatabase.getSRG("field_75191_d");

	/**
	 * <p>
	 * Name: instancesSpawned
	 * </p>
	 */
	public static McObfPair field_75193_c = McMappingDatabase.getSRG("field_75193_c");

	/**
	 * <p>
	 * Name: pieceWeight
	 * </p>
	 */
	public static McObfPair field_75192_b = McMappingDatabase.getSRG("field_75192_b");

}
