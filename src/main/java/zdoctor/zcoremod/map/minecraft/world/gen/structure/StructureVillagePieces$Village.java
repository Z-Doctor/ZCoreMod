package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces$Village {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$n";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces$Village";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$n";
		else
			return "StructureVillagePieces$Village";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb$n;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces$Village;";
	}

	/**
	 * <p>
	 * Name: isZombieInfested
	 * </p>
	 */
	public static McObfPair field_189929_i = McMappingDatabase.getSRG("field_189929_i");

	/**
	 * <p>
	 * Name: chooseProfession
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_180779_c = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_180779_c");

	/**
	 * <p>
	 * Name: biomeDoor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/BlockDoor;]
	 * </p>
	 */
	public static McObfPair func_189925_i = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_189925_i");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_143012_a");

	/**
	 * <p>
	 * Name: replaceAirAndLiquidDownwards
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/block/state/IBlockState;IIILnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_175808_b = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_175808_b");

	/**
	 * <p>
	 * Name: structureType
	 * </p>
	 */
	public static McObfPair field_189928_h = McMappingDatabase.getSRG("field_189928_h");

	/**
	 * <p>
	 * Name: villagersSpawned
	 * </p>
	 */
	public static McObfPair field_74896_a = McMappingDatabase.getSRG("field_74896_a");

	/**
	 * <p>
	 * Name: getNextComponentPP
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;II)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74894_b = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_74894_b");

	/**
	 * <p>
	 * Name: createVillageDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_189927_a = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_189927_a");

	/**
	 * <p>
	 * Name: setStructureType
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_189924_a = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_189924_a");

	/**
	 * <p>
	 * Name: getNextComponentNN
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;II)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74891_a = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_74891_a");

	/**
	 * <p>
	 * Name: getBiomeSpecificBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_175847_a = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_175847_a");

	/**
	 * <p>
	 * Name: averageGroundLvl
	 * </p>
	 */
	public static McObfPair field_143015_k = McMappingDatabase.getSRG("field_143015_k");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_143011_b");

	/**
	 * <p>
	 * Name: spawnVillagers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIII)V]
	 * </p>
	 */
	public static McObfPair func_74893_a = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_74893_a");

	/**
	 * <p>
	 * Name: getAverageGroundLevel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)I]
	 * </p>
	 */
	public static McObfPair func_74889_b = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_74889_b");

	/**
	 * <p>
	 * Name: placeTorch
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/EnumFacing;IIILnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_189926_a = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_189926_a");

	/**
	 * <p>
	 * Name: canVillageGoDeeper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74895_a = McMappingDatabase.getSRG("StructureVillagePieces$Village.func_74895_a");

}
