package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockModelShapes$7 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvl$7";
		else
			return "net/minecraft/client/renderer/BlockModelShapes$7";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvl$7";
		else
			return "BlockModelShapes$7";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvl$7;";
		else
			return "Lnet/minecraft/client/renderer/BlockModelShapes$7;";
	}

	/**
	 * <p>
	 * Name: getModelResourceLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178132_a = McMappingDatabase.getSRG("BlockModelShapes$7.func_178132_a");

}
