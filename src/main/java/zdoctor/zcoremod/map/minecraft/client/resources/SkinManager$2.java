package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SkinManager$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cex$2";
		else
			return "net/minecraft/client/resources/SkinManager$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cex$2";
		else
			return "SkinManager$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcex$2;";
		else
			return "Lnet/minecraft/client/resources/SkinManager$2;";
	}

	/**
	 * <p>
	 * Name: parseUserSkin
	 * </p>
	 * <p>
	 * Desc: [(Ljava/awt/image/BufferedImage;)Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_78432_a = McMappingDatabase.getSRG("SkinManager$2.func_78432_a");

	/**
	 * <p>
	 * Name: skinAvailable
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152634_a = McMappingDatabase.getSRG("SkinManager$2.func_152634_a");

}
