package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldServerDemo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oi";
		else
			return "net/minecraft/world/WorldServerDemo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "oi";
		else
			return "WorldServerDemo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Loi;";
		else
			return "Lnet/minecraft/world/WorldServerDemo;";
	}

	/**
	 * <p>
	 * Name: DEMO_WORLD_SEED
	 * </p>
	 */
	public static McObfPair field_73072_L = McMappingDatabase.getSRG("field_73072_L");

	/**
	 * <p>
	 * Name: DEMO_WORLD_SETTINGS
	 * </p>
	 */
	public static McObfPair field_73071_a = McMappingDatabase.getSRG("field_73071_a");

}
