package zdoctor.zcoremod.map.minecraft.block.material;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MaterialTransparent {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcx";
		else
			return "net/minecraft/block/material/MaterialTransparent";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcx";
		else
			return "MaterialTransparent";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcx;";
		else
			return "Lnet/minecraft/block/material/MaterialTransparent;";
	}

	/**
	 * <p>
	 * Name: blocksMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76230_c = McMappingDatabase.getSRG("MaterialTransparent.func_76230_c");

	/**
	 * <p>
	 * Name: isSolid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76220_a = McMappingDatabase.getSRG("MaterialTransparent.func_76220_a");

	/**
	 * <p>
	 * Name: blocksLight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76228_b = McMappingDatabase.getSRG("MaterialTransparent.func_76228_b");

}
