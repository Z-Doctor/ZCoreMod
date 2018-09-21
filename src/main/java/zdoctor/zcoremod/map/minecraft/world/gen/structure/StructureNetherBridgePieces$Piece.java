package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureNetherBridgePieces$Piece {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$m";
		else
			return "net/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$m";
		else
			return "StructureNetherBridgePieces$Piece";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbn$m;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece;";
	}

	/**
	 * <p>
	 * Name: generateAndAddPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;IZ)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_175870_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_175870_a");

	/**
	 * <p>
	 * Name: isAboveGround
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74964_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_74964_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_143011_b");

	/**
	 * <p>
	 * Name: getNextComponentZ
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIZ)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74965_c = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_74965_c");

	/**
	 * <p>
	 * Name: generatePiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece;]
	 * </p>
	 */
	public static McObfPair func_175871_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_175871_a");

	/**
	 * <p>
	 * Name: getNextComponentX
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIZ)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74961_b = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_74961_b");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_143012_a");

	/**
	 * <p>
	 * Name: getTotalWeight
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)I]
	 * </p>
	 */
	public static McObfPair func_74960_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_74960_a");

	/**
	 * <p>
	 * Name: getNextComponentNormal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;Ljava/util/List;Ljava/util/Random;IIZ)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74963_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Piece.func_74963_a");

}
