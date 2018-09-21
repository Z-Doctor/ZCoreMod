package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntitySpecialRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwy";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwy";
		else
			return "TileEntitySpecialRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwy;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer;";
	}

	/**
	 * <p>
	 * Name: getFontRenderer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/FontRenderer;]
	 * </p>
	 */
	public static McObfPair func_147498_b = McMappingDatabase.getSRG("TileEntitySpecialRenderer.func_147498_b");

	/**
	 * <p>
	 * Name: setRendererDispatcher
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher;)V]
	 * </p>
	 */
	public static McObfPair func_147497_a = McMappingDatabase.getSRG("TileEntitySpecialRenderer.func_147497_a");

	/**
	 * <p>
	 * Name: drawNameplate
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;Ljava/lang/String;DDDI)V]
	 * </p>
	 */
	public static McObfPair func_190052_a = McMappingDatabase.getSRG("TileEntitySpecialRenderer.func_190052_a");

	/**
	 * <p>
	 * Name: getWorld
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_178459_a = McMappingDatabase.getSRG("TileEntitySpecialRenderer.func_178459_a");

	/**
	 * <p>
	 * Name: isGlobalRenderer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)Z]
	 * </p>
	 */
	public static McObfPair func_188185_a = McMappingDatabase.getSRG("TileEntitySpecialRenderer.func_188185_a");

	/**
	 * <p>
	 * Name: DESTROY_STAGES
	 * </p>
	 */
	public static McObfPair field_178460_a = McMappingDatabase.getSRG("field_178460_a");

	/**
	 * <p>
	 * Name: rendererDispatcher
	 * </p>
	 */
	public static McObfPair field_147501_a = McMappingDatabase.getSRG("field_147501_a");

	/**
	 * <p>
	 * Name: setLightmapDisabled
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_190053_a = McMappingDatabase.getSRG("TileEntitySpecialRenderer.func_190053_a");

	/**
	 * <p>
	 * Name: bindTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_147499_a = McMappingDatabase.getSRG("TileEntitySpecialRenderer.func_147499_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntitySpecialRenderer.func_192841_a");

}
