package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Item {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ain";
		else
			return "net/minecraft/item/Item";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ain";
		else
			return "Item";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lain;";
		else
			return "Lnet/minecraft/item/Item;";
	}

	/**
	 * <p>
	 * Name: DAMAGE_GETTER
	 * </p>
	 */
	public static McObfPair field_185047_c = McMappingDatabase.getSRG("field_185047_c");

	/**
	 * <p>
	 * Name: registerItem
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;Lnet/minecraft/item/Item;)V]
	 * </p>
	 */
	public static McObfPair func_179217_a = McMappingDatabase.getSRG("Item.func_179217_a");

	/**
	 * <p>
	 * Name: hasContainerItem
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77634_r = McMappingDatabase.getSRG("Item.func_77634_r");

	/**
	 * <p>
	 * Name: isInCreativeTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;)Z]
	 * </p>
	 */
	public static McObfPair func_194125_a = McMappingDatabase.getSRG("Item.func_194125_a");

	/**
	 * <p>
	 * Name: setCreativeTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77637_a = McMappingDatabase.getSRG("Item.func_77637_a");

	/**
	 * <p>
	 * Name: registerItemBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Lnet/minecraft/item/Item;)V]
	 * </p>
	 */
	public static McObfPair func_179214_a = McMappingDatabase.getSRG("Item.func_179214_a");

	/**
	 * <p>
	 * Name: hasCustomProperties
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_185040_i = McMappingDatabase.getSRG("Item.func_185040_i");

	/**
	 * <p>
	 * Name: getSubItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_150895_a = McMappingDatabase.getSRG("Item.func_150895_a");

	/**
	 * <p>
	 * Name: getUnlocalizedNameInefficiently
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77657_g = McMappingDatabase.getSRG("Item.func_77657_g");

	/**
	 * <p>
	 * Name: onPlayerStoppedUsing
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;I)V]
	 * </p>
	 */
	public static McObfPair func_77615_a = McMappingDatabase.getSRG("Item.func_77615_a");

	/**
	 * <p>
	 * Name: setHasSubtypes
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77627_a = McMappingDatabase.getSRG("Item.func_77627_a");

	/**
	 * <p>
	 * Name: onBlockDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_179218_a = McMappingDatabase.getSRG("Item.func_179218_a");

	/**
	 * <p>
	 * Name: containerItem
	 * </p>
	 */
	public static McObfPair field_77700_c = McMappingDatabase.getSRG("field_77700_c");

	/**
	 * <p>
	 * Name: ATTACK_DAMAGE_MODIFIER
	 * </p>
	 */
	public static McObfPair field_111210_e = McMappingDatabase.getSRG("field_111210_e");

	/**
	 * <p>
	 * Name: getDestroySpeed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_150893_a = McMappingDatabase.getSRG("Item.func_150893_a");

	/**
	 * <p>
	 * Name: isFull3D
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77662_d = McMappingDatabase.getSRG("Item.func_77662_d");

	/**
	 * <p>
	 * Name: registerItem
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/util/ResourceLocation;Lnet/minecraft/item/Item;)V]
	 * </p>
	 */
	public static McObfPair func_179219_a = McMappingDatabase.getSRG("Item.func_179219_a");

	/**
	 * <p>
	 * Name: onCreated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_77622_d = McMappingDatabase.getSRG("Item.func_77622_d");

	/**
	 * <p>
	 * Name: setMaxStackSize
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77625_d = McMappingDatabase.getSRG("Item.func_77625_d");

	/**
	 * <p>
	 * Name: shouldRotateAroundWhenRendering
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77629_n_ = McMappingDatabase.getSRG("Item.func_77629_n_");

	/**
	 * <p>
	 * Name: getByNameOrId
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_111206_d = McMappingDatabase.getSRG("Item.func_111206_d");

	/**
	 * <p>
	 * Name: LEFTHANDED_GETTER
	 * </p>
	 */
	public static McObfPair field_185048_d = McMappingDatabase.getSRG("field_185048_d");

	/**
	 * <p>
	 * Name: getCreativeTab
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/creativetab/CreativeTabs;]
	 * </p>
	 */
	public static McObfPair func_77640_w = McMappingDatabase.getSRG("Item.func_77640_w");

	/**
	 * <p>
	 * Name: updateItemStackNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Z]
	 * </p>
	 */
	public static McObfPair func_179215_a = McMappingDatabase.getSRG("Item.func_179215_a");

	/**
	 * <p>
	 * Name: getItemUseAction
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumAction;]
	 * </p>
	 */
	public static McObfPair func_77661_b = McMappingDatabase.getSRG("Item.func_77661_b");

	/**
	 * <p>
	 * Name: isEnchantable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77616_k = McMappingDatabase.getSRG("Item.func_77616_k");

	/**
	 * <p>
	 * Name: onItemRightClick
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Lnet/minecraft/util/ActionResult;]
	 * </p>
	 */
	public static McObfPair func_77659_a = McMappingDatabase.getSRG("Item.func_77659_a");

	/**
	 * <p>
	 * Name: rayTrace
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;Z)Lnet/minecraft/util/math/RayTraceResult;]
	 * </p>
	 */
	public static McObfPair func_77621_a = McMappingDatabase.getSRG("Item.func_77621_a");

	/**
	 * <p>
	 * Name: hasSubtypes
	 * </p>
	 */
	public static McObfPair field_77787_bX = McMappingDatabase.getSRG("field_77787_bX");

	/**
	 * <p>
	 * Name: onItemUseFinish
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_77654_b = McMappingDatabase.getSRG("Item.func_77654_b");

	/**
	 * <p>
	 * Name: canItemEditBlocks
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_82788_x = McMappingDatabase.getSRG("Item.func_82788_x");

	/**
	 * <p>
	 * Name: getItemFromBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_150898_a = McMappingDatabase.getSRG("Item.func_150898_a");

	/**
	 * <p>
	 * Name: isMap
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77643_m_ = McMappingDatabase.getSRG("Item.func_77643_m_");

	/**
	 * <p>
	 * Name: setFull3D
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77664_n = McMappingDatabase.getSRG("Item.func_77664_n");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77667_c = McMappingDatabase.getSRG("Item.func_77667_c");

	/**
	 * <p>
	 * Name: isDamageable
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77645_m = McMappingDatabase.getSRG("Item.func_77645_m");

	/**
	 * <p>
	 * Name: onUpdate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;IZ)V]
	 * </p>
	 */
	public static McObfPair func_77663_a = McMappingDatabase.getSRG("Item.func_77663_a");

	/**
	 * <p>
	 * Name: properties
	 * </p>
	 */
	public static McObfPair field_185051_m = McMappingDatabase.getSRG("field_185051_m");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77658_a = McMappingDatabase.getSRG("Item.func_77658_a");

	/**
	 * <p>
	 * Name: getIdFromItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)I]
	 * </p>
	 */
	public static McObfPair func_150891_b = McMappingDatabase.getSRG("Item.func_150891_b");

	/**
	 * <p>
	 * Name: getRarity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/EnumRarity;]
	 * </p>
	 */
	public static McObfPair func_77613_e = McMappingDatabase.getSRG("Item.func_77613_e");

	/**
	 * <p>
	 * Name: getItemStackDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77653_i = McMappingDatabase.getSRG("Item.func_77653_i");

	/**
	 * <p>
	 * Name: getHasSubtypes
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77614_k = McMappingDatabase.getSRG("Item.func_77614_k");

	/**
	 * <p>
	 * Name: hitEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_77644_a = McMappingDatabase.getSRG("Item.func_77644_a");

	/**
	 * <p>
	 * Name: setUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77655_b = McMappingDatabase.getSRG("Item.func_77655_b");

	/**
	 * <p>
	 * Name: registerItems
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_150900_l = McMappingDatabase.getSRG("Item.func_150900_l");

	/**
	 * <p>
	 * Name: setContainerItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77642_a = McMappingDatabase.getSRG("Item.func_77642_a");

	/**
	 * <p>
	 * Name: getItemById
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_150899_d = McMappingDatabase.getSRG("Item.func_150899_d");

	/**
	 * <p>
	 * Name: BLOCK_TO_ITEM
	 * </p>
	 */
	public static McObfPair field_179220_a = McMappingDatabase.getSRG("field_179220_a");

	/**
	 * <p>
	 * Name: maxDamage
	 * </p>
	 */
	public static McObfPair field_77699_b = McMappingDatabase.getSRG("field_77699_b");

	/**
	 * <p>
	 * Name: ATTACK_SPEED_MODIFIER
	 * </p>
	 */
	public static McObfPair field_185050_h = McMappingDatabase.getSRG("field_185050_h");

	/**
	 * <p>
	 * Name: addPropertyOverride
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/item/IItemPropertyGetter;)V]
	 * </p>
	 */
	public static McObfPair func_185043_a = McMappingDatabase.getSRG("Item.func_185043_a");

	/**
	 * <p>
	 * Name: registerItemBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;)V]
	 * </p>
	 */
	public static McObfPair func_179216_c = McMappingDatabase.getSRG("Item.func_179216_c");

	/**
	 * <p>
	 * Name: getItemAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lcom/google/common/collect/Multimap;]
	 * </p>
	 */
	public static McObfPair func_111205_h = McMappingDatabase.getSRG("Item.func_111205_h");

	/**
	 * <p>
	 * Name: setMaxDamage
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77656_e = McMappingDatabase.getSRG("Item.func_77656_e");

	/**
	 * <p>
	 * Name: getContainerItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_77668_q = McMappingDatabase.getSRG("Item.func_77668_q");

	/**
	 * <p>
	 * Name: bFull3D
	 * </p>
	 */
	public static McObfPair field_77789_bW = McMappingDatabase.getSRG("field_77789_bW");

	/**
	 * <p>
	 * Name: getItemEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77619_b = McMappingDatabase.getSRG("Item.func_77619_b");

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("Item.func_77624_a");

	/**
	 * <p>
	 * Name: itemRand
	 * </p>
	 */
	public static McObfPair field_77697_d = McMappingDatabase.getSRG("field_77697_d");

	/**
	 * <p>
	 * Name: itemInteractionForEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/util/EnumHand;)Z]
	 * </p>
	 */
	public static McObfPair func_111207_a = McMappingDatabase.getSRG("Item.func_111207_a");

	/**
	 * <p>
	 * Name: canHarvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_150897_b = McMappingDatabase.getSRG("Item.func_150897_b");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_150901_e = McMappingDatabase.getSRG("field_150901_e");

	/**
	 * <p>
	 * Name: hasEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_77636_d = McMappingDatabase.getSRG("Item.func_77636_d");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("Item.func_180614_a");

	/**
	 * <p>
	 * Name: getMaxItemUseDuration
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_77626_a = McMappingDatabase.getSRG("Item.func_77626_a");

	/**
	 * <p>
	 * Name: getIsRepairable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_82789_a = McMappingDatabase.getSRG("Item.func_82789_a");

	/**
	 * <p>
	 * Name: getDefaultInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190903_i = McMappingDatabase.getSRG("Item.func_190903_i");

	/**
	 * <p>
	 * Name: COOLDOWN_GETTER
	 * </p>
	 */
	public static McObfPair field_185049_e = McMappingDatabase.getSRG("field_185049_e");

	/**
	 * <p>
	 * Name: DAMAGED_GETTER
	 * </p>
	 */
	public static McObfPair field_185046_b = McMappingDatabase.getSRG("field_185046_b");

	/**
	 * <p>
	 * Name: maxStackSize
	 * </p>
	 */
	public static McObfPair field_77777_bU = McMappingDatabase.getSRG("field_77777_bU");

	/**
	 * <p>
	 * Name: getShareTag
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77651_p = McMappingDatabase.getSRG("Item.func_77651_p");

	/**
	 * <p>
	 * Name: getItemStackLimit
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77639_j = McMappingDatabase.getSRG("Item.func_77639_j");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_77647_b = McMappingDatabase.getSRG("Item.func_77647_b");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_77774_bZ = McMappingDatabase.getSRG("field_77774_bZ");

	/**
	 * <p>
	 * Name: getPropertyGetter
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/item/IItemPropertyGetter;]
	 * </p>
	 */
	public static McObfPair func_185045_a = McMappingDatabase.getSRG("Item.func_185045_a");

	/**
	 * <p>
	 * Name: getMaxDamage
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77612_l = McMappingDatabase.getSRG("Item.func_77612_l");

	/**
	 * <p>
	 * Name: tabToDisplayOn
	 * </p>
	 */
	public static McObfPair field_77701_a = McMappingDatabase.getSRG("field_77701_a");

}
