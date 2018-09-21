package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderWitherSkull {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbl";
		else
			return "net/minecraft/client/renderer/entity/RenderWitherSkull";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbl";
		else
			return "RenderWitherSkull";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbl;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderWitherSkull;";
	}

	/**
	 * <p>
	 * Name: getRenderYaw
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_82400_a = McMappingDatabase.getSRG("RenderWitherSkull.func_82400_a");

	/**
	 * <p>
	 * Name: WITHER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110810_f = McMappingDatabase.getSRG("field_110810_f");

	/**
	 * <p>
	 * Name: skeletonHeadModel
	 * </p>
	 */
	public static McObfPair field_82401_a = McMappingDatabase.getSRG("field_82401_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityWitherSkull;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderWitherSkull.func_76986_a");

	/**
	 * <p>
	 * Name: INVULNERABLE_WITHER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110811_a = McMappingDatabase.getSRG("field_110811_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityWitherSkull;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderWitherSkull.func_110775_a");

}
