package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySpellcasterIllager$AIUseSpell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adm$c";
		else
			return "net/minecraft/entity/monster/EntitySpellcasterIllager$AIUseSpell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adm$c";
		else
			return "EntitySpellcasterIllager$AIUseSpell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladm$c;";
		else
			return "Lnet/minecraft/entity/monster/EntitySpellcasterIllager$AIUseSpell;";
	}

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_75246_d");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_75253_b");

	/**
	 * <p>
	 * Name: getSpellType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/EntitySpellcasterIllager$SpellType;]
	 * </p>
	 */
	public static McObfPair func_193320_l = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_193320_l");

	/**
	 * <p>
	 * Name: castSpell
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190868_j = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_190868_j");

	/**
	 * <p>
	 * Name: spellWarmup
	 * </p>
	 */
	public static McObfPair field_193321_c = McMappingDatabase.getSRG("field_193321_c");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_75249_e");

	/**
	 * <p>
	 * Name: getCastingInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190872_i = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_190872_i");

	/**
	 * <p>
	 * Name: spellCooldown
	 * </p>
	 */
	public static McObfPair field_193322_d = McMappingDatabase.getSRG("field_193322_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_75250_a");

	/**
	 * <p>
	 * Name: getCastingTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190869_f = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_190869_f");

	/**
	 * <p>
	 * Name: getCastWarmupTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190867_m = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_190867_m");

	/**
	 * <p>
	 * Name: getSpellPrepareSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190871_k = McMappingDatabase.getSRG("EntitySpellcasterIllager$AIUseSpell.func_190871_k");

}
