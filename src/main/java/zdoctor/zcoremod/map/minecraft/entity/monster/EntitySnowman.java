package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySnowman {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aai";
		else
			return "net/minecraft/entity/monster/EntitySnowman";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aai";
		else
			return "EntitySnowman";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laai;";
		else
			return "Lnet/minecraft/entity/monster/EntitySnowman;";
	}

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntitySnowman.func_70636_d");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntitySnowman.func_184615_bR");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntitySnowman.func_184639_G");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntitySnowman.func_70014_b");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntitySnowman.func_70088_a");

	/**
	 * <p>
	 * Name: PUMPKIN_EQUIPPED
	 * </p>
	 */
	public static McObfPair field_184749_a = McMappingDatabase.getSRG("field_184749_a");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntitySnowman.func_184645_a");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntitySnowman.func_184651_r");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntitySnowman.func_70047_e");

	/**
	 * <p>
	 * Name: setPumpkinEquipped
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184747_a = McMappingDatabase.getSRG("EntitySnowman.func_184747_a");

	/**
	 * <p>
	 * Name: isPumpkinEquipped
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184748_o = McMappingDatabase.getSRG("EntitySnowman.func_184748_o");

	/**
	 * <p>
	 * Name: setSwingingArms
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184724_a = McMappingDatabase.getSRG("EntitySnowman.func_184724_a");

	/**
	 * <p>
	 * Name: registerFixesSnowman
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189783_b = McMappingDatabase.getSRG("EntitySnowman.func_189783_b");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntitySnowman.func_70037_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntitySnowman.func_184601_bQ");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntitySnowman.func_110147_ax");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntitySnowman.func_184647_J");

	/**
	 * <p>
	 * Name: attackEntityWithRangedAttack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_82196_d = McMappingDatabase.getSRG("EntitySnowman.func_82196_d");

}
