package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderLeashKnot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzy";
		else
			return "net/minecraft/client/renderer/entity/RenderLeashKnot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzy";
		else
			return "RenderLeashKnot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzy;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderLeashKnot;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLeashKnot;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderLeashKnot.func_110775_a");

	/**
	 * <p>
	 * Name: leashKnotModel
	 * </p>
	 */
	public static McObfPair field_110801_f = McMappingDatabase.getSRG("field_110801_f");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLeashKnot;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderLeashKnot.func_76986_a");

	/**
	 * <p>
	 * Name: LEASH_KNOT_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110802_a = McMappingDatabase.getSRG("field_110802_a");

}
