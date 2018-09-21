package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Biome$BiomeProperties {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anh$a";
		else
			return "net/minecraft/world/biome/Biome$BiomeProperties";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anh$a";
		else
			return "Biome$BiomeProperties";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanh$a;";
		else
			return "Lnet/minecraft/world/biome/Biome$BiomeProperties;";
	}

	/**
	 * <p>
	 * Name: heightVariation
	 * </p>
	 */
	public static McObfPair field_185414_c = McMappingDatabase.getSRG("field_185414_c");

	/**
	 * <p>
	 * Name: rainfall
	 * </p>
	 */
	public static McObfPair field_185416_e = McMappingDatabase.getSRG("field_185416_e");

	/**
	 * <p>
	 * Name: enableRain
	 * </p>
	 */
	public static McObfPair field_185419_h = McMappingDatabase.getSRG("field_185419_h");

	/**
	 * <p>
	 * Name: setRainDisabled
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/Biome$BiomeProperties;]
	 * </p>
	 */
	public static McObfPair func_185396_a = McMappingDatabase.getSRG("Biome$BiomeProperties.func_185396_a");

	/**
	 * <p>
	 * Name: setSnowEnabled
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/biome/Biome$BiomeProperties;]
	 * </p>
	 */
	public static McObfPair func_185411_b = McMappingDatabase.getSRG("Biome$BiomeProperties.func_185411_b");

	/**
	 * <p>
	 * Name: setTemperature
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/world/biome/Biome$BiomeProperties;]
	 * </p>
	 */
	public static McObfPair func_185410_a = McMappingDatabase.getSRG("Biome$BiomeProperties.func_185410_a");

	/**
	 * <p>
	 * Name: setWaterColor
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/biome/Biome$BiomeProperties;]
	 * </p>
	 */
	public static McObfPair func_185402_a = McMappingDatabase.getSRG("Biome$BiomeProperties.func_185402_a");

	/**
	 * <p>
	 * Name: setRainfall
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/world/biome/Biome$BiomeProperties;]
	 * </p>
	 */
	public static McObfPair func_185395_b = McMappingDatabase.getSRG("Biome$BiomeProperties.func_185395_b");

	/**
	 * <p>
	 * Name: enableSnow
	 * </p>
	 */
	public static McObfPair field_185418_g = McMappingDatabase.getSRG("field_185418_g");

	/**
	 * <p>
	 * Name: setBaseBiome
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/world/biome/Biome$BiomeProperties;]
	 * </p>
	 */
	public static McObfPair func_185399_a = McMappingDatabase.getSRG("Biome$BiomeProperties.func_185399_a");

	/**
	 * <p>
	 * Name: baseBiomeRegName
	 * </p>
	 */
	public static McObfPair field_185420_i = McMappingDatabase.getSRG("field_185420_i");

	/**
	 * <p>
	 * Name: setBaseHeight
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/world/biome/Biome$BiomeProperties;]
	 * </p>
	 */
	public static McObfPair func_185398_c = McMappingDatabase.getSRG("Biome$BiomeProperties.func_185398_c");

	/**
	 * <p>
	 * Name: setHeightVariation
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/world/biome/Biome$BiomeProperties;]
	 * </p>
	 */
	public static McObfPair func_185400_d = McMappingDatabase.getSRG("Biome$BiomeProperties.func_185400_d");

	/**
	 * <p>
	 * Name: temperature
	 * </p>
	 */
	public static McObfPair field_185415_d = McMappingDatabase.getSRG("field_185415_d");

	/**
	 * <p>
	 * Name: waterColor
	 * </p>
	 */
	public static McObfPair field_185417_f = McMappingDatabase.getSRG("field_185417_f");

	/**
	 * <p>
	 * Name: biomeName
	 * </p>
	 */
	public static McObfPair field_185412_a = McMappingDatabase.getSRG("field_185412_a");

	/**
	 * <p>
	 * Name: baseHeight
	 * </p>
	 */
	public static McObfPair field_185413_b = McMappingDatabase.getSRG("field_185413_b");

}
