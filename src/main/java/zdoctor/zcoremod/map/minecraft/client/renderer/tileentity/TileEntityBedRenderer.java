package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityBedRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bww";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityBedRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bww";
		else
			return "TileEntityBedRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbww;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityBedRenderer;";
	}

	/**
	 * <p>
	 * Name: version
	 * </p>
	 */
	public static McObfPair field_193850_e = McMappingDatabase.getSRG("field_193850_e");

	/**
	 * <p>
	 * Name: TEXTURES
	 * </p>
	 */
	public static McObfPair field_193848_a = McMappingDatabase.getSRG("field_193848_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntityBed;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntity;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityBedRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_193849_d = McMappingDatabase.getSRG("field_193849_d");

	/**
	 * <p>
	 * Name: renderPiece
	 * </p>
	 * <p>
	 * Desc: [(ZDDDIF)V]
	 * </p>
	 */
	public static McObfPair func_193847_a = McMappingDatabase.getSRG("TileEntityBedRenderer.func_193847_a");

}
