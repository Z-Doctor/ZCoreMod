package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextureOffset {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brt";
		else
			return "net/minecraft/client/model/TextureOffset";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brt";
		else
			return "TextureOffset";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrt;";
		else
			return "Lnet/minecraft/client/model/TextureOffset;";
	}

	/**
	 * <p>
	 * Name: textureOffsetY
	 * </p>
	 */
	public static McObfPair field_78782_b = McMappingDatabase.getSRG("field_78782_b");

	/**
	 * <p>
	 * Name: textureOffsetX
	 * </p>
	 */
	public static McObfPair field_78783_a = McMappingDatabase.getSRG("field_78783_a");

}
