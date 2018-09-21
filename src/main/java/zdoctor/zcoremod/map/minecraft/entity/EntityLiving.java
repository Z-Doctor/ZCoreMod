package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLiving {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vq";
		else
			return "net/minecraft/entity/EntityLiving";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vq";
		else
			return "EntityLiving";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvq;";
		else
			return "Lnet/minecraft/entity/EntityLiving;";
	}

	/**
	 * <p>
	 * Name: canDespawn
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70692_ba = McMappingDatabase.getSRG("EntityLiving.func_70692_ba");

	/**
	 * <p>
	 * Name: getLeashHolder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_110166_bE = McMappingDatabase.getSRG("EntityLiving.func_110166_bE");

	/**
	 * <p>
	 * Name: onEntityUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70030_z = McMappingDatabase.getSRG("EntityLiving.func_70030_z");

	/**
	 * <p>
	 * Name: eatGrassBonus
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70615_aA = McMappingDatabase.getSRG("EntityLiving.func_70615_aA");

	/**
	 * <p>
	 * Name: updateDistance
	 * </p>
	 * <p>
	 * Desc: [(FF)F]
	 * </p>
	 */
	public static McObfPair func_110146_f = McMappingDatabase.getSRG("EntityLiving.func_110146_f");

	/**
	 * <p>
	 * Name: targetTasks
	 * </p>
	 */
	public static McObfPair field_70715_bh = McMappingDatabase.getSRG("field_70715_bh");

	/**
	 * <p>
	 * Name: registerFixesMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;Ljava/lang/Class;)V]
	 * </p>
	 */
	public static McObfPair func_189752_a = McMappingDatabase.getSRG("EntityLiving.func_189752_a");

	/**
	 * <p>
	 * Name: getPathPriority
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathNodeType;)F]
	 * </p>
	 */
	public static McObfPair func_184643_a = McMappingDatabase.getSRG("EntityLiving.func_184643_a");

	/**
	 * <p>
	 * Name: createNavigator
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)Lnet/minecraft/pathfinding/PathNavigate;]
	 * </p>
	 */
	public static McObfPair func_175447_b = McMappingDatabase.getSRG("EntityLiving.func_175447_b");

	/**
	 * <p>
	 * Name: setPathPriority
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/pathfinding/PathNodeType;F)V]
	 * </p>
	 */
	public static McObfPair func_184644_a = McMappingDatabase.getSRG("EntityLiving.func_184644_a");

	/**
	 * <p>
	 * Name: setLeashHolder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Z)V]
	 * </p>
	 */
	public static McObfPair func_110162_b = McMappingDatabase.getSRG("EntityLiving.func_110162_b");

	/**
	 * <p>
	 * Name: applyEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175456_n = McMappingDatabase.getSRG("EntityLiving.func_175456_n");

	/**
	 * <p>
	 * Name: setAIMoveSpeed
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70659_e = McMappingDatabase.getSRG("EntityLiving.func_70659_e");

	/**
	 * <p>
	 * Name: setCanPickUpLoot
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_98053_h = McMappingDatabase.getSRG("EntityLiving.func_98053_h");

	/**
	 * <p>
	 * Name: getTalkInterval
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70627_aG = McMappingDatabase.getSRG("EntityLiving.func_70627_aG");

	/**
	 * <p>
	 * Name: applyEntityAttributes
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110147_ax = McMappingDatabase.getSRG("EntityLiving.func_110147_ax");

	/**
	 * <p>
	 * Name: getArmorByChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_184636_a = McMappingDatabase.getSRG("EntityLiving.func_184636_a");

	/**
	 * <p>
	 * Name: canPickUpLoot
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_98052_bS = McMappingDatabase.getSRG("EntityLiving.func_98052_bS");

	/**
	 * <p>
	 * Name: bodyHelper
	 * </p>
	 */
	public static McObfPair field_70762_j = McMappingDatabase.getSRG("field_70762_j");

	/**
	 * <p>
	 * Name: updateAITasks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70619_bc = McMappingDatabase.getSRG("EntityLiving.func_70619_bc");

	/**
	 * <p>
	 * Name: getPrimaryHand
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/EnumHandSide;]
	 * </p>
	 */
	public static McObfPair func_184591_cq = McMappingDatabase.getSRG("EntityLiving.func_184591_cq");

	/**
	 * <p>
	 * Name: getHorizontalFaceSpeed
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_184649_cE = McMappingDatabase.getSRG("EntityLiving.func_184649_cE");

	/**
	 * <p>
	 * Name: getMaxFallHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82143_as = McMappingDatabase.getSRG("EntityLiving.func_82143_as");

	/**
	 * <p>
	 * Name: onInitialSpawn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;]
	 * </p>
	 */
	public static McObfPair func_180482_a = McMappingDatabase.getSRG("EntityLiving.func_180482_a");

	/**
	 * <p>
	 * Name: inventoryArmor
	 * </p>
	 */
	public static McObfPair field_184657_bw = McMappingDatabase.getSRG("field_184657_bw");

	/**
	 * <p>
	 * Name: isLeftHanded
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184638_cS = McMappingDatabase.getSRG("EntityLiving.func_184638_cS");

	/**
	 * <p>
	 * Name: deathLootTableSeed
	 * </p>
	 */
	public static McObfPair field_184653_bB = McMappingDatabase.getSRG("field_184653_bB");

	/**
	 * <p>
	 * Name: AI_FLAGS
	 * </p>
	 */
	public static McObfPair field_184654_a = McMappingDatabase.getSRG("field_184654_a");

	/**
	 * <p>
	 * Name: getNavigator
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/pathfinding/PathNavigate;]
	 * </p>
	 */
	public static McObfPair func_70661_as = McMappingDatabase.getSRG("EntityLiving.func_70661_as");

	/**
	 * <p>
	 * Name: setEquipmentBasedOnDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180481_a = McMappingDatabase.getSRG("EntityLiving.func_180481_a");

	/**
	 * <p>
	 * Name: dropLoot
	 * </p>
	 * <p>
	 * Desc: [(ZILnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_184610_a = McMappingDatabase.getSRG("EntityLiving.func_184610_a");

	/**
	 * <p>
	 * Name: setItemStackToSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_184201_a = McMappingDatabase.getSRG("EntityLiving.func_184201_a");

	/**
	 * <p>
	 * Name: navigator
	 * </p>
	 */
	public static McObfPair field_70699_by = McMappingDatabase.getSRG("field_70699_by");

	/**
	 * <p>
	 * Name: isNoDespawnRequired
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_104002_bU = McMappingDatabase.getSRG("EntityLiving.func_104002_bU");

	/**
	 * <p>
	 * Name: senses
	 * </p>
	 */
	public static McObfPair field_70723_bA = McMappingDatabase.getSRG("field_70723_bA");

	/**
	 * <p>
	 * Name: playLivingSound
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70642_aH = McMappingDatabase.getSRG("EntityLiving.func_70642_aH");

	/**
	 * <p>
	 * Name: isNotColliding
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70058_J = McMappingDatabase.getSRG("EntityLiving.func_70058_J");

	/**
	 * <p>
	 * Name: deathLootTable
	 * </p>
	 */
	public static McObfPair field_184659_bA = McMappingDatabase.getSRG("field_184659_bA");

	/**
	 * <p>
	 * Name: inventoryArmorDropChances
	 * </p>
	 */
	public static McObfPair field_184655_bs = McMappingDatabase.getSRG("field_184655_bs");

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184647_J = McMappingDatabase.getSRG("EntityLiving.func_184647_J");

	/**
	 * <p>
	 * Name: isLeashed
	 * </p>
	 */
	public static McObfPair field_110169_bv = McMappingDatabase.getSRG("field_110169_bv");

	/**
	 * <p>
	 * Name: getCanSpawnHere
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70601_bi = McMappingDatabase.getSRG("EntityLiving.func_70601_bi");

	/**
	 * <p>
	 * Name: getRenderSizeModifier
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_70603_bj = McMappingDatabase.getSRG("EntityLiving.func_70603_bj");

	/**
	 * <p>
	 * Name: despawnEntity
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70623_bb = McMappingDatabase.getSRG("EntityLiving.func_70623_bb");

	/**
	 * <p>
	 * Name: setMoveForward
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_191989_p = McMappingDatabase.getSRG("EntityLiving.func_191989_p");

	/**
	 * <p>
	 * Name: writeEntityToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70014_b = McMappingDatabase.getSRG("EntityLiving.func_70014_b");

	/**
	 * <p>
	 * Name: isServerWorld
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70613_aW = McMappingDatabase.getSRG("EntityLiving.func_70613_aW");

	/**
	 * <p>
	 * Name: lookHelper
	 * </p>
	 */
	public static McObfPair field_70749_g = McMappingDatabase.getSRG("field_70749_g");

	/**
	 * <p>
	 * Name: recreateLeash
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110165_bF = McMappingDatabase.getSRG("EntityLiving.func_110165_bF");

	/**
	 * <p>
	 * Name: getLeashed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110167_bD = McMappingDatabase.getSRG("EntityLiving.func_110167_bD");

	/**
	 * <p>
	 * Name: setAttackTarget
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_70624_b = McMappingDatabase.getSRG("EntityLiving.func_70624_b");

	/**
	 * <p>
	 * Name: setDropChance
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;F)V]
	 * </p>
	 */
	public static McObfPair func_184642_a = McMappingDatabase.getSRG("EntityLiving.func_184642_a");

	/**
	 * <p>
	 * Name: getExperiencePoints
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)I]
	 * </p>
	 */
	public static McObfPair func_70693_a = McMappingDatabase.getSRG("EntityLiving.func_70693_a");

	/**
	 * <p>
	 * Name: inventoryHands
	 * </p>
	 */
	public static McObfPair field_184656_bv = McMappingDatabase.getSRG("field_184656_bv");

	/**
	 * <p>
	 * Name: getJumpHelper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/EntityJumpHelper;]
	 * </p>
	 */
	public static McObfPair func_70683_ar = McMappingDatabase.getSRG("EntityLiving.func_70683_ar");

	/**
	 * <p>
	 * Name: moveHelper
	 * </p>
	 */
	public static McObfPair field_70765_h = McMappingDatabase.getSRG("field_70765_h");

	/**
	 * <p>
	 * Name: getArmorInventoryList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184193_aE = McMappingDatabase.getSRG("EntityLiving.func_184193_aE");

	/**
	 * <p>
	 * Name: startRiding
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Z)Z]
	 * </p>
	 */
	public static McObfPair func_184205_a = McMappingDatabase.getSRG("EntityLiving.func_184205_a");

	/**
	 * <p>
	 * Name: initEntityAI
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184651_r = McMappingDatabase.getSRG("EntityLiving.func_184651_r");

	/**
	 * <p>
	 * Name: faceEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FF)V]
	 * </p>
	 */
	public static McObfPair func_70625_a = McMappingDatabase.getSRG("EntityLiving.func_70625_a");

	/**
	 * <p>
	 * Name: attackTarget
	 * </p>
	 */
	public static McObfPair field_70696_bz = McMappingDatabase.getSRG("field_70696_bz");

	/**
	 * <p>
	 * Name: jumpHelper
	 * </p>
	 */
	public static McObfPair field_70767_i = McMappingDatabase.getSRG("field_70767_i");

	/**
	 * <p>
	 * Name: updateRotation
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_70663_b = McMappingDatabase.getSRG("EntityLiving.func_70663_b");

	/**
	 * <p>
	 * Name: experienceValue
	 * </p>
	 */
	public static McObfPair field_70728_aV = McMappingDatabase.getSRG("field_70728_aV");

	/**
	 * <p>
	 * Name: processInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184645_a = McMappingDatabase.getSRG("EntityLiving.func_184645_a");

	/**
	 * <p>
	 * Name: getDropItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_146068_u = McMappingDatabase.getSRG("EntityLiving.func_146068_u");

	/**
	 * <p>
	 * Name: getSlotForItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/inventory/EntityEquipmentSlot;]
	 * </p>
	 */
	public static McObfPair func_184640_d = McMappingDatabase.getSRG("EntityLiving.func_184640_d");

	/**
	 * <p>
	 * Name: setMoveVertical
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_70657_f = McMappingDatabase.getSRG("EntityLiving.func_70657_f");

	/**
	 * <p>
	 * Name: entityInit
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70088_a = McMappingDatabase.getSRG("EntityLiving.func_70088_a");

	/**
	 * <p>
	 * Name: setNoAI
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_94061_f = McMappingDatabase.getSRG("EntityLiving.func_94061_f");

	/**
	 * <p>
	 * Name: mapPathPriority
	 * </p>
	 */
	public static McObfPair field_184658_bz = McMappingDatabase.getSRG("field_184658_bz");

	/**
	 * <p>
	 * Name: isItemStackInSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_184648_b = McMappingDatabase.getSRG("EntityLiving.func_184648_b");

	/**
	 * <p>
	 * Name: updateEntityActionState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70626_be = McMappingDatabase.getSRG("EntityLiving.func_70626_be");

	/**
	 * <p>
	 * Name: clearLeashed
	 * </p>
	 * <p>
	 * Desc: [(ZZ)V]
	 * </p>
	 */
	public static McObfPair func_110160_i = McMappingDatabase.getSRG("EntityLiving.func_110160_i");

	/**
	 * <p>
	 * Name: playHurtSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)V]
	 * </p>
	 */
	public static McObfPair func_184581_c = McMappingDatabase.getSRG("EntityLiving.func_184581_c");

	/**
	 * <p>
	 * Name: canPickUpLoot
	 * </p>
	 */
	public static McObfPair field_82172_bs = McMappingDatabase.getSRG("field_82172_bs");

	/**
	 * <p>
	 * Name: getVerticalFaceSpeed
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70646_bf = McMappingDatabase.getSRG("EntityLiving.func_70646_bf");

	/**
	 * <p>
	 * Name: createBodyHelper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityBodyHelper;]
	 * </p>
	 */
	public static McObfPair func_184650_s = McMappingDatabase.getSRG("EntityLiving.func_184650_s");

	/**
	 * <p>
	 * Name: getEntitySenses
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/EntitySenses;]
	 * </p>
	 */
	public static McObfPair func_70635_at = McMappingDatabase.getSRG("EntityLiving.func_70635_at");

	/**
	 * <p>
	 * Name: canBeSteered
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82171_bF = McMappingDatabase.getSRG("EntityLiving.func_82171_bF");

	/**
	 * <p>
	 * Name: spawnExplosionParticle
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70656_aK = McMappingDatabase.getSRG("EntityLiving.func_70656_aK");

	/**
	 * <p>
	 * Name: handleStatusUpdate
	 * </p>
	 * <p>
	 * Desc: [(B)V]
	 * </p>
	 */
	public static McObfPair func_70103_a = McMappingDatabase.getSRG("EntityLiving.func_70103_a");

	/**
	 * <p>
	 * Name: persistenceRequired
	 * </p>
	 */
	public static McObfPair field_82179_bU = McMappingDatabase.getSRG("field_82179_bU");

	/**
	 * <p>
	 * Name: inventoryHandsDropChances
	 * </p>
	 */
	public static McObfPair field_82174_bp = McMappingDatabase.getSRG("field_82174_bp");

	/**
	 * <p>
	 * Name: replaceItemInInventory
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_174820_d = McMappingDatabase.getSRG("EntityLiving.func_174820_d");

	/**
	 * <p>
	 * Name: processInitialInteract
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_184230_a = McMappingDatabase.getSRG("EntityLiving.func_184230_a");

	/**
	 * <p>
	 * Name: getItemStackFromSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_184582_a = McMappingDatabase.getSRG("EntityLiving.func_184582_a");

	/**
	 * <p>
	 * Name: dropFewItems
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_70628_a = McMappingDatabase.getSRG("EntityLiving.func_70628_a");

	/**
	 * <p>
	 * Name: updateEquipmentIfNeeded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItem;)V]
	 * </p>
	 */
	public static McObfPair func_175445_a = McMappingDatabase.getSRG("EntityLiving.func_175445_a");

	/**
	 * <p>
	 * Name: tasks
	 * </p>
	 */
	public static McObfPair field_70714_bg = McMappingDatabase.getSRG("field_70714_bg");

	/**
	 * <p>
	 * Name: canPassengerSteer
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184186_bw = McMappingDatabase.getSRG("EntityLiving.func_184186_bw");

	/**
	 * <p>
	 * Name: getHeldEquipment
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/Iterable;]
	 * </p>
	 */
	public static McObfPair func_184214_aD = McMappingDatabase.getSRG("EntityLiving.func_184214_aD");

	/**
	 * <p>
	 * Name: getMoveHelper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/EntityMoveHelper;]
	 * </p>
	 */
	public static McObfPair func_70605_aq = McMappingDatabase.getSRG("EntityLiving.func_70605_aq");

	/**
	 * <p>
	 * Name: isAIDisabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_175446_cd = McMappingDatabase.getSRG("EntityLiving.func_175446_cd");

	/**
	 * <p>
	 * Name: dropEquipment
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_82160_b = McMappingDatabase.getSRG("EntityLiving.func_82160_b");

	/**
	 * <p>
	 * Name: canBeLeashedTo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Z]
	 * </p>
	 */
	public static McObfPair func_184652_a = McMappingDatabase.getSRG("EntityLiving.func_184652_a");

	/**
	 * <p>
	 * Name: getAmbientSound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_184639_G = McMappingDatabase.getSRG("EntityLiving.func_184639_G");

	/**
	 * <p>
	 * Name: readEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_70037_a = McMappingDatabase.getSRG("EntityLiving.func_70037_a");

	/**
	 * <p>
	 * Name: leashHolder
	 * </p>
	 */
	public static McObfPair field_110168_bw = McMappingDatabase.getSRG("field_110168_bw");

	/**
	 * <p>
	 * Name: onLivingUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70636_d = McMappingDatabase.getSRG("EntityLiving.func_70636_d");

	/**
	 * <p>
	 * Name: setMoveStrafing
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_184646_p = McMappingDatabase.getSRG("EntityLiving.func_184646_p");

	/**
	 * <p>
	 * Name: getAttackTarget
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/EntityLivingBase;]
	 * </p>
	 */
	public static McObfPair func_70638_az = McMappingDatabase.getSRG("EntityLiving.func_70638_az");

	/**
	 * <p>
	 * Name: canAttackClass
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Z]
	 * </p>
	 */
	public static McObfPair func_70686_a = McMappingDatabase.getSRG("EntityLiving.func_70686_a");

	/**
	 * <p>
	 * Name: leashNBTTag
	 * </p>
	 */
	public static McObfPair field_110170_bx = McMappingDatabase.getSRG("field_110170_bx");

	/**
	 * <p>
	 * Name: canEquipItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_175448_a = McMappingDatabase.getSRG("EntityLiving.func_175448_a");

	/**
	 * <p>
	 * Name: setLeftHanded
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_184641_n = McMappingDatabase.getSRG("EntityLiving.func_184641_n");

	/**
	 * <p>
	 * Name: setEnchantmentBasedOnDifficulty
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/DifficultyInstance;)V]
	 * </p>
	 */
	public static McObfPair func_180483_b = McMappingDatabase.getSRG("EntityLiving.func_180483_b");

	/**
	 * <p>
	 * Name: getMaxSpawnedInChunk
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_70641_bl = McMappingDatabase.getSRG("EntityLiving.func_70641_bl");

	/**
	 * <p>
	 * Name: enablePersistence
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110163_bv = McMappingDatabase.getSRG("EntityLiving.func_110163_bv");

	/**
	 * <p>
	 * Name: updateLeashedState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110159_bB = McMappingDatabase.getSRG("EntityLiving.func_110159_bB");

	/**
	 * <p>
	 * Name: getLookHelper
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/ai/EntityLookHelper;]
	 * </p>
	 */
	public static McObfPair func_70671_ap = McMappingDatabase.getSRG("EntityLiving.func_70671_ap");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70071_h_ = McMappingDatabase.getSRG("EntityLiving.func_70071_h_");

	/**
	 * <p>
	 * Name: livingSoundTime
	 * </p>
	 */
	public static McObfPair field_70757_a = McMappingDatabase.getSRG("field_70757_a");

}
