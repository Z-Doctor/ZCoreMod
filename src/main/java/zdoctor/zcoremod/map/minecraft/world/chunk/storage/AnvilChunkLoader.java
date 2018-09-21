package zdoctor.zcoremod.map.minecraft.world.chunk.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AnvilChunkLoader {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aye";
		else
			return "net/minecraft/world/chunk/storage/AnvilChunkLoader";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aye";
		else
			return "AnvilChunkLoader";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laye;";
		else
			return "Lnet/minecraft/world/chunk/storage/AnvilChunkLoader;";
	}

	/**
	 * <p>
	 * Name: readWorldEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;Z)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186051_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_186051_a");

	/**
	 * <p>
	 * Name: addChunkToPending
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75824_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_75824_a");

	/**
	 * <p>
	 * Name: writeChunkData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/ChunkPos;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_183013_b = McMappingDatabase.getSRG("AnvilChunkLoader.func_183013_b");

	/**
	 * <p>
	 * Name: writeNextIO
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75814_c = McMappingDatabase.getSRG("AnvilChunkLoader.func_75814_c");

	/**
	 * <p>
	 * Name: checkedReadChunkFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;IILnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_75822_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_75822_a");

	/**
	 * <p>
	 * Name: readChunkEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;Lnet/minecraft/world/chunk/Chunk;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186050_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_186050_a");

	/**
	 * <p>
	 * Name: chunkSaveLocation
	 * </p>
	 */
	public static McObfPair field_75825_d = McMappingDatabase.getSRG("field_75825_d");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151505_a = McMappingDatabase.getSRG("field_151505_a");

	/**
	 * <p>
	 * Name: flush
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75818_b = McMappingDatabase.getSRG("AnvilChunkLoader.func_75818_b");

	/**
	 * <p>
	 * Name: createEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186053_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_186053_a");

	/**
	 * <p>
	 * Name: spawnEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_186052_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_186052_a");

	/**
	 * <p>
	 * Name: chunkTick
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75817_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_75817_a");

	/**
	 * <p>
	 * Name: isChunkGeneratedAt
	 * </p>
	 * <p>
	 * Desc: [(II)Z]
	 * </p>
	 */
	public static McObfPair func_191063_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_191063_a");

	/**
	 * <p>
	 * Name: saveExtraChunkData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_75819_b = McMappingDatabase.getSRG("AnvilChunkLoader.func_75819_b");

	/**
	 * <p>
	 * Name: chunksToSave
	 * </p>
	 */
	public static McObfPair field_75828_a = McMappingDatabase.getSRG("field_75828_a");

	/**
	 * <p>
	 * Name: writeChunkToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/chunk/Chunk;Lnet/minecraft/world/World;Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_75820_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_75820_a");

	/**
	 * <p>
	 * Name: saveChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/world/chunk/Chunk;)V]
	 * </p>
	 */
	public static McObfPair func_75816_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_75816_a");

	/**
	 * <p>
	 * Name: readWorldEntityPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;DDDZ)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_186054_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_186054_a");

	/**
	 * <p>
	 * Name: fixer
	 * </p>
	 */
	public static McObfPair field_193416_e = McMappingDatabase.getSRG("field_193416_e");

	/**
	 * <p>
	 * Name: registerFixes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189889_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_189889_a");

	/**
	 * <p>
	 * Name: readChunkFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_75823_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_75823_a");

	/**
	 * <p>
	 * Name: loadChunk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;II)Lnet/minecraft/world/chunk/Chunk;]
	 * </p>
	 */
	public static McObfPair func_75815_a = McMappingDatabase.getSRG("AnvilChunkLoader.func_75815_a");

	/**
	 * <p>
	 * Name: flushing
	 * </p>
	 */
	public static McObfPair field_183014_e = McMappingDatabase.getSRG("field_183014_e");

	/**
	 * <p>
	 * Name: chunksBeingSaved
	 * </p>
	 */
	public static McObfPair field_193415_c = McMappingDatabase.getSRG("field_193415_c");

}
