package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiScreenCustomizePresets$Info {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkt$a";
		else
			return "net/minecraft/client/gui/GuiScreenCustomizePresets$Info";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bkt$a";
		else
			return "GuiScreenCustomizePresets$Info";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbkt$a;";
		else
			return "Lnet/minecraft/client/gui/GuiScreenCustomizePresets$Info;";
	}

	/**
	 * <p>
	 * Name: settings
	 * </p>
	 */
	public static McObfPair field_178954_c = McMappingDatabase.getSRG("field_178954_c");

	/**
	 * <p>
	 * Name: texture
	 * </p>
	 */
	public static McObfPair field_178953_b = McMappingDatabase.getSRG("field_178953_b");

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_178955_a = McMappingDatabase.getSRG("field_178955_a");

}
