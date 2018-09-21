package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityShulkerBoxRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxe";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityShulkerBoxRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxe";
		else
			return "TileEntityShulkerBoxRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxe;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityShulkerBoxRenderer;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityShulkerBox;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityShulkerBoxRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_191285_a = McMappingDatabase.getSRG("field_191285_a");

}
