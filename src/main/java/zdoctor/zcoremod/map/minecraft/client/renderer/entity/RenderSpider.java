package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderSpider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caw";
		else
			return "net/minecraft/client/renderer/entity/RenderSpider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caw";
		else
			return "RenderSpider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcaw;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderSpider;";
	}

	/**
	 * <p>
	 * Name: getDeathMaxRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntitySpider;)F, (Lnet/minecraft/entity/EntityLivingBase;)F]
	 * </p>
	 */
	public static McObfPair func_77037_a = McMappingDatabase.getSRG("RenderSpider.func_77037_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntitySpider;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderSpider.func_110775_a");

	/**
	 * <p>
	 * Name: SPIDER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110890_f = McMappingDatabase.getSRG("field_110890_f");

}
