package zdoctor.zcoremod.map.minecraft.item;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agx";
		else
			return "net/minecraft/item/ItemArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "agx";
		else
			return "ItemArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lagx;";
		else
			return "Lnet/minecraft/item/ItemArrow;";
	}

	/**
	 * <p>
	 * Name: createArrow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/entity/projectile/EntityArrow;]
	 * </p>
	 */
	public static McObfPair func_185052_a = McMappingDatabase.getSRG("ItemArrow.func_185052_a");

}
