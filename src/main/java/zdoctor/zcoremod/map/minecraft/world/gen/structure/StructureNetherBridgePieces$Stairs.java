package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureNetherBridgePieces$Stairs {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$p";
		else
			return "net/minecraft/world/gen/structure/StructureNetherBridgePieces$Stairs";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$p";
		else
			return "StructureNetherBridgePieces$Stairs";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbn$p;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Stairs;";
	}

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Stairs.func_74875_a");

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Stairs.func_74861_a");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Stairs;]
	 * </p>
	 */
	public static McObfPair func_175872_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Stairs.func_175872_a");

}
