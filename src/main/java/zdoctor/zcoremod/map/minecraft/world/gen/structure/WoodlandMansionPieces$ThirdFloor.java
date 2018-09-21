package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WoodlandMansionPieces$ThirdFloor {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$h";
		else
			return "net/minecraft/world/gen/structure/WoodlandMansionPieces$ThirdFloor";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcd$h";
		else
			return "WoodlandMansionPieces$ThirdFloor";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcd$h;";
		else
			return "Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$ThirdFloor;";
	}

}
