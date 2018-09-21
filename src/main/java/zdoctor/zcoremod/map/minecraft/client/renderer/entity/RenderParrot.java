package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderParrot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caj";
		else
			return "net/minecraft/client/renderer/entity/RenderParrot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caj";
		else
			return "RenderParrot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcaj;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderParrot;";
	}

	/**
	 * <p>
	 * Name: handleRotationFloat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityParrot;F)F, (Lnet/minecraft/entity/EntityLivingBase;F)F]
	 * </p>
	 */
	public static McObfPair func_77044_a = McMappingDatabase.getSRG("RenderParrot.func_77044_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityParrot;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderParrot.func_110775_a");

	/**
	 * <p>
	 * Name: PARROT_TEXTURES
	 * </p>
	 */
	public static McObfPair field_192862_a = McMappingDatabase.getSRG("field_192862_a");

	/**
	 * <p>
	 * Name: getCustomBob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityParrot;F)F]
	 * </p>
	 */
	public static McObfPair func_192861_b = McMappingDatabase.getSRG("RenderParrot.func_192861_b");

}
