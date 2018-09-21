package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderLlama {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cab";
		else
			return "net/minecraft/client/renderer/entity/RenderLlama";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cab";
		else
			return "RenderLlama";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcab;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderLlama;";
	}

	/**
	 * <p>
	 * Name: LLAMA_TEXTURES
	 * </p>
	 */
	public static McObfPair field_191350_a = McMappingDatabase.getSRG("field_191350_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityLlama;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderLlama.func_110775_a");

}
