package zdoctor.zcoremod.map.minecraft.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityCommandBlock$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avm$1";
		else
			return "net/minecraft/tileentity/TileEntityCommandBlock$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "avm$1";
		else
			return "TileEntityCommandBlock$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lavm$1;";
		else
			return "Lnet/minecraft/tileentity/TileEntityCommandBlock$1;";
	}

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/BlockPos;]
	 * </p>
	 */
	public static McObfPair func_180425_c = McMappingDatabase.getSRG("TileEntityCommandBlock$1.func_180425_c");

	/**
	 * <p>
	 * Name: getCommandBlockType
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_145751_f = McMappingDatabase.getSRG("TileEntityCommandBlock$1.func_145751_f");

	/**
	 * <p>
	 * Name: fillInInfo
	 * </p>
	 * <p>
	 * Desc: [(Lio/netty/buffer/ByteBuf;)V]
	 * </p>
	 */
	public static McObfPair func_145757_a = McMappingDatabase.getSRG("TileEntityCommandBlock$1.func_145757_a");

	/**
	 * <p>
	 * Name: getEntityWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_130014_f_ = McMappingDatabase.getSRG("TileEntityCommandBlock$1.func_130014_f_");

	/**
	 * <p>
	 * Name: getPositionVector
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_174791_d = McMappingDatabase.getSRG("TileEntityCommandBlock$1.func_174791_d");

	/**
	 * <p>
	 * Name: getServer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_184102_h = McMappingDatabase.getSRG("TileEntityCommandBlock$1.func_184102_h");

	/**
	 * <p>
	 * Name: updateCommand
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_145756_e = McMappingDatabase.getSRG("TileEntityCommandBlock$1.func_145756_e");

	/**
	 * <p>
	 * Name: setCommand
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_145752_a = McMappingDatabase.getSRG("TileEntityCommandBlock$1.func_145752_a");

}
