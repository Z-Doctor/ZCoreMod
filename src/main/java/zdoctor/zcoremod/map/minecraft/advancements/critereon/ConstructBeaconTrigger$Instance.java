package zdoctor.zcoremod.map.minecraft.advancements.critereon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ConstructBeaconTrigger$Instance {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "y$b";
		else
			return "net/minecraft/advancements/critereon/ConstructBeaconTrigger$Instance";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "y$b";
		else
			return "ConstructBeaconTrigger$Instance";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ly$b;";
		else
			return "Lnet/minecraft/advancements/critereon/ConstructBeaconTrigger$Instance;";
	}

	/**
	 * <p>
	 * Name: level
	 * </p>
	 */
	public static McObfPair field_192253_a = McMappingDatabase.getSRG("field_192253_a");

	/**
	 * <p>
	 * Name: test
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityBeacon;)Z]
	 * </p>
	 */
	public static McObfPair func_192252_a = McMappingDatabase.getSRG("ConstructBeaconTrigger$Instance.func_192252_a");

}
