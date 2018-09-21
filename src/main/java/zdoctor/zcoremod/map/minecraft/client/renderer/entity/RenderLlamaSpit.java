package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderLlamaSpit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cac";
		else
			return "net/minecraft/client/renderer/entity/RenderLlamaSpit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cac";
		else
			return "RenderLlamaSpit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcac;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderLlamaSpit;";
	}

	/**
	 * <p>
	 * Name: LLAMA_SPIT_TEXTURE
	 * </p>
	 */
	public static McObfPair field_191333_a = McMappingDatabase.getSRG("field_191333_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityLlamaSpit;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderLlamaSpit.func_110775_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityLlamaSpit;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderLlamaSpit.func_76986_a");

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_191334_f = McMappingDatabase.getSRG("field_191334_f");

}
