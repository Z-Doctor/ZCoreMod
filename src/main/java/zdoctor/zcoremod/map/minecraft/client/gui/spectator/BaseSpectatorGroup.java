package zdoctor.zcoremod.map.minecraft.client.gui.spectator;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BaseSpectatorGroup {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bop";
		else
			return "net/minecraft/client/gui/spectator/BaseSpectatorGroup";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bop";
		else
			return "BaseSpectatorGroup";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbop;";
		else
			return "Lnet/minecraft/client/gui/spectator/BaseSpectatorGroup;";
	}

	/**
	 * <p>
	 * Name: getPrompt
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_178670_b = McMappingDatabase.getSRG("BaseSpectatorGroup.func_178670_b");

	/**
	 * <p>
	 * Name: items
	 * </p>
	 */
	public static McObfPair field_178671_a = McMappingDatabase.getSRG("field_178671_a");

	/**
	 * <p>
	 * Name: getItems
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178669_a = McMappingDatabase.getSRG("BaseSpectatorGroup.func_178669_a");

}
