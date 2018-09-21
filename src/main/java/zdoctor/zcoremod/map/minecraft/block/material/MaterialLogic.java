package zdoctor.zcoremod.map.minecraft.block.material;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MaterialLogic {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcw";
		else
			return "net/minecraft/block/material/MaterialLogic";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bcw";
		else
			return "MaterialLogic";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbcw;";
		else
			return "Lnet/minecraft/block/material/MaterialLogic;";
	}

	/**
	 * <p>
	 * Name: isSolid
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76220_a = McMappingDatabase.getSRG("MaterialLogic.func_76220_a");

	/**
	 * <p>
	 * Name: blocksLight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76228_b = McMappingDatabase.getSRG("MaterialLogic.func_76228_b");

	/**
	 * <p>
	 * Name: blocksMovement
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_76230_c = McMappingDatabase.getSRG("MaterialLogic.func_76230_c");

}
