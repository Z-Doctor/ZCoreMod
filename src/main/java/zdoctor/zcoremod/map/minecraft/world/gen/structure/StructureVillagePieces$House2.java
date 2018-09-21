package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces$House2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$j";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces$House2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$j";
		else
			return "StructureVillagePieces$House2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb$j;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces$House2;";
	}

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureVillagePieces$House2.func_74875_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureVillagePieces$House2.func_143011_b");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$House2;]
	 * </p>
	 */
	public static McObfPair func_175855_a = McMappingDatabase.getSRG("StructureVillagePieces$House2.func_175855_a");

	/**
	 * <p>
	 * Name: chooseProfession
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_180779_c = McMappingDatabase.getSRG("StructureVillagePieces$House2.func_180779_c");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureVillagePieces$House2.func_143012_a");

	/**
	 * <p>
	 * Name: hasMadeChest
	 * </p>
	 */
	public static McObfPair field_74917_c = McMappingDatabase.getSRG("field_74917_c");

}
