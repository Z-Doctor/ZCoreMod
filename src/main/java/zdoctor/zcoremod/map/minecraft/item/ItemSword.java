package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSword {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajy";
		else
			return "net/minecraft/item/ItemSword";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajy";
		else
			return "ItemSword";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajy;";
		else
			return "Lnet/minecraft/item/ItemSword;";
	}

	/**
	 * <p>
	 * Name: attackDamage
	 * </p>
	 */
	public static McObfPair field_150934_a = McMappingDatabase.getSRG("field_150934_a");

	/**
	 * <p>
	 * Name: onBlockDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_179218_a = McMappingDatabase.getSRG("ItemSword.func_179218_a");

	/**
	 * <p>
	 * Name: canHarvestBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Z]
	 * </p>
	 */
	public static McObfPair func_150897_b = McMappingDatabase.getSRG("ItemSword.func_150897_b");

	/**
	 * <p>
	 * Name: getToolMaterialName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150932_j = McMappingDatabase.getSRG("ItemSword.func_150932_j");

	/**
	 * <p>
	 * Name: getIsRepairable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_82789_a = McMappingDatabase.getSRG("ItemSword.func_82789_a");

	/**
	 * <p>
	 * Name: getItemAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lcom/google/common/collect/Multimap;]
	 * </p>
	 */
	public static McObfPair func_111205_h = McMappingDatabase.getSRG("ItemSword.func_111205_h");

	/**
	 * <p>
	 * Name: isFull3D
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77662_d = McMappingDatabase.getSRG("ItemSword.func_77662_d");

	/**
	 * <p>
	 * Name: getItemEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77619_b = McMappingDatabase.getSRG("ItemSword.func_77619_b");

	/**
	 * <p>
	 * Name: material
	 * </p>
	 */
	public static McObfPair field_150933_b = McMappingDatabase.getSRG("field_150933_b");

	/**
	 * <p>
	 * Name: getDestroySpeed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_150893_a = McMappingDatabase.getSRG("ItemSword.func_150893_a");

	/**
	 * <p>
	 * Name: getAttackDamage
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_150931_i = McMappingDatabase.getSRG("ItemSword.func_150931_i");

	/**
	 * <p>
	 * Name: hitEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_77644_a = McMappingDatabase.getSRG("ItemSword.func_77644_a");

}
