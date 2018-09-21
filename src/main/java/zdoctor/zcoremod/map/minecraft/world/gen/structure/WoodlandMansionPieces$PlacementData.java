package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansionPieces$PlacementData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$e";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansionPieces$PlacementData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$e";
		else
			return "WoodlandMansionPieces$PlacementData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcd$e;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$PlacementData;";
	}

	/**
	 * <p>
	 * Name: wallType
	 * </p>
	 */
	public static McObfPair field_191140_c = McMappingDatabase.getSRG("field_191140_c");

	/**
	 * <p>
	 * Name: rotation
	 * </p>
	 */
	public static McObfPair field_191138_a = McMappingDatabase.getSRG("field_191138_a");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_191139_b = McMappingDatabase.getSRG("field_191139_b");

}
