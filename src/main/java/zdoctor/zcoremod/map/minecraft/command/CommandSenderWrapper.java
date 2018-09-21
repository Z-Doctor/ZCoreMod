package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandSenderWrapper {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bo";
		else
			return "net/minecraft/command/CommandSenderWrapper";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bo";
		else
			return "CommandSenderWrapper";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbo;";
		else
			return "Lnet/minecraft/command/CommandSenderWrapper;";
	}

	/**
	 * <p>
	 * Name: delegate
	 * </p>
	 */
	public static McObfPair field_193043_a = McMappingDatabase.getSRG("field_193043_a");

	/**
	 * <p>
	 * Name: getEntityWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_130014_f_ = McMappingDatabase.getSRG("CommandSenderWrapper.func_130014_f_");

	/**
	 * <p>
	 * Name: positionVector
	 * </p>
	 */
	public static McObfPair field_194002_b = McMappingDatabase.getSRG("field_194002_b");

	/**
	 * <p>
	 * Name: withSendCommandFeedback
	 * </p>
	 * <p>
	 * Desc: [(Z)Lnet/minecraft/command/CommandSenderWrapper;]
	 * </p>
	 */
	public static McObfPair func_194001_a = McMappingDatabase.getSRG("CommandSenderWrapper.func_194001_a");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("CommandSenderWrapper.func_145747_a");

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184102_h = McMappingDatabase.getSRG("CommandSenderWrapper.func_184102_h");

	/**
	 * <p>
	 * Name: setCommandStat
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/CommandResultStats$Type;I)V]
	 * </p>
	 */
	public static McObfPair func_174794_a = McMappingDatabase.getSRG("CommandSenderWrapper.func_174794_a");

	/**
	 * <p>
	 * Name: withEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/command/CommandSenderWrapper;]
	 * </p>
	 */
	public static McObfPair func_193997_a = McMappingDatabase.getSRG("CommandSenderWrapper.func_193997_a");

	/**
	 * <p>
	 * Name: create
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/command/ICommandSender;)Lnet/minecraft/command/CommandSenderWrapper;]
	 * </p>
	 */
	public static McObfPair func_193998_a = McMappingDatabase.getSRG("CommandSenderWrapper.func_193998_a");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("CommandSenderWrapper.func_180425_c");

	/**
	 * <p>
	 * Name: withPermissionLevel
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/command/CommandSenderWrapper;]
	 * </p>
	 */
	public static McObfPair func_193999_a = McMappingDatabase.getSRG("CommandSenderWrapper.func_193999_a");

	/**
	 * <p>
	 * Name: sendCommandFeedback
	 * </p>
	 */
	public static McObfPair field_194006_f = McMappingDatabase.getSRG("field_194006_f");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("CommandSenderWrapper.func_70005_c_");

	/**
	 * <p>
	 * Name: position
	 * </p>
	 */
	public static McObfPair field_194003_c = McMappingDatabase.getSRG("field_194003_c");

	/**
	 * <p>
	 * Name: computePositionVector
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/command/CommandSenderWrapper;]
	 * </p>
	 */
	public static McObfPair func_194000_i = McMappingDatabase.getSRG("CommandSenderWrapper.func_194000_i");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_194005_e = McMappingDatabase.getSRG("field_194005_e");

	/**
	 * <p>
	 * Name: getPositionVector
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_174791_d = McMappingDatabase.getSRG("CommandSenderWrapper.func_174791_d");

	/**
	 * <p>
	 * Name: getCommandSenderEntity
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_174793_f = McMappingDatabase.getSRG("CommandSenderWrapper.func_174793_f");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("CommandSenderWrapper.func_70003_b");

	/**
	 * <p>
	 * Name: getDisplayName
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/text/ITextComponent;]
	 * </p>
	 */
	public static McObfPair func_145748_c_ = McMappingDatabase.getSRG("CommandSenderWrapper.func_145748_c_");

	/**
	 * <p>
	 * Name: sendCommandFeedback
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174792_t_ = McMappingDatabase.getSRG("CommandSenderWrapper.func_174792_t_");

	/**
	 * <p>
	 * Name: permissionLevel
	 * </p>
	 */
	public static McObfPair field_194004_d = McMappingDatabase.getSRG("field_194004_d");

}
