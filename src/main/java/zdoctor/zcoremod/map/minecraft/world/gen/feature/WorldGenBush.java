package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenBush {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azl";
		else
			return "net/minecraft/world/gen/feature/WorldGenBush";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azl";
		else
			return "WorldGenBush";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazl;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenBush;";
	}

	/**
	 * <p>
	 * Name: block
	 * </p>
	 */
	public static McObfPair field_175908_a = McMappingDatabase.getSRG("field_175908_a");

	/**
	 * <p>
	 * Name: generate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z]
	 * </p>
	 */
	public static McObfPair func_180709_b = McMappingDatabase.getSRG("WorldGenBush.func_180709_b");

}
