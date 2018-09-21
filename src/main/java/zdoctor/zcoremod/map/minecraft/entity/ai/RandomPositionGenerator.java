package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RandomPositionGenerator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zl";
		else
			return "net/minecraft/entity/ai/RandomPositionGenerator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zl";
		else
			return "RandomPositionGenerator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzl;";
		else
			return "Lnet/minecraft/entity/ai/RandomPositionGenerator;";
	}

	/**
	 * <p>
	 * Name: findRandomTargetBlockTowards
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75464_a = McMappingDatabase.getSRG("RandomPositionGenerator.func_75464_a");

	/**
	 * <p>
	 * Name: findRandomTargetBlockAwayFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75461_b = McMappingDatabase.getSRG("RandomPositionGenerator.func_75461_b");

	/**
	 * <p>
	 * Name: getLandPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;II)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_191377_b = McMappingDatabase.getSRG("RandomPositionGenerator.func_191377_b");

	/**
	 * <p>
	 * Name: findRandomTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;II)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75463_a = McMappingDatabase.getSRG("RandomPositionGenerator.func_75463_a");

	/**
	 * <p>
	 * Name: findRandomTargetBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_75462_c = McMappingDatabase.getSRG("RandomPositionGenerator.func_75462_c");

	/**
	 * <p>
	 * Name: isWaterDestination
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityCreature;)Z]
	 * </p>
	 */
	public static McObfPair func_191380_b = McMappingDatabase.getSRG("RandomPositionGenerator.func_191380_b");

	/**
	 * <p>
	 * Name: generateRandomPos
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityCreature;IILnet/minecraft/util/math/Vec3d;Z)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_191379_a = McMappingDatabase.getSRG("RandomPositionGenerator.func_191379_a");

	/**
	 * <p>
	 * Name: moveAboveSolid
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityCreature;)Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_191378_a = McMappingDatabase.getSRG("RandomPositionGenerator.func_191378_a");

	/**
	 * <p>
	 * Name: staticVector
	 * </p>
	 */
	public static McObfPair field_75465_a = McMappingDatabase.getSRG("field_75465_a");

}
