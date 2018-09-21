package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IEntityLivingData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vs";
		else
			return "net/minecraft/entity/IEntityLivingData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vs";
		else
			return "IEntityLivingData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvs;";
		else
			return "Lnet/minecraft/entity/IEntityLivingData;";
	}

}
