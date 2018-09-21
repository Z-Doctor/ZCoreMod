package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FaceBakery$2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvx$2";
		else
			return "net/minecraft/client/renderer/block/model/FaceBakery$2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvx$2";
		else
			return "FaceBakery$2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvx$2;";
		else
			return "Lnet/minecraft/client/renderer/block/model/FaceBakery$2;";
	}

	/**
	 * <p>
	 * Name: makeRotatedUV
	 * </p>
	 * <p>
	 * Desc: [(FFFF)Lnet/minecraft/client/renderer/block/model/BlockFaceUV;]
	 * </p>
	 */
	public static McObfPair func_188007_a = McMappingDatabase.getSRG("FaceBakery$2.func_188007_a");

}
