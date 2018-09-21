package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderBlaze {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bys";
		else
			return "net/minecraft/client/renderer/entity/RenderBlaze";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bys";
		else
			return "RenderBlaze";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbys;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderBlaze;";
	}

	/**
	 * <p>
	 * Name: BLAZE_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110837_a = McMappingDatabase.getSRG("field_110837_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityBlaze;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderBlaze.func_110775_a");

}
