package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ClientAdvancementManager$IListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brw$a";
		else
			return "net/minecraft/client/multiplayer/ClientAdvancementManager$IListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brw$a";
		else
			return "ClientAdvancementManager$IListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrw$a;";
		else
			return "Lnet/minecraft/client/multiplayer/ClientAdvancementManager$IListener;";
	}

	/**
	 * <p>
	 * Name: setSelectedTab
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;)V]
	 * </p>
	 */
	public static McObfPair func_193982_e = McMappingDatabase.getSRG("ClientAdvancementManager$IListener.func_193982_e");

	/**
	 * <p>
	 * Name: onUpdateAdvancementProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/advancements/Advancement;Lnet/minecraft/advancements/AdvancementProgress;)V]
	 * </p>
	 */
	public static McObfPair func_191933_a = McMappingDatabase.getSRG("ClientAdvancementManager$IListener.func_191933_a");

}
