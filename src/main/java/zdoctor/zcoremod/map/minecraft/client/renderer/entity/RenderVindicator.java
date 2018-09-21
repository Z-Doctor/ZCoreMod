package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderVindicator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbh";
		else
			return "net/minecraft/client/renderer/entity/RenderVindicator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbh";
		else
			return "RenderVindicator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbh;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderVindicator;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityMob;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderVindicator.func_110775_a");

	/**
	 * <p>
	 * Name: VINDICATOR_TEXTURE
	 * </p>
	 */
	public static McObfPair field_191357_a = McMappingDatabase.getSRG("field_191357_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityMob;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V, (Lnet/minecraft/entity/EntityLiving;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderVindicator.func_76986_a");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityMob;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderVindicator.func_77041_b");

}
