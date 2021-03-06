package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$Prison {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$h";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$Prison";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$h";
		else
			return "StructureStrongholdPieces$Prison";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$h;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Prison;";
	}

	/**
	 * <p>
	 * Name: buildComponent
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_74861_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Prison.func_74861_a");

	/**
	 * <p>
	 * Name: createPiece
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;I)Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Prison;]
	 * </p>
	 */
	public static McObfPair func_175860_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Prison.func_175860_a");

	/**
	 * <p>
	 * Name: addComponentParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z]
	 * </p>
	 */
	public static McObfPair func_74875_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Prison.func_74875_a");

}
