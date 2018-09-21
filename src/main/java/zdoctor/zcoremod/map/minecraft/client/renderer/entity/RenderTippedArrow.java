package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderTippedArrow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbb";
		else
			return "net/minecraft/client/renderer/entity/RenderTippedArrow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbb";
		else
			return "RenderTippedArrow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbb;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderTippedArrow;";
	}

	/**
	 * <p>
	 * Name: RES_TIPPED_ARROW
	 * </p>
	 */
	public static McObfPair field_188306_b = McMappingDatabase.getSRG("field_188306_b");

	/**
	 * <p>
	 * Name: RES_ARROW
	 * </p>
	 */
	public static McObfPair field_188305_a = McMappingDatabase.getSRG("field_188305_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityTippedArrow;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderTippedArrow.func_110775_a");

}
