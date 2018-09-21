package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonument$StartMonument {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbo$a";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonument$StartMonument";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbo$a";
		else
			return "StructureOceanMonument$StartMonument";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbo$a;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonument$StartMonument;";
	}

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143017_b = McMappingDatabase.getSRG("StructureOceanMonument$StartMonument.func_143017_b");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;II)V]
	 * </p>
	 */
	public static McObfPair func_175789_b = McMappingDatabase.getSRG("StructureOceanMonument$StartMonument.func_175789_b");

	/**
	 * <p>
	 * Name: processed
	 * </p>
	 */
	public static McObfPair field_175791_c = McMappingDatabase.getSRG("field_175791_c");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143022_a = McMappingDatabase.getSRG("StructureOceanMonument$StartMonument.func_143022_a");

	/**
	 * <p>
	 * Name: wasCreated
	 * </p>
	 */
	public static McObfPair field_175790_d = McMappingDatabase.getSRG("field_175790_d");

	/**
	 * <p>
	 * Name: generateStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_75068_a = McMappingDatabase.getSRG("StructureOceanMonument$StartMonument.func_75068_a");

	/**
	 * <p>
	 * Name: isValidForPostProcess
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175788_a = McMappingDatabase.getSRG("StructureOceanMonument$StartMonument.func_175788_a");

	/**
	 * <p>
	 * Name: notifyPostProcessAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;)V]
	 * </p>
	 */
	public static McObfPair func_175787_b = McMappingDatabase.getSRG("StructureOceanMonument$StartMonument.func_175787_b");

}
