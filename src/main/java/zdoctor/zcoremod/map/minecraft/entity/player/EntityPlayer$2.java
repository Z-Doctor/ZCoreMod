package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPlayer$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed$2";
		else
			return "net/minecraft/entity/player/EntityPlayer$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed$2";
		else
			return "EntityPlayer$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laed$2;";
		else
			return "Lnet/minecraft/entity/player/EntityPlayer$2;";
	}

}
