package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderTntMinecart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbc";
		else
			return "net/minecraft/client/renderer/entity/RenderTntMinecart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbc";
		else
			return "RenderTntMinecart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbc;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderTntMinecart;";
	}

	/**
	 * <p>
	 * Name: renderCartContents
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityMinecart;FLnet/minecraft/block/state/IBlockState;)V, (Lnet/minecraft/entity/item/EntityMinecartTNT;FLnet/minecraft/block/state/IBlockState;)V]
	 * </p>
	 */
	public static McObfPair func_188319_a = McMappingDatabase.getSRG("RenderTntMinecart.func_188319_a");

}
