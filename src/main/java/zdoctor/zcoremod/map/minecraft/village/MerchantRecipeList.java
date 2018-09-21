package zdoctor.zcoremod.map.minecraft.village;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MerchantRecipeList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amh";
		else
			return "net/minecraft/village/MerchantRecipeList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "amh";
		else
			return "MerchantRecipeList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lamh;";
		else
			return "Lnet/minecraft/village/MerchantRecipeList;";
	}

	/**
	 * <p>
	 * Name: readRecipiesFromTags
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_77201_a = McMappingDatabase.getSRG("MerchantRecipeList.func_77201_a");

	/**
	 * <p>
	 * Name: areItemStacksExactlyEqual
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_181078_a = McMappingDatabase.getSRG("MerchantRecipeList.func_181078_a");

	/**
	 * <p>
	 * Name: getRecipiesAsTags
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_77202_a = McMappingDatabase.getSRG("MerchantRecipeList.func_77202_a");

	/**
	 * <p>
	 * Name: writeToBuf
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)V]
	 * </p>
	 */
	public static McObfPair func_151391_a = McMappingDatabase.getSRG("MerchantRecipeList.func_151391_a");

	/**
	 * <p>
	 * Name: readFromBuf
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Lnet/minecraft/village/MerchantRecipeList;]
	 * </p>
	 */
	public static McObfPair func_151390_b = McMappingDatabase.getSRG("MerchantRecipeList.func_151390_b");

	/**
	 * <p>
	 * Name: canRecipeBeUsed
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/item/ItemStack;I)Lnet/minecraft/village/MerchantRecipe;]
	 * </p>
	 */
	public static McObfPair func_77203_a = McMappingDatabase.getSRG("MerchantRecipeList.func_77203_a");

}
