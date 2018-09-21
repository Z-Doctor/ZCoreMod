package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPlayer$SleepResult {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed$a";
		else
			return "net/minecraft/entity/player/EntityPlayer$SleepResult";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed$a";
		else
			return "EntityPlayer$SleepResult";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laed$a;";
		else
			return "Lnet/minecraft/entity/player/EntityPlayer$SleepResult;";
	}

}
