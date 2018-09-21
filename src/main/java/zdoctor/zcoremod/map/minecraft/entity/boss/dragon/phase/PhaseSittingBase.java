package zdoctor.zcoremod.map.minecraft.entity.boss.dragon.phase;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PhaseSittingBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abg";
		else
			return "net/minecraft/entity/boss/dragon/phase/PhaseSittingBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "abg";
		else
			return "PhaseSittingBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Labg;";
		else
			return "Lnet/minecraft/entity/boss/dragon/phase/PhaseSittingBase;";
	}

	/**
	 * <p>
	 * Name: getAdjustedDamage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/MultiPartEntityPart;Lnet/minecraft/util/DamageSource;F)F]
	 * </p>
	 */
	public static McObfPair func_188656_a = McMappingDatabase.getSRG("PhaseSittingBase.func_188656_a");

	/**
	 * <p>
	 * Name: getIsStationary
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188654_a = McMappingDatabase.getSRG("PhaseSittingBase.func_188654_a");

}
