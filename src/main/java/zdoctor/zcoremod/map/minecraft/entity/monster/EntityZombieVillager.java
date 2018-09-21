package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityZombieVillager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adu";
		else
			return "net/minecraft/entity/monster/EntityZombieVillager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adu";
		else
			return "EntityZombieVillager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladu;";
		else
			return "Lnet/minecraft/entity/monster/EntityZombieVillager;";
	}

	/**
	 * <p>
	 * Name: setProfession
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190733_a = McMappingDatabase.getSRG("EntityZombieVillager.func_190733_a");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityZombieVillager.func_70071_h_");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityZombieVillager.func_184647_J");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityZombieVillager.func_184615_bR");

	/**
	 * <p>
	 * Name: registerFixesZombieVillager
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_190737_b = McMappingDatabase.getSRG("EntityZombieVillager.func_190737_b");

	/**
	 * <p>
	 * Name: canDespawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70692_ba = McMappingDatabase.getSRG("EntityZombieVillager.func_70692_ba");

	/**
	 * <p>
	 * Name: CONVERTING
	 * </p>
	 */
	public static McObfPair field_184739_bx = McMappingDatabase.getSRG("field_184739_bx");

	/**
	 * <p>
	 * Name: finishConversion
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190738_dp = McMappingDatabase.getSRG("EntityZombieVillager.func_190738_dp");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityZombieVillager.func_70014_b");

	/**
	 * <p>
	 * Name: getProfession
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190736_dl = McMappingDatabase.getSRG("EntityZombieVillager.func_190736_dl");

	/**
	 * <p>
	 * Name: startConverting
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;I)V]
	 * </p>
	 */
	public static McObfPair func_191991_a = McMappingDatabase.getSRG("EntityZombieVillager.func_191991_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityZombieVillager.func_70037_a");

	/**
	 * <p>
	 * Name: getStepSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_190731_di = McMappingDatabase.getSRG("EntityZombieVillager.func_190731_di");

	/**
	 * <p>
	 * Name: getSoundPitch
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70647_i = McMappingDatabase.getSRG("EntityZombieVillager.func_70647_i");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityZombieVillager.func_180482_a");

	/**
	 * <p>
	 * Name: converstionStarter
	 * </p>
	 */
	public static McObfPair field_191992_by = McMappingDatabase.getSRG("field_191992_by");

	/**
	 * <p>
	 * Name: getSkullDrop
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190732_dj = McMappingDatabase.getSRG("EntityZombieVillager.func_190732_dj");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityZombieVillager.func_70103_a");

	/**
	 * <p>
	 * Name: getConversionProgress
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190735_dq = McMappingDatabase.getSRG("EntityZombieVillager.func_190735_dq");

	/**
	 * <p>
	 * Name: isConverting
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82230_o = McMappingDatabase.getSRG("EntityZombieVillager.func_82230_o");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityZombieVillager.func_184639_G");

	/**
	 * <p>
	 * Name: conversionTime
	 * </p>
	 */
	public static McObfPair field_82234_d = McMappingDatabase.getSRG("field_82234_d");

	/**
	 * <p>
	 * Name: PROFESSION
	 * </p>
	 */
	public static McObfPair field_190739_c = McMappingDatabase.getSRG("field_190739_c");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityZombieVillager.func_70088_a");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityZombieVillager.func_184645_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityZombieVillager.func_184601_bQ");

}
