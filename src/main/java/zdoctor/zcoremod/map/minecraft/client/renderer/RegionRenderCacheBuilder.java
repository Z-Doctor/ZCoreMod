package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RegionRenderCacheBuilder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bum";
		else
			return "net/minecraft/client/renderer/RegionRenderCacheBuilder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bum";
		else
			return "RegionRenderCacheBuilder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbum;";
		else
			return "Lnet/minecraft/client/renderer/RegionRenderCacheBuilder;";
	}

	/**
	 * <p>
	 * Name: worldRenderers
	 * </p>
	 */
	public static McObfPair field_179040_a = McMappingDatabase.getSRG("field_179040_a");

	/**
	 * <p>
	 * Name: getWorldRendererByLayerId
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_179039_a = McMappingDatabase.getSRG("RegionRenderCacheBuilder.func_179039_a");

	/**
	 * <p>
	 * Name: getWorldRendererByLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/BlockRenderLayer;)Lnet/minecraft/client/renderer/BufferBuilder;]
	 * </p>
	 */
	public static McObfPair func_179038_a = McMappingDatabase.getSRG("RegionRenderCacheBuilder.func_179038_a");

}
