package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourceLocation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nf";
		else
			return "net/minecraft/util/ResourceLocation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "nf";
		else
			return "ResourceLocation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lnf;";
		else
			return "Lnet/minecraft/util/ResourceLocation;";
	}

	/**
	 * <p>
	 * Name: getResourceDomain
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110624_b = McMappingDatabase.getSRG("ResourceLocation.func_110624_b");

	/**
	 * <p>
	 * Name: resourcePath
	 * </p>
	 */
	public static McObfPair field_110625_b = McMappingDatabase.getSRG("field_110625_b");

	/**
	 * <p>
	 * Name: splitObjectName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177516_a = McMappingDatabase.getSRG("ResourceLocation.func_177516_a");

	/**
	 * <p>
	 * Name: getResourcePath
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110623_a = McMappingDatabase.getSRG("ResourceLocation.func_110623_a");

	/**
	 * <p>
	 * Name: resourceDomain
	 * </p>
	 */
	public static McObfPair field_110626_a = McMappingDatabase.getSRG("field_110626_a");

}
