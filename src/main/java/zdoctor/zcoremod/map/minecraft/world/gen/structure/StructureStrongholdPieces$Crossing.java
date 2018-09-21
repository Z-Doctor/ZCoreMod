package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$Crossing {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$c";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$c";
		else
			return "StructureStrongholdPieces$Crossing";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$c;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing;";
	}

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureStrongholdPieces$Crossing.func_143011_b");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Crossing.func_74875_a");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Crossing;]
	 * </p>
	 */
	public static McObfPair func_175866_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Crossing.func_175866_a");

	/**
	 * <p>
	 * Name: leftHigh
	 * </p>
	 */
	public static McObfPair field_74997_c = McMappingDatabase.getSRG("field_74997_c");

	/**
	 * <p>
	 * Name: rightLow
	 * </p>
	 */
	public static McObfPair field_74995_d = McMappingDatabase.getSRG("field_74995_d");

	/**
	 * <p>
	 * Name: leftLow
	 * </p>
	 */
	public static McObfPair field_74996_b = McMappingDatabase.getSRG("field_74996_b");

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Crossing.func_74861_a");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Crossing.func_143012_a");

	/**
	 * <p>
	 * Name: rightHigh
	 * </p>
	 */
	public static McObfPair field_74999_h = McMappingDatabase.getSRG("field_74999_h");

}
