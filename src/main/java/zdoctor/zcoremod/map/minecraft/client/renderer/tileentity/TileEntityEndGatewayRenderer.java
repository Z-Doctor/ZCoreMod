package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityEndGatewayRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxi";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityEndGatewayRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxi";
		else
			return "TileEntityEndGatewayRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxi;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityEndGatewayRenderer;";
	}

	/**
	 * <p>
	 * Name: getPasses
	 * </p>
	 * <p>
	 * Desc: [(D)I]
	 * </p>
	 */
	public static McObfPair func_191286_a = McMappingDatabase.getSRG("TileEntityEndGatewayRenderer.func_191286_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityEndGatewayRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_191287_c = McMappingDatabase.getSRG("TileEntityEndGatewayRenderer.func_191287_c");

	/**
	 * <p>
	 * Name: END_GATEWAY_BEAM_TEXTURE
	 * </p>
	 */
	public static McObfPair field_188199_f = McMappingDatabase.getSRG("field_188199_f");

}
