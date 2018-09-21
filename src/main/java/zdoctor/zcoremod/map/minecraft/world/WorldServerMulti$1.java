package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WorldServerMulti$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ok$1";
		else
			return "net/minecraft/world/WorldServerMulti$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ok$1";
		else
			return "WorldServerMulti$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lok$1;";
		else
			return "Lnet/minecraft/world/WorldServerMulti$1;";
	}

	/**
	 * <p>
	 * Name: onDamageAmountChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177696_b = McMappingDatabase.getSRG("WorldServerMulti$1.func_177696_b");

	/**
	 * <p>
	 * Name: onWarningDistanceChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;I)V]
	 * </p>
	 */
	public static McObfPair func_177690_b = McMappingDatabase.getSRG("WorldServerMulti$1.func_177690_b");

	/**
	 * <p>
	 * Name: onSizeChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177694_a = McMappingDatabase.getSRG("WorldServerMulti$1.func_177694_a");

	/**
	 * <p>
	 * Name: onDamageBufferChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;D)V]
	 * </p>
	 */
	public static McObfPair func_177695_c = McMappingDatabase.getSRG("WorldServerMulti$1.func_177695_c");

	/**
	 * <p>
	 * Name: onCenterChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;DD)V]
	 * </p>
	 */
	public static McObfPair func_177693_a = McMappingDatabase.getSRG("WorldServerMulti$1.func_177693_a");

	/**
	 * <p>
	 * Name: onWarningTimeChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;I)V]
	 * </p>
	 */
	public static McObfPair func_177691_a = McMappingDatabase.getSRG("WorldServerMulti$1.func_177691_a");

	/**
	 * <p>
	 * Name: onTransitionStarted
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/border/WorldBorder;DDJ)V]
	 * </p>
	 */
	public static McObfPair func_177692_a = McMappingDatabase.getSRG("WorldServerMulti$1.func_177692_a");

}
