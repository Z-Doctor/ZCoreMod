package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityBannerRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwu";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityBannerRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwu";
		else
			return "TileEntityBannerRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwu;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityBannerRenderer;";
	}

	/**
	 * <p>
	 * Name: bannerModel
	 * </p>
	 */
	public static McObfPair field_178465_e = McMappingDatabase.getSRG("field_178465_e");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityBanner;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntity;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityBannerRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: getBannerResourceLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityBanner;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178463_a = McMappingDatabase.getSRG("TileEntityBannerRenderer.func_178463_a");

}
