package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemSpectralArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajw";
		else
			return "net/minecraft/item/ItemSpectralArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ajw";
		else
			return "ItemSpectralArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lajw;";
		else
			return "Lnet/minecraft/item/ItemSpectralArrow;";
	}

	/**
	 * <p>
	 * Name: createArrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/entity/projectile/EntityArrow;]
	 * </p>
	 */
	public static McObfPair func_185052_a = McMappingDatabase.getSRG("ItemSpectralArrow.func_185052_a");

}
