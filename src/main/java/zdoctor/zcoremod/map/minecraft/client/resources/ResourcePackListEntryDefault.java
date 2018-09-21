package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourcePackListEntryDefault {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bny";
		else
			return "net/minecraft/client/resources/ResourcePackListEntryDefault";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bny";
		else
			return "ResourcePackListEntryDefault";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbny;";
		else
			return "Lnet/minecraft/client/resources/ResourcePackListEntryDefault;";
	}

	/**
	 * <p>
	 * Name: isServerPack
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186768_j = McMappingDatabase.getSRG("ResourcePackListEntryDefault.func_186768_j");

	/**
	 * <p>
	 * Name: getResourcePackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148312_b = McMappingDatabase.getSRG("ResourcePackListEntryDefault.func_148312_b");

}
