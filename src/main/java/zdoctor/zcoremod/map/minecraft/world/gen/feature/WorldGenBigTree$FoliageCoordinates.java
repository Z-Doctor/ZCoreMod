package zdoctor.zcoremod.map.minecraft.world.gen.feature;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldGenBigTree$FoliageCoordinates {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azh$a";
		else
			return "net/minecraft/world/gen/feature/WorldGenBigTree$FoliageCoordinates";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "azh$a";
		else
			return "WorldGenBigTree$FoliageCoordinates";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lazh$a;";
		else
			return "Lnet/minecraft/world/gen/feature/WorldGenBigTree$FoliageCoordinates;";
	}

	/**
	 * <p>
	 * Name: getBranchBase
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_177999_q = McMappingDatabase.getSRG("WorldGenBigTree$FoliageCoordinates.func_177999_q");

	/**
	 * <p>
	 * Name: branchBase
	 * </p>
	 */
	public static McObfPair field_178000_b = McMappingDatabase.getSRG("field_178000_b");

}
