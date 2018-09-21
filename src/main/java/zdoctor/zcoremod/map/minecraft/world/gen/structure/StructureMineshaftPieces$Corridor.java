package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureMineshaftPieces$Corridor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbk$a";
		else
			return "net/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbk$a";
		else
			return "StructureMineshaftPieces$Corridor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbk$a;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureMineshaftPieces$Corridor;";
	}

	/**
	 * <p>
	 * Name: spawnerPlaced
	 * </p>
	 */
	public static McObfPair field_74957_c = McMappingDatabase.getSRG("field_74957_c");

	/**
	 * <p>
	 * Name: generateChest
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_186167_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Corridor.func_186167_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureMineshaftPieces$Corridor.func_143011_b");

	/**
	 * <p>
	 * Name: placeCobWeb
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;FIII)V]
	 * </p>
	 */
	public static McObfPair func_189922_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Corridor.func_189922_a");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Corridor.func_143012_a");

	/**
	 * <p>
	 * Name: sectionCount
	 * </p>
	 */
	public static McObfPair field_74955_d = McMappingDatabase.getSRG("field_74955_d");

	/**
	 * <p>
	 * Name: findCorridorSize
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_175814_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Corridor.func_175814_a");

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Corridor.func_74861_a");

	/**
	 * <p>
	 * Name: hasSpiders
	 * </p>
	 */
	public static McObfPair field_74956_b = McMappingDatabase.getSRG("field_74956_b");

	/**
	 * <p>
	 * Name: placeSupport
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIILjava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_189921_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Corridor.func_189921_a");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Corridor.func_74875_a");

	/**
	 * <p>
	 * Name: hasRails
	 * </p>
	 */
	public static McObfPair field_74958_a = McMappingDatabase.getSRG("field_74958_a");

}
