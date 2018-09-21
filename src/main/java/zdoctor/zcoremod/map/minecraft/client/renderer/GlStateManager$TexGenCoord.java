package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GlStateManager$TexGenCoord {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$v";
		else
			return "net/minecraft/client/renderer/GlStateManager$TexGenCoord";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bus$v";
		else
			return "GlStateManager$TexGenCoord";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbus$v;";
		else
			return "Lnet/minecraft/client/renderer/GlStateManager$TexGenCoord;";
	}

	/**
	 * <p>
	 * Name: param
	 * </p>
	 */
	public static McObfPair field_179066_c = McMappingDatabase.getSRG("field_179066_c");

	/**
	 * <p>
	 * Name: textureGen
	 * </p>
	 */
	public static McObfPair field_179067_a = McMappingDatabase.getSRG("field_179067_a");

	/**
	 * <p>
	 * Name: coord
	 * </p>
	 */
	public static McObfPair field_179065_b = McMappingDatabase.getSRG("field_179065_b");

}
