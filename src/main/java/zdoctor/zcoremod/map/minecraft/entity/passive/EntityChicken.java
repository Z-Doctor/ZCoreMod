package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityChicken {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zw";
		else
			return "net/minecraft/entity/passive/EntityChicken";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "zw";
		else
			return "EntityChicken";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lzw;";
		else
			return "Lnet/minecraft/entity/passive/EntityChicken;";
	}

	/**
	 * <p>
	 * Name: oFlap
	 * </p>
	 */
	public static McObfPair field_70888_h = McMappingDatabase.getSRG("field_70888_h");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;, (Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityChicken;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityChicken.func_90011_a");

	/**
	 * <p>
	 * Name: wingRotation
	 * </p>
	 */
	public static McObfPair field_70886_e = McMappingDatabase.getSRG("field_70886_e");

	/**
	 * <p>
	 * Name: chickenJockey
	 * </p>
	 */
	public static McObfPair field_152118_bv = McMappingDatabase.getSRG("field_152118_bv");

	/**
	 * <p>
	 * Name: wingRotDelta
	 * </p>
	 */
	public static McObfPair field_70889_i = McMappingDatabase.getSRG("field_70889_i");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityChicken.func_184639_G");

	/**
	 * <p>
	 * Name: registerFixesChicken
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189789_b = McMappingDatabase.getSRG("EntityChicken.func_189789_b");

	/**
	 * <p>
	 * Name: oFlapSpeed
	 * </p>
	 */
	public static McObfPair field_70884_g = McMappingDatabase.getSRG("field_70884_g");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityChicken.func_184601_bQ");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityChicken.func_110147_ax");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntityChicken.func_180429_a");

	/**
	 * <p>
	 * Name: timeUntilNextEgg
	 * </p>
	 */
	public static McObfPair field_70887_j = McMappingDatabase.getSRG("field_70887_j");

	/**
	 * <p>
	 * Name: destPos
	 * </p>
	 */
	public static McObfPair field_70883_f = McMappingDatabase.getSRG("field_70883_f");

	/**
	 * <p>
	 * Name: updatePassenger
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_184232_k = McMappingDatabase.getSRG("EntityChicken.func_184232_k");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityChicken.func_184647_J");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityChicken.func_70636_d");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityChicken.func_70047_e");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityChicken.func_184615_bR");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityChicken.func_70037_a");

	/**
	 * <p>
	 * Name: isChickenJockey
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_152116_bZ = McMappingDatabase.getSRG("EntityChicken.func_152116_bZ");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityChicken.func_184651_r");

	/**
	 * <p>
	 * Name: isBreedingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_70877_b = McMappingDatabase.getSRG("EntityChicken.func_70877_b");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityChicken.func_70014_b");

	/**
	 * <p>
	 * Name: canDespawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70692_ba = McMappingDatabase.getSRG("EntityChicken.func_70692_ba");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityChicken.func_180430_e");

	/**
	 * <p>
	 * Name: setChickenJockey
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_152117_i = McMappingDatabase.getSRG("EntityChicken.func_152117_i");

	/**
	 * <p>
	 * Name: TEMPTATION_ITEMS
	 * </p>
	 */
	public static McObfPair field_184761_bD = McMappingDatabase.getSRG("field_184761_bD");

	/**
	 * <p>
	 * Name: getExperiencePoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)I]
	 * </p>
	 */
	public static McObfPair func_70693_a = McMappingDatabase.getSRG("EntityChicken.func_70693_a");

}
