package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityStructureRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxh";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityStructureRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxh";
		else
			return "TileEntityStructureRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxh;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityStructureRenderer;";
	}

	/**
	 * <p>
	 * Name: renderBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/Tessellator;Lnet/minecraft/client/renderer/BufferBuilder;DDDDDDIII)V]
	 * </p>
	 */
	public static McObfPair func_190055_a = McMappingDatabase.getSRG("TileEntityStructureRenderer.func_190055_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityStructure;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityStructureRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: isGlobalRenderer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)Z, (Lnet/minecraft/tileentity/TileEntityStructure;)Z]
	 * </p>
	 */
	public static McObfPair func_188185_a = McMappingDatabase.getSRG("TileEntityStructureRenderer.func_188185_a");

	/**
	 * <p>
	 * Name: renderInvisibleBlocks
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityStructure;DDDLnet/minecraft/util/math/BlockPos;Lnet/minecraft/client/renderer/Tessellator;Lnet/minecraft/client/renderer/BufferBuilder;Z)V]
	 * </p>
	 */
	public static McObfPair func_190054_a = McMappingDatabase.getSRG("TileEntityStructureRenderer.func_190054_a");

}
