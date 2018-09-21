package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityEnderChestRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxb";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityEnderChestRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxb";
		else
			return "TileEntityEnderChestRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxb;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityEnderChestRenderer;";
	}

	/**
	 * <p>
	 * Name: ENDER_CHEST_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147520_b = McMappingDatabase.getSRG("field_147520_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityEnderChest;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityEnderChestRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: modelChest
	 * </p>
	 */
	public static McObfPair field_147521_c = McMappingDatabase.getSRG("field_147521_c");

}
