package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemHoe {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aim";
		else
			return "net/minecraft/item/ItemHoe";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aim";
		else
			return "ItemHoe";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laim;";
		else
			return "Lnet/minecraft/item/ItemHoe;";
	}

	/**
	 * <p>
	 * Name: getItemAttributeModifiers
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lcom/google/common/collect/Multimap;]
	 * </p>
	 */
	public static McObfPair func_111205_h = McMappingDatabase.getSRG("ItemHoe.func_111205_h");

	/**
	 * <p>
	 * Name: hitEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/entity/EntityLivingBase;)Z]
	 * </p>
	 */
	public static McObfPair func_77644_a = McMappingDatabase.getSRG("ItemHoe.func_77644_a");

	/**
	 * <p>
	 * Name: onItemUse
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Lnet/minecraft/util/EnumActionResult;]
	 * </p>
	 */
	public static McObfPair func_180614_a = McMappingDatabase.getSRG("ItemHoe.func_180614_a");

	/**
	 * <p>
	 * Name: toolMaterial
	 * </p>
	 */
	public static McObfPair field_77843_a = McMappingDatabase.getSRG("field_77843_a");

	/**
	 * <p>
	 * Name: speed
	 * </p>
	 */
	public static McObfPair field_185072_b = McMappingDatabase.getSRG("field_185072_b");

	/**
	 * <p>
	 * Name: isFull3D
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_77662_d = McMappingDatabase.getSRG("ItemHoe.func_77662_d");

	/**
	 * <p>
	 * Name: setBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_185071_a = McMappingDatabase.getSRG("ItemHoe.func_185071_a");

	/**
	 * <p>
	 * Name: getMaterialName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77842_f = McMappingDatabase.getSRG("ItemHoe.func_77842_f");

}
