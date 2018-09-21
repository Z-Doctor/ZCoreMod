package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderSpectralArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cav";
		else
			return "net/minecraft/client/renderer/entity/RenderSpectralArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cav";
		else
			return "RenderSpectralArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcav;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderSpectralArrow;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntitySpectralArrow;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderSpectralArrow.func_110775_a");

	/**
	 * <p>
	 * Name: RES_SPECTRAL_ARROW
	 * </p>
	 */
	public static McObfPair field_188303_a = McMappingDatabase.getSRG("field_188303_a");

}
