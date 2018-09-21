package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureMineshaftPieces$Cross {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbk$b";
		else
			return "net/minecraft/world/gen/structure/StructureMineshaftPieces$Cross";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbk$b";
		else
			return "StructureMineshaftPieces$Cross";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbk$b;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureMineshaftPieces$Cross;";
	}

	/**
	 * <p>
	 * Name: findCrossing
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_175813_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Cross.func_175813_a");

	/**
	 * <p>
	 * Name: placeSupportPillar
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIII)V]
	 * </p>
	 */
	public static McObfPair func_189923_b = McMappingDatabase.getSRG("StructureMineshaftPieces$Cross.func_189923_b");

	/**
	 * <p>
	 * Name: isMultipleFloors
	 * </p>
	 */
	public static McObfPair field_74952_b = McMappingDatabase.getSRG("field_74952_b");

	/**
	 * <p>
	 * Name: corridorDirection
	 * </p>
	 */
	public static McObfPair field_74953_a = McMappingDatabase.getSRG("field_74953_a");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Cross.func_74875_a");

	/**
	 * <p>
	 * Name: readStructureFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/gen/structure/template/TemplateManager;)V]
	 * </p>
	 */
	public static McObfPair func_143011_b = McMappingDatabase.getSRG("StructureMineshaftPieces$Cross.func_143011_b");

	/**
	 * <p>
	 * Name: writeStructureToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143012_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Cross.func_143012_a");

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureMineshaftPieces$Cross.func_74861_a");

}
