package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourceIndexFolder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceh";
		else
			return "net/minecraft/client/resources/ResourceIndexFolder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceh";
		else
			return "ResourceIndexFolder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceh;";
		else
			return "Lnet/minecraft/client/resources/ResourceIndexFolder;";
	}

	/**
	 * <p>
	 * Name: baseDir
	 * </p>
	 */
	public static McObfPair field_188548_a = McMappingDatabase.getSRG("field_188548_a");

	/**
	 * <p>
	 * Name: getFile
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_188547_a = McMappingDatabase.getSRG("ResourceIndexFolder.func_188547_a");

	/**
	 * <p>
	 * Name: getPackMcmeta
	 * </p>
	 * <p>
	 * Desc: [()Ljava/io/File;]
	 * </p>
	 */
	public static McObfPair func_188546_a = McMappingDatabase.getSRG("ResourceIndexFolder.func_188546_a");

}
