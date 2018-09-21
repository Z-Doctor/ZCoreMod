package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractIllager$IllagerArmPose {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aco$a";
		else
			return "net/minecraft/entity/monster/AbstractIllager$IllagerArmPose";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aco$a";
		else
			return "AbstractIllager$IllagerArmPose";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laco$a;";
		else
			return "Lnet/minecraft/entity/monster/AbstractIllager$IllagerArmPose;";
	}

}
