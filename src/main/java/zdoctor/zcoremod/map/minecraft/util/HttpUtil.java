package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class HttpUtil {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rd";
		else
			return "net/minecraft/util/HttpUtil";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "rd";
		else
			return "HttpUtil";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lrd;";
		else
			return "Lnet/minecraft/util/HttpUtil;";
	}

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151227_b = McMappingDatabase.getSRG("field_151227_b");

	/**
	 * <p>
	 * Name: buildPostString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Map;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_76179_a = McMappingDatabase.getSRG("HttpUtil.func_76179_a");

	/**
	 * <p>
	 * Name: getSuitableLanPort
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_76181_a = McMappingDatabase.getSRG("HttpUtil.func_76181_a");

	/**
	 * <p>
	 * Name: post
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/URL;Ljava/lang/String;ZLjava/net/Proxy;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151225_a = McMappingDatabase.getSRG("HttpUtil.func_151225_a");

	/**
	 * <p>
	 * Name: postMap
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/URL;Ljava/util/Map;ZLjava/net/Proxy;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151226_a = McMappingDatabase.getSRG("HttpUtil.func_151226_a");

	/**
	 * <p>
	 * Name: DOWNLOADER_EXECUTOR
	 * </p>
	 */
	public static McObfPair field_180193_a = McMappingDatabase.getSRG("field_180193_a");

	/**
	 * <p>
	 * Name: DOWNLOAD_THREADS_STARTED
	 * </p>
	 */
	public static McObfPair field_151228_a = McMappingDatabase.getSRG("field_151228_a");

	/**
	 * <p>
	 * Name: downloadResourcePack
	 * </p>
	 * <p>
	 * Desc: [(Ljava/io/File;Ljava/lang/String;Ljava/util/Map;ILnet/minecraft/util/IProgressUpdate;Ljava/net/Proxy;)Lcom/google/common/util/concurrent/ListenableFuture;]
	 * </p>
	 */
	public static McObfPair func_180192_a = McMappingDatabase.getSRG("HttpUtil.func_180192_a");

}
