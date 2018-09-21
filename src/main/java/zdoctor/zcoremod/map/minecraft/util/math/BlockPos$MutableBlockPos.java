package zdoctor.zcoremod.map.minecraft.util.math;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockPos$MutableBlockPos {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et$a";
		else
			return "net/minecraft/util/math/BlockPos$MutableBlockPos";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "et$a";
		else
			return "BlockPos$MutableBlockPos";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Let$a;";
		else
			return "Lnet/minecraft/util/math/BlockPos$MutableBlockPos;";
	}

	/**
	 * <p>
	 * Name: offset
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;I)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177967_a = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_177967_a");

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/Rotation;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_190942_a = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_190942_a");

	/**
	 * <p>
	 * Name: toImmutable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_185334_h = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_185334_h");

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_177997_b = McMappingDatabase.getSRG("field_177997_b");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_177996_d = McMappingDatabase.getSRG("field_177996_d");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189533_g = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_189533_g");

	/**
	 * <p>
	 * Name: setY
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_185336_p = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_185336_p");

	/**
	 * <p>
	 * Name: getX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177958_n = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_177958_n");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;I)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189534_c = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_189534_c");

	/**
	 * <p>
	 * Name: getZ
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177952_p = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_177952_p");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189532_c = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_189532_c");

	/**
	 * <p>
	 * Name: move
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189536_c = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_189536_c");

	/**
	 * <p>
	 * Name: getY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177956_o = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_177956_o");

	/**
	 * <p>
	 * Name: crossProduct
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/Vec3i;)Lnet/minecraft/util/math/Vec3i;]
	 * </p>
	 */
	public static McObfPair func_177955_d = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_177955_d");

	/**
	 * <p>
	 * Name: y
	 * </p>
	 */
	public static McObfPair field_177998_c = McMappingDatabase.getSRG("field_177998_c");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_189535_a = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_189535_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(DDD)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177963_a = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_177963_a");

	/**
	 * <p>
	 * Name: add
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_177982_a = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_177982_a");

	/**
	 * <p>
	 * Name: setPos
	 * </p>
	 * <p>
	 * Desc: [(III)Lnet/minecraft/util/math/BlockPos$MutableBlockPos;]
	 * </p>
	 */
	public static McObfPair func_181079_c = McMappingDatabase.getSRG("BlockPos$MutableBlockPos.func_181079_c");

}
