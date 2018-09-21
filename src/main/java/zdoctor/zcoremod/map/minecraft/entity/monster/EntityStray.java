package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityStray {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ado";
		else
			return "net/minecraft/entity/monster/EntityStray";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ado";
		else
			return "EntityStray";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lado;";
		else
			return "Lnet/minecraft/entity/monster/EntityStray;";
	}

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityStray.func_184639_G");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityStray.func_70601_bi");

	/**
	 * <p>
	 * Name: getArrow
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/entity/projectile/EntityArrow;]
	 * </p>
	 */
	public static McObfPair func_190726_a = McMappingDatabase.getSRG("EntityStray.func_190726_a");

	/**
	 * <p>
	 * Name: getStepSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190727_o = McMappingDatabase.getSRG("EntityStray.func_190727_o");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityStray.func_184601_bQ");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityStray.func_184647_J");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityStray.func_184615_bR");

	/**
	 * <p>
	 * Name: registerFixesStray
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190728_b = McMappingDatabase.getSRG("EntityStray.func_190728_b");

}
