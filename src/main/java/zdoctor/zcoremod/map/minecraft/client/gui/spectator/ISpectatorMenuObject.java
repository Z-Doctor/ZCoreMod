package zdoctor.zcoremod.map.minecraft.client.gui.spectator;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ISpectatorMenuObject {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bos";
		else
			return "net/minecraft/client/gui/spectator/ISpectatorMenuObject";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bos";
		else
			return "ISpectatorMenuObject";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbos;";
		else
			return "Lnet/minecraft/client/gui/spectator/ISpectatorMenuObject;";
	}

	/**
	 * <p>
	 * Name: selectItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/spectator/SpectatorMenu;)V]
	 * </p>
	 */
	public static McObfPair func_178661_a = McMappingDatabase.getSRG("ISpectatorMenuObject.func_178661_a");

	/**
	 * <p>
	 * Name: renderIcon
	 * </p>
	 * <p>
	 * Desc: [(FI)V]
	 * </p>
	 */
	public static McObfPair func_178663_a = McMappingDatabase.getSRG("ISpectatorMenuObject.func_178663_a");

	/**
	 * <p>
	 * Name: getSpectatorName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_178664_z_ = McMappingDatabase.getSRG("ISpectatorMenuObject.func_178664_z_");

	/**
	 * <p>
	 * Name: isEnabled
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178662_A_ = McMappingDatabase.getSRG("ISpectatorMenuObject.func_178662_A_");

}
