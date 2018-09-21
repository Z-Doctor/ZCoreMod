package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderDragon {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzc";
		else
			return "net/minecraft/client/renderer/entity/RenderDragon";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzc";
		else
			return "RenderDragon";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzc;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderDragon;";
	}

	/**
	 * <p>
	 * Name: DRAGON_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110844_k = McMappingDatabase.getSRG("field_110844_k");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderDragon.func_110775_a");

	/**
	 * <p>
	 * Name: renderCrystalBeams
	 * </p>
	 * <p>
	 * Desc: [(DDDFDDDIDDD)V]
	 * </p>
	 */
	public static McObfPair func_188325_a = McMappingDatabase.getSRG("RenderDragon.func_188325_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V, (Lnet/minecraft/entity/EntityLiving;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderDragon.func_76986_a");

	/**
	 * <p>
	 * Name: ENDERCRYSTAL_BEAM_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110843_g = McMappingDatabase.getSRG("field_110843_g");

	/**
	 * <p>
	 * Name: DRAGON_EXPLODING_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110842_f = McMappingDatabase.getSRG("field_110842_f");

	/**
	 * <p>
	 * Name: applyRotations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;FFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_77043_a = McMappingDatabase.getSRG("RenderDragon.func_77043_a");

	/**
	 * <p>
	 * Name: renderModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityDragon;FFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_77036_a = McMappingDatabase.getSRG("RenderDragon.func_77036_a");

}
