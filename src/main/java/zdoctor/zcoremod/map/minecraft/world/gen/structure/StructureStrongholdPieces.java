package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt";
		else
			return "StructureStrongholdPieces";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces;";
	}

	/**
	 * <p>
	 * Name: prepareStructurePieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75198_a = McMappingDatabase.getSRG("StructureStrongholdPieces.func_75198_a");

	/**
	 * <p>
	 * Name: strongComponentType
	 * </p>
	 */
	public static McObfPair field_75203_d = McMappingDatabase.getSRG("field_75203_d");

	/**
	 * <p>
	 * Name: totalWeight
	 * </p>
	 */
	public static McObfPair field_75207_a = McMappingDatabase.getSRG("field_75207_a");

	/**
	 * <p>
	 * Name: PIECE_WEIGHTS
	 * </p>
	 */
	public static McObfPair field_75205_b = McMappingDatabase.getSRG("field_75205_b");

	/**
	 * <p>
	 * Name: generatePieceFromSmallDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold;]
	 * </p>
	 */
	public static McObfPair func_175955_b = McMappingDatabase.getSRG("StructureStrongholdPieces.func_175955_b");

	/**
	 * <p>
	 * Name: findAndCreatePieceFactory
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold;]
	 * </p>
	 */
	public static McObfPair func_175954_a = McMappingDatabase.getSRG("StructureStrongholdPieces.func_175954_a");

	/**
	 * <p>
	 * Name: registerStrongholdPieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_143046_a = McMappingDatabase.getSRG("StructureStrongholdPieces.func_143046_a");

	/**
	 * <p>
	 * Name: structurePieceList
	 * </p>
	 */
	public static McObfPair field_75206_c = McMappingDatabase.getSRG("field_75206_c");

	/**
	 * <p>
	 * Name: STRONGHOLD_STONES
	 * </p>
	 */
	public static McObfPair field_75204_e = McMappingDatabase.getSRG("field_75204_e");

	/**
	 * <p>
	 * Name: canAddStructurePieces
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75202_c = McMappingDatabase.getSRG("StructureStrongholdPieces.func_75202_c");

	/**
	 * <p>
	 * Name: generateAndAddPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_175953_c = McMappingDatabase.getSRG("StructureStrongholdPieces.func_175953_c");

}
