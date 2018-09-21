package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureNetherBridgePieces$Corridor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$h";
		else
			return "net/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$h";
		else
			return "StructureNetherBridgePieces$Corridor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbn$h;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor;";
	}

	/**
	 * <p>
	 * Name: chest
	 * </p>
	 */
	public static McObfPair field_111021_b = McMappingDatabase.getSRG("field_111021_b");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Corridor.func_74875_a");

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Corridor.func_74861_a");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Corridor;]
	 * </p>
	 */
	public static McObfPair func_175879_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Corridor.func_175879_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureNetherBridgePieces$Corridor.func_143011_b");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$Corridor.func_143012_a");

}
