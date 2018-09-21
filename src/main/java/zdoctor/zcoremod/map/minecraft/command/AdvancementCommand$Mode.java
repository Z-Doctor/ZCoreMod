package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class AdvancementCommand$Mode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "br$b";
		else
			return "net/minecraft/command/AdvancementCommand$Mode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "br$b";
		else
			return "AdvancementCommand$Mode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbr$b;";
		else
			return "Lnet/minecraft/command/AdvancementCommand$Mode;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_193554_g = McMappingDatabase.getSRG("field_193554_g");

	/**
	 * <p>
	 * Name: fail
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/AdvancementCommand$ActionType;[Ljava/lang/Object;)Lnet/minecraft/command/CommandException;]
	 * </p>
	 */
	public static McObfPair func_193543_a = McMappingDatabase.getSRG("AdvancementCommand$Mode.func_193543_a");

	/**
	 * <p>
	 * Name: success
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;Lnet/minecraft/command/AdvancementCommand;Lnet/minecraft/command/AdvancementCommand$ActionType;[Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_193546_a = McMappingDatabase.getSRG("AdvancementCommand$Mode.func_193546_a");

	/**
	 * <p>
	 * Name: usage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/AdvancementCommand$ActionType;)Lnet/minecraft/command/CommandException;]
	 * </p>
	 */
	public static McObfPair func_193544_a = McMappingDatabase.getSRG("AdvancementCommand$Mode.func_193544_a");

	/**
	 * <p>
	 * Name: parents
	 * </p>
	 */
	public static McObfPair field_193555_h = McMappingDatabase.getSRG("field_193555_h");

	/**
	 * <p>
	 * Name: NAMES
	 * </p>
	 */
	public static McObfPair field_193553_f = McMappingDatabase.getSRG("field_193553_f");

	/**
	 * <p>
	 * Name: children
	 * </p>
	 */
	public static McObfPair field_193556_i = McMappingDatabase.getSRG("field_193556_i");

	/**
	 * <p>
	 * Name: byName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/command/AdvancementCommand$Mode;]
	 * </p>
	 */
	public static McObfPair func_193547_a = McMappingDatabase.getSRG("AdvancementCommand$Mode.func_193547_a");

}
