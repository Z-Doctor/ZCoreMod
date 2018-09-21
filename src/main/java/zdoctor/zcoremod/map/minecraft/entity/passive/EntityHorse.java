package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHorse {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaq";
		else
			return "net/minecraft/entity/passive/EntityHorse";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaq";
		else
			return "EntityHorse";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaq;";
		else
			return "Lnet/minecraft/entity/passive/EntityHorse;";
	}

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityHorse.func_90011_a");

	/**
	 * <p>
	 * Name: setHorseTexturePaths
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110247_cG = McMappingDatabase.getSRG("EntityHorse.func_110247_cG");

	/**
	 * <p>
	 * Name: getHorseVariant
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110202_bQ = McMappingDatabase.getSRG("EntityHorse.func_110202_bQ");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityHorse.func_70088_a");

	/**
	 * <p>
	 * Name: getHorseArmorType
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/passive/HorseArmorType;]
	 * </p>
	 */
	public static McObfPair func_184783_dl = McMappingDatabase.getSRG("EntityHorse.func_184783_dl");

	/**
	 * <p>
	 * Name: setHorseVariant
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_110235_q = McMappingDatabase.getSRG("EntityHorse.func_110235_q");

	/**
	 * <p>
	 * Name: canMateWith
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityAnimal;)Z]
	 * </p>
	 */
	public static McObfPair func_70878_b = McMappingDatabase.getSRG("EntityHorse.func_70878_b");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityHorse.func_184615_bR");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityHorse.func_70037_a");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityHorse.func_184601_bQ");

	/**
	 * <p>
	 * Name: wearsArmor
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190677_dK = McMappingDatabase.getSRG("EntityHorse.func_190677_dK");

	/**
	 * <p>
	 * Name: HORSE_MARKING_TEXTURES_ABBR
	 * </p>
	 */
	public static McObfPair field_110292_bC = McMappingDatabase.getSRG("field_110292_bC");

	/**
	 * <p>
	 * Name: registerFixesHorse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189803_b = McMappingDatabase.getSRG("EntityHorse.func_189803_b");

	/**
	 * <p>
	 * Name: getHorseTexture
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110264_co = McMappingDatabase.getSRG("EntityHorse.func_110264_co");

	/**
	 * <p>
	 * Name: horseTexturesArray
	 * </p>
	 */
	public static McObfPair field_110280_bR = McMappingDatabase.getSRG("field_110280_bR");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityHorse.func_184639_G");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityHorse.func_184647_J");

	/**
	 * <p>
	 * Name: HORSE_TEXTURES_ABBR
	 * </p>
	 */
	public static McObfPair field_110269_bA = McMappingDatabase.getSRG("field_110269_bA");

	/**
	 * <p>
	 * Name: playGallopSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/SoundType;)V]
	 * </p>
	 */
	public static McObfPair func_190680_a = McMappingDatabase.getSRG("EntityHorse.func_190680_a");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityHorse.func_180482_a");

	/**
	 * <p>
	 * Name: ARMOR_MODIFIER_UUID
	 * </p>
	 */
	public static McObfPair field_184786_bD = McMappingDatabase.getSRG("field_184786_bD");

	/**
	 * <p>
	 * Name: getAngrySound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184785_dv = McMappingDatabase.getSRG("EntityHorse.func_184785_dv");

	/**
	 * <p>
	 * Name: resetTexturePrefix
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110230_cF = McMappingDatabase.getSRG("EntityHorse.func_110230_cF");

	/**
	 * <p>
	 * Name: HORSE_MARKING_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110291_bB = McMappingDatabase.getSRG("field_110291_bB");

	/**
	 * <p>
	 * Name: getVariantTexturePaths
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110212_cp = McMappingDatabase.getSRG("EntityHorse.func_110212_cp");

	/**
	 * <p>
	 * Name: setHorseArmorStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_146086_d = McMappingDatabase.getSRG("EntityHorse.func_146086_d");

	/**
	 * <p>
	 * Name: texturePrefix
	 * </p>
	 */
	public static McObfPair field_110286_bQ = McMappingDatabase.getSRG("field_110286_bQ");

	/**
	 * <p>
	 * Name: isArmor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_190682_f = McMappingDatabase.getSRG("EntityHorse.func_190682_f");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityHorse.func_70014_b");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityHorse.func_110147_ax");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityHorse.func_70071_h_");

	/**
	 * <p>
	 * Name: HORSE_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110268_bz = McMappingDatabase.getSRG("field_110268_bz");

	/**
	 * <p>
	 * Name: onInventoryChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/IInventory;)V]
	 * </p>
	 */
	public static McObfPair func_76316_a = McMappingDatabase.getSRG("EntityHorse.func_76316_a");

	/**
	 * <p>
	 * Name: HORSE_VARIANT
	 * </p>
	 */
	public static McObfPair field_184789_bG = McMappingDatabase.getSRG("field_184789_bG");

	/**
	 * <p>
	 * Name: updateHorseSlots
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110232_cE = McMappingDatabase.getSRG("EntityHorse.func_110232_cE");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityHorse.func_184645_a");

	/**
	 * <p>
	 * Name: HORSE_ARMOR
	 * </p>
	 */
	public static McObfPair field_184791_bI = McMappingDatabase.getSRG("field_184791_bI");

}
