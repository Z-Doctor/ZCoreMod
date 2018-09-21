package zdoctor.zcoremod.map.minecraft.network.rcon;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RConConsoleSource {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "px";
		else
			return "net/minecraft/network/rcon/RConConsoleSource";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "px";
		else
			return "RConConsoleSource";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpx;";
		else
			return "Lnet/minecraft/network/rcon/RConConsoleSource;";
	}

	/**
	 * <p>
	 * Name: getEntityWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_130014_f_ = McMappingDatabase.getSRG("RConConsoleSource.func_130014_f_");

	/**
	 * <p>
	 * Name: resetLog
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_70007_b = McMappingDatabase.getSRG("RConConsoleSource.func_70007_b");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("RConConsoleSource.func_70005_c_");

	/**
	 * <p>
	 * Name: getLogContents
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70008_c = McMappingDatabase.getSRG("RConConsoleSource.func_70008_c");

	/**
	 * <p>
	 * Name: server
	 * </p>
	 */
	public static McObfPair field_184171_b = McMappingDatabase.getSRG("field_184171_b");

	/**
	 * <p>
	 * Name: sendMessage
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/text/ITextComponent;)V]
	 * </p>
	 */
	public static McObfPair func_145747_a = McMappingDatabase.getSRG("RConConsoleSource.func_145747_a");

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184102_h = McMappingDatabase.getSRG("RConConsoleSource.func_184102_h");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_70009_b = McMappingDatabase.getSRG("field_70009_b");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("RConConsoleSource.func_70003_b");

	/**
	 * <p>
	 * Name: sendCommandFeedback
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174792_t_ = McMappingDatabase.getSRG("RConConsoleSource.func_174792_t_");

}
