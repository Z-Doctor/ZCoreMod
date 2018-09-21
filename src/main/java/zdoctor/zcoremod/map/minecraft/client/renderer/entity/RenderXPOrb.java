package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderXPOrb {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzj";
		else
			return "net/minecraft/client/renderer/entity/RenderXPOrb";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzj";
		else
			return "RenderXPOrb";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzj;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderXPOrb;";
	}

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/item/EntityXPOrb;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderXPOrb.func_76986_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/item/EntityXPOrb;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderXPOrb.func_110775_a");

	/**
	 * <p>
	 * Name: EXPERIENCE_ORB_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110785_a = McMappingDatabase.getSRG("field_110785_a");

}
