package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemFishingRod$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aih$1";
		else
			return "net/minecraft/item/ItemFishingRod$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aih$1";
		else
			return "ItemFishingRod$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laih$1;";
		else
			return "Lnet/minecraft/item/ItemFishingRod$1;";
	}

	/**
	 * <p>
	 * Name: apply
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)F]
	 * </p>
	 */
	public static McObfPair func_185085_a = McMappingDatabase.getSRG("ItemFishingRod$1.func_185085_a");

}
