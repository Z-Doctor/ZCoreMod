package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureNetherBridgePieces$Throne {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$l";
		else
			return "net/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$l";
		else
			return "StructureNetherBridgePieces$Throne";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbn$l;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne;";
	}

	/**
	 * <p>
	 * Name: hasSpawner
	 * </p>
	 */
	public static McObfPair field_74976_a = McMappingDatabase.getSRG("field_74976_a");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Throne.func_143012_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureNetherBridgePieces$Throne.func_143011_b");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Throne;]
	 * </p>
	 */
	public static McObfPair func_175874_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Throne.func_175874_a");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Throne.func_74875_a");

}
