package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansionPieces$Placer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$d";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansionPieces$Placer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$d";
		else
			return "WoodlandMansionPieces$Placer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcd$d;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$Placer;";
	}

	/**
	 * <p>
	 * Name: traverseOuterWalls
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$PlacementData;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/util/EnumFacing;IIII)V]
	 * </p>
	 */
	public static McObfPair func_191130_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191130_a");

	/**
	 * <p>
	 * Name: startY
	 * </p>
	 */
	public static McObfPair field_191137_d = McMappingDatabase.getSRG("field_191137_d");

	/**
	 * <p>
	 * Name: entrance
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$PlacementData;)V]
	 * </p>
	 */
	public static McObfPair func_191133_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191133_a");

	/**
	 * <p>
	 * Name: traverseInnerTurn
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$PlacementData;)V]
	 * </p>
	 */
	public static McObfPair func_191126_d = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191126_d");

	/**
	 * <p>
	 * Name: createMansion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Ljava/util/List;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$Grid;)V]
	 * </p>
	 */
	public static McObfPair func_191125_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191125_a");

	/**
	 * <p>
	 * Name: addRoom2x2
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$RoomCollection;)V]
	 * </p>
	 */
	public static McObfPair func_191127_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191127_a");

	/**
	 * <p>
	 * Name: addRoom2x2Secret
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$RoomCollection;)V]
	 * </p>
	 */
	public static McObfPair func_191128_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191128_a");

	/**
	 * <p>
	 * Name: traverseWallPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$PlacementData;)V]
	 * </p>
	 */
	public static McObfPair func_191131_b = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191131_b");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_191135_b = McMappingDatabase.getSRG("field_191135_b");

	/**
	 * <p>
	 * Name: templateManager
	 * </p>
	 */
	public static McObfPair field_191134_a = McMappingDatabase.getSRG("field_191134_a");

	/**
	 * <p>
	 * Name: traverseTurn
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$PlacementData;)V]
	 * </p>
	 */
	public static McObfPair func_191124_c = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191124_c");

	/**
	 * <p>
	 * Name: addRoom1x1
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$RoomCollection;)V]
	 * </p>
	 */
	public static McObfPair func_191129_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191129_a");

	/**
	 * <p>
	 * Name: startX
	 * </p>
	 */
	public static McObfPair field_191136_c = McMappingDatabase.getSRG("field_191136_c");

	/**
	 * <p>
	 * Name: createRoof
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;)V]
	 * </p>
	 */
	public static McObfPair func_191123_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191123_a");

	/**
	 * <p>
	 * Name: addRoom1x2
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$RoomCollection;Z)V]
	 * </p>
	 */
	public static McObfPair func_191132_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Placer.func_191132_a");

}
