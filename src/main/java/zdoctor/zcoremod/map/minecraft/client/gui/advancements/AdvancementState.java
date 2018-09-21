package zdoctor.zcoremod.map.minecraft.client.gui.advancements;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementState {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bma";
		else
			return "net/minecraft/client/gui/advancements/AdvancementState";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bma";
		else
			return "AdvancementState";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbma;";
		else
			return "Lnet/minecraft/client/gui/advancements/AdvancementState;";
	}

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_192667_a = McMappingDatabase.getSRG("AdvancementState.func_192667_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_192671_d = McMappingDatabase.getSRG("field_192671_d");

}
