package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BiomeCache$Block {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ani$a";
		else
			return "net/minecraft/world/biome/BiomeCache$Block";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ani$a";
		else
			return "BiomeCache$Block";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lani$a;";
		else
			return "Lnet/minecraft/world/biome/BiomeCache$Block;";
	}

	/**
	 * <p>
	 * Name: x
	 * </p>
	 */
	public static McObfPair field_76888_d = McMappingDatabase.getSRG("field_76888_d");

	/**
	 * <p>
	 * Name: lastAccessTime
	 * </p>
	 */
	public static McObfPair field_76886_f = McMappingDatabase.getSRG("field_76886_f");

	/**
	 * <p>
	 * Name: getBiome
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/world/biome/Biome;]
	 * </p>
	 */
	public static McObfPair func_76885_a = McMappingDatabase.getSRG("BiomeCache$Block.func_76885_a");

	/**
	 * <p>
	 * Name: biomes
	 * </p>
	 */
	public static McObfPair field_76891_c = McMappingDatabase.getSRG("field_76891_c");

	/**
	 * <p>
	 * Name: z
	 * </p>
	 */
	public static McObfPair field_76889_e = McMappingDatabase.getSRG("field_76889_e");

}
