package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandResultStats$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bp$1";
		else
			return "net/minecraft/command/CommandResultStats$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bp$1";
		else
			return "CommandResultStats$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbp$1;";
		else
			return "Lnet/minecraft/command/CommandResultStats$1;";
	}

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("CommandResultStats$1.func_70005_c_");

	/**
	 * <p>
	 * Name: getEntityWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_130014_f_ = McMappingDatabase.getSRG("CommandResultStats$1.func_130014_f_");

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184102_h = McMappingDatabase.getSRG("CommandResultStats$1.func_184102_h");

	/**
	 * <p>
	 * Name: getPositionVector
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_174791_d = McMappingDatabase.getSRG("CommandResultStats$1.func_174791_d");

	/**
	 * <p>
	 * Name: sendCommandFeedback
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174792_t_ = McMappingDatabase.getSRG("CommandResultStats$1.func_174792_t_");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("CommandResultStats$1.func_145747_a");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("CommandResultStats$1.func_70003_b");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("CommandResultStats$1.func_180425_c");

	/**
	 * <p>
	 * Name: setCommandStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandResultStats$Type;I)V]
	 * </p>
	 */
	public static McObfPair func_174794_a = McMappingDatabase.getSRG("CommandResultStats$1.func_174794_a");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("CommandResultStats$1.func_145748_c_");

	/**
	 * <p>
	 * Name: getCommandSenderEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_174793_f = McMappingDatabase.getSRG("CommandResultStats$1.func_174793_f");

}
