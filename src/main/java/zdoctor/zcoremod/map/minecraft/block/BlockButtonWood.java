package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockButtonWood {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avb";
		else
			return "net/minecraft/block/BlockButtonWood";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avb";
		else
			return "BlockButtonWood";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavb;";
		else
			return "Lnet/minecraft/block/BlockButtonWood;";
	}

	/**
	 * <p>
	 * Name: playReleaseSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185617_b = McMappingDatabase.getSRG("BlockButtonWood.func_185617_b");

	/**
	 * <p>
	 * Name: playClickSound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_185615_a = McMappingDatabase.getSRG("BlockButtonWood.func_185615_a");

}
