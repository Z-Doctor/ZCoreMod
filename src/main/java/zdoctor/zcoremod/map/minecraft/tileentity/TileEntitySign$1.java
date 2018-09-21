package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntitySign$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awc$1";
		else
			return "net/minecraft/tileentity/TileEntitySign$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "awc$1";
		else
			return "TileEntitySign$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lawc$1;";
		else
			return "Lnet/minecraft/tileentity/TileEntitySign$1;";
	}

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184102_h = McMappingDatabase.getSRG("TileEntitySign$1.func_184102_h");

	/**
	 * <p>
	 * Name: getEntityWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_130014_f_ = McMappingDatabase.getSRG("TileEntitySign$1.func_130014_f_");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_70005_c_ = McMappingDatabase.getSRG("TileEntitySign$1.func_70005_c_");

	/**
	 * <p>
	 * Name: getPositionVector
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_174791_d = McMappingDatabase.getSRG("TileEntitySign$1.func_174791_d");

	/**
	 * <p>
	 * Name: canUseCommand
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;)Z]
	 * </p>
	 */
	public static McObfPair func_70003_b = McMappingDatabase.getSRG("TileEntitySign$1.func_70003_b");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("TileEntitySign$1.func_180425_c");

}
