package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$1";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$1";
		else
			return "StructureStrongholdPieces$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$1;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$1;";
	}

	/**
	 * <p>
	 * Name: canSpawnMoreStructuresOfType
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_75189_a = McMappingDatabase.getSRG("StructureStrongholdPieces$1.func_75189_a");

}
