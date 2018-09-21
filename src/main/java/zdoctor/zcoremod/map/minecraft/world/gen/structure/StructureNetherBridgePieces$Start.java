package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureNetherBridgePieces$Start {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$q";
		else
			return "net/minecraft/world/gen/structure/StructureNetherBridgePieces$Start";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$q";
		else
			return "StructureNetherBridgePieces$Start";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbn$q;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Start;";
	}

	/**
	 * <p>
	 * Name: primaryWeights
	 * </p>
	 */
	public static McObfPair field_74968_b = McMappingDatabase.getSRG("field_74968_b");

	/**
	 * <p>
	 * Name: lastPlaced
	 * </p>
	 */
	public static McObfPair field_74970_a = McMappingDatabase.getSRG("field_74970_a");

	/**
	 * <p>
	 * Name: secondaryWeights
	 * </p>
	 */
	public static McObfPair field_74969_c = McMappingDatabase.getSRG("field_74969_c");

	/**
	 * <p>
	 * Name: pendingChildren
	 * </p>
	 */
	public static McObfPair field_74967_d = McMappingDatabase.getSRG("field_74967_d");

}
