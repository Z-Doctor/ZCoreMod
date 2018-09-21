package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySpider$AISpiderAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adn$a";
		else
			return "net/minecraft/entity/monster/EntitySpider$AISpiderAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adn$a";
		else
			return "EntitySpider$AISpiderAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladn$a;";
		else
			return "Lnet/minecraft/entity/monster/EntitySpider$AISpiderAttack;";
	}

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntitySpider$AISpiderAttack.func_75253_b");

	/**
	 * <p>
	 * Name: getAttackReachSqr
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)D]
	 * </p>
	 */
	public static McObfPair func_179512_a = McMappingDatabase.getSRG("EntitySpider$AISpiderAttack.func_179512_a");

}
