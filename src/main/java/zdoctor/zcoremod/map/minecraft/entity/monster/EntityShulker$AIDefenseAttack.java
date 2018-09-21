package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityShulker$AIDefenseAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi$c";
		else
			return "net/minecraft/entity/monster/EntityShulker$AIDefenseAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adi$c";
		else
			return "EntityShulker$AIDefenseAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladi$c;";
		else
			return "Lnet/minecraft/entity/monster/EntityShulker$AIDefenseAttack;";
	}

	/**
	 * <p>
	 * Name: getTargetableArea
	 * </p>
	 * <p>
	 * Desc: [(D)Lnet/minecraft/util/math/AxisAlignedBB;]
	 * </p>
	 */
	public static McObfPair func_188511_a = McMappingDatabase.getSRG("EntityShulker$AIDefenseAttack.func_188511_a");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityShulker$AIDefenseAttack.func_75250_a");

}
