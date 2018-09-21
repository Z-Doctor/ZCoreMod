package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureOceanMonumentPieces$SimpleRoom {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$s";
		else
			return "net/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbp$s";
		else
			return "StructureOceanMonumentPieces$SimpleRoom";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbp$s;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$SimpleRoom;";
	}

	/**
	 * <p>
	 * Name: mainDesign
	 * </p>
	 */
	public static McObfPair field_175833_o = McMappingDatabase.getSRG("field_175833_o");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureOceanMonumentPieces$SimpleRoom.func_74875_a");

}
