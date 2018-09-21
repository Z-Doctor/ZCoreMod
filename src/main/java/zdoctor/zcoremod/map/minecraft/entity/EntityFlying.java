package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityFlying {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vn";
		else
			return "net/minecraft/entity/EntityFlying";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vn";
		else
			return "EntityFlying";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvn;";
		else
			return "Lnet/minecraft/entity/EntityFlying;";
	}

	/**
	 * <p>
	 * Name: updateFallState
	 * </p>
	 * <p>
	 * Desc: [(DZLnet/minecraft/block/state/IBlockState;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_184231_a = McMappingDatabase.getSRG("EntityFlying.func_184231_a");

	/**
	 * <p>
	 * Name: isOnLadder
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_70617_f_ = McMappingDatabase.getSRG("EntityFlying.func_70617_f_");

	/**
	 * <p>
	 * Name: travel
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_191986_a = McMappingDatabase.getSRG("EntityFlying.func_191986_a");

	/**
	 * <p>
	 * Name: fall
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_180430_e = McMappingDatabase.getSRG("EntityFlying.func_180430_e");

}
