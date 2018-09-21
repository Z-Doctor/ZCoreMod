package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldSavedDataCallableSave {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bes";
		else
			return "net/minecraft/world/storage/WorldSavedDataCallableSave";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bes";
		else
			return "WorldSavedDataCallableSave";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbes;";
		else
			return "Lnet/minecraft/world/storage/WorldSavedDataCallableSave;";
	}

	/**
	 * <p>
	 * Name: data
	 * </p>
	 */
	public static McObfPair field_186338_a = McMappingDatabase.getSRG("field_186338_a");

}
