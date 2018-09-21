package zdoctor.zcoremod.map.minecraft.client.gui.spectator.categories;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SpectatorDetails {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bou";
		else
			return "net/minecraft/client/gui/spectator/categories/SpectatorDetails";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bou";
		else
			return "SpectatorDetails";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbou;";
		else
			return "Lnet/minecraft/client/gui/spectator/categories/SpectatorDetails;";
	}

	/**
	 * <p>
	 * Name: category
	 * </p>
	 */
	public static McObfPair field_178684_a = McMappingDatabase.getSRG("field_178684_a");

	/**
	 * <p>
	 * Name: getObject
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/client/gui/spectator/ISpectatorMenuObject;]
	 * </p>
	 */
	public static McObfPair func_178680_a = McMappingDatabase.getSRG("SpectatorDetails.func_178680_a");

	/**
	 * <p>
	 * Name: items
	 * </p>
	 */
	public static McObfPair field_178682_b = McMappingDatabase.getSRG("field_178682_b");

	/**
	 * <p>
	 * Name: getSelectedSlot
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_178681_b = McMappingDatabase.getSRG("SpectatorDetails.func_178681_b");

	/**
	 * <p>
	 * Name: selectedSlot
	 * </p>
	 */
	public static McObfPair field_178683_c = McMappingDatabase.getSRG("field_178683_c");

}
