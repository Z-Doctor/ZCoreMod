package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderChicken {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byv";
		else
			return "net/minecraft/client/renderer/entity/RenderChicken";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byv";
		else
			return "RenderChicken";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyv;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderChicken;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/passive/EntityChicken;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderChicken.func_110775_a");

	/**
	 * <p>
	 * Name: CHICKEN_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110920_a = McMappingDatabase.getSRG("field_110920_a");

	/**
	 * <p>
	 * Name: handleRotationFloat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityChicken;F)F, (Lnet/minecraft/entity/EntityLivingBase;F)F]
	 * </p>
	 */
	public static McObfPair func_77044_a = McMappingDatabase.getSRG("RenderChicken.func_77044_a");

}
