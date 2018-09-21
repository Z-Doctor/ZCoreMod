package zdoctor.zcoremod.map.minecraft.world.biome;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Biome$SpawnListEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anh$c";
		else
			return "net/minecraft/world/biome/Biome$SpawnListEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anh$c";
		else
			return "Biome$SpawnListEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanh$c;";
		else
			return "Lnet/minecraft/world/biome/Biome$SpawnListEntry;";
	}

	/**
	 * <p>
	 * Name: maxGroupCount
	 * </p>
	 */
	public static McObfPair field_76299_d = McMappingDatabase.getSRG("field_76299_d");

	/**
	 * <p>
	 * Name: minGroupCount
	 * </p>
	 */
	public static McObfPair field_76301_c = McMappingDatabase.getSRG("field_76301_c");

	/**
	 * <p>
	 * Name: entityClass
	 * </p>
	 */
	public static McObfPair field_76300_b = McMappingDatabase.getSRG("field_76300_b");

}
