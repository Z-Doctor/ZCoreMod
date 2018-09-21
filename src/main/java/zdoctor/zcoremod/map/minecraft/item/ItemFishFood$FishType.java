package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemFishFood$FishType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aig$a";
		else
			return "net/minecraft/item/ItemFishFood$FishType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aig$a";
		else
			return "ItemFishFood$FishType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laig$a;";
		else
			return "Lnet/minecraft/item/ItemFishFood$FishType;";
	}

	/**
	 * <p>
	 * Name: getCookedSaturationModifier
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_150977_f = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150977_f");

	/**
	 * <p>
	 * Name: cookable
	 * </p>
	 */
	public static McObfPair field_150987_n = McMappingDatabase.getSRG("field_150987_n");

	/**
	 * <p>
	 * Name: META_LOOKUP
	 * </p>
	 */
	public static McObfPair field_150983_e = McMappingDatabase.getSRG("field_150983_e");

	/**
	 * <p>
	 * Name: canCook
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_150973_i = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150973_i");

	/**
	 * <p>
	 * Name: cookedHealAmount
	 * </p>
	 */
	public static McObfPair field_150989_l = McMappingDatabase.getSRG("field_150989_l");

	/**
	 * <p>
	 * Name: unlocalizedName
	 * </p>
	 */
	public static McObfPair field_150981_g = McMappingDatabase.getSRG("field_150981_g");

	/**
	 * <p>
	 * Name: getUncookedSaturationModifier
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_150967_d = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150967_d");

	/**
	 * <p>
	 * Name: getCookedHealAmount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150970_e = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150970_e");

	/**
	 * <p>
	 * Name: uncookedSaturationModifier
	 * </p>
	 */
	public static McObfPair field_150992_k = McMappingDatabase.getSRG("field_150992_k");

	/**
	 * <p>
	 * Name: getUnlocalizedName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_150972_b = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150972_b");

	/**
	 * <p>
	 * Name: uncookedHealAmount
	 * </p>
	 */
	public static McObfPair field_150991_j = McMappingDatabase.getSRG("field_150991_j");

	/**
	 * <p>
	 * Name: byMetadata
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/item/ItemFishFood$FishType;]
	 * </p>
	 */
	public static McObfPair func_150974_a = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150974_a");

	/**
	 * <p>
	 * Name: getUncookedHealAmount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150975_c = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150975_c");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_150976_a = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150976_a");

	/**
	 * <p>
	 * Name: meta
	 * </p>
	 */
	public static McObfPair field_150980_f = McMappingDatabase.getSRG("field_150980_f");

	/**
	 * <p>
	 * Name: byItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemFishFood$FishType;]
	 * </p>
	 */
	public static McObfPair func_150978_a = McMappingDatabase.getSRG("ItemFishFood$FishType.func_150978_a");

	/**
	 * <p>
	 * Name: cookedSaturationModifier
	 * </p>
	 */
	public static McObfPair field_150990_m = McMappingDatabase.getSRG("field_150990_m");

}
