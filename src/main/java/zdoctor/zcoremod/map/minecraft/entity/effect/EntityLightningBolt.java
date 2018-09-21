package zdoctor.zcoremod.map.minecraft.entity.effect;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLightningBolt {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aci";
		else
			return "net/minecraft/entity/effect/EntityLightningBolt";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aci";
		else
			return "EntityLightningBolt";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laci;";
		else
			return "Lnet/minecraft/entity/effect/EntityLightningBolt;";
	}

	/**
	 * <p>
	 * Name: effectOnly
	 * </p>
	 */
	public static McObfPair field_184529_d = McMappingDatabase.getSRG("field_184529_d");

	/**
	 * <p>
	 * Name: getSoundCategory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundCategory;]
	 * </p>
	 */
	public static McObfPair func_184176_by = McMappingDatabase.getSRG("EntityLightningBolt.func_184176_by");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityLightningBolt.func_70037_a");

	/**
	 * <p>
	 * Name: boltVertex
	 * </p>
	 */
	public static McObfPair field_70264_a = McMappingDatabase.getSRG("field_70264_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityLightningBolt.func_70071_h_");

	/**
	 * <p>
	 * Name: lightningState
	 * </p>
	 */
	public static McObfPair field_70262_b = McMappingDatabase.getSRG("field_70262_b");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityLightningBolt.func_70088_a");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityLightningBolt.func_70014_b");

	/**
	 * <p>
	 * Name: boltLivingTime
	 * </p>
	 */
	public static McObfPair field_70263_c = McMappingDatabase.getSRG("field_70263_c");

}
