package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenDoublePlant {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azq";
		else
			return "net/minecraft/world/gen/feature/WorldGenDoublePlant";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azq";
		else
			return "WorldGenDoublePlant";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazq;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenDoublePlant;";
	}

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenDoublePlant.func_180709_b");

	/**
	 * <p>
	 * Name: plantType
	 * </p>
	 */
	public static McObfPair field_150549_a = McMappingDatabase.getSRG("field_150549_a");

	/**
	 * <p>
	 * Name: setPlantType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/BlockDoublePlant$EnumPlantType;)V]
	 * </p>
	 */
	public static McObfPair func_180710_a = McMappingDatabase.getSRG("WorldGenDoublePlant.func_180710_a");

}
