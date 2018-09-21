package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourcePackListEntryFound {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnz";
		else
			return "net/minecraft/client/resources/ResourcePackListEntryFound";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnz";
		else
			return "ResourcePackListEntryFound";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnz;";
		else
			return "Lnet/minecraft/client/resources/ResourcePackListEntryFound;";
	}

	/**
	 * <p>
	 * Name: getResourcePackEntry
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/ResourcePackRepository$Entry;]
	 * </p>
	 */
	public static McObfPair func_148318_i = McMappingDatabase.getSRG("ResourcePackListEntryFound.func_148318_i");

	/**
	 * <p>
	 * Name: getResourcePackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148312_b = McMappingDatabase.getSRG("ResourcePackListEntryFound.func_148312_b");

	/**
	 * <p>
	 * Name: bindResourcePackIcon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148313_c = McMappingDatabase.getSRG("ResourcePackListEntryFound.func_148313_c");

	/**
	 * <p>
	 * Name: getResourcePackFormat
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_183019_a = McMappingDatabase.getSRG("ResourcePackListEntryFound.func_183019_a");

	/**
	 * <p>
	 * Name: getResourcePackDescription
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148311_a = McMappingDatabase.getSRG("ResourcePackListEntryFound.func_148311_a");

	/**
	 * <p>
	 * Name: resourcePackEntry
	 * </p>
	 */
	public static McObfPair field_148319_c = McMappingDatabase.getSRG("field_148319_c");

}
