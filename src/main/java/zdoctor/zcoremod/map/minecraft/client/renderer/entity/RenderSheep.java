package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderSheep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cao";
		else
			return "net/minecraft/client/renderer/entity/RenderSheep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cao";
		else
			return "RenderSheep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcao;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderSheep;";
	}

	/**
	 * <p>
	 * Name: SHEARED_SHEEP_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110884_f = McMappingDatabase.getSRG("field_110884_f");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntitySheep;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderSheep.func_110775_a");

}
