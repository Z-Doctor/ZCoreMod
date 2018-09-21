package zdoctor.zcoremod.map.minecraft.client.gui;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GuiCustomizeSkin$ButtonPart {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blm$a";
		else
			return "net/minecraft/client/gui/GuiCustomizeSkin$ButtonPart";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "blm$a";
		else
			return "GuiCustomizeSkin$ButtonPart";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lblm$a;";
		else
			return "Lnet/minecraft/client/gui/GuiCustomizeSkin$ButtonPart;";
	}

	/**
	 * <p>
	 * Name: playerModelParts
	 * </p>
	 */
	public static McObfPair field_175234_p = McMappingDatabase.getSRG("field_175234_p");

}
