package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Teleporter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anc";
		else
			return "net/minecraft/world/Teleporter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "anc";
		else
			return "Teleporter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lanc;";
		else
			return "Lnet/minecraft/world/Teleporter;";
	}

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_85192_a = McMappingDatabase.getSRG("field_85192_a");

	/**
	 * <p>
	 * Name: placeInPortal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_180266_a = McMappingDatabase.getSRG("Teleporter.func_180266_a");

	/**
	 * <p>
	 * Name: makePortal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_85188_a = McMappingDatabase.getSRG("Teleporter.func_85188_a");

	/**
	 * <p>
	 * Name: removeStalePortalLocations
	 * </p>
	 * <p>
	 * Desc: [(J)V]
	 * </p>
	 */
	public static McObfPair func_85189_a = McMappingDatabase.getSRG("Teleporter.func_85189_a");

	/**
	 * <p>
	 * Name: random
	 * </p>
	 */
	public static McObfPair field_77187_a = McMappingDatabase.getSRG("field_77187_a");

	/**
	 * <p>
	 * Name: placeInExistingPortal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;F)Z]
	 * </p>
	 */
	public static McObfPair func_180620_b = McMappingDatabase.getSRG("Teleporter.func_180620_b");

	/**
	 * <p>
	 * Name: destinationCoordinateCache
	 * </p>
	 */
	public static McObfPair field_85191_c = McMappingDatabase.getSRG("field_85191_c");

}
