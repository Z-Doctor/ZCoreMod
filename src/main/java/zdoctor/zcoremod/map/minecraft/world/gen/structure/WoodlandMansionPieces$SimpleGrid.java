package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansionPieces$SimpleGrid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$g";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$g";
		else
			return "WoodlandMansionPieces$SimpleGrid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcd$g;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$SimpleGrid;";
	}

	/**
	 * <p>
	 * Name: edgesTo
	 * </p>
	 * <p>
	 * Desc: [(III)Z]
	 * </p>
	 */
	public static McObfPair func_191147_b = McMappingDatabase.getSRG("WoodlandMansionPieces$SimpleGrid.func_191147_b");

	/**
	 * <p>
	 * Name: valueIfOutside
	 * </p>
	 */
	public static McObfPair field_191151_d = McMappingDatabase.getSRG("field_191151_d");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(III)V]
	 * </p>
	 */
	public static McObfPair func_191144_a = McMappingDatabase.getSRG("WoodlandMansionPieces$SimpleGrid.func_191144_a");

	/**
	 * <p>
	 * Name: set
	 * </p>
	 * <p>
	 * Desc: [(IIIII)V]
	 * </p>
	 */
	public static McObfPair func_191142_a = McMappingDatabase.getSRG("WoodlandMansionPieces$SimpleGrid.func_191142_a");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_191150_c = McMappingDatabase.getSRG("field_191150_c");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_191149_b = McMappingDatabase.getSRG("field_191149_b");

	/**
	 * <p>
	 * Name: get
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_191145_a = McMappingDatabase.getSRG("WoodlandMansionPieces$SimpleGrid.func_191145_a");

	/**
	 * <p>
	 * Name: grid
	 * </p>
	 */
	public static McObfPair field_191148_a = McMappingDatabase.getSRG("field_191148_a");

	/**
	 * <p>
	 * Name: setIf
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_191141_a = McMappingDatabase.getSRG("WoodlandMansionPieces$SimpleGrid.func_191141_a");

}
