package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$2";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$2";
		else
			return "StructureStrongholdPieces$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$2;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$2;";
	}

	/**
	 * <p>
	 * Name: canSpawnMoreStructuresOfType
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_75189_a = McMappingDatabase.getSRG("StructureStrongholdPieces$2.func_75189_a");

}
