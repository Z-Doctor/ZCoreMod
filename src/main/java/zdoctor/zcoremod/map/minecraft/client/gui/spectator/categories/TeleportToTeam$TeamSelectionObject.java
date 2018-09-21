package zdoctor.zcoremod.map.minecraft.client.gui.spectator.categories;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TeleportToTeam$TeamSelectionObject {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bow$a";
		else
			return "net/minecraft/client/gui/spectator/categories/TeleportToTeam$TeamSelectionObject";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bow$a";
		else
			return "TeleportToTeam$TeamSelectionObject";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbow$a;";
		else
			return "Lnet/minecraft/client/gui/spectator/categories/TeleportToTeam$TeamSelectionObject;";
	}

	/**
	 * <p>
	 * Name: location
	 * </p>
	 */
	public static McObfPair field_178677_c = McMappingDatabase.getSRG("field_178677_c");

	/**
	 * <p>
	 * Name: selectItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V]
	 * </p>
	 */
	public static McObfPair func_178661_a = McMappingDatabase.getSRG("TeleportToTeam$TeamSelectionObject.func_178661_a");

	/**
	 * <p>
	 * Name: renderIcon
	 * </p>
	 * <p>
	 * Desc: [(FI)V]
	 * </p>
	 */
	public static McObfPair func_178663_a = McMappingDatabase.getSRG("TeleportToTeam$TeamSelectionObject.func_178663_a");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178662_A_ = McMappingDatabase.getSRG("TeleportToTeam$TeamSelectionObject.func_178662_A_");

	/**
	 * <p>
	 * Name: team
	 * </p>
	 */
	public static McObfPair field_178676_b = McMappingDatabase.getSRG("field_178676_b");

	/**
	 * <p>
	 * Name: getSpectatorName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_178664_z_ = McMappingDatabase.getSRG("TeleportToTeam$TeamSelectionObject.func_178664_z_");

	/**
	 * <p>
	 * Name: players
	 * </p>
	 */
	public static McObfPair field_178675_d = McMappingDatabase.getSRG("field_178675_d");

}
