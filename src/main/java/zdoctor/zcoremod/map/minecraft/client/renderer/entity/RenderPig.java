package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderPig {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cak";
		else
			return "net/minecraft/client/renderer/entity/RenderPig";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cak";
		else
			return "RenderPig";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcak;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderPig;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityPig;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderPig.func_110775_a");

	/**
	 * <p>
	 * Name: PIG_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110887_f = McMappingDatabase.getSRG("field_110887_f");

}
