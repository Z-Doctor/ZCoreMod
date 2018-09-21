package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGuardian$GuardianTargetSelector {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ada$b";
		else
			return "net/minecraft/entity/monster/EntityGuardian$GuardianTargetSelector";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ada$b";
		else
			return "EntityGuardian$GuardianTargetSelector";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lada$b;";
		else
			return "Lnet/minecraft/entity/monster/EntityGuardian$GuardianTargetSelector;";
	}

	/**
	 * <p>
	 * Name: parentEntity
	 * </p>
	 */
	public static McObfPair field_179916_a = McMappingDatabase.getSRG("field_179916_a");

}
