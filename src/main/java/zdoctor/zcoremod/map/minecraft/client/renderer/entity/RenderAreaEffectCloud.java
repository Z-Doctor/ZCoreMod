package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderAreaEffectCloud {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byo";
		else
			return "net/minecraft/client/renderer/entity/RenderAreaEffectCloud";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byo";
		else
			return "RenderAreaEffectCloud";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyo;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderAreaEffectCloud;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityAreaEffectCloud;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderAreaEffectCloud.func_110775_a");

}
