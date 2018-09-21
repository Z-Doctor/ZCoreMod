package zdoctor.zcoremod.map.minecraft.world.gen.structure.template;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Template$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj$1";
		else
			return "net/minecraft/world/gen/structure/template/Template$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcj$1";
		else
			return "Template$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcj$1;";
		else
			return "Lnet/minecraft/world/gen/structure/template/Template$1;";
	}

}
