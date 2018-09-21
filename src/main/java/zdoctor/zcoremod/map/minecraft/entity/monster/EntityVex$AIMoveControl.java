package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVex$AIMoveControl {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adp$c";
		else
			return "net/minecraft/entity/monster/EntityVex$AIMoveControl";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adp$c";
		else
			return "EntityVex$AIMoveControl";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladp$c;";
		else
			return "Lnet/minecraft/entity/monster/EntityVex$AIMoveControl;";
	}

	/**
	 * <p>
	 * Name: onUpdateMoveHelper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75641_c = McMappingDatabase.getSRG("EntityVex$AIMoveControl.func_75641_c");

}
