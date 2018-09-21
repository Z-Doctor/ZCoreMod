package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiFlatPresets$LayerItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blh$a";
		else
			return "net/minecraft/client/gui/GuiFlatPresets$LayerItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blh$a";
		else
			return "GuiFlatPresets$LayerItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblh$a;";
		else
			return "Lnet/minecraft/client/gui/GuiFlatPresets$LayerItem;";
	}

	/**
	 * <p>
	 * Name: iconMetadata
	 * </p>
	 */
	public static McObfPair field_179037_b = McMappingDatabase.getSRG("field_179037_b");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_148232_b = McMappingDatabase.getSRG("field_148232_b");

	/**
	 * <p>
	 * Name: generatorInfo
	 * </p>
	 */
	public static McObfPair field_148233_c = McMappingDatabase.getSRG("field_148233_c");

	/**
	 * <p>
	 * Name: icon
	 * </p>
	 */
	public static McObfPair field_148234_a = McMappingDatabase.getSRG("field_148234_a");

}
