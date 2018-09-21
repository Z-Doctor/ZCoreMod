package zdoctor.zcoremod.map.minecraft.client.resources.data;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PackMetadataSection {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfr";
		else
			return "net/minecraft/client/resources/data/PackMetadataSection";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cfr";
		else
			return "PackMetadataSection";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcfr;";
		else
			return "Lnet/minecraft/client/resources/data/PackMetadataSection;";
	}

	/**
	 * <p>
	 * Name: getPackDescription
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_152805_a = McMappingDatabase.getSRG("PackMetadataSection.func_152805_a");

	/**
	 * <p>
	 * Name: packFormat
	 * </p>
	 */
	public static McObfPair field_110463_b = McMappingDatabase.getSRG("field_110463_b");

	/**
	 * <p>
	 * Name: getPackFormat
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110462_b = McMappingDatabase.getSRG("PackMetadataSection.func_110462_b");

	/**
	 * <p>
	 * Name: packDescription
	 * </p>
	 */
	public static McObfPair field_110464_a = McMappingDatabase.getSRG("field_110464_a");

}
