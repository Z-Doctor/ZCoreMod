package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRabbit$AIEvilAttack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$a";
		else
			return "net/minecraft/entity/passive/EntityRabbit$AIEvilAttack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$a";
		else
			return "EntityRabbit$AIEvilAttack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaf$a;";
		else
			return "Lnet/minecraft/entity/passive/EntityRabbit$AIEvilAttack;";
	}

	/**
	 * <p>
	 * Name: getAttackReachSqr
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)D]
	 * </p>
	 */
	public static McObfPair func_179512_a = McMappingDatabase.getSRG("EntityRabbit$AIEvilAttack.func_179512_a");

}
