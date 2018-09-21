package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemTool {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahq";
		else
			return "net/minecraft/item/ItemTool";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ahq";
		else
			return "ItemTool";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lahq;";
		else
			return "Lnet/minecraft/item/ItemTool;";
	}

	/**
	 * <p>
	 * Name: getItemAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lcom/google/common/collect/Multimap;]
	 * </p>
	 */
	public static McObfPair func_111205_h = McMappingDatabase.getSRG("ItemTool.func_111205_h");

	/**
	 * <p>
	 * Name: getDestroySpeed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/block/state/IBlockState;)F]
	 * </p>
	 */
	public static McObfPair func_150893_a = McMappingDatabase.getSRG("ItemTool.func_150893_a");

	/**
	 * <p>
	 * Name: isFull3D
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77662_d = McMappingDatabase.getSRG("ItemTool.func_77662_d");

	/**
	 * <p>
	 * Name: getIsRepairable
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_82789_a = McMappingDatabase.getSRG("ItemTool.func_82789_a");

	/**
	 * <p>
	 * Name: toolMaterial
	 * </p>
	 */
	public static McObfPair field_77862_b = McMappingDatabase.getSRG("field_77862_b");

	/**
	 * <p>
	 * Name: hitEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_77644_a = McMappingDatabase.getSRG("ItemTool.func_77644_a");

	/**
	 * <p>
	 * Name: attackDamage
	 * </p>
	 */
	public static McObfPair field_77865_bY = McMappingDatabase.getSRG("field_77865_bY");

	/**
	 * <p>
	 * Name: effectiveBlocks
	 * </p>
	 */
	public static McObfPair field_150914_c = McMappingDatabase.getSRG("field_150914_c");

	/**
	 * <p>
	 * Name: getToolMaterialName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77861_e = McMappingDatabase.getSRG("ItemTool.func_77861_e");

	/**
	 * <p>
	 * Name: efficiency
	 * </p>
	 */
	public static McObfPair field_77864_a = McMappingDatabase.getSRG("field_77864_a");

	/**
	 * <p>
	 * Name: onBlockDestroyed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_179218_a = McMappingDatabase.getSRG("ItemTool.func_179218_a");

	/**
	 * <p>
	 * Name: getItemEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77619_b = McMappingDatabase.getSRG("ItemTool.func_77619_b");

	/**
	 * <p>
	 * Name: attackSpeed
	 * </p>
	 */
	public static McObfPair field_185065_c = McMappingDatabase.getSRG("field_185065_c");

}
