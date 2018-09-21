package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLlama {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aas";
		else
			return "net/minecraft/entity/passive/EntityLlama";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aas";
		else
			return "EntityLlama";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laas;";
		else
			return "Lnet/minecraft/entity/passive/EntityLlama;";
	}

	/**
	 * <p>
	 * Name: caravanTail
	 * </p>
	 */
	public static McObfPair field_190725_bL = McMappingDatabase.getSRG("field_190725_bL");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityLlama.func_110147_ax");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityLlama.func_184601_bQ");

	/**
	 * <p>
	 * Name: isArmor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_190682_f = McMappingDatabase.getSRG("EntityLlama.func_190682_f");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;, (Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityLlama.func_90011_a");

	/**
	 * <p>
	 * Name: DATA_STRENGTH_ID
	 * </p>
	 */
	public static McObfPair field_190720_bG = McMappingDatabase.getSRG("field_190720_bG");

	/**
	 * <p>
	 * Name: setRandomStrength
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190705_dT = McMappingDatabase.getSRG("EntityLlama.func_190705_dT");

	/**
	 * <p>
	 * Name: setStrength
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190706_p = McMappingDatabase.getSRG("EntityLlama.func_190706_p");

	/**
	 * <p>
	 * Name: getInventorySize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190686_di = McMappingDatabase.getSRG("EntityLlama.func_190686_di");

	/**
	 * <p>
	 * Name: isMovementBlocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70610_aX = McMappingDatabase.getSRG("EntityLlama.func_70610_aX");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityLlama.func_70037_a");

	/**
	 * <p>
	 * Name: canBeSteered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82171_bF = McMappingDatabase.getSRG("EntityLlama.func_82171_bF");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityLlama.func_180482_a");

	/**
	 * <p>
	 * Name: getAngrySound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184785_dv = McMappingDatabase.getSRG("EntityLlama.func_184785_dv");

	/**
	 * <p>
	 * Name: didSpit
	 * </p>
	 */
	public static McObfPair field_190723_bJ = McMappingDatabase.getSRG("field_190723_bJ");

	/**
	 * <p>
	 * Name: getMountedYOffset
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_70042_X = McMappingDatabase.getSRG("EntityLlama.func_70042_X");

	/**
	 * <p>
	 * Name: getMaxTemper
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190676_dC = McMappingDatabase.getSRG("EntityLlama.func_190676_dC");

	/**
	 * <p>
	 * Name: getStrength
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190707_dL = McMappingDatabase.getSRG("EntityLlama.func_190707_dL");

	/**
	 * <p>
	 * Name: spit
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_190713_e = McMappingDatabase.getSRG("EntityLlama.func_190713_e");

	/**
	 * <p>
	 * Name: DATA_COLOR_ID
	 * </p>
	 */
	public static McObfPair field_190721_bH = McMappingDatabase.getSRG("field_190721_bH");

	/**
	 * <p>
	 * Name: canBeSaddled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190685_dA = McMappingDatabase.getSRG("EntityLlama.func_190685_dA");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityLlama.func_70014_b");

	/**
	 * <p>
	 * Name: setColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/EnumDyeColor;)V]
	 * </p>
	 */
	public static McObfPair func_190711_a = McMappingDatabase.getSRG("EntityLlama.func_190711_a");

	/**
	 * <p>
	 * Name: canMateWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityAnimal;)Z]
	 * </p>
	 */
	public static McObfPair func_70878_b = McMappingDatabase.getSRG("EntityLlama.func_70878_b");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityLlama.func_184647_J");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntityLlama.func_180429_a");

	/**
	 * <p>
	 * Name: caravanHead
	 * </p>
	 */
	public static McObfPair field_190724_bK = McMappingDatabase.getSRG("field_190724_bK");

	/**
	 * <p>
	 * Name: updateHorseSlots
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110232_cE = McMappingDatabase.getSRG("EntityLlama.func_110232_cE");

	/**
	 * <p>
	 * Name: leaveCaravan
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190709_dP = McMappingDatabase.getSRG("EntityLlama.func_190709_dP");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityLlama.func_184639_G");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityLlama.func_70088_a");

	/**
	 * <p>
	 * Name: handleEating
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_190678_b = McMappingDatabase.getSRG("EntityLlama.func_190678_b");

	/**
	 * <p>
	 * Name: setSwingingArms
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184724_a = McMappingDatabase.getSRG("EntityLlama.func_184724_a");

	/**
	 * <p>
	 * Name: onInventoryChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_76316_a = McMappingDatabase.getSRG("EntityLlama.func_76316_a");

	/**
	 * <p>
	 * Name: getVariant
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190719_dM = McMappingDatabase.getSRG("EntityLlama.func_190719_dM");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityLlama.func_184615_bR");

	/**
	 * <p>
	 * Name: inCaravan
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190718_dR = McMappingDatabase.getSRG("EntityLlama.func_190718_dR");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_190704_dO = McMappingDatabase.getSRG("EntityLlama.func_190704_dO");

	/**
	 * <p>
	 * Name: joinCaravan
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityLlama;)V]
	 * </p>
	 */
	public static McObfPair func_190715_a = McMappingDatabase.getSRG("EntityLlama.func_190715_a");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityLlama.func_180430_e");

	/**
	 * <p>
	 * Name: setVariant
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190710_o = McMappingDatabase.getSRG("EntityLlama.func_190710_o");

	/**
	 * <p>
	 * Name: getInventoryColumns
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190696_dl = McMappingDatabase.getSRG("EntityLlama.func_190696_dl");

	/**
	 * <p>
	 * Name: setDidSpit
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_190714_x = McMappingDatabase.getSRG("EntityLlama.func_190714_x");

	/**
	 * <p>
	 * Name: followMother
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190679_dD = McMappingDatabase.getSRG("EntityLlama.func_190679_dD");

	/**
	 * <p>
	 * Name: DATA_VARIANT_ID
	 * </p>
	 */
	public static McObfPair field_190722_bI = McMappingDatabase.getSRG("field_190722_bI");

	/**
	 * <p>
	 * Name: getCaravanHead
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/passive/EntityLlama;]
	 * </p>
	 */
	public static McObfPair func_190716_dS = McMappingDatabase.getSRG("EntityLlama.func_190716_dS");

	/**
	 * <p>
	 * Name: updatePassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184232_k = McMappingDatabase.getSRG("EntityLlama.func_184232_k");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityLlama.func_184651_r");

	/**
	 * <p>
	 * Name: hasColor
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190717_dN = McMappingDatabase.getSRG("EntityLlama.func_190717_dN");

	/**
	 * <p>
	 * Name: canEatGrass
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190684_dE = McMappingDatabase.getSRG("EntityLlama.func_190684_dE");

	/**
	 * <p>
	 * Name: playChestEquipSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190697_dk = McMappingDatabase.getSRG("EntityLlama.func_190697_dk");

	/**
	 * <p>
	 * Name: makeMad
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190687_dF = McMappingDatabase.getSRG("EntityLlama.func_190687_dF");

	/**
	 * <p>
	 * Name: setColorByItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_190702_g = McMappingDatabase.getSRG("EntityLlama.func_190702_g");

	/**
	 * <p>
	 * Name: hasCaravanTrail
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190712_dQ = McMappingDatabase.getSRG("EntityLlama.func_190712_dQ");

	/**
	 * <p>
	 * Name: followLeashSpeed
	 * </p>
	 * <p>
	 * Desc: [()D]
	 * </p>
	 */
	public static McObfPair func_190634_dg = McMappingDatabase.getSRG("EntityLlama.func_190634_dg");

	/**
	 * <p>
	 * Name: attackEntityWithRangedAttack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_82196_d = McMappingDatabase.getSRG("EntityLlama.func_82196_d");

	/**
	 * <p>
	 * Name: wearsArmor
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190677_dK = McMappingDatabase.getSRG("EntityLlama.func_190677_dK");

}
