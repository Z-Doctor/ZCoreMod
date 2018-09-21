package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IImageBuffer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "but";
		else
			return "net/minecraft/client/renderer/IImageBuffer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "but";
		else
			return "IImageBuffer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbut;";
		else
			return "Lnet/minecraft/client/renderer/IImageBuffer;";
	}

	/**
	 * <p>
	 * Name: skinAvailable
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152634_a = McMappingDatabase.getSRG("IImageBuffer.func_152634_a");

	/**
	 * <p>
	 * Name: parseUserSkin
	 * </p>
	 * <p>
	 * Desc: [(Ljava/awt/image/BufferedImage;)Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_78432_a = McMappingDatabase.getSRG("IImageBuffer.func_78432_a");

}
