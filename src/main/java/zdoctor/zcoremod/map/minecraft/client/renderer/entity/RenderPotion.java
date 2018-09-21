package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderPotion {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cba";
		else
			return "net/minecraft/client/renderer/entity/RenderPotion";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cba";
		else
			return "RenderPotion";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcba;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderPotion;";
	}

	/**
	 * <p>
	 * Name: getStackToRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityPotion;)Lnet/minecraft/item/ItemStack;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_177082_d = McMappingDatabase.getSRG("RenderPotion.func_177082_d");

}
