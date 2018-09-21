package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBlockAccess {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amy";
		else
			return "net/minecraft/world/IBlockAccess";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amy";
		else
			return "IBlockAccess";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamy;";
		else
			return "Lnet/minecraft/world/IBlockAccess;";
	}

	/**
	 * <p>
	 * Name: getBlockState
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;]
	 * </p>
	 */
	public static McObfPair func_180495_p = McMappingDatabase.getSRG("IBlockAccess.func_180495_p");

	/**
	 * <p>
	 * Name: getCombinedLight
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;I)I]
	 * </p>
	 */
	public static McObfPair func_175626_b = McMappingDatabase.getSRG("IBlockAccess.func_175626_b");

	/**
	 * <p>
	 * Name: getWorldType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/WorldType;]
	 * </p>
	 */
	public static McObfPair func_175624_G = McMappingDatabase.getSRG("IBlockAccess.func_175624_G");

	/**
	 * <p>
	 * Name: isAirBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_175623_d = McMappingDatabase.getSRG("IBlockAccess.func_175623_d");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_180494_b = McMappingDatabase.getSRG("IBlockAccess.func_180494_b");

	/**
	 * <p>
	 * Name: getStrongPower
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_175627_a = McMappingDatabase.getSRG("IBlockAccess.func_175627_a");

	/**
	 * <p>
	 * Name: getTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_175625_s = McMappingDatabase.getSRG("IBlockAccess.func_175625_s");

}
