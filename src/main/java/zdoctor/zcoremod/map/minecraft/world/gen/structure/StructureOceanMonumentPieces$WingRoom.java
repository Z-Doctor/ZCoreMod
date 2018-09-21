package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonumentPieces$WingRoom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$u";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonumentPieces$WingRoom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$u";
		else
			return "StructureOceanMonumentPieces$WingRoom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbp$u;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$WingRoom;";
	}

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$WingRoom.func_74875_a");

	/**
	 * <p>
	 * Name: mainDesign
	 * </p>
	 */
	public static McObfPair field_175834_o = McMappingDatabase.getSRG("field_175834_o");

}
