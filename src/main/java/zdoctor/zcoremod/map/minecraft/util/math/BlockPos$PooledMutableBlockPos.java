package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPos$PooledMutableBlockPos {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et$b";
		else
			return "net/minecraft/util/math/BlockPos$PooledMutableBlockPos";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et$b";
		else
			return "BlockPos$PooledMutableBlockPos";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Let$b;";
		else
			return "Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;";
	}

	/**
	 * <p>
	 * Name: retain
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_185345_c = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_185345_c");

	/**
	 * <p>
	 * Name: released
	 * </p>
	 */
	public static McObfPair field_185350_f = McMappingDatabase.getSRG("field_185350_f");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;, (Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189536_c = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_189536_c");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;, (Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189533_g = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_189533_g");

	/**
	 * <p>
	 * Name: retain
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_185342_g = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_185342_g");

	/**
	 * <p>
	 * Name: retain
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_185346_s = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_185346_s");

	/**
	 * <p>
	 * Name: release
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_185344_t = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_185344_t");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;, (III)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_181079_c = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_181079_c");

	/**
	 * <p>
	 * Name: retain
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_185339_c = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_185339_c");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;, (DDD)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189532_c = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_189532_c");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;I)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;, (Lnet/minecraft/util/EnumFacing;I)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189534_c = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_189534_c");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/BlockPos$PooledMutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189535_a = McMappingDatabase.getSRG("BlockPos$PooledMutableBlockPos.func_189535_a");

	/**
	 * <p>
	 * Name: POOL
	 * </p>
	 */
	public static McObfPair field_185351_g = McMappingDatabase.getSRG("field_185351_g");

}
