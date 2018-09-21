package zdoctor.zcoremod.map.minecraft.world.gen.layer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GenLayerBiome {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdk";
		else
			return "net/minecraft/world/gen/layer/GenLayerBiome";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdk";
		else
			return "GenLayerBiome";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdk;";
		else
			return "Lnet/minecraft/world/gen/layer/GenLayerBiome;";
	}

	/**
	 * <p>
	 * Name: getInts
	 * </p>
	 * <p>
	 * Desc: [(IIII)[I]
	 * </p>
	 */
	public static McObfPair func_75904_a = McMappingDatabase.getSRG("GenLayerBiome.func_75904_a");

	/**
	 * <p>
	 * Name: mediumBiomes
	 * </p>
	 */
	public static McObfPair field_151621_d = McMappingDatabase.getSRG("field_151621_d");

	/**
	 * <p>
	 * Name: coldBiomes
	 * </p>
	 */
	public static McObfPair field_151622_e = McMappingDatabase.getSRG("field_151622_e");

	/**
	 * <p>
	 * Name: warmBiomes
	 * </p>
	 */
	public static McObfPair field_151623_c = McMappingDatabase.getSRG("field_151623_c");

	/**
	 * <p>
	 * Name: iceBiomes
	 * </p>
	 */
	public static McObfPair field_151620_f = McMappingDatabase.getSRG("field_151620_f");

	/**
	 * <p>
	 * Name: settings
	 * </p>
	 */
	public static McObfPair field_175973_g = McMappingDatabase.getSRG("field_175973_g");

}
