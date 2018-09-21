package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonumentPieces$Piece {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$r";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$r";
		else
			return "StructureOceanMonumentPieces$Piece";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbp$r;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece;";
	}

	/**
	 * <p>
	 * Name: generateDefaultFloor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIZ)V]
	 * </p>
	 */
	public static McObfPair func_175821_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$Piece.func_175821_a");

	/**
	 * <p>
	 * Name: ROUGH_PRISMARINE
	 * </p>
	 */
	public static McObfPair field_175828_a = McMappingDatabase.getSRG("field_175828_a");

	/**
	 * <p>
	 * Name: WATER
	 * </p>
	 */
	public static McObfPair field_175822_f = McMappingDatabase.getSRG("field_175822_f");

	/**
	 * <p>
	 * Name: GRIDROOM_SOURCE_INDEX
	 * </p>
	 */
	public static McObfPair field_175823_g = McMappingDatabase.getSRG("field_175823_g");

	/**
	 * <p>
	 * Name: generateWaterBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIIIZ)V]
	 * </p>
	 */
	public static McObfPair func_181655_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$Piece.func_181655_a");

	/**
	 * <p>
	 * Name: generateBoxOnFillOnly
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIIILnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_175819_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$Piece.func_175819_a");

	/**
	 * <p>
	 * Name: roomDefinition
	 * </p>
	 */
	public static McObfPair field_175830_k = McMappingDatabase.getSRG("field_175830_k");

	/**
	 * <p>
	 * Name: SEA_LANTERN
	 * </p>
	 */
	public static McObfPair field_175825_e = McMappingDatabase.getSRG("field_175825_e");

	/**
	 * <p>
	 * Name: doesChunkIntersect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIII)Z]
	 * </p>
	 */
	public static McObfPair func_175818_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$Piece.func_175818_a");

	/**
	 * <p>
	 * Name: GRIDROOM_LEFTWING_CONNECT_INDEX
	 * </p>
	 */
	public static McObfPair field_175832_i = McMappingDatabase.getSRG("field_175832_i");

	/**
	 * <p>
	 * Name: getRoomIndex
	 * </p>
	 * <p>
	 * Desc: [(III)I]
	 * </p>
	 */
	public static McObfPair func_175820_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$Piece.func_175820_a");

	/**
	 * <p>
	 * Name: GRIDROOM_TOP_CONNECT_INDEX
	 * </p>
	 */
	public static McObfPair field_175831_h = McMappingDatabase.getSRG("field_175831_h");

	/**
	 * <p>
	 * Name: DARK_PRISMARINE
	 * </p>
	 */
	public static McObfPair field_175827_c = McMappingDatabase.getSRG("field_175827_c");

	/**
	 * <p>
	 * Name: spawnElder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;III)Z]
	 * </p>
	 */
	public static McObfPair func_175817_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$Piece.func_175817_a");

	/**
	 * <p>
	 * Name: DOT_DECO_DATA
	 * </p>
	 */
	public static McObfPair field_175824_d = McMappingDatabase.getSRG("field_175824_d");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureOceanMonumentPieces$Piece.func_143011_b");

	/**
	 * <p>
	 * Name: BRICKS_PRISMARINE
	 * </p>
	 */
	public static McObfPair field_175826_b = McMappingDatabase.getSRG("field_175826_b");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$Piece.func_143012_a");

	/**
	 * <p>
	 * Name: GRIDROOM_RIGHTWING_CONNECT_INDEX
	 * </p>
	 */
	public static McObfPair field_175829_j = McMappingDatabase.getSRG("field_175829_j");

}
