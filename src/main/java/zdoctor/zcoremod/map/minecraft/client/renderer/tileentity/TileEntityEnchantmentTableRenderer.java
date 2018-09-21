package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityEnchantmentTableRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxa";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityEnchantmentTableRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxa";
		else
			return "TileEntityEnchantmentTableRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxa;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityEnchantmentTableRenderer;";
	}

	/**
	 * <p>
	 * Name: TEXTURE_BOOK
	 * </p>
	 */
	public static McObfPair field_147540_b = McMappingDatabase.getSRG("field_147540_b");

	/**
	 * <p>
	 * Name: modelBook
	 * </p>
	 */
	public static McObfPair field_147541_c = McMappingDatabase.getSRG("field_147541_c");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityEnchantmentTable;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityEnchantmentTableRenderer.func_192841_a");

}
