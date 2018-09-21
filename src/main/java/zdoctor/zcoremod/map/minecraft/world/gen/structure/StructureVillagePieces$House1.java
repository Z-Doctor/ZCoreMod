package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces$House1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$a";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces$House1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$a";
		else
			return "StructureVillagePieces$House1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb$a;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces$House1;";
	}

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureVillagePieces$Start;Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureVillagePieces$House1;]
	 * </p>
	 */
	public static McObfPair func_175850_a = McMappingDatabase.getSRG("StructureVillagePieces$House1.func_175850_a");

	/**
	 * <p>
	 * Name: chooseProfession
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_180779_c = McMappingDatabase.getSRG("StructureVillagePieces$House1.func_180779_c");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureVillagePieces$House1.func_74875_a");

}
