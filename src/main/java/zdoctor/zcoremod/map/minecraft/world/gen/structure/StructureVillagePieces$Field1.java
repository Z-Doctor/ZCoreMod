package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces$Field1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$b";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces$Field1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$b";
		else
			return "StructureVillagePieces$Field1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb$b;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces$Field1;";
	}

	/**
	 * <p>
	 * Name: getRandomCropType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/block/Block;]
	 * </p>
	 */
	public static McObfPair func_151559_a = McMappingDatabase.getSRG("StructureVillagePieces$Field1.func_151559_a");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureVillagePieces$Field1.func_143012_a");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$Field1;]
	 * </p>
	 */
	public static McObfPair func_175851_a = McMappingDatabase.getSRG("StructureVillagePieces$Field1.func_175851_a");

	/**
	 * <p>
	 * Name: cropTypeB
	 * </p>
	 */
	public static McObfPair field_82680_c = McMappingDatabase.getSRG("field_82680_c");

	/**
	 * <p>
	 * Name: cropTypeA
	 * </p>
	 */
	public static McObfPair field_82679_b = McMappingDatabase.getSRG("field_82679_b");

	/**
	 * <p>
	 * Name: cropTypeD
	 * </p>
	 */
	public static McObfPair field_82681_h = McMappingDatabase.getSRG("field_82681_h");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureVillagePieces$Field1.func_74875_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureVillagePieces$Field1.func_143011_b");

	/**
	 * <p>
	 * Name: cropTypeC
	 * </p>
	 */
	public static McObfPair field_82678_d = McMappingDatabase.getSRG("field_82678_d");

}
