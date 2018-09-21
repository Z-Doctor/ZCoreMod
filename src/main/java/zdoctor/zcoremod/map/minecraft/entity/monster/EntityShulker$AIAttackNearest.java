package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityShulker$AIAttackNearest {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi$d";
		else
			return "net/minecraft/entity/monster/EntityShulker$AIAttackNearest";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi$d";
		else
			return "EntityShulker$AIAttackNearest";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladi$d;";
		else
			return "Lnet/minecraft/entity/monster/EntityShulker$AIAttackNearest;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityShulker$AIAttackNearest.func_75250_a");

	/**
	 * <p>
	 * Name: getTargetableArea
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_188511_a = McMappingDatabase.getSRG("EntityShulker$AIAttackNearest.func_188511_a");

}
