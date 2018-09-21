package zdoctor.zcoremod.map.minecraft.server.management;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class PlayerList$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pl$1";
		else
			return "net/minecraft/server/management/PlayerList$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "pl$1";
		else
			return "PlayerList$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lpl$1;";
		else
			return "Lnet/minecraft/server/management/PlayerList$1;";
	}

	/**
	 * <p>
	 * Name: onDamageBufferChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177695_c = McMappingDatabase.getSRG("PlayerList$1.func_177695_c");

	/**
	 * <p>
	 * Name: onDamageAmountChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177696_b = McMappingDatabase.getSRG("PlayerList$1.func_177696_b");

	/**
	 * <p>
	 * Name: onSizeChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177694_a = McMappingDatabase.getSRG("PlayerList$1.func_177694_a");

	/**
	 * <p>
	 * Name: onCenterChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;DD)V]
	 * </p>
	 */
	public static McObfPair func_177693_a = McMappingDatabase.getSRG("PlayerList$1.func_177693_a");

	/**
	 * <p>
	 * Name: onWarningDistanceChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;I)V]
	 * </p>
	 */
	public static McObfPair func_177690_b = McMappingDatabase.getSRG("PlayerList$1.func_177690_b");

	/**
	 * <p>
	 * Name: onTransitionStarted
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;DDJ)V]
	 * </p>
	 */
	public static McObfPair func_177692_a = McMappingDatabase.getSRG("PlayerList$1.func_177692_a");

	/**
	 * <p>
	 * Name: onWarningTimeChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;I)V]
	 * </p>
	 */
	public static McObfPair func_177691_a = McMappingDatabase.getSRG("PlayerList$1.func_177691_a");

}
