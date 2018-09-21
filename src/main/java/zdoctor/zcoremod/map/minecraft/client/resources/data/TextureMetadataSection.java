package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextureMetadataSection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfv";
		else
			return "net/minecraft/client/resources/data/TextureMetadataSection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfv";
		else
			return "TextureMetadataSection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfv;";
		else
			return "Lnet/minecraft/client/resources/data/TextureMetadataSection;";
	}

	/**
	 * <p>
	 * Name: getTextureClamp
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110480_b = McMappingDatabase.getSRG("TextureMetadataSection.func_110480_b");

	/**
	 * <p>
	 * Name: getTextureBlur
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_110479_a = McMappingDatabase.getSRG("TextureMetadataSection.func_110479_a");

	/**
	 * <p>
	 * Name: textureBlur
	 * </p>
	 */
	public static McObfPair field_110482_a = McMappingDatabase.getSRG("field_110482_a");

	/**
	 * <p>
	 * Name: textureClamp
	 * </p>
	 */
	public static McObfPair field_110481_b = McMappingDatabase.getSRG("field_110481_b");

}
