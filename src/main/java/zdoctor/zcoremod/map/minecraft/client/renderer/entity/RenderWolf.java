package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderWolf {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbm";
		else
			return "net/minecraft/client/renderer/entity/RenderWolf";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbm";
		else
			return "RenderWolf";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbm;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderWolf;";
	}

	/**
	 * <p>
	 * Name: ANRGY_WOLF_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110916_g = McMappingDatabase.getSRG("field_110916_g");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityWolf;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderWolf.func_110775_a");

	/**
	 * <p>
	 * Name: TAMED_WOLF_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110915_f = McMappingDatabase.getSRG("field_110915_f");

	/**
	 * <p>
	 * Name: handleRotationFloat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityWolf;F)F, (Lnet/minecraft/entity/EntityLivingBase;F)F]
	 * </p>
	 */
	public static McObfPair func_77044_a = McMappingDatabase.getSRG("RenderWolf.func_77044_a");

	/**
	 * <p>
	 * Name: WOLF_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110917_a = McMappingDatabase.getSRG("field_110917_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityWolf;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V, (Lnet/minecraft/entity/EntityLiving;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderWolf.func_76986_a");

}
