package zdoctor.zcoremod.map.minecraft.potion;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PotionUtils {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aki";
		else
			return "net/minecraft/potion/PotionUtils";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aki";
		else
			return "PotionUtils";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laki;";
		else
			return "Lnet/minecraft/potion/PotionUtils;";
	}

	/**
	 * <p>
	 * Name: getEffectsFromTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185185_a = McMappingDatabase.getSRG("PotionUtils.func_185185_a");

	/**
	 * <p>
	 * Name: addPotionToItemStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/potion/PotionType;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185188_a = McMappingDatabase.getSRG("PotionUtils.func_185188_a");

	/**
	 * <p>
	 * Name: getPotionFromItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/potion/PotionType;]
	 * </p>
	 */
	public static McObfPair func_185191_c = McMappingDatabase.getSRG("PotionUtils.func_185191_c");

	/**
	 * <p>
	 * Name: addCustomPotionEffectToList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_185193_a = McMappingDatabase.getSRG("PotionUtils.func_185193_a");

	/**
	 * <p>
	 * Name: getPotionColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionType;)I]
	 * </p>
	 */
	public static McObfPair func_185183_a = McMappingDatabase.getSRG("PotionUtils.func_185183_a");

	/**
	 * <p>
	 * Name: getFullEffectsFromTag
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185192_b = McMappingDatabase.getSRG("PotionUtils.func_185192_b");

	/**
	 * <p>
	 * Name: appendEffects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/Collection;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_185184_a = McMappingDatabase.getSRG("PotionUtils.func_185184_a");

	/**
	 * <p>
	 * Name: getPotionColorFromEffectList
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Collection;)I]
	 * </p>
	 */
	public static McObfPair func_185181_a = McMappingDatabase.getSRG("PotionUtils.func_185181_a");

	/**
	 * <p>
	 * Name: getFullEffectsFromItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185190_b = McMappingDatabase.getSRG("PotionUtils.func_185190_b");

	/**
	 * <p>
	 * Name: getColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_190932_c = McMappingDatabase.getSRG("PotionUtils.func_190932_c");

	/**
	 * <p>
	 * Name: getPotionTypeFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/potion/PotionType;]
	 * </p>
	 */
	public static McObfPair func_185187_c = McMappingDatabase.getSRG("PotionUtils.func_185187_c");

	/**
	 * <p>
	 * Name: getEffectsFromStack
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185189_a = McMappingDatabase.getSRG("PotionUtils.func_185189_a");

	/**
	 * <p>
	 * Name: addPotionTooltip
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Ljava/util/List;F)V]
	 * </p>
	 */
	public static McObfPair func_185182_a = McMappingDatabase.getSRG("PotionUtils.func_185182_a");

	/**
	 * <p>
	 * Name: mergeEffects
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/potion/PotionType;Ljava/util/Collection;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_185186_a = McMappingDatabase.getSRG("PotionUtils.func_185186_a");

}
