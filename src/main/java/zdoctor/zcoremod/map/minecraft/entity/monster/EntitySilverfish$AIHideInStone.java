package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySilverfish$AIHideInStone {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adj$a";
		else
			return "net/minecraft/entity/monster/EntitySilverfish$AIHideInStone";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adj$a";
		else
			return "EntitySilverfish$AIHideInStone";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladj$a;";
		else
			return "Lnet/minecraft/entity/monster/EntitySilverfish$AIHideInStone;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntitySilverfish$AIHideInStone.func_75250_a");

	/**
	 * <p>
	 * Name: facing
	 * </p>
	 */
	public static McObfPair field_179483_b = McMappingDatabase.getSRG("field_179483_b");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntitySilverfish$AIHideInStone.func_75249_e");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntitySilverfish$AIHideInStone.func_75253_b");

	/**
	 * <p>
	 * Name: doMerge
	 * </p>
	 */
	public static McObfPair field_179484_c = McMappingDatabase.getSRG("field_179484_c");

}
