package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderWither {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbj";
		else
			return "net/minecraft/client/renderer/entity/RenderWither";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbj";
		else
			return "RenderWither";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbj;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderWither;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityWither;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderWither.func_110775_a");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/boss/EntityWither;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderWither.func_77041_b");

	/**
	 * <p>
	 * Name: INVULNERABLE_WITHER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110913_a = McMappingDatabase.getSRG("field_110913_a");

	/**
	 * <p>
	 * Name: WITHER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110912_f = McMappingDatabase.getSRG("field_110912_f");

}
