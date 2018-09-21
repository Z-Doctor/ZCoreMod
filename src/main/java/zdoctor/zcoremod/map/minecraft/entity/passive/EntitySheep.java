package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySheep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aag";
		else
			return "net/minecraft/entity/passive/EntitySheep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aag";
		else
			return "EntitySheep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laag;";
		else
			return "Lnet/minecraft/entity/passive/EntitySheep;";
	}

	/**
	 * <p>
	 * Name: setFleeceColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/EnumDyeColor;)V]
	 * </p>
	 */
	public static McObfPair func_175512_b = McMappingDatabase.getSRG("EntitySheep.func_175512_b");

	/**
	 * <p>
	 * Name: getSheared
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70892_o = McMappingDatabase.getSRG("EntitySheep.func_70892_o");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntitySheep.func_70088_a");

	/**
	 * <p>
	 * Name: entityAIEatGrass
	 * </p>
	 */
	public static McObfPair field_146087_bs = McMappingDatabase.getSRG("field_146087_bs");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntitySheep.func_184639_G");

	/**
	 * <p>
	 * Name: eatGrassBonus
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70615_aA = McMappingDatabase.getSRG("EntitySheep.func_70615_aA");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntitySheep.func_184651_r");

	/**
	 * <p>
	 * Name: setSheared
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70893_e = McMappingDatabase.getSRG("EntitySheep.func_70893_e");

	/**
	 * <p>
	 * Name: DYE_TO_RGB
	 * </p>
	 */
	public static McObfPair field_175514_bm = McMappingDatabase.getSRG("field_175514_bm");

	/**
	 * <p>
	 * Name: registerFixesSheep
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189802_b = McMappingDatabase.getSRG("EntitySheep.func_189802_b");

	/**
	 * <p>
	 * Name: playStepSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_180429_a = McMappingDatabase.getSRG("EntitySheep.func_180429_a");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntitySheep.func_70103_a");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntitySheep.func_70047_e");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntitySheep.func_70636_d");

	/**
	 * <p>
	 * Name: DYE_COLOR
	 * </p>
	 */
	public static McObfPair field_184774_bv = McMappingDatabase.getSRG("field_184774_bv");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntitySheep.func_70619_bc");

	/**
	 * <p>
	 * Name: getHeadRotationPointY
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_70894_j = McMappingDatabase.getSRG("EntitySheep.func_70894_j");

	/**
	 * <p>
	 * Name: getDyeColorMixFromParents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityAnimal;Lnet/minecraft/entity/passive/EntityAnimal;)Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_175511_a = McMappingDatabase.getSRG("EntitySheep.func_175511_a");

	/**
	 * <p>
	 * Name: getFleeceColor
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_175509_cj = McMappingDatabase.getSRG("EntitySheep.func_175509_cj");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntitySheep.func_184647_J");

	/**
	 * <p>
	 * Name: inventoryCrafting
	 * </p>
	 */
	public static McObfPair field_90016_e = McMappingDatabase.getSRG("field_90016_e");

	/**
	 * <p>
	 * Name: getHeadRotationAngleX
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_70890_k = McMappingDatabase.getSRG("EntitySheep.func_70890_k");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntitySheep.func_184645_a");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntitySheep.func_184615_bR");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntitySheep.func_180482_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntitySheep.func_184601_bQ");

	/**
	 * <p>
	 * Name: getRandomSheepColor
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/item/EnumDyeColor;]
	 * </p>
	 */
	public static McObfPair func_175510_a = McMappingDatabase.getSRG("EntitySheep.func_175510_a");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;, (Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntitySheep;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntitySheep.func_90011_a");

	/**
	 * <p>
	 * Name: createSheepColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/EnumDyeColor;)[F]
	 * </p>
	 */
	public static McObfPair func_192020_c = McMappingDatabase.getSRG("EntitySheep.func_192020_c");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntitySheep.func_70014_b");

	/**
	 * <p>
	 * Name: getDyeRgb
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/EnumDyeColor;)[F]
	 * </p>
	 */
	public static McObfPair func_175513_a = McMappingDatabase.getSRG("EntitySheep.func_175513_a");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntitySheep.func_110147_ax");

	/**
	 * <p>
	 * Name: sheepTimer
	 * </p>
	 */
	public static McObfPair field_70899_e = McMappingDatabase.getSRG("field_70899_e");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntitySheep.func_70037_a");

}
