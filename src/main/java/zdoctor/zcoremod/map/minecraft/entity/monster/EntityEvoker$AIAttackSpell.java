package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEvoker$AIAttackSpell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acx$a";
		else
			return "net/minecraft/entity/monster/EntityEvoker$AIAttackSpell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acx$a";
		else
			return "EntityEvoker$AIAttackSpell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacx$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityEvoker$AIAttackSpell;";
	}

	/**
	 * <p>
	 * Name: getSpellType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/EntitySpellcasterIllager$SpellType;]
	 * </p>
	 */
	public static McObfPair func_193320_l = McMappingDatabase.getSRG("EntityEvoker$AIAttackSpell.func_193320_l");

	/**
	 * <p>
	 * Name: castSpell
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190868_j = McMappingDatabase.getSRG("EntityEvoker$AIAttackSpell.func_190868_j");

	/**
	 * <p>
	 * Name: getSpellPrepareSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190871_k = McMappingDatabase.getSRG("EntityEvoker$AIAttackSpell.func_190871_k");

	/**
	 * <p>
	 * Name: getCastingInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190872_i = McMappingDatabase.getSRG("EntityEvoker$AIAttackSpell.func_190872_i");

	/**
	 * <p>
	 * Name: getCastingTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190869_f = McMappingDatabase.getSRG("EntityEvoker$AIAttackSpell.func_190869_f");

	/**
	 * <p>
	 * Name: spawnFangs
	 * </p>
	 * <p>
	 * Desc: [(DDDDFI)V]
	 * </p>
	 */
	public static McObfPair func_190876_a = McMappingDatabase.getSRG("EntityEvoker$AIAttackSpell.func_190876_a");

}
