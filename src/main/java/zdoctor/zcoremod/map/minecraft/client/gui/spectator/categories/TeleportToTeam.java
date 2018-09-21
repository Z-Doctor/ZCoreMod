package zdoctor.zcoremod.map.minecraft.client.gui.spectator.categories;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TeleportToTeam {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bow";
		else
			return "net/minecraft/client/gui/spectator/categories/TeleportToTeam";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bow";
		else
			return "TeleportToTeam";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbow;";
		else
			return "Lnet/minecraft/client/gui/spectator/categories/TeleportToTeam;";
	}

	/**
	 * <p>
	 * Name: getItems
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178669_a = McMappingDatabase.getSRG("TeleportToTeam.func_178669_a");

	/**
	 * <p>
	 * Name: selectItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V]
	 * </p>
	 */
	public static McObfPair func_178661_a = McMappingDatabase.getSRG("TeleportToTeam.func_178661_a");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178662_A_ = McMappingDatabase.getSRG("TeleportToTeam.func_178662_A_");

	/**
	 * <p>
	 * Name: getPrompt
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_178670_b = McMappingDatabase.getSRG("TeleportToTeam.func_178670_b");

	/**
	 * <p>
	 * Name: getSpectatorName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_178664_z_ = McMappingDatabase.getSRG("TeleportToTeam.func_178664_z_");

	/**
	 * <p>
	 * Name: renderIcon
	 * </p>
	 * <p>
	 * Desc: [(FI)V]
	 * </p>
	 */
	public static McObfPair func_178663_a = McMappingDatabase.getSRG("TeleportToTeam.func_178663_a");

	/**
	 * <p>
	 * Name: items
	 * </p>
	 */
	public static McObfPair field_178672_a = McMappingDatabase.getSRG("field_178672_a");

}
