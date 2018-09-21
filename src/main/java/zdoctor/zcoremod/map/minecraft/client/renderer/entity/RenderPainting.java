package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderPainting {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cai";
		else
			return "net/minecraft/client/renderer/entity/RenderPainting";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cai";
		else
			return "RenderPainting";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcai;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderPainting;";
	}

	/**
	 * <p>
	 * Name: renderPainting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityPainting;IIII)V]
	 * </p>
	 */
	public static McObfPair func_77010_a = McMappingDatabase.getSRG("RenderPainting.func_77010_a");

	/**
	 * <p>
	 * Name: setLightmap
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityPainting;FF)V]
	 * </p>
	 */
	public static McObfPair func_77008_a = McMappingDatabase.getSRG("RenderPainting.func_77008_a");

	/**
	 * <p>
	 * Name: KRISTOFFER_PAINTING_TEXTURE
	 * </p>
	 */
	public static McObfPair field_110807_a = McMappingDatabase.getSRG("field_110807_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityPainting;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderPainting.func_76986_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityPainting;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderPainting.func_110775_a");

}
