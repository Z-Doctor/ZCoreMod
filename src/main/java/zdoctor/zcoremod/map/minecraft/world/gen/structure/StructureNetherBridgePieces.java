package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureNetherBridgePieces {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn";
		else
			return "net/minecraft/world/gen/structure/StructureNetherBridgePieces";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbn";
		else
			return "StructureNetherBridgePieces";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbn;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces;";
	}

	/**
	 * <p>
	 * Name: PRIMARY_COMPONENTS
	 * </p>
	 */
	public static McObfPair field_78742_a = McMappingDatabase.getSRG("field_78742_a");

	/**
	 * <p>
	 * Name: registerNetherFortressPieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_143049_a = McMappingDatabase.getSRG("StructureNetherBridgePieces.func_143049_a");

	/**
	 * <p>
	 * Name: SECONDARY_COMPONENTS
	 * </p>
	 */
	public static McObfPair field_78741_b = McMappingDatabase.getSRG("field_78741_b");

	/**
	 * <p>
	 * Name: findAndCreateBridgePieceFactory
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$PieceWeight;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureNetherBridgePieces$Piece;]
	 * </p>
	 */
	public static McObfPair func_175887_b = McMappingDatabase.getSRG("StructureNetherBridgePieces.func_175887_b");

}
