package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PackMetadataSectionSerializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfs";
		else
			return "net/minecraft/client/resources/data/PackMetadataSectionSerializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfs";
		else
			return "PackMetadataSectionSerializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfs;";
		else
			return "Lnet/minecraft/client/resources/data/PackMetadataSectionSerializer;";
	}

	/**
	 * <p>
	 * Name: getSectionName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110483_a = McMappingDatabase.getSRG("PackMetadataSectionSerializer.func_110483_a");

}
