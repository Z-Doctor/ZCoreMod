package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityBeaconRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwv";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityBeaconRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwv";
		else
			return "TileEntityBeaconRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwv;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityBeaconRenderer;";
	}

	/**
	 * <p>
	 * Name: renderBeamSegment
	 * </p>
	 * <p>
	 * Desc: [(DDDDDDII[F)V]
	 * </p>
	 */
	public static McObfPair func_188204_a = McMappingDatabase.getSRG("TileEntityBeaconRenderer.func_188204_a");

	/**
	 * <p>
	 * Name: renderBeacon
	 * </p>
	 * <p>
	 * Desc: [(DDDDDLjava/util/List;D)V]
	 * </p>
	 */
	public static McObfPair func_188206_a = McMappingDatabase.getSRG("TileEntityBeaconRenderer.func_188206_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityBeacon;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntity;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityBeaconRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: isGlobalRenderer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityBeacon;)Z, (Lnet/minecraft/tileentity/TileEntity;)Z]
	 * </p>
	 */
	public static McObfPair func_188185_a = McMappingDatabase.getSRG("TileEntityBeaconRenderer.func_188185_a");

	/**
	 * <p>
	 * Name: renderBeamSegment
	 * </p>
	 * <p>
	 * Desc: [(DDDDDDII[FDD)V]
	 * </p>
	 */
	public static McObfPair func_188205_a = McMappingDatabase.getSRG("TileEntityBeaconRenderer.func_188205_a");

	/**
	 * <p>
	 * Name: TEXTURE_BEACON_BEAM
	 * </p>
	 */
	public static McObfPair field_147523_b = McMappingDatabase.getSRG("field_147523_b");

}
