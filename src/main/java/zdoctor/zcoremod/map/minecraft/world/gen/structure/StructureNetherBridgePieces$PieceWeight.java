package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureNetherBridgePieces$PieceWeight {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$n";
		else
			return "net/minecraft/world/gen/structure/StructureNetherBridgePieces$PieceWeight";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn$n";
		else
			return "StructureNetherBridgePieces$PieceWeight";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbn$n;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$PieceWeight;";
	}

	/**
	 * <p>
	 * Name: placeCount
	 * </p>
	 */
	public static McObfPair field_78827_c = McMappingDatabase.getSRG("field_78827_c");

	/**
	 * <p>
	 * Name: weightClass
	 * </p>
	 */
	public static McObfPair field_78828_a = McMappingDatabase.getSRG("field_78828_a");

	/**
	 * <p>
	 * Name: maxPlaceCount
	 * </p>
	 */
	public static McObfPair field_78824_d = McMappingDatabase.getSRG("field_78824_d");

	/**
	 * <p>
	 * Name: weight
	 * </p>
	 */
	public static McObfPair field_78826_b = McMappingDatabase.getSRG("field_78826_b");

	/**
	 * <p>
	 * Name: doPlace
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_78822_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$PieceWeight.func_78822_a");

	/**
	 * <p>
	 * Name: isValid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_78823_a = McMappingDatabase.getSRG("StructureNetherBridgePieces$PieceWeight.func_78823_a");

	/**
	 * <p>
	 * Name: allowInRow
	 * </p>
	 */
	public static McObfPair field_78825_e = McMappingDatabase.getSRG("field_78825_e");

}
