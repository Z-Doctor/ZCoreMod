package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonumentPieces$XYDoubleRoomFitHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$b";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonumentPieces$XYDoubleRoomFitHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$b";
		else
			return "StructureOceanMonumentPieces$XYDoubleRoomFitHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbp$b;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$XYDoubleRoomFitHelper;";
	}

	/**
	 * <p>
	 * Name: fits
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$RoomDefinition;)Z]
	 * </p>
	 */
	public static McObfPair func_175969_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$XYDoubleRoomFitHelper.func_175969_a");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$RoomDefinition;Ljava/util/Random;)Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$Piece;]
	 * </p>
	 */
	public static McObfPair func_175968_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$XYDoubleRoomFitHelper.func_175968_a");

}
