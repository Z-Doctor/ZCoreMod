package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IMetadataSectionSerializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cff";
		else
			return "net/minecraft/client/resources/data/IMetadataSectionSerializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cff";
		else
			return "IMetadataSectionSerializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcff;";
		else
			return "Lnet/minecraft/client/resources/data/IMetadataSectionSerializer;";
	}

	/**
	 * <p>
	 * Name: getSectionName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110483_a = McMappingDatabase.getSRG("IMetadataSectionSerializer.func_110483_a");

}
