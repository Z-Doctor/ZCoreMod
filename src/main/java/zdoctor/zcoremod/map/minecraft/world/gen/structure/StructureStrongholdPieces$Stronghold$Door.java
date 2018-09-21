package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$Stronghold$Door {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$p$a";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$Door";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$p$a";
		else
			return "StructureStrongholdPieces$Stronghold$Door";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$p$a;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stronghold$Door;";
	}

}
