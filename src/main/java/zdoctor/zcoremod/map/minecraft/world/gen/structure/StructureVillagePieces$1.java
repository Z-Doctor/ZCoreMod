package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureVillagePieces$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$1";
		else
			return "net/minecraft/world/gen/structure/StructureVillagePieces$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcb$1";
		else
			return "StructureVillagePieces$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcb$1;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureVillagePieces$1;";
	}

}
