package zdoctor.zcoremod.map.minecraft.client.gui.spectator;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SpectatorMenu$MoveMenuObject {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boq$b";
		else
			return "net/minecraft/client/gui/spectator/SpectatorMenu$MoveMenuObject";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boq$b";
		else
			return "SpectatorMenu$MoveMenuObject";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboq$b;";
		else
			return "Lnet/minecraft/client/gui/spectator/SpectatorMenu$MoveMenuObject;";
	}

	/**
	 * <p>
	 * Name: renderIcon
	 * </p>
	 * <p>
	 * Desc: [(FI)V]
	 * </p>
	 */
	public static McObfPair func_178663_a = McMappingDatabase.getSRG("SpectatorMenu$MoveMenuObject.func_178663_a");

	/**
	 * <p>
	 * Name: selectItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V]
	 * </p>
	 */
	public static McObfPair func_178661_a = McMappingDatabase.getSRG("SpectatorMenu$MoveMenuObject.func_178661_a");

	/**
	 * <p>
	 * Name: getSpectatorName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_178664_z_ = McMappingDatabase.getSRG("SpectatorMenu$MoveMenuObject.func_178664_z_");

	/**
	 * <p>
	 * Name: enabled
	 * </p>
	 */
	public static McObfPair field_178665_b = McMappingDatabase.getSRG("field_178665_b");

	/**
	 * <p>
	 * Name: direction
	 * </p>
	 */
	public static McObfPair field_178666_a = McMappingDatabase.getSRG("field_178666_a");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178662_A_ = McMappingDatabase.getSRG("SpectatorMenu$MoveMenuObject.func_178662_A_");

}
