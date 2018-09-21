package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ImageBufferDownload {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buz";
		else
			return "net/minecraft/client/renderer/ImageBufferDownload";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buz";
		else
			return "ImageBufferDownload";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuz;";
		else
			return "Lnet/minecraft/client/renderer/ImageBufferDownload;";
	}

	/**
	 * <p>
	 * Name: skinAvailable
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152634_a = McMappingDatabase.getSRG("ImageBufferDownload.func_152634_a");

	/**
	 * <p>
	 * Name: setAreaOpaque
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_78433_b = McMappingDatabase.getSRG("ImageBufferDownload.func_78433_b");

	/**
	 * <p>
	 * Name: parseUserSkin
	 * </p>
	 * <p>
	 * Desc: [(Ljava/awt/image/BufferedImage;)Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_78432_a = McMappingDatabase.getSRG("ImageBufferDownload.func_78432_a");

	/**
	 * <p>
	 * Name: setAreaTransparent
	 * </p>
	 * <p>
	 * Desc: [(IIII)V]
	 * </p>
	 */
	public static McObfPair func_189559_a = McMappingDatabase.getSRG("ImageBufferDownload.func_189559_a");

	/**
	 * <p>
	 * Name: imageWidth
	 * </p>
	 */
	public static McObfPair field_78436_b = McMappingDatabase.getSRG("field_78436_b");

	/**
	 * <p>
	 * Name: imageHeight
	 * </p>
	 */
	public static McObfPair field_78437_c = McMappingDatabase.getSRG("field_78437_c");

	/**
	 * <p>
	 * Name: imageData
	 * </p>
	 */
	public static McObfPair field_78438_a = McMappingDatabase.getSRG("field_78438_a");

}
