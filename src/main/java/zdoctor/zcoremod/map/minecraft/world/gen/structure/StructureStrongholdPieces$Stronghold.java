package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$Stronghold {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$p";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$p";
		else
			return "StructureStrongholdPieces$Stronghold";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$p;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold;";
	}

	/**
	 * <p>
	 * Name: getNextComponentX
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74989_b = McMappingDatabase.getSRG("StructureStrongholdPieces$Stronghold.func_74989_b");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Stronghold.func_143012_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureStrongholdPieces$Stronghold.func_143011_b");

	/**
	 * <p>
	 * Name: canStrongholdGoDeeper
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74991_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Stronghold.func_74991_a");

	/**
	 * <p>
	 * Name: entryDoor
	 * </p>
	 */
	public static McObfPair field_143013_d = McMappingDatabase.getSRG("field_143013_d");

	/**
	 * <p>
	 * Name: getNextComponentZ
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74987_c = McMappingDatabase.getSRG("StructureStrongholdPieces$Stronghold.func_74987_c");

	/**
	 * <p>
	 * Name: placeDoor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$Door;III)V]
	 * </p>
	 */
	public static McObfPair func_74990_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Stronghold.func_74990_a");

	/**
	 * <p>
	 * Name: getRandomDoor
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$Door;]
	 * </p>
	 */
	public static McObfPair func_74988_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Stronghold.func_74988_a");

	/**
	 * <p>
	 * Name: getNextComponentNormal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;Ljava/util/List;Ljava/util/Random;II)Lnet/minecraft/world/gen/structure/StructureComponent;]
	 * </p>
	 */
	public static McObfPair func_74986_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Stronghold.func_74986_a");

}
