package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEndermite {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acv";
		else
			return "net/minecraft/entity/monster/EntityEndermite";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "acv";
		else
			return "EntityEndermite";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lacv;";
		else
			return "Lnet/minecraft/entity/monster/EntityEndermite;";
	}

	/**
	 * <p>
	 * Name: lifetime
	 * </p>
	 */
	public static McObfPair field_175497_b = McMappingDatabase.getSRG("field_175497_b");

	/**
	 * <p>
	 * Name: playerSpawned
	 * </p>
	 */
	public static McObfPair field_175498_c = McMappingDatabase.getSRG("field_175498_c");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityEndermite.func_70636_d");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntityEndermite.func_180429_a");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityEndermite.func_184615_bR");

	/**
	 * <p>
	 * Name: getYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70033_W = McMappingDatabase.getSRG("EntityEndermite.func_70033_W");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityEndermite.func_70047_e");

	/**
	 * <p>
	 * Name: canTriggerWalking
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70041_e_ = McMappingDatabase.getSRG("EntityEndermite.func_70041_e_");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityEndermite.func_70014_b");

	/**
	 * <p>
	 * Name: registerFixesEndermite
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189764_b = McMappingDatabase.getSRG("EntityEndermite.func_189764_b");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityEndermite.func_184601_bQ");

	/**
	 * <p>
	 * Name: setRenderYawOffset
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_181013_g = McMappingDatabase.getSRG("EntityEndermite.func_181013_g");

	/**
	 * <p>
	 * Name: getCreatureAttribute
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EnumCreatureAttribute;]
	 * </p>
	 */
	public static McObfPair func_70668_bt = McMappingDatabase.getSRG("EntityEndermite.func_70668_bt");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityEndermite.func_184647_J");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityEndermite.func_70037_a");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityEndermite.func_70601_bi");

	/**
	 * <p>
	 * Name: setSpawnedByPlayer
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175496_a = McMappingDatabase.getSRG("EntityEndermite.func_175496_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityEndermite.func_70071_h_");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityEndermite.func_184639_G");

	/**
	 * <p>
	 * Name: isSpawnedByPlayer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175495_n = McMappingDatabase.getSRG("EntityEndermite.func_175495_n");

	/**
	 * <p>
	 * Name: isValidLightLevel
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70814_o = McMappingDatabase.getSRG("EntityEndermite.func_70814_o");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityEndermite.func_110147_ax");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityEndermite.func_184651_r");

}
