package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockSlime {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atu";
		else
			return "net/minecraft/block/BlockSlime";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "atu";
		else
			return "BlockSlime";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Latu;";
		else
			return "Lnet/minecraft/block/BlockSlime;";
	}

	/**
	 * <p>
	 * Name: onFallenUpon
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_180658_a = McMappingDatabase.getSRG("BlockSlime.func_180658_a");

	/**
	 * <p>
	 * Name: getBlockLayer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/BlockRenderLayer;]
	 * </p>
	 */
	public static McObfPair func_180664_k = McMappingDatabase.getSRG("BlockSlime.func_180664_k");

	/**
	 * <p>
	 * Name: onLanded
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_176216_a = McMappingDatabase.getSRG("BlockSlime.func_176216_a");

	/**
	 * <p>
	 * Name: onEntityWalk
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_176199_a = McMappingDatabase.getSRG("BlockSlime.func_176199_a");

}
