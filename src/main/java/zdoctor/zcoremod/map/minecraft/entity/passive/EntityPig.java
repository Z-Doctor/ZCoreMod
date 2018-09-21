package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPig {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aad";
		else
			return "net/minecraft/entity/passive/EntityPig";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aad";
		else
			return "EntityPig";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laad;";
		else
			return "Lnet/minecraft/entity/passive/EntityPig;";
	}

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityPig.func_70037_a");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityPig.func_184645_a");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;, (Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityPig;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityPig.func_90011_a");

	/**
	 * <p>
	 * Name: isBreedingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70877_b = McMappingDatabase.getSRG("EntityPig.func_70877_b");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntityPig.func_180429_a");

	/**
	 * <p>
	 * Name: onStruckByLightning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/effect/EntityLightningBolt;)V]
	 * </p>
	 */
	public static McObfPair func_70077_a = McMappingDatabase.getSRG("EntityPig.func_70077_a");

	/**
	 * <p>
	 * Name: notifyDataManagerChange
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/datasync/DataParameter;)V]
	 * </p>
	 */
	public static McObfPair func_184206_a = McMappingDatabase.getSRG("EntityPig.func_184206_a");

	/**
	 * <p>
	 * Name: setSaddled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70900_e = McMappingDatabase.getSRG("EntityPig.func_70900_e");

	/**
	 * <p>
	 * Name: canBeSteered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82171_bF = McMappingDatabase.getSRG("EntityPig.func_82171_bF");

	/**
	 * <p>
	 * Name: getControllingPassenger
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_184179_bs = McMappingDatabase.getSRG("EntityPig.func_184179_bs");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityPig.func_184639_G");

	/**
	 * <p>
	 * Name: SADDLED
	 * </p>
	 */
	public static McObfPair field_184763_bv = McMappingDatabase.getSRG("field_184763_bv");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityPig.func_184647_J");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityPig.func_184651_r");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityPig.func_184615_bR");

	/**
	 * <p>
	 * Name: BOOST_TIME
	 * </p>
	 */
	public static McObfPair field_191520_bx = McMappingDatabase.getSRG("field_191520_bx");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityPig.func_184601_bQ");

	/**
	 * <p>
	 * Name: boost
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184762_da = McMappingDatabase.getSRG("EntityPig.func_184762_da");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityPig.func_70014_b");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityPig.func_70645_a");

	/**
	 * <p>
	 * Name: travel
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_191986_a = McMappingDatabase.getSRG("EntityPig.func_191986_a");

	/**
	 * <p>
	 * Name: boosting
	 * </p>
	 */
	public static McObfPair field_184765_bx = McMappingDatabase.getSRG("field_184765_bx");

	/**
	 * <p>
	 * Name: boostTime
	 * </p>
	 */
	public static McObfPair field_184766_bz = McMappingDatabase.getSRG("field_184766_bz");

	/**
	 * <p>
	 * Name: totalBoostTime
	 * </p>
	 */
	public static McObfPair field_184767_bA = McMappingDatabase.getSRG("field_184767_bA");

	/**
	 * <p>
	 * Name: registerFixesPig
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189792_b = McMappingDatabase.getSRG("EntityPig.func_189792_b");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityPig.func_110147_ax");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityPig.func_70088_a");

	/**
	 * <p>
	 * Name: getSaddled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70901_n = McMappingDatabase.getSRG("EntityPig.func_70901_n");

	/**
	 * <p>
	 * Name: TEMPTATION_ITEMS
	 * </p>
	 */
	public static McObfPair field_184764_bw = McMappingDatabase.getSRG("field_184764_bw");

}
