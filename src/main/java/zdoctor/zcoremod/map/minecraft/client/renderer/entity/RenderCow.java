package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderCow {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byw";
		else
			return "net/minecraft/client/renderer/entity/RenderCow";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byw";
		else
			return "RenderCow";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyw;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderCow;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/passive/EntityCow;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderCow.func_110775_a");

	/**
	 * <p>
	 * Name: COW_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110833_a = McMappingDatabase.getSRG("field_110833_a");

}
