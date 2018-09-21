package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEvoker$AIWololoSpell {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acx$d";
		else
			return "net/minecraft/entity/monster/EntityEvoker$AIWololoSpell";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acx$d";
		else
			return "EntityEvoker$AIWololoSpell";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacx$d;";
		else
			return "Lnet/minecraft/entity/monster/EntityEvoker$AIWololoSpell;";
	}

	/**
	 * <p>
	 * Name: getSpellPrepareSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190871_k = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_190871_k");

	/**
	 * <p>
	 * Name: updateTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75246_d = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_75246_d");

	/**
	 * <p>
	 * Name: shouldExecute
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75250_a = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_75250_a");

	/**
	 * <p>
	 * Name: getSpellType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/monster/EntitySpellcasterIllager$SpellType;]
	 * </p>
	 */
	public static McObfPair func_193320_l = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_193320_l");

	/**
	 * <p>
	 * Name: castSpell
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190868_j = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_190868_j");

	/**
	 * <p>
	 * Name: startExecuting
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75249_e = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_75249_e");

	/**
	 * <p>
	 * Name: getCastWarmupTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190867_m = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_190867_m");

	/**
	 * <p>
	 * Name: shouldContinueExecuting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_75253_b = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_75253_b");

	/**
	 * <p>
	 * Name: resetTask
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_75251_c = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_75251_c");

	/**
	 * <p>
	 * Name: getCastingTime
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190869_f = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_190869_f");

	/**
	 * <p>
	 * Name: wololoSelector
	 * </p>
	 */
	public static McObfPair field_190879_a = McMappingDatabase.getSRG("field_190879_a");

	/**
	 * <p>
	 * Name: getCastingInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190872_i = McMappingDatabase.getSRG("EntityEvoker$AIWololoSpell.func_190872_i");

}
