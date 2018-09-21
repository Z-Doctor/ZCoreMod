package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MetadataSerializer$Registration {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfg$a";
		else
			return "net/minecraft/client/resources/data/MetadataSerializer$Registration";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfg$a";
		else
			return "MetadataSerializer$Registration";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfg$a;";
		else
			return "Lnet/minecraft/client/resources/data/MetadataSerializer$Registration;";
	}

	/**
	 * <p>
	 * Name: section
	 * </p>
	 */
	public static McObfPair field_110502_a = McMappingDatabase.getSRG("field_110502_a");

	/**
	 * <p>
	 * Name: clazz
	 * </p>
	 */
	public static McObfPair field_110500_b = McMappingDatabase.getSRG("field_110500_b");

}
