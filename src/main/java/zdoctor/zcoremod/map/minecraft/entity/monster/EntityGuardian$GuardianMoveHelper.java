package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGuardian$GuardianMoveHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ada$c";
		else
			return "net/minecraft/entity/monster/EntityGuardian$GuardianMoveHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ada$c";
		else
			return "EntityGuardian$GuardianMoveHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lada$c;";
		else
			return "Lnet/minecraft/entity/monster/EntityGuardian$GuardianMoveHelper;";
	}

	/**
	 * <p>
	 * Name: onUpdateMoveHelper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75641_c = McMappingDatabase.getSRG("EntityGuardian$GuardianMoveHelper.func_75641_c");

	/**
	 * <p>
	 * Name: entityGuardian
	 * </p>
	 */
	public static McObfPair field_179930_g = McMappingDatabase.getSRG("field_179930_g");

}
