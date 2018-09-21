package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityIllusionIllager$AIMirriorSpell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adc$b";
		else
			return "net/minecraft/entity/monster/EntityIllusionIllager$AIMirriorSpell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adc$b";
		else
			return "EntityIllusionIllager$AIMirriorSpell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladc$b;";
		else
			return "Lnet/minecraft/entity/monster/EntityIllusionIllager$AIMirriorSpell;";
	}

	/**
	 * <p>
	 * Name: getSpellType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/EntitySpellcasterIllager$SpellType;]
	 * </p>
	 */
	public static McObfPair func_193320_l = McMappingDatabase.getSRG("EntityIllusionIllager$AIMirriorSpell.func_193320_l");

	/**
	 * <p>
	 * Name: getCastingTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190869_f = McMappingDatabase.getSRG("EntityIllusionIllager$AIMirriorSpell.func_190869_f");

	/**
	 * <p>
	 * Name: castSpell
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190868_j = McMappingDatabase.getSRG("EntityIllusionIllager$AIMirriorSpell.func_190868_j");

	/**
	 * <p>
	 * Name: getSpellPrepareSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190871_k = McMappingDatabase.getSRG("EntityIllusionIllager$AIMirriorSpell.func_190871_k");

	/**
	 * <p>
	 * Name: getCastingInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190872_i = McMappingDatabase.getSRG("EntityIllusionIllager$AIMirriorSpell.func_190872_i");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityIllusionIllager$AIMirriorSpell.func_75250_a");

}
