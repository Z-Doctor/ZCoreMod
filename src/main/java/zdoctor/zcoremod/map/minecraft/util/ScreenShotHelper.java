package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ScreenShotHelper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bif";
		else
			return "net/minecraft/util/ScreenShotHelper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bif";
		else
			return "ScreenShotHelper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbif;";
		else
			return "Lnet/minecraft/util/ScreenShotHelper;";
	}

	/**
	 * <p>
	 * Name: saveScreenshot
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/lang/String;IILnet/minecraft/client/shader/Framebuffer;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_148259_a = McMappingDatabase.getSRG("ScreenShotHelper.func_148259_a");

	/**
	 * <p>
	 * Name: pixelBuffer
	 * </p>
	 */
	public static McObfPair field_74293_b = McMappingDatabase.getSRG("field_74293_b");

	/**
	 * <p>
	 * Name: pixelValues
	 * </p>
	 */
	public static McObfPair field_74294_c = McMappingDatabase.getSRG("field_74294_c");

	/**
	 * <p>
	 * Name: createScreenshot
	 * </p>
	 * <p>
	 * Desc: [(IILnet/minecraft/client/shader/Framebuffer;)Ljava/awt/image/BufferedImage;]
	 * </p>
	 */
	public static McObfPair func_186719_a = McMappingDatabase.getSRG("ScreenShotHelper.func_186719_a");

	/**
	 * <p>
	 * Name: DATE_FORMAT
	 * </p>
	 */
	public static McObfPair field_74295_a = McMappingDatabase.getSRG("field_74295_a");

	/**
	 * <p>
	 * Name: saveScreenshot
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;IILnet/minecraft/client/shader/Framebuffer;)Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_148260_a = McMappingDatabase.getSRG("ScreenShotHelper.func_148260_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148261_a = McMappingDatabase.getSRG("field_148261_a");

	/**
	 * <p>
	 * Name: getTimestampedPNGFileForDirectory
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_74290_a = McMappingDatabase.getSRG("ScreenShotHelper.func_74290_a");

}
