package zdoctor.zcoremod.map.minecraft.entity.ai;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAINearestAttackableTarget$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yw$2";
		else
			return "net/minecraft/entity/ai/EntityAINearestAttackableTarget$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "yw$2";
		else
			return "EntityAINearestAttackableTarget$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lyw$2;";
		else
			return "Lnet/minecraft/entity/ai/EntityAINearestAttackableTarget$2;";
	}

}
