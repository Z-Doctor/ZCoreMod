package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourcePackListEntry$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnx$1";
		else
			return "net/minecraft/client/resources/ResourcePackListEntry$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnx$1";
		else
			return "ResourcePackListEntry$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnx$1;";
		else
			return "Lnet/minecraft/client/resources/ResourcePackListEntry$1;";
	}

	/**
	 * <p>
	 * Name: confirmClicked
	 * </p>
	 * <p>
	 * Desc: [(ZI)V]
	 * </p>
	 */
	public static McObfPair func_73878_a = McMappingDatabase.getSRG("ResourcePackListEntry$1.func_73878_a");

}
