package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AbstractIllager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aco";
		else
			return "net/minecraft/entity/monster/AbstractIllager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aco";
		else
			return "AbstractIllager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laco;";
		else
			return "Lnet/minecraft/entity/monster/AbstractIllager;";
	}

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("AbstractIllager.func_70088_a");

	/**
	 * <p>
	 * Name: isAggressive
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_193078_a = McMappingDatabase.getSRG("AbstractIllager.func_193078_a");

	/**
	 * <p>
	 * Name: AGGRESSIVE
	 * </p>
	 */
	public static McObfPair field_193080_a = McMappingDatabase.getSRG("field_193080_a");

	/**
	 * <p>
	 * Name: getArmPose
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/AbstractIllager$IllagerArmPose;]
	 * </p>
	 */
	public static McObfPair func_193077_p = McMappingDatabase.getSRG("AbstractIllager.func_193077_p");

	/**
	 * <p>
	 * Name: setAggressive
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_193079_a = McMappingDatabase.getSRG("AbstractIllager.func_193079_a");

	/**
	 * <p>
	 * Name: getCreatureAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EnumCreatureAttribute;]
	 * </p>
	 */
	public static McObfPair func_70668_bt = McMappingDatabase.getSRG("AbstractIllager.func_70668_bt");

}
