package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonumentPieces$MonumentBuilding {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$h";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$h";
		else
			return "StructureOceanMonumentPieces$MonumentBuilding";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbp$h;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$MonumentBuilding;";
	}

	/**
	 * <p>
	 * Name: sourceRoom
	 * </p>
	 */
	public static McObfPair field_175845_o = McMappingDatabase.getSRG("field_175845_o");

	/**
	 * <p>
	 * Name: coreRoom
	 * </p>
	 */
	public static McObfPair field_175844_p = McMappingDatabase.getSRG("field_175844_p");

	/**
	 * <p>
	 * Name: generateLowerWall
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175835_e = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_175835_e");

	/**
	 * <p>
	 * Name: generateWing
	 * </p>
	 * <p>
	 * Desc: [(ZILnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175840_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_175840_a");

	/**
	 * <p>
	 * Name: generateEntranceWall
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175837_c = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_175837_c");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_74875_a");

	/**
	 * <p>
	 * Name: generateMiddleWall
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175842_f = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_175842_f");

	/**
	 * <p>
	 * Name: generateRoofPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175841_d = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_175841_d");

	/**
	 * <p>
	 * Name: generateEntranceArchs
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175839_b = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_175839_b");

	/**
	 * <p>
	 * Name: generateUpperWall
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175838_g = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_175838_g");

	/**
	 * <p>
	 * Name: childPieces
	 * </p>
	 */
	public static McObfPair field_175843_q = McMappingDatabase.getSRG("field_175843_q");

	/**
	 * <p>
	 * Name: generateRoomGraph
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_175836_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$MonumentBuilding.func_175836_a");

}
