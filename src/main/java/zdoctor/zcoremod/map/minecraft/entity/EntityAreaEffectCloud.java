package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityAreaEffectCloud {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ve";
		else
			return "net/minecraft/entity/EntityAreaEffectCloud";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ve";
		else
			return "EntityAreaEffectCloud";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lve;";
		else
			return "Lnet/minecraft/entity/EntityAreaEffectCloud;";
	}

	/**
	 * <p>
	 * Name: setPotion
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionType;)V]
	 * </p>
	 */
	public static McObfPair func_184484_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184484_a");

	/**
	 * <p>
	 * Name: ownerUniqueId
	 * </p>
	 */
	public static McObfPair field_184513_az = McMappingDatabase.getSRG("field_184513_az");

	/**
	 * <p>
	 * Name: getOwner
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_184494_w = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184494_w");

	/**
	 * <p>
	 * Name: colorSet
	 * </p>
	 */
	public static McObfPair field_184508_au = McMappingDatabase.getSRG("field_184508_au");

	/**
	 * <p>
	 * Name: getRadius
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_184490_j = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184490_j");

	/**
	 * <p>
	 * Name: setRadiusPerTick
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_184487_c = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184487_c");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_70037_a");

	/**
	 * <p>
	 * Name: radiusPerTick
	 * </p>
	 */
	public static McObfPair field_184511_ax = McMappingDatabase.getSRG("field_184511_ax");

	/**
	 * <p>
	 * Name: reapplicationDelay
	 * </p>
	 */
	public static McObfPair field_184507_at = McMappingDatabase.getSRG("field_184507_at");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_70071_h_");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184206_a");

	/**
	 * <p>
	 * Name: setRadiusOnUse
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_184495_b = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184495_b");

	/**
	 * <p>
	 * Name: getParticleParam1
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_189733_n = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_189733_n");

	/**
	 * <p>
	 * Name: updateFixedColor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190618_C = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_190618_C");

	/**
	 * <p>
	 * Name: getParticleParam2
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_189735_o = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_189735_o");

	/**
	 * <p>
	 * Name: getDuration
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184489_o = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184489_o");

	/**
	 * <p>
	 * Name: waitTime
	 * </p>
	 */
	public static McObfPair field_184506_as = McMappingDatabase.getSRG("field_184506_as");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184492_k = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184492_k");

	/**
	 * <p>
	 * Name: shouldIgnoreRadius
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184497_n = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184497_n");

	/**
	 * <p>
	 * Name: setWaitTime
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184485_d = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184485_d");

	/**
	 * <p>
	 * Name: PARTICLE_PARAM_2
	 * </p>
	 */
	public static McObfPair field_189737_f = McMappingDatabase.getSRG("field_189737_f");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_70014_b");

	/**
	 * <p>
	 * Name: effects
	 * </p>
	 */
	public static McObfPair field_184503_f = McMappingDatabase.getSRG("field_184503_f");

	/**
	 * <p>
	 * Name: IGNORE_RADIUS
	 * </p>
	 */
	public static McObfPair field_184500_c = McMappingDatabase.getSRG("field_184500_c");

	/**
	 * <p>
	 * Name: potion
	 * </p>
	 */
	public static McObfPair field_184502_e = McMappingDatabase.getSRG("field_184502_e");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_70088_a");

	/**
	 * <p>
	 * Name: setIgnoreRadius
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184488_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184488_a");

	/**
	 * <p>
	 * Name: addEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_184496_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184496_a");

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184482_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184482_a");

	/**
	 * <p>
	 * Name: setParticleParam2
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_189732_d = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_189732_d");

	/**
	 * <p>
	 * Name: setParticleParam1
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_189734_b = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_189734_b");

	/**
	 * <p>
	 * Name: RADIUS
	 * </p>
	 */
	public static McObfPair field_184498_a = McMappingDatabase.getSRG("field_184498_a");

	/**
	 * <p>
	 * Name: radiusOnUse
	 * </p>
	 */
	public static McObfPair field_184510_aw = McMappingDatabase.getSRG("field_184510_aw");

	/**
	 * <p>
	 * Name: setDuration
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184486_b = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184486_b");

	/**
	 * <p>
	 * Name: PARTICLE
	 * </p>
	 */
	public static McObfPair field_184501_d = McMappingDatabase.getSRG("field_184501_d");

	/**
	 * <p>
	 * Name: reapplicationDelayMap
	 * </p>
	 */
	public static McObfPair field_184504_g = McMappingDatabase.getSRG("field_184504_g");

	/**
	 * <p>
	 * Name: durationOnUse
	 * </p>
	 */
	public static McObfPair field_184509_av = McMappingDatabase.getSRG("field_184509_av");

	/**
	 * <p>
	 * Name: COLOR
	 * </p>
	 */
	public static McObfPair field_184499_b = McMappingDatabase.getSRG("field_184499_b");

	/**
	 * <p>
	 * Name: duration
	 * </p>
	 */
	public static McObfPair field_184505_h = McMappingDatabase.getSRG("field_184505_h");

	/**
	 * <p>
	 * Name: getParticle
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumParticleTypes;]
	 * </p>
	 */
	public static McObfPair func_184493_l = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184493_l");

	/**
	 * <p>
	 * Name: PARTICLE_PARAM_1
	 * </p>
	 */
	public static McObfPair field_189736_e = McMappingDatabase.getSRG("field_189736_e");

	/**
	 * <p>
	 * Name: setRadius
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_184483_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184483_a");

	/**
	 * <p>
	 * Name: setOwner
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_184481_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184481_a");

	/**
	 * <p>
	 * Name: getPushReaction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/block/material/EnumPushReaction;]
	 * </p>
	 */
	public static McObfPair func_184192_z = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184192_z");

	/**
	 * <p>
	 * Name: setParticle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumParticleTypes;)V]
	 * </p>
	 */
	public static McObfPair func_184491_a = McMappingDatabase.getSRG("EntityAreaEffectCloud.func_184491_a");

	/**
	 * <p>
	 * Name: owner
	 * </p>
	 */
	public static McObfPair field_184512_ay = McMappingDatabase.getSRG("field_184512_ay");

}
