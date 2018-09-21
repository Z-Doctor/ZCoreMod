package zdoctor.zcoremod.map.minecraft.entity.projectile;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityEvokerFangs {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aej";
		else
			return "net/minecraft/entity/projectile/EntityEvokerFangs";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aej";
		else
			return "EntityEvokerFangs";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laej;";
		else
			return "Lnet/minecraft/entity/projectile/EntityEvokerFangs;";
	}

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityEvokerFangs.func_70103_a");

	/**
	 * <p>
	 * Name: damage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_190551_c = McMappingDatabase.getSRG("EntityEvokerFangs.func_190551_c");

	/**
	 * <p>
	 * Name: setCaster
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_190549_a = McMappingDatabase.getSRG("EntityEvokerFangs.func_190549_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityEvokerFangs.func_70014_b");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityEvokerFangs.func_70071_h_");

	/**
	 * <p>
	 * Name: getCaster
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_190552_j = McMappingDatabase.getSRG("EntityEvokerFangs.func_190552_j");

	/**
	 * <p>
	 * Name: getAnimationProgress
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_190550_a = McMappingDatabase.getSRG("EntityEvokerFangs.func_190550_a");

	/**
	 * <p>
	 * Name: lifeTicks
	 * </p>
	 */
	public static McObfPair field_190555_c = McMappingDatabase.getSRG("field_190555_c");

	/**
	 * <p>
	 * Name: sentSpikeEvent
	 * </p>
	 */
	public static McObfPair field_190554_b = McMappingDatabase.getSRG("field_190554_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityEvokerFangs.func_70037_a");

	/**
	 * <p>
	 * Name: caster
	 * </p>
	 */
	public static McObfPair field_190557_e = McMappingDatabase.getSRG("field_190557_e");

	/**
	 * <p>
	 * Name: clientSideAttackStarted
	 * </p>
	 */
	public static McObfPair field_190556_d = McMappingDatabase.getSRG("field_190556_d");

	/**
	 * <p>
	 * Name: warmupDelayTicks
	 * </p>
	 */
	public static McObfPair field_190553_a = McMappingDatabase.getSRG("field_190553_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityEvokerFangs.func_70088_a");

	/**
	 * <p>
	 * Name: casterUuid
	 * </p>
	 */
	public static McObfPair field_190558_f = McMappingDatabase.getSRG("field_190558_f");

}
