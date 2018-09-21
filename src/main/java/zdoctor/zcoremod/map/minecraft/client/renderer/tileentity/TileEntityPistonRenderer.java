package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityPistonRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxd";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityPistonRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxd";
		else
			return "TileEntityPistonRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxd;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityPistonRenderer;";
	}

	/**
	 * <p>
	 * Name: renderStateModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/world/World;Z)Z]
	 * </p>
	 */
	public static McObfPair func_188186_a = McMappingDatabase.getSRG("TileEntityPistonRenderer.func_188186_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityPiston;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityPistonRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: blockRenderer
	 * </p>
	 */
	public static McObfPair field_178462_c = McMappingDatabase.getSRG("field_178462_c");

}
