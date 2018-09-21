package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockHay {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ark";
		else
			return "net/minecraft/block/BlockHay";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ark";
		else
			return "BlockHay";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lark;";
		else
			return "Lnet/minecraft/block/BlockHay;";
	}

	/**
	 * <p>
	 * Name: onFallenUpon
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_180658_a = McMappingDatabase.getSRG("BlockHay.func_180658_a");

}
