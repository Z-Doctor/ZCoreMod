package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ColorizerFoliage {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amq";
		else
			return "net/minecraft/world/ColorizerFoliage";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amq";
		else
			return "ColorizerFoliage";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamq;";
		else
			return "Lnet/minecraft/world/ColorizerFoliage;";
	}

	/**
	 * <p>
	 * Name: getFoliageColorBirch
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77469_b = McMappingDatabase.getSRG("ColorizerFoliage.func_77469_b");

	/**
	 * <p>
	 * Name: getFoliageColorPine
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77466_a = McMappingDatabase.getSRG("ColorizerFoliage.func_77466_a");

	/**
	 * <p>
	 * Name: foliageBuffer
	 * </p>
	 */
	public static McObfPair field_77471_a = McMappingDatabase.getSRG("field_77471_a");

	/**
	 * <p>
	 * Name: getFoliageColorBasic
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77468_c = McMappingDatabase.getSRG("ColorizerFoliage.func_77468_c");

	/**
	 * <p>
	 * Name: getFoliageColor
	 * </p>
	 * <p>
	 * Desc: [(DD)I]
	 * </p>
	 */
	public static McObfPair func_77470_a = McMappingDatabase.getSRG("ColorizerFoliage.func_77470_a");

	/**
	 * <p>
	 * Name: setFoliageBiomeColorizer
	 * </p>
	 * <p>
	 * Desc: [([I)V]
	 * </p>
	 */
	public static McObfPair func_77467_a = McMappingDatabase.getSRG("ColorizerFoliage.func_77467_a");

}
