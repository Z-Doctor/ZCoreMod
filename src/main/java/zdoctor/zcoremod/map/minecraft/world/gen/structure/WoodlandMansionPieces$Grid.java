package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansionPieces$Grid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$c";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansionPieces$Grid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$c";
		else
			return "WoodlandMansionPieces$Grid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcd$c;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$Grid;";
	}

	/**
	 * <p>
	 * Name: floorRooms
	 * </p>
	 */
	public static McObfPair field_191120_d = McMappingDatabase.getSRG("field_191120_d");

	/**
	 * <p>
	 * Name: isRoomId
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;IIII)Z]
	 * </p>
	 */
	public static McObfPair func_191114_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Grid.func_191114_a");

	/**
	 * <p>
	 * Name: baseGrid
	 * </p>
	 */
	public static McObfPair field_191118_b = McMappingDatabase.getSRG("field_191118_b");

	/**
	 * <p>
	 * Name: setupThirdFloor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191115_b = McMappingDatabase.getSRG("WoodlandMansionPieces$Grid.func_191115_b");

	/**
	 * <p>
	 * Name: entranceX
	 * </p>
	 */
	public static McObfPair field_191121_e = McMappingDatabase.getSRG("field_191121_e");

	/**
	 * <p>
	 * Name: thirdFloorGrid
	 * </p>
	 */
	public static McObfPair field_191119_c = McMappingDatabase.getSRG("field_191119_c");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_191117_a = McMappingDatabase.getSRG("field_191117_a");

	/**
	 * <p>
	 * Name: cleanEdges
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;)Z]
	 * </p>
	 */
	public static McObfPair func_191111_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Grid.func_191111_a");

	/**
	 * <p>
	 * Name: identifyRooms
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;)V]
	 * </p>
	 */
	public static McObfPair func_191116_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Grid.func_191116_a");

	/**
	 * <p>
	 * Name: recursiveCorridor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;IILnet/minecraft/util/EnumFacing;I)V]
	 * </p>
	 */
	public static McObfPair func_191110_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Grid.func_191110_a");

	/**
	 * <p>
	 * Name: isHouse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;II)Z]
	 * </p>
	 */
	public static McObfPair func_191109_a = McMappingDatabase.getSRG("WoodlandMansionPieces$Grid.func_191109_a");

	/**
	 * <p>
	 * Name: get1x2RoomDirection
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;IIII)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_191113_b = McMappingDatabase.getSRG("WoodlandMansionPieces$Grid.func_191113_b");

	/**
	 * <p>
	 * Name: entranceY
	 * </p>
	 */
	public static McObfPair field_191122_f = McMappingDatabase.getSRG("field_191122_f");

}
