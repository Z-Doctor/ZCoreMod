package zdoctor.zcoremod.map.minecraft.world;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LockCode {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ug";
		else
			return "net/minecraft/world/LockCode";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ug";
		else
			return "LockCode";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lug;";
		else
			return "Lnet/minecraft/world/LockCode;";
	}

	/**
	 * <p>
	 * Name: isEmpty
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_180160_a = McMappingDatabase.getSRG("LockCode.func_180160_a");

	/**
	 * <p>
	 * Name: fromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/world/LockCode;]
	 * </p>
	 */
	public static McObfPair func_180158_b = McMappingDatabase.getSRG("LockCode.func_180158_b");

	/**
	 * <p>
	 * Name: toNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)V]
	 * </p>
	 */
	public static McObfPair func_180157_a = McMappingDatabase.getSRG("LockCode.func_180157_a");

	/**
	 * <p>
	 * Name: EMPTY_CODE
	 * </p>
	 */
	public static McObfPair field_180162_a = McMappingDatabase.getSRG("field_180162_a");

	/**
	 * <p>
	 * Name: getLock
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_180159_b = McMappingDatabase.getSRG("LockCode.func_180159_b");

	/**
	 * <p>
	 * Name: lock
	 * </p>
	 */
	public static McObfPair field_180161_b = McMappingDatabase.getSRG("field_180161_b");

}
