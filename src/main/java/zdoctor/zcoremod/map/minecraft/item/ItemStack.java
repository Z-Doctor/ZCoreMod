package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemStack {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aip";
		else
			return "net/minecraft/item/ItemStack";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aip";
		else
			return "ItemStack";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laip;";
		else
			return "Lnet/minecraft/item/ItemStack;";
	}

	/**
	 * <p>
	 * Name: getItemFrame
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/item/EntityItemFrame;]
	 * </p>
	 */
	public static McObfPair func_82836_z = McMappingDatabase.getSRG("ItemStack.func_82836_z");

	/**
	 * <p>
	 * Name: updateAnimation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;IZ)V]
	 * </p>
	 */
	public static McObfPair func_77945_a = McMappingDatabase.getSRG("ItemStack.func_77945_a");

	/**
	 * <p>
	 * Name: damageItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/entity/EntityLivingBase;)V]
	 * </p>
	 */
	public static McObfPair func_77972_a = McMappingDatabase.getSRG("ItemStack.func_77972_a");

	/**
	 * <p>
	 * Name: isStackable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77985_e = McMappingDatabase.getSRG("ItemStack.func_77985_e");

	/**
	 * <p>
	 * Name: itemFrame
	 * </p>
	 */
	public static McObfPair field_82843_f = McMappingDatabase.getSRG("field_82843_f");

	/**
	 * <p>
	 * Name: getHasSubtypes
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77981_g = McMappingDatabase.getSRG("ItemStack.func_77981_g");

	/**
	 * <p>
	 * Name: canHarvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_150998_b = McMappingDatabase.getSRG("ItemStack.func_150998_b");

	/**
	 * <p>
	 * Name: getMaxStackSize
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77976_d = McMappingDatabase.getSRG("ItemStack.func_77976_d");

	/**
	 * <p>
	 * Name: setCount
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190920_e = McMappingDatabase.getSRG("ItemStack.func_190920_e");

	/**
	 * <p>
	 * Name: useItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77957_a = McMappingDatabase.getSRG("ItemStack.func_77957_a");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_179546_a = McMappingDatabase.getSRG("ItemStack.func_179546_a");

	/**
	 * <p>
	 * Name: isOnItemFrame
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82839_y = McMappingDatabase.getSRG("ItemStack.func_82839_y");

	/**
	 * <p>
	 * Name: getCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190916_E = McMappingDatabase.getSRG("ItemStack.func_190916_E");

	/**
	 * <p>
	 * Name: getItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77973_b = McMappingDatabase.getSRG("ItemStack.func_77973_b");

	/**
	 * <p>
	 * Name: getRepairCost
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_82838_A = McMappingDatabase.getSRG("ItemStack.func_82838_A");

	/**
	 * <p>
	 * Name: canDestroy
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_179544_c = McMappingDatabase.getSRG("ItemStack.func_179544_c");

	/**
	 * <p>
	 * Name: addAttributeModifier
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/entity/ai/attributes/AttributeModifier;Lnet/minecraft/inventory/EntityEquipmentSlot;)V]
	 * </p>
	 */
	public static McObfPair func_185129_a = McMappingDatabase.getSRG("ItemStack.func_185129_a");

	/**
	 * <p>
	 * Name: getTooltip
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/client/util/ITooltipFlag;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_82840_a = McMappingDatabase.getSRG("ItemStack.func_82840_a");

	/**
	 * <p>
	 * Name: interactWithEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_111282_a = McMappingDatabase.getSRG("ItemStack.func_111282_a");

	/**
	 * <p>
	 * Name: isItemEqualIgnoreDurability
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185136_b = McMappingDatabase.getSRG("ItemStack.func_185136_b");

	/**
	 * <p>
	 * Name: canDestroyCacheResult
	 * </p>
	 */
	public static McObfPair field_179553_i = McMappingDatabase.getSRG("field_179553_i");

	/**
	 * <p>
	 * Name: onItemUseFinish
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77950_b = McMappingDatabase.getSRG("ItemStack.func_77950_b");

	/**
	 * <p>
	 * Name: areItemsEqualIgnoreDurability
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_185132_d = McMappingDatabase.getSRG("ItemStack.func_185132_d");

	/**
	 * <p>
	 * Name: getAnimationsToGo
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_190921_D = McMappingDatabase.getSRG("ItemStack.func_190921_D");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 */
	public static McObfPair field_190928_g = McMappingDatabase.getSRG("field_190928_g");

	/**
	 * <p>
	 * Name: removeSubCompound
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_190919_e = McMappingDatabase.getSRG("ItemStack.func_190919_e");

	/**
	 * <p>
	 * Name: addEnchantment
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/enchantment/Enchantment;I)V]
	 * </p>
	 */
	public static McObfPair func_77966_a = McMappingDatabase.getSRG("ItemStack.func_77966_a");

	/**
	 * <p>
	 * Name: setItemFrame
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItemFrame;)V]
	 * </p>
	 */
	public static McObfPair func_82842_a = McMappingDatabase.getSRG("ItemStack.func_82842_a");

	/**
	 * <p>
	 * Name: updateEmptyState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_190923_F = McMappingDatabase.getSRG("ItemStack.func_190923_F");

	/**
	 * <p>
	 * Name: hasTagCompound
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77942_o = McMappingDatabase.getSRG("ItemStack.func_77942_o");

	/**
	 * <p>
	 * Name: getItemUseAction
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/EnumAction;]
	 * </p>
	 */
	public static McObfPair func_77975_n = McMappingDatabase.getSRG("ItemStack.func_77975_n");

	/**
	 * <p>
	 * Name: hitEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_77961_a = McMappingDatabase.getSRG("ItemStack.func_77961_a");

	/**
	 * <p>
	 * Name: areItemStackTagsEqual
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77970_a = McMappingDatabase.getSRG("ItemStack.func_77970_a");

	/**
	 * <p>
	 * Name: setRepairCost
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_82841_c = McMappingDatabase.getSRG("ItemStack.func_82841_c");

	/**
	 * <p>
	 * Name: areItemsEqual
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_179545_c = McMappingDatabase.getSRG("ItemStack.func_179545_c");

	/**
	 * <p>
	 * Name: registerFixes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/datafix/DataFixer;)V]
	 * </p>
	 */
	public static McObfPair func_189868_a = McMappingDatabase.getSRG("ItemStack.func_189868_a");

	/**
	 * <p>
	 * Name: canEditBlocks
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82835_x = McMappingDatabase.getSRG("ItemStack.func_82835_x");

	/**
	 * <p>
	 * Name: isItemEqual
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77969_a = McMappingDatabase.getSRG("ItemStack.func_77969_a");

	/**
	 * <p>
	 * Name: getMaxDamage
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77958_k = McMappingDatabase.getSRG("ItemStack.func_77958_k");

	/**
	 * <p>
	 * Name: DECIMALFORMAT
	 * </p>
	 */
	public static McObfPair field_111284_a = McMappingDatabase.getSRG("field_111284_a");

	/**
	 * <p>
	 * Name: areItemStacksEqual
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77989_b = McMappingDatabase.getSRG("ItemStack.func_77989_b");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77960_j = McMappingDatabase.getSRG("ItemStack.func_77960_j");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_151002_e = McMappingDatabase.getSRG("field_151002_e");

	/**
	 * <p>
	 * Name: isItemStackDamageable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77984_f = McMappingDatabase.getSRG("ItemStack.func_77984_f");

	/**
	 * <p>
	 * Name: attemptDamageItem
	 * </p>
	 * <p>
	 * Desc: [(ILjava/util/Random;Lnet/minecraft/entity/player/EntityPlayerMP;)Z]
	 * </p>
	 */
	public static McObfPair func_96631_a = McMappingDatabase.getSRG("ItemStack.func_96631_a");

	/**
	 * <p>
	 * Name: canPlaceOnCacheBlock
	 * </p>
	 */
	public static McObfPair field_179550_j = McMappingDatabase.getSRG("field_179550_j");

	/**
	 * <p>
	 * Name: setStackDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_151001_c = McMappingDatabase.getSRG("ItemStack.func_151001_c");

	/**
	 * <p>
	 * Name: stackSize
	 * </p>
	 */
	public static McObfPair field_77994_a = McMappingDatabase.getSRG("field_77994_a");

	/**
	 * <p>
	 * Name: getAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lcom/google/common/collect/Multimap;]
	 * </p>
	 */
	public static McObfPair func_111283_C = McMappingDatabase.getSRG("ItemStack.func_111283_C");

	/**
	 * <p>
	 * Name: EMPTY
	 * </p>
	 */
	public static McObfPair field_190927_a = McMappingDatabase.getSRG("field_190927_a");

	/**
	 * <p>
	 * Name: writeToNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_77955_b = McMappingDatabase.getSRG("ItemStack.func_77955_b");

	/**
	 * <p>
	 * Name: getMaxItemUseDuration
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77988_m = McMappingDatabase.getSRG("ItemStack.func_77988_m");

	/**
	 * <p>
	 * Name: hasEffect
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77962_s = McMappingDatabase.getSRG("ItemStack.func_77962_s");

	/**
	 * <p>
	 * Name: clearCustomName
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_135074_t = McMappingDatabase.getSRG("ItemStack.func_135074_t");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77977_a = McMappingDatabase.getSRG("ItemStack.func_77977_a");

	/**
	 * <p>
	 * Name: getDestroySpeed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_150997_a = McMappingDatabase.getSRG("ItemStack.func_150997_a");

	/**
	 * <p>
	 * Name: getEnchantmentTagList
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagList;]
	 * </p>
	 */
	public static McObfPair func_77986_q = McMappingDatabase.getSRG("ItemStack.func_77986_q");

	/**
	 * <p>
	 * Name: stackTagCompound
	 * </p>
	 */
	public static McObfPair field_77990_d = McMappingDatabase.getSRG("field_77990_d");

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_190926_b = McMappingDatabase.getSRG("ItemStack.func_190926_b");

	/**
	 * <p>
	 * Name: getItemDamage
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77952_i = McMappingDatabase.getSRG("ItemStack.func_77952_i");

	/**
	 * <p>
	 * Name: onCrafting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;I)V]
	 * </p>
	 */
	public static McObfPair func_77980_a = McMappingDatabase.getSRG("ItemStack.func_77980_a");

	/**
	 * <p>
	 * Name: getOrCreateSubCompound
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_190925_c = McMappingDatabase.getSRG("ItemStack.func_190925_c");

	/**
	 * <p>
	 * Name: canPlaceOn
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Z]
	 * </p>
	 */
	public static McObfPair func_179547_d = McMappingDatabase.getSRG("ItemStack.func_179547_d");

	/**
	 * <p>
	 * Name: isItemDamaged
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77951_h = McMappingDatabase.getSRG("ItemStack.func_77951_h");

	/**
	 * <p>
	 * Name: splitStack
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77979_a = McMappingDatabase.getSRG("ItemStack.func_77979_a");

	/**
	 * <p>
	 * Name: getTagCompound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_77978_p = McMappingDatabase.getSRG("ItemStack.func_77978_p");

	/**
	 * <p>
	 * Name: setTagInfo
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/nbt/NBTBase;)V]
	 * </p>
	 */
	public static McObfPair func_77983_a = McMappingDatabase.getSRG("ItemStack.func_77983_a");

	/**
	 * <p>
	 * Name: animationsToGo
	 * </p>
	 */
	public static McObfPair field_77992_b = McMappingDatabase.getSRG("field_77992_b");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_82833_r = McMappingDatabase.getSRG("ItemStack.func_82833_r");

	/**
	 * <p>
	 * Name: isItemStackEqual
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77959_d = McMappingDatabase.getSRG("ItemStack.func_77959_d");

	/**
	 * <p>
	 * Name: canDestroyCacheBlock
	 * </p>
	 */
	public static McObfPair field_179552_h = McMappingDatabase.getSRG("field_179552_h");

	/**
	 * <p>
	 * Name: setTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_77982_d = McMappingDatabase.getSRG("ItemStack.func_77982_d");

	/**
	 * <p>
	 * Name: setTranslatableName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190924_f = McMappingDatabase.getSRG("ItemStack.func_190924_f");

	/**
	 * <p>
	 * Name: isItemEnchanted
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77948_v = McMappingDatabase.getSRG("ItemStack.func_77948_v");

	/**
	 * <p>
	 * Name: itemDamage
	 * </p>
	 */
	public static McObfPair field_77991_e = McMappingDatabase.getSRG("field_77991_e");

	/**
	 * <p>
	 * Name: canPlaceOnCacheResult
	 * </p>
	 */
	public static McObfPair field_179551_k = McMappingDatabase.getSRG("field_179551_k");

	/**
	 * <p>
	 * Name: getRarity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/EnumRarity;]
	 * </p>
	 */
	public static McObfPair func_77953_t = McMappingDatabase.getSRG("ItemStack.func_77953_t");

	/**
	 * <p>
	 * Name: onBlockDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_179548_a = McMappingDatabase.getSRG("ItemStack.func_179548_a");

	/**
	 * <p>
	 * Name: shrink
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190918_g = McMappingDatabase.getSRG("ItemStack.func_190918_g");

	/**
	 * <p>
	 * Name: isItemEnchantable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77956_u = McMappingDatabase.getSRG("ItemStack.func_77956_u");

	/**
	 * <p>
	 * Name: onPlayerStoppedUsing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;I)V]
	 * </p>
	 */
	public static McObfPair func_77974_b = McMappingDatabase.getSRG("ItemStack.func_77974_b");

	/**
	 * <p>
	 * Name: hasDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82837_s = McMappingDatabase.getSRG("ItemStack.func_82837_s");

	/**
	 * <p>
	 * Name: copy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77946_l = McMappingDatabase.getSRG("ItemStack.func_77946_l");

	/**
	 * <p>
	 * Name: grow
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190917_f = McMappingDatabase.getSRG("ItemStack.func_190917_f");

	/**
	 * <p>
	 * Name: setItemDamage
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_77964_b = McMappingDatabase.getSRG("ItemStack.func_77964_b");

	/**
	 * <p>
	 * Name: setAnimationsToGo
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_190915_d = McMappingDatabase.getSRG("ItemStack.func_190915_d");

	/**
	 * <p>
	 * Name: getTextComponent
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_151000_E = McMappingDatabase.getSRG("ItemStack.func_151000_E");

	/**
	 * <p>
	 * Name: getSubCompound
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_179543_a = McMappingDatabase.getSRG("ItemStack.func_179543_a");

}
