package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureNetherBridgePieces$Crossing3 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$a";
		else
			return "net/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$a";
		else
			return "StructureNetherBridgePieces$Crossing3";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbn$a;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3;";
	}

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Crossing3.func_74861_a");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Crossing3;]
	 * </p>
	 */
	public static McObfPair func_175885_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Crossing3.func_175885_a");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Crossing3.func_74875_a");

}
