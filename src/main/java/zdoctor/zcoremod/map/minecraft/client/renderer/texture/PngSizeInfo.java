package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PngSizeInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdl";
		else
			return "net/minecraft/client/renderer/texture/PngSizeInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdl";
		else
			return "PngSizeInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdl;";
		else
			return "Lnet/minecraft/client/renderer/texture/PngSizeInfo;";
	}

	/**
	 * <p>
	 * Name: makeFromResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResource;)Lnet/minecraft/client/renderer/texture/PngSizeInfo;]
	 * </p>
	 */
	public static McObfPair func_188532_a = McMappingDatabase.getSRG("PngSizeInfo.func_188532_a");

	/**
	 * <p>
	 * Name: pngHeight
	 * </p>
	 */
	public static McObfPair field_188534_b = McMappingDatabase.getSRG("field_188534_b");

	/**
	 * <p>
	 * Name: pngWidth
	 * </p>
	 */
	public static McObfPair field_188533_a = McMappingDatabase.getSRG("field_188533_a");

}
