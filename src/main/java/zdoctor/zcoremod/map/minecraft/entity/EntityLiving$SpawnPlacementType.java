package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLiving$SpawnPlacementType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vq$a";
		else
			return "net/minecraft/entity/EntityLiving$SpawnPlacementType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vq$a";
		else
			return "EntityLiving$SpawnPlacementType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvq$a;";
		else
			return "Lnet/minecraft/entity/EntityLiving$SpawnPlacementType;";
	}

}
