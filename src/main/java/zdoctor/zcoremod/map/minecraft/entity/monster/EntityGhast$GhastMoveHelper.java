package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityGhast$GhastMoveHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acy$b";
		else
			return "net/minecraft/entity/monster/EntityGhast$GhastMoveHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acy$b";
		else
			return "EntityGhast$GhastMoveHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacy$b;";
		else
			return "Lnet/minecraft/entity/monster/EntityGhast$GhastMoveHelper;";
	}

	/**
	 * <p>
	 * Name: courseChangeCooldown
	 * </p>
	 */
	public static McObfPair field_179928_h = McMappingDatabase.getSRG("field_179928_h");

	/**
	 * <p>
	 * Name: parentEntity
	 * </p>
	 */
	public static McObfPair field_179927_g = McMappingDatabase.getSRG("field_179927_g");

	/**
	 * <p>
	 * Name: onUpdateMoveHelper
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75641_c = McMappingDatabase.getSRG("EntityGhast$GhastMoveHelper.func_75641_c");

	/**
	 * <p>
	 * Name: isNotColliding
	 * </p>
	 * <p>
	 * Desc: [(DDDD)Z]
	 * </p>
	 */
	public static McObfPair func_179926_b = McMappingDatabase.getSRG("EntityGhast$GhastMoveHelper.func_179926_b");

}
