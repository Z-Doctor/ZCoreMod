package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FaceBakery$4 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvx$4";
		else
			return "net/minecraft/client/renderer/block/model/FaceBakery$4";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvx$4";
		else
			return "FaceBakery$4";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvx$4;";
		else
			return "Lnet/minecraft/client/renderer/block/model/FaceBakery$4;";
	}

	/**
	 * <p>
	 * Name: makeRotatedUV
	 * </p>
	 * <p>
	 * Desc: [(FFFF)Lnet/minecraft/client/renderer/block/model/BlockFaceUV;]
	 * </p>
	 */
	public static McObfPair func_188007_a = McMappingDatabase.getSRG("FaceBakery$4.func_188007_a");

}
