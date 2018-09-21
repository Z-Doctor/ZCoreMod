package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ICommandListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bh";
		else
			return "net/minecraft/command/ICommandListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bh";
		else
			return "ICommandListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbh;";
		else
			return "Lnet/minecraft/command/ICommandListener;";
	}

	/**
	 * <p>
	 * Name: notifyListener
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/ICommand;ILjava/lang/String;[Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_152372_a = McMappingDatabase.getSRG("ICommandListener.func_152372_a");

}
