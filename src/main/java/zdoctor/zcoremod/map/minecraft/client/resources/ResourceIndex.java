package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourceIndex {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cee";
		else
			return "net/minecraft/client/resources/ResourceIndex";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cee";
		else
			return "ResourceIndex";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcee;";
		else
			return "Lnet/minecraft/client/resources/ResourceIndex;";
	}

	/**
	 * <p>
	 * Name: getPackMcmeta
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_188546_a = McMappingDatabase.getSRG("ResourceIndex.func_188546_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_152783_a = McMappingDatabase.getSRG("field_152783_a");

	/**
	 * <p>
	 * Name: resourceMap
	 * </p>
	 */
	public static McObfPair field_152784_b = McMappingDatabase.getSRG("field_152784_b");

	/**
	 * <p>
	 * Name: isFileExisting
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_188545_b = McMappingDatabase.getSRG("ResourceIndex.func_188545_b");

	/**
	 * <p>
	 * Name: getFile
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_188547_a = McMappingDatabase.getSRG("ResourceIndex.func_188547_a");

}
