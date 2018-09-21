package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChunkCache {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "and";
		else
			return "net/minecraft/world/ChunkCache";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "and";
		else
			return "ChunkCache";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Land;";
		else
			return "Lnet/minecraft/world/ChunkCache;";
	}

	/**
	 * <p>
	 * Name: getCombinedLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_175626_b = McMappingDatabase.getSRG("ChunkCache.func_175626_b");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_175627_a = McMappingDatabase.getSRG("ChunkCache.func_175627_a");

	/**
	 * <p>
	 * Name: chunkArray
	 * </p>
	 */
	public static McObfPair field_72817_c = McMappingDatabase.getSRG("field_72817_c");

	/**
	 * <p>
	 * Name: chunkX
	 * </p>
	 */
	public static McObfPair field_72818_a = McMappingDatabase.getSRG("field_72818_a");

	/**
	 * <p>
	 * Name: getLightForExt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175629_a = McMappingDatabase.getSRG("ChunkCache.func_175629_a");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_72806_N = McMappingDatabase.getSRG("ChunkCache.func_72806_N");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_72815_e = McMappingDatabase.getSRG("field_72815_e");

	/**
	 * <p>
	 * Name: getWorldType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_175624_G = McMappingDatabase.getSRG("ChunkCache.func_175624_G");

	/**
	 * <p>
	 * Name: getTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/chunk/Chunk$EnumCreateEntityType;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_190300_a = McMappingDatabase.getSRG("ChunkCache.func_190300_a");

	/**
	 * <p>
	 * Name: isAirBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175623_d = McMappingDatabase.getSRG("ChunkCache.func_175623_d");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_180494_b = McMappingDatabase.getSRG("ChunkCache.func_180494_b");

	/**
	 * <p>
	 * Name: empty
	 * </p>
	 */
	public static McObfPair field_72814_d = McMappingDatabase.getSRG("field_72814_d");

	/**
	 * <p>
	 * Name: chunkZ
	 * </p>
	 */
	public static McObfPair field_72816_b = McMappingDatabase.getSRG("field_72816_b");

	/**
	 * <p>
	 * Name: getTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_175625_s = McMappingDatabase.getSRG("ChunkCache.func_175625_s");

	/**
	 * <p>
	 * Name: getLightFor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/EnumSkyBlock;Lnet/minecraft/util/math/BlockPos;)I]
	 * </p>
	 */
	public static McObfPair func_175628_b = McMappingDatabase.getSRG("ChunkCache.func_175628_b");

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180495_p = McMappingDatabase.getSRG("ChunkCache.func_180495_p");

}
