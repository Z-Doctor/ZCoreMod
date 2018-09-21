package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady";
		else
			return "net/minecraft/entity/passive/EntityVillager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady";
		else
			return "EntityVillager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager;";
	}

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityVillager.func_70103_a");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityVillager.func_70037_a");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityVillager.func_184647_J");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_190670_t_ = McMappingDatabase.getSRG("EntityVillager.func_190670_t_");

	/**
	 * <p>
	 * Name: timeUntilReset
	 * </p>
	 */
	public static McObfPair field_70961_j = McMappingDatabase.getSRG("field_70961_j");

	/**
	 * <p>
	 * Name: hasEnoughItems
	 * </p>
	 * <p>
	 * Desc: [(I)Z]
	 * </p>
	 */
	public static McObfPair func_175559_s = McMappingDatabase.getSRG("EntityVillager.func_175559_s");

	/**
	 * <p>
	 * Name: canVillagerPickupItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Z]
	 * </p>
	 */
	public static McObfPair func_175558_a = McMappingDatabase.getSRG("EntityVillager.func_175558_a");

	/**
	 * <p>
	 * Name: areAdditionalTasksSet
	 * </p>
	 */
	public static McObfPair field_175564_by = McMappingDatabase.getSRG("field_175564_by");

	/**
	 * <p>
	 * Name: villagerInventory
	 * </p>
	 */
	public static McObfPair field_175560_bz = McMappingDatabase.getSRG("field_175560_bz");

	/**
	 * <p>
	 * Name: createChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/EntityAgeable;, (Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityVillager;]
	 * </p>
	 */
	public static McObfPair func_90011_a = McMappingDatabase.getSRG("EntityVillager.func_90011_a");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityVillager.func_70088_a");

	/**
	 * <p>
	 * Name: setAdditionalAItasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175552_ct = McMappingDatabase.getSRG("EntityVillager.func_175552_ct");

	/**
	 * <p>
	 * Name: getHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184601_bQ = McMappingDatabase.getSRG("EntityVillager.func_184601_bQ");

	/**
	 * <p>
	 * Name: wantsMoreFood
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175557_cr = McMappingDatabase.getSRG("EntityVillager.func_175557_cr");

	/**
	 * <p>
	 * Name: needsInitilization
	 * </p>
	 */
	public static McObfPair field_70959_by = McMappingDatabase.getSRG("field_70959_by");

	/**
	 * <p>
	 * Name: canBeLeashedTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_184652_a = McMappingDatabase.getSRG("EntityVillager.func_184652_a");

	/**
	 * <p>
	 * Name: setIsWillingToMate
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_175549_o = McMappingDatabase.getSRG("EntityVillager.func_175549_o");

	/**
	 * <p>
	 * Name: getCustomer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/player/EntityPlayer;]
	 * </p>
	 */
	public static McObfPair func_70931_l_ = McMappingDatabase.getSRG("EntityVillager.func_70931_l_");

	/**
	 * <p>
	 * Name: setPlaying
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70939_f = McMappingDatabase.getSRG("EntityVillager.func_70939_f");

	/**
	 * <p>
	 * Name: DEFAULT_TRADE_LIST_MAP
	 * </p>
	 */
	public static McObfPair field_175561_bA = McMappingDatabase.getSRG("field_175561_bA");

	/**
	 * <p>
	 * Name: finalizeMobSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;Z)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_190672_a = McMappingDatabase.getSRG("EntityVillager.func_190672_a");

	/**
	 * <p>
	 * Name: setCustomer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_70932_a_ = McMappingDatabase.getSRG("EntityVillager.func_70932_a_");

	/**
	 * <p>
	 * Name: getRecipes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/village/MerchantRecipeList;]
	 * </p>
	 */
	public static McObfPair func_70934_b = McMappingDatabase.getSRG("EntityVillager.func_70934_b");

	/**
	 * <p>
	 * Name: buyingPlayer
	 * </p>
	 */
	public static McObfPair field_70962_h = McMappingDatabase.getSRG("field_70962_h");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("EntityVillager.func_145748_c_");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityVillager.func_70014_b");

	/**
	 * <p>
	 * Name: canDespawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70692_ba = McMappingDatabase.getSRG("EntityVillager.func_70692_ba");

	/**
	 * <p>
	 * Name: hasEnoughFoodToBreed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175553_cp = McMappingDatabase.getSRG("EntityVillager.func_175553_cp");

	/**
	 * <p>
	 * Name: populateBuyingList
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175554_cu = McMappingDatabase.getSRG("EntityVillager.func_175554_cu");

	/**
	 * <p>
	 * Name: isMating
	 * </p>
	 */
	public static McObfPair field_70952_f = McMappingDatabase.getSRG("field_70952_f");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityVillager.func_184651_r");

	/**
	 * <p>
	 * Name: buyingList
	 * </p>
	 */
	public static McObfPair field_70963_i = McMappingDatabase.getSRG("field_70963_i");

	/**
	 * <p>
	 * Name: wealth
	 * </p>
	 */
	public static McObfPair field_70956_bz = McMappingDatabase.getSRG("field_70956_bz");

	/**
	 * <p>
	 * Name: setMating
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_70947_e = McMappingDatabase.getSRG("EntityVillager.func_70947_e");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityVillager.func_184645_a");

	/**
	 * <p>
	 * Name: setRecipes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/MerchantRecipeList;)V]
	 * </p>
	 */
	public static McObfPair func_70930_a = McMappingDatabase.getSRG("EntityVillager.func_70930_a");

	/**
	 * <p>
	 * Name: getProfession
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70946_n = McMappingDatabase.getSRG("EntityVillager.func_70946_n");

	/**
	 * <p>
	 * Name: setLookingForHome
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82187_q = McMappingDatabase.getSRG("EntityVillager.func_82187_q");

	/**
	 * <p>
	 * Name: getVillagerInventory
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/inventory/InventoryBasic;]
	 * </p>
	 */
	public static McObfPair func_175551_co = McMappingDatabase.getSRG("EntityVillager.func_175551_co");

	/**
	 * <p>
	 * Name: getIsWillingToMate
	 * </p>
	 * <p>
	 * Desc: [(Z)Z]
	 * </p>
	 */
	public static McObfPair func_175550_n = McMappingDatabase.getSRG("EntityVillager.func_175550_n");

	/**
	 * <p>
	 * Name: isPlaying
	 * </p>
	 */
	public static McObfPair field_70953_g = McMappingDatabase.getSRG("field_70953_g");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityVillager.func_184639_G");

	/**
	 * <p>
	 * Name: isFarmItemInInventory
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175556_cs = McMappingDatabase.getSRG("EntityVillager.func_175556_cs");

	/**
	 * <p>
	 * Name: PROFESSION
	 * </p>
	 */
	public static McObfPair field_184752_bw = McMappingDatabase.getSRG("field_184752_bw");

	/**
	 * <p>
	 * Name: setProfession
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_70938_b = McMappingDatabase.getSRG("EntityVillager.func_70938_b");

	/**
	 * <p>
	 * Name: isTrading
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70940_q = McMappingDatabase.getSRG("EntityVillager.func_70940_q");

	/**
	 * <p>
	 * Name: spawnParticles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumParticleTypes;)V]
	 * </p>
	 */
	public static McObfPair func_180489_a = McMappingDatabase.getSRG("EntityVillager.func_180489_a");

	/**
	 * <p>
	 * Name: isMating
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70941_o = McMappingDatabase.getSRG("EntityVillager.func_70941_o");

	/**
	 * <p>
	 * Name: updateEquipmentIfNeeded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItem;)V]
	 * </p>
	 */
	public static McObfPair func_175445_a = McMappingDatabase.getSRG("EntityVillager.func_175445_a");

	/**
	 * <p>
	 * Name: replaceItemInInventory
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_174820_d = McMappingDatabase.getSRG("EntityVillager.func_174820_d");

	/**
	 * <p>
	 * Name: randomTickDivider
	 * </p>
	 */
	public static McObfPair field_70955_e = McMappingDatabase.getSRG("field_70955_e");

	/**
	 * <p>
	 * Name: careerLevel
	 * </p>
	 */
	public static McObfPair field_175562_bw = McMappingDatabase.getSRG("field_175562_bw");

	/**
	 * <p>
	 * Name: onStruckByLightning
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/effect/EntityLightningBolt;)V]
	 * </p>
	 */
	public static McObfPair func_70077_a = McMappingDatabase.getSRG("EntityVillager.func_70077_a");

	/**
	 * <p>
	 * Name: registerFixesVillager
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189785_b = McMappingDatabase.getSRG("EntityVillager.func_189785_b");

	/**
	 * <p>
	 * Name: getDeathSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184615_bR = McMappingDatabase.getSRG("EntityVillager.func_184615_bR");

	/**
	 * <p>
	 * Name: village
	 * </p>
	 */
	public static McObfPair field_70954_d = McMappingDatabase.getSRG("field_70954_d");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityVillager.func_70619_bc");

	/**
	 * <p>
	 * Name: careerId
	 * </p>
	 */
	public static McObfPair field_175563_bv = McMappingDatabase.getSRG("field_175563_bv");

	/**
	 * <p>
	 * Name: setRevengeTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70604_c = McMappingDatabase.getSRG("EntityVillager.func_70604_c");

	/**
	 * <p>
	 * Name: useRecipe
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/village/MerchantRecipe;)V]
	 * </p>
	 */
	public static McObfPair func_70933_a = McMappingDatabase.getSRG("EntityVillager.func_70933_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_190674_bx = McMappingDatabase.getSRG("field_190674_bx");

	/**
	 * <p>
	 * Name: getEyeHeight
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70047_e = McMappingDatabase.getSRG("EntityVillager.func_70047_e");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityVillager.func_180482_a");

	/**
	 * <p>
	 * Name: verifySellingItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_110297_a_ = McMappingDatabase.getSRG("EntityVillager.func_110297_a_");

	/**
	 * <p>
	 * Name: isPlaying
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70945_p = McMappingDatabase.getSRG("EntityVillager.func_70945_p");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityVillager.func_110147_ax");

	/**
	 * <p>
	 * Name: onDeath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_70645_a = McMappingDatabase.getSRG("EntityVillager.func_70645_a");

	/**
	 * <p>
	 * Name: canAbondonItems
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175555_cq = McMappingDatabase.getSRG("EntityVillager.func_175555_cq");

	/**
	 * <p>
	 * Name: isLookingForHome
	 * </p>
	 */
	public static McObfPair field_82190_bM = McMappingDatabase.getSRG("field_82190_bM");

	/**
	 * <p>
	 * Name: isWillingToMate
	 * </p>
	 */
	public static McObfPair field_175565_bs = McMappingDatabase.getSRG("field_175565_bs");

	/**
	 * <p>
	 * Name: getPos
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_190671_u_ = McMappingDatabase.getSRG("EntityVillager.func_190671_u_");

	/**
	 * <p>
	 * Name: onGrowingAdult
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175500_n = McMappingDatabase.getSRG("EntityVillager.func_175500_n");

	/**
	 * <p>
	 * Name: lastBuyingPlayer
	 * </p>
	 */
	public static McObfPair field_82189_bL = McMappingDatabase.getSRG("field_82189_bL");

}
