package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Item$ToolMaterial {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ain$a";
		else
			return "net/minecraft/item/Item$ToolMaterial";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ain$a";
		else
			return "Item$ToolMaterial";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lain$a;";
		else
			return "Lnet/minecraft/item/Item$ToolMaterial;";
	}

	/**
	 * <p>
	 * Name: maxUses
	 * </p>
	 */
	public static McObfPair field_78002_g = McMappingDatabase.getSRG("field_78002_g");

	/**
	 * <p>
	 * Name: enchantability
	 * </p>
	 */
	public static McObfPair field_78008_j = McMappingDatabase.getSRG("field_78008_j");

	/**
	 * <p>
	 * Name: getEnchantability
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77995_e = McMappingDatabase.getSRG("Item$ToolMaterial.func_77995_e");

	/**
	 * <p>
	 * Name: getAttackDamage
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_78000_c = McMappingDatabase.getSRG("Item$ToolMaterial.func_78000_c");

	/**
	 * <p>
	 * Name: harvestLevel
	 * </p>
	 */
	public static McObfPair field_78001_f = McMappingDatabase.getSRG("field_78001_f");

	/**
	 * <p>
	 * Name: attackDamage
	 * </p>
	 */
	public static McObfPair field_78011_i = McMappingDatabase.getSRG("field_78011_i");

	/**
	 * <p>
	 * Name: efficiency
	 * </p>
	 */
	public static McObfPair field_78010_h = McMappingDatabase.getSRG("field_78010_h");

	/**
	 * <p>
	 * Name: getRepairItem
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/item/Item;]
	 * </p>
	 */
	public static McObfPair func_150995_f = McMappingDatabase.getSRG("Item$ToolMaterial.func_150995_f");

	/**
	 * <p>
	 * Name: getMaxUses
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77997_a = McMappingDatabase.getSRG("Item$ToolMaterial.func_77997_a");

	/**
	 * <p>
	 * Name: getEfficiency
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_77998_b = McMappingDatabase.getSRG("Item$ToolMaterial.func_77998_b");

	/**
	 * <p>
	 * Name: getHarvestLevel
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_77996_d = McMappingDatabase.getSRG("Item$ToolMaterial.func_77996_d");

}
