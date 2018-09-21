package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHusk {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adb";
		else
			return "net/minecraft/entity/monster/EntityHusk";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adb";
		else
			return "EntityHusk";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladb;";
		else
			return "Lnet/minecraft/entity/monster/EntityHusk;";
	}

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityHusk.func_184647_J");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityHusk.func_184639_G");

	/**
	 * <p>
	 * Name: shouldBurnInDay
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190730_o = McMappingDatabase.getSRG("EntityHusk.func_190730_o");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityHusk.func_70601_bi");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityHusk.func_184615_bR");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityHusk.func_184601_bQ");

	/**
	 * <p>
	 * Name: registerFixesHusk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190740_b = McMappingDatabase.getSRG("EntityHusk.func_190740_b");

	/**
	 * <p>
	 * Name: attackEntityAsMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_70652_k = McMappingDatabase.getSRG("EntityHusk.func_70652_k");

	/**
	 * <p>
	 * Name: getStepSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190731_di = McMappingDatabase.getSRG("EntityHusk.func_190731_di");

	/**
	 * <p>
	 * Name: getSkullDrop
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190732_dj = McMappingDatabase.getSRG("EntityHusk.func_190732_dj");

}
