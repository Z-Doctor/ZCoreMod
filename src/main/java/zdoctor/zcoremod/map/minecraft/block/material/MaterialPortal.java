package zdoctor.zcoremod.map.minecraft.block.material;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MaterialPortal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdb";
		else
			return "net/minecraft/block/material/MaterialPortal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bdb";
		else
			return "MaterialPortal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbdb;";
		else
			return "Lnet/minecraft/block/material/MaterialPortal;";
	}

	/**
	 * <p>
	 * Name: isSolid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76220_a = McMappingDatabase.getSRG("MaterialPortal.func_76220_a");

	/**
	 * <p>
	 * Name: blocksLight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76228_b = McMappingDatabase.getSRG("MaterialPortal.func_76228_b");

	/**
	 * <p>
	 * Name: blocksMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76230_c = McMappingDatabase.getSRG("MaterialPortal.func_76230_c");

}
