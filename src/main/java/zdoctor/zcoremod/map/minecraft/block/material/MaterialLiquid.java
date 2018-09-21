package zdoctor.zcoremod.map.minecraft.block.material;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MaterialLiquid {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcy";
		else
			return "net/minecraft/block/material/MaterialLiquid";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcy";
		else
			return "MaterialLiquid";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcy;";
		else
			return "Lnet/minecraft/block/material/MaterialLiquid;";
	}

	/**
	 * <p>
	 * Name: isSolid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76220_a = McMappingDatabase.getSRG("MaterialLiquid.func_76220_a");

	/**
	 * <p>
	 * Name: isLiquid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76224_d = McMappingDatabase.getSRG("MaterialLiquid.func_76224_d");

	/**
	 * <p>
	 * Name: blocksMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76230_c = McMappingDatabase.getSRG("MaterialLiquid.func_76230_c");

}
