package zdoctor.zcoremod.map.minecraft.server.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerListComponent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "od";
		else
			return "net/minecraft/server/gui/PlayerListComponent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "od";
		else
			return "PlayerListComponent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lod;";
		else
			return "Lnet/minecraft/server/gui/PlayerListComponent;";
	}

	/**
	 * <p>
	 * Name: update
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_73660_a = McMappingDatabase.getSRG("PlayerListComponent.func_73660_a");

	/**
	 * <p>
	 * Name: ticks
	 * </p>
	 */
	public static McObfPair field_120014_b = McMappingDatabase.getSRG("field_120014_b");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_120015_a = McMappingDatabase.getSRG("field_120015_a");

}
