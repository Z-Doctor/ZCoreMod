package zdoctor.zcoremod.map.minecraft.world.border;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IBorderListener {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axl";
		else
			return "net/minecraft/world/border/IBorderListener";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "axl";
		else
			return "IBorderListener";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laxl;";
		else
			return "Lnet/minecraft/world/border/IBorderListener;";
	}

	/**
	 * <p>
	 * Name: onDamageBufferChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177695_c = McMappingDatabase.getSRG("IBorderListener.func_177695_c");

	/**
	 * <p>
	 * Name: onDamageAmountChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177696_b = McMappingDatabase.getSRG("IBorderListener.func_177696_b");

	/**
	 * <p>
	 * Name: onWarningDistanceChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;I)V]
	 * </p>
	 */
	public static McObfPair func_177690_b = McMappingDatabase.getSRG("IBorderListener.func_177690_b");

	/**
	 * <p>
	 * Name: onTransitionStarted
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;DDJ)V]
	 * </p>
	 */
	public static McObfPair func_177692_a = McMappingDatabase.getSRG("IBorderListener.func_177692_a");

	/**
	 * <p>
	 * Name: onSizeChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177694_a = McMappingDatabase.getSRG("IBorderListener.func_177694_a");

	/**
	 * <p>
	 * Name: onCenterChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;DD)V]
	 * </p>
	 */
	public static McObfPair func_177693_a = McMappingDatabase.getSRG("IBorderListener.func_177693_a");

	/**
	 * <p>
	 * Name: onWarningTimeChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;I)V]
	 * </p>
	 */
	public static McObfPair func_177691_a = McMappingDatabase.getSRG("IBorderListener.func_177691_a");

}
