package zdoctor.zcoremod.map.minecraft.block.material;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Material$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcz$1";
		else
			return "net/minecraft/block/material/Material$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcz$1";
		else
			return "Material$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcz$1;";
		else
			return "Lnet/minecraft/block/material/Material$1;";
	}

	/**
	 * <p>
	 * Name: blocksMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76230_c = McMappingDatabase.getSRG("Material$1.func_76230_c");

}
