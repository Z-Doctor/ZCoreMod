package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ILockableContainer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uh";
		else
			return "net/minecraft/world/ILockableContainer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uh";
		else
			return "ILockableContainer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luh;";
		else
			return "Lnet/minecraft/world/ILockableContainer;";
	}

	/**
	 * <p>
	 * Name: isLocked
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_174893_q_ = McMappingDatabase.getSRG("ILockableContainer.func_174893_q_");

	/**
	 * <p>
	 * Name: getLockCode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/LockCode;]
	 * </p>
	 */
	public static McObfPair func_174891_i = McMappingDatabase.getSRG("ILockableContainer.func_174891_i");

	/**
	 * <p>
	 * Name: setLockCode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/LockCode;)V]
	 * </p>
	 */
	public static McObfPair func_174892_a = McMappingDatabase.getSRG("ILockableContainer.func_174892_a");

}
