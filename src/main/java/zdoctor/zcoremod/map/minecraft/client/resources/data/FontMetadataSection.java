package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FontMetadataSection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfl";
		else
			return "net/minecraft/client/resources/data/FontMetadataSection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfl";
		else
			return "FontMetadataSection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfl;";
		else
			return "Lnet/minecraft/client/resources/data/FontMetadataSection;";
	}

	/**
	 * <p>
	 * Name: charSpacings
	 * </p>
	 */
	public static McObfPair field_110466_c = McMappingDatabase.getSRG("field_110466_c");

	/**
	 * <p>
	 * Name: charLefts
	 * </p>
	 */
	public static McObfPair field_110465_b = McMappingDatabase.getSRG("field_110465_b");

	/**
	 * <p>
	 * Name: charWidths
	 * </p>
	 */
	public static McObfPair field_110467_a = McMappingDatabase.getSRG("field_110467_a");

}
