package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockButtonStone {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auj";
		else
			return "net/minecraft/block/BlockButtonStone";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "auj";
		else
			return "BlockButtonStone";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lauj;";
		else
			return "Lnet/minecraft/block/BlockButtonStone;";
	}

	/**
	 * <p>
	 * Name: playReleaseSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185617_b = McMappingDatabase.getSRG("BlockButtonStone.func_185617_b");

	/**
	 * <p>
	 * Name: playClickSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185615_a = McMappingDatabase.getSRG("BlockButtonStone.func_185615_a");

}
