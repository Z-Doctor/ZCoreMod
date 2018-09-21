package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IJumpingMount {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vz";
		else
			return "net/minecraft/entity/IJumpingMount";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vz";
		else
			return "IJumpingMount";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvz;";
		else
			return "Lnet/minecraft/entity/IJumpingMount;";
	}

	/**
	 * <p>
	 * Name: setJumpPower
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_110206_u = McMappingDatabase.getSRG("IJumpingMount.func_110206_u");

	/**
	 * <p>
	 * Name: handleStartJump
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_184775_b = McMappingDatabase.getSRG("IJumpingMount.func_184775_b");

	/**
	 * <p>
	 * Name: handleStopJump
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_184777_r_ = McMappingDatabase.getSRG("IJumpingMount.func_184777_r_");

	/**
	 * <p>
	 * Name: canJump
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_184776_b = McMappingDatabase.getSRG("IJumpingMount.func_184776_b");

}
