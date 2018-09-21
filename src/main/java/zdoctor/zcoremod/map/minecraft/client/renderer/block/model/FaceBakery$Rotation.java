package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FaceBakery$Rotation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvx$a";
		else
			return "net/minecraft/client/renderer/block/model/FaceBakery$Rotation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvx$a";
		else
			return "FaceBakery$Rotation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvx$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/FaceBakery$Rotation;";
	}

	/**
	 * <p>
	 * Name: rotateUV
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/BlockFaceUV;)Lnet/minecraft/client/renderer/block/model/BlockFaceUV;]
	 * </p>
	 */
	public static McObfPair func_188006_a = McMappingDatabase.getSRG("FaceBakery$Rotation.func_188006_a");

	/**
	 * <p>
	 * Name: makeRotatedUV
	 * </p>
	 * <p>
	 * Desc: [(FFFF)Lnet/minecraft/client/renderer/block/model/BlockFaceUV;]
	 * </p>
	 */
	public static McObfPair func_188007_a = McMappingDatabase.getSRG("FaceBakery$Rotation.func_188007_a");

}
