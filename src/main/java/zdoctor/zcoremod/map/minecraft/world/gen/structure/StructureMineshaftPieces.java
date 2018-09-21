package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureMineshaftPieces {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbk";
		else
			return "net/minecraft/world/gen/structure/StructureMineshaftPieces";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbk";
		else
			return "StructureMineshaftPieces";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbk;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureMineshaftPieces;";
	}

	/**
	 * <p>
	 * Name: generateAndAddPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureMineshaftPieces$Peice;]
	 * </p>
	 */
	public static McObfPair func_189938_b = McMappingDatabase.getSRG("StructureMineshaftPieces.func_189938_b");

	/**
	 * <p>
	 * Name: registerStructurePieces
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_143048_a = McMappingDatabase.getSRG("StructureMineshaftPieces.func_143048_a");

	/**
	 * <p>
	 * Name: createRandomShaftPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;ILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)Lnet/minecraft/world/gen/structure/StructureMineshaftPieces$Peice;]
	 * </p>
	 */
	public static McObfPair func_189940_a = McMappingDatabase.getSRG("StructureMineshaftPieces.func_189940_a");

}
