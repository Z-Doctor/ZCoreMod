package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderSquid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cax";
		else
			return "net/minecraft/client/renderer/entity/RenderSquid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cax";
		else
			return "RenderSquid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcax;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderSquid;";
	}

	/**
	 * <p>
	 * Name: SQUID_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110901_a = McMappingDatabase.getSRG("field_110901_a");

	/**
	 * <p>
	 * Name: handleRotationFloat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntitySquid;F)F, (Lnet/minecraft/entity/EntityLivingBase;F)F]
	 * </p>
	 */
	public static McObfPair func_77044_a = McMappingDatabase.getSRG("RenderSquid.func_77044_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntitySquid;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderSquid.func_110775_a");

	/**
	 * <p>
	 * Name: applyRotations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntitySquid;FFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_77043_a = McMappingDatabase.getSRG("RenderSquid.func_77043_a");

}
