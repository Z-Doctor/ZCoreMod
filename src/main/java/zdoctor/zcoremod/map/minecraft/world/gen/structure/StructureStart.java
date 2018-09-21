package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bby";
		else
			return "net/minecraft/world/gen/structure/StructureStart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bby";
		else
			return "StructureStart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbby;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStart;";
	}

	/**
	 * <p>
	 * Name: notifyPostProcessAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;)V]
	 * </p>
	 */
	public static McObfPair func_175787_b = McMappingDatabase.getSRG("StructureStart.func_175787_b");

	/**
	 * <p>
	 * Name: chunkPosX
	 * </p>
	 */
	public static McObfPair field_143024_c = McMappingDatabase.getSRG("field_143024_c");

	/**
	 * <p>
	 * Name: readStructureComponentsFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143020_a = McMappingDatabase.getSRG("StructureStart.func_143020_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143022_a = McMappingDatabase.getSRG("StructureStart.func_143022_a");

	/**
	 * <p>
	 * Name: chunkPosZ
	 * </p>
	 */
	public static McObfPair field_143023_d = McMappingDatabase.getSRG("field_143023_d");

	/**
	 * <p>
	 * Name: markAvailableHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;I)V]
	 * </p>
	 */
	public static McObfPair func_75067_a = McMappingDatabase.getSRG("StructureStart.func_75067_a");

	/**
	 * <p>
	 * Name: getChunkPosZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_143018_f = McMappingDatabase.getSRG("StructureStart.func_143018_f");

	/**
	 * <p>
	 * Name: generateStructure
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V]
	 * </p>
	 */
	public static McObfPair func_75068_a = McMappingDatabase.getSRG("StructureStart.func_75068_a");

	/**
	 * <p>
	 * Name: components
	 * </p>
	 */
	public static McObfPair field_75075_a = McMappingDatabase.getSRG("field_75075_a");

	/**
	 * <p>
	 * Name: getComponents
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_186161_c = McMappingDatabase.getSRG("StructureStart.func_186161_c");

	/**
	 * <p>
	 * Name: writeStructureComponentsToNBT
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_143021_a = McMappingDatabase.getSRG("StructureStart.func_143021_a");

	/**
	 * <p>
	 * Name: isValidForPostProcess
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175788_a = McMappingDatabase.getSRG("StructureStart.func_175788_a");

	/**
	 * <p>
	 * Name: readFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_143017_b = McMappingDatabase.getSRG("StructureStart.func_143017_b");

	/**
	 * <p>
	 * Name: isSizeableStructure
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75069_d = McMappingDatabase.getSRG("StructureStart.func_75069_d");

	/**
	 * <p>
	 * Name: boundingBox
	 * </p>
	 */
	public static McObfPair field_75074_b = McMappingDatabase.getSRG("field_75074_b");

	/**
	 * <p>
	 * Name: getBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/gen/structure/StructureBoundingBox;]
	 * </p>
	 */
	public static McObfPair func_75071_a = McMappingDatabase.getSRG("StructureStart.func_75071_a");

	/**
	 * <p>
	 * Name: setRandomHeight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;II)V]
	 * </p>
	 */
	public static McObfPair func_75070_a = McMappingDatabase.getSRG("StructureStart.func_75070_a");

	/**
	 * <p>
	 * Name: updateBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75072_c = McMappingDatabase.getSRG("StructureStart.func_75072_c");

	/**
	 * <p>
	 * Name: getChunkPosX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_143019_e = McMappingDatabase.getSRG("StructureStart.func_143019_e");

}
