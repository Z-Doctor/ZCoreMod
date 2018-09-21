package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntitySignRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxf";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntitySignRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxf";
		else
			return "TileEntitySignRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxf;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntitySignRenderer;";
	}

	/**
	 * <p>
	 * Name: SIGN_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147513_b = McMappingDatabase.getSRG("field_147513_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntitySign;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntitySignRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_147514_c = McMappingDatabase.getSRG("field_147514_c");

}
