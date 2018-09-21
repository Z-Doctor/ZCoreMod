package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemTippedArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aka";
		else
			return "net/minecraft/item/ItemTippedArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aka";
		else
			return "ItemTippedArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laka;";
		else
			return "Lnet/minecraft/item/ItemTippedArrow;";
	}

	/**
	 * <p>
	 * Name: getDefaultInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_190903_i = McMappingDatabase.getSRG("ItemTippedArrow.func_190903_i");

	/**
	 * <p>
	 * Name: addInformation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Ljava/util/List;Lnet/minecraft/client/util/ITooltipFlag;)V]
	 * </p>
	 */
	public static McObfPair func_77624_a = McMappingDatabase.getSRG("ItemTippedArrow.func_77624_a");

	/**
	 * <p>
	 * Name: getSubItems
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/creativetab/CreativeTabs;Lnet/minecraft/util/NonNullList;)V]
	 * </p>
	 */
	public static McObfPair func_150895_a = McMappingDatabase.getSRG("ItemTippedArrow.func_150895_a");

	/**
	 * <p>
	 * Name: createArrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/entity/projectile/EntityArrow;]
	 * </p>
	 */
	public static McObfPair func_185052_a = McMappingDatabase.getSRG("ItemTippedArrow.func_185052_a");

	/**
	 * <p>
	 * Name: getItemStackDisplayName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_77653_i = McMappingDatabase.getSRG("ItemTippedArrow.func_77653_i");

}
