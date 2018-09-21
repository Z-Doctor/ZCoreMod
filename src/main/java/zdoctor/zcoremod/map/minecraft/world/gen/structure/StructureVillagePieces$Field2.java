package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces$Field2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$c";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces$Field2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$c";
		else
			return "StructureVillagePieces$Field2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb$c;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces$Field2;";
	}

	/**
	 * <p>
	 * Name: cropTypeA
	 * </p>
	 */
	public static McObfPair field_82675_b = McMappingDatabase.getSRG("field_82675_b");

	/**
	 * <p>
	 * Name: getRandomCropType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_151560_a = McMappingDatabase.getSRG("StructureVillagePieces$Field2.func_151560_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureVillagePieces$Field2.func_143011_b");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureVillagePieces$Field2.func_74875_a");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureVillagePieces$Field2.func_143012_a");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$Field2;]
	 * </p>
	 */
	public static McObfPair func_175852_a = McMappingDatabase.getSRG("StructureVillagePieces$Field2.func_175852_a");

	/**
	 * <p>
	 * Name: cropTypeB
	 * </p>
	 */
	public static McObfPair field_82676_c = McMappingDatabase.getSRG("field_82676_c");

}
