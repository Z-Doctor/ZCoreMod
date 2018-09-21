package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionEffect {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "va";
		else
			return "net/minecraft/potion/PotionEffect";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "va";
		else
			return "PotionEffect";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lva;";
		else
			return "Lnet/minecraft/potion/PotionEffect;";
	}

	/**
	 * <p>
	 * Name: doesShowParticles
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188418_e = McMappingDatabase.getSRG("PotionEffect.func_188418_e");

	/**
	 * <p>
	 * Name: performEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_76457_b = McMappingDatabase.getSRG("PotionEffect.func_76457_b");

	/**
	 * <p>
	 * Name: isAmbient
	 * </p>
	 */
	public static McObfPair field_82724_e = McMappingDatabase.getSRG("field_82724_e");

	/**
	 * <p>
	 * Name: duration
	 * </p>
	 */
	public static McObfPair field_76460_b = McMappingDatabase.getSRG("field_76460_b");

	/**
	 * <p>
	 * Name: getAmplifier
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76458_c = McMappingDatabase.getSRG("PotionEffect.func_76458_c");

	/**
	 * <p>
	 * Name: readCustomPotionEffectFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/potion/PotionEffect;]
	 * </p>
	 */
	public static McObfPair func_82722_b = McMappingDatabase.getSRG("PotionEffect.func_82722_b");

	/**
	 * <p>
	 * Name: getIsPotionDurationMax
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_100011_g = McMappingDatabase.getSRG("PotionEffect.func_100011_g");

	/**
	 * <p>
	 * Name: writeCustomPotionEffectToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_82719_a = McMappingDatabase.getSRG("PotionEffect.func_82719_a");

	/**
	 * <p>
	 * Name: potion
	 * </p>
	 */
	public static McObfPair field_188420_b = McMappingDatabase.getSRG("field_188420_b");

	/**
	 * <p>
	 * Name: isSplashPotion
	 * </p>
	 */
	public static McObfPair field_82723_d = McMappingDatabase.getSRG("field_82723_d");

	/**
	 * <p>
	 * Name: setPotionDurationMax
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_100012_b = McMappingDatabase.getSRG("PotionEffect.func_100012_b");

	/**
	 * <p>
	 * Name: combine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionEffect;)V]
	 * </p>
	 */
	public static McObfPair func_76452_a = McMappingDatabase.getSRG("PotionEffect.func_76452_a");

	/**
	 * <p>
	 * Name: amplifier
	 * </p>
	 */
	public static McObfPair field_76461_c = McMappingDatabase.getSRG("field_76461_c");

	/**
	 * <p>
	 * Name: getIsAmbient
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82720_e = McMappingDatabase.getSRG("PotionEffect.func_82720_e");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_180155_a = McMappingDatabase.getSRG("field_180155_a");

	/**
	 * <p>
	 * Name: getDuration
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76459_b = McMappingDatabase.getSRG("PotionEffect.func_76459_b");

	/**
	 * <p>
	 * Name: deincrementDuration
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76454_e = McMappingDatabase.getSRG("PotionEffect.func_76454_e");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_76455_a = McMappingDatabase.getSRG("PotionEffect.func_76455_a");

	/**
	 * <p>
	 * Name: getPotion
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/potion/Potion;]
	 * </p>
	 */
	public static McObfPair func_188419_a = McMappingDatabase.getSRG("PotionEffect.func_188419_a");

	/**
	 * <p>
	 * Name: isPotionDurationMax
	 * </p>
	 */
	public static McObfPair field_100013_f = McMappingDatabase.getSRG("field_100013_f");

	/**
	 * <p>
	 * Name: getEffectName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76453_d = McMappingDatabase.getSRG("PotionEffect.func_76453_d");

	/**
	 * <p>
	 * Name: showParticles
	 * </p>
	 */
	public static McObfPair field_188421_h = McMappingDatabase.getSRG("field_188421_h");

}
