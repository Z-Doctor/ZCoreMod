package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb";
		else
			return "StructureVillagePieces";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces;";
	}

	/**
	 * <p>
	 * Name: findAndCreateComponentFactory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Lnet/minecraft/world/gen/structure/StructureVillagePieces$PieceWeight;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$Village;]
	 * </p>
	 */
	public static McObfPair func_176065_a = McMappingDatabase.getSRG("StructureVillagePieces.func_176065_a");

	/**
	 * <p>
	 * Name: getStructureVillageWeightedPieceList
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;I)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_75084_a = McMappingDatabase.getSRG("StructureVillagePieces.func_75084_a");

	/**
	 * <p>
	 * Name: registerVillagePieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_143016_a = McMappingDatabase.getSRG("StructureVillagePieces.func_143016_a");

	/**
	 * <p>
	 * Name: generateComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$Village;]
	 * </p>
	 */
	public static McObfPair func_176067_c = McMappingDatabase.getSRG("StructureVillagePieces.func_176067_c");

	/**
	 * <p>
	 * Name: generateAndAddRoadPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_176069_e = McMappingDatabase.getSRG("StructureVillagePieces.func_176069_e");

	/**
	 * <p>
	 * Name: generateAndAddComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_176066_d = McMappingDatabase.getSRG("StructureVillagePieces.func_176066_d");

	/**
	 * <p>
	 * Name: updatePieceWeight
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)I]
	 * </p>
	 */
	public static McObfPair func_75079_a = McMappingDatabase.getSRG("StructureVillagePieces.func_75079_a");

}
