package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderCaveSpider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byu";
		else
			return "net/minecraft/client/renderer/entity/RenderCaveSpider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byu";
		else
			return "RenderCaveSpider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyu;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderCaveSpider;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityCaveSpider;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/monster/EntitySpider;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderCaveSpider.func_110775_a");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityCaveSpider;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderCaveSpider.func_77041_b");

	/**
	 * <p>
	 * Name: CAVE_SPIDER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110893_a = McMappingDatabase.getSRG("field_110893_a");

}
