package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenBirchTree {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azi";
		else
			return "net/minecraft/world/gen/feature/WorldGenBirchTree";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azi";
		else
			return "WorldGenBirchTree";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazi;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenBirchTree;";
	}

	/**
	 * <p>
	 * Name: LEAF
	 * </p>
	 */
	public static McObfPair field_181630_b = McMappingDatabase.getSRG("field_181630_b");

	/**
	 * <p>
	 * Name: LOG
	 * </p>
	 */
	public static McObfPair field_181629_a = McMappingDatabase.getSRG("field_181629_a");

	/**
	 * <p>
	 * Name: useExtraRandomHeight
	 * </p>
	 */
	public static McObfPair field_150531_a = McMappingDatabase.getSRG("field_150531_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenBirchTree.func_180709_b");

}
