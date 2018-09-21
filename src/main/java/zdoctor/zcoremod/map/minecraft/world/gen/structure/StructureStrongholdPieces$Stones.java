package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$Stones {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$k";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$Stones";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$k";
		else
			return "StructureStrongholdPieces$Stones";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$k;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stones;";
	}

	/**
	 * <p>
	 * Name: selectBlocks
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;IIIZ)V]
	 * </p>
	 */
	public static McObfPair func_75062_a = McMappingDatabase.getSRG("StructureStrongholdPieces$Stones.func_75062_a");

}
