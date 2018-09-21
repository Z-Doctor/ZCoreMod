package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ThreadDownloadImageData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdh";
		else
			return "net/minecraft/client/renderer/ThreadDownloadImageData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdh";
		else
			return "ThreadDownloadImageData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdh;";
		else
			return "Lnet/minecraft/client/renderer/ThreadDownloadImageData;";
	}

	/**
	 * <p>
	 * Name: imageThread
	 * </p>
	 */
	public static McObfPair field_110561_e = McMappingDatabase.getSRG("field_110561_e");

	/**
	 * <p>
	 * Name: textureUploaded
	 * </p>
	 */
	public static McObfPair field_110559_g = McMappingDatabase.getSRG("field_110559_g");

	/**
	 * <p>
	 * Name: loadTextureFromServer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_152433_a = McMappingDatabase.getSRG("ThreadDownloadImageData.func_152433_a");

	/**
	 * <p>
	 * Name: checkTextureUploaded
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_147640_e = McMappingDatabase.getSRG("ThreadDownloadImageData.func_147640_e");

	/**
	 * <p>
	 * Name: bufferedImage
	 * </p>
	 */
	public static McObfPair field_110560_d = McMappingDatabase.getSRG("field_110560_d");

	/**
	 * <p>
	 * Name: loadTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110551_a = McMappingDatabase.getSRG("ThreadDownloadImageData.func_110551_a");

	/**
	 * <p>
	 * Name: getGlTextureId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110552_b = McMappingDatabase.getSRG("ThreadDownloadImageData.func_110552_b");

	/**
	 * <p>
	 * Name: TEXTURE_DOWNLOADER_THREAD_ID
	 * </p>
	 */
	public static McObfPair field_147643_d = McMappingDatabase.getSRG("field_147643_d");

	/**
	 * <p>
	 * Name: imageUrl
	 * </p>
	 */
	public static McObfPair field_110562_b = McMappingDatabase.getSRG("field_110562_b");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_147644_c = McMappingDatabase.getSRG("field_147644_c");

	/**
	 * <p>
	 * Name: imageBuffer
	 * </p>
	 */
	public static McObfPair field_110563_c = McMappingDatabase.getSRG("field_110563_c");

	/**
	 * <p>
	 * Name: setBufferedImage
	 * </p>
	 * <p>
	 * Desc: [(Ljava/awt/image/BufferedImage;)V]
	 * </p>
	 */
	public static McObfPair func_147641_a = McMappingDatabase.getSRG("ThreadDownloadImageData.func_147641_a");

	/**
	 * <p>
	 * Name: cacheFile
	 * </p>
	 */
	public static McObfPair field_152434_e = McMappingDatabase.getSRG("field_152434_e");

}
