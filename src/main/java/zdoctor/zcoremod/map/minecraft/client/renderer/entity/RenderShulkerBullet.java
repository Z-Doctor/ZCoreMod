package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderShulkerBullet {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cap";
		else
			return "net/minecraft/client/renderer/entity/RenderShulkerBullet";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cap";
		else
			return "RenderShulkerBullet";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcap;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderShulkerBullet;";
	}

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityShulkerBullet;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderShulkerBullet.func_76986_a");

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_188349_b = McMappingDatabase.getSRG("field_188349_b");

	/**
	 * <p>
	 * Name: SHULKER_SPARK_TEXTURE
	 * </p>
	 */
	public static McObfPair field_188348_a = McMappingDatabase.getSRG("field_188348_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityShulkerBullet;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderShulkerBullet.func_110775_a");

	/**
	 * <p>
	 * Name: rotLerp
	 * </p>
	 * <p>
	 * Desc: [(FFF)F]
	 * </p>
	 */
	public static McObfPair func_188347_a = McMappingDatabase.getSRG("RenderShulkerBullet.func_188347_a");

}
