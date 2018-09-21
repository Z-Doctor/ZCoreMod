package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLlama$AIDefendTarget {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aas$a";
		else
			return "net/minecraft/entity/passive/EntityLlama$AIDefendTarget";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aas$a";
		else
			return "EntityLlama$AIDefendTarget";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laas$a;";
		else
			return "Lnet/minecraft/entity/passive/EntityLlama$AIDefendTarget;";
	}

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityLlama$AIDefendTarget.func_75250_a");

	/**
	 * <p>
	 * Name: getTargetDistance
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_111175_f = McMappingDatabase.getSRG("EntityLlama$AIDefendTarget.func_111175_f");

}
