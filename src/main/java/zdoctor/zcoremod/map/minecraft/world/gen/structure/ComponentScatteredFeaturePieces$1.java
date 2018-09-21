package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ComponentScatteredFeaturePieces$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$1";
		else
			return "net/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbr$1";
		else
			return "ComponentScatteredFeaturePieces$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbr$1;";
		else
			return "Lnet/minecraft/world/gen/structure/ComponentScatteredFeaturePieces$1;";
	}

}
