package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityEndPortalRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxj";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityEndPortalRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxj";
		else
			return "TileEntityEndPortalRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxj;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityEndPortalRenderer;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityEndPortalRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: buffer
	 * </p>
	 */
	public static McObfPair field_147528_b = McMappingDatabase.getSRG("field_147528_b");

	/**
	 * <p>
	 * Name: PROJECTION
	 * </p>
	 */
	public static McObfPair field_188202_i = McMappingDatabase.getSRG("field_188202_i");

	/**
	 * <p>
	 * Name: getBuffer
	 * </p>
	 * <p>
	 * Desc: [(FFFF)Ljava/nio/FloatBuffer;]
	 * </p>
	 */
	public static McObfPair func_147525_a = McMappingDatabase.getSRG("TileEntityEndPortalRenderer.func_147525_a");

	/**
	 * <p>
	 * Name: MODELVIEW
	 * </p>
	 */
	public static McObfPair field_188201_h = McMappingDatabase.getSRG("field_188201_h");

	/**
	 * <p>
	 * Name: getOffset
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_191287_c = McMappingDatabase.getSRG("TileEntityEndPortalRenderer.func_191287_c");

	/**
	 * <p>
	 * Name: END_PORTAL_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147526_d = McMappingDatabase.getSRG("field_147526_d");

	/**
	 * <p>
	 * Name: getPasses
	 * </p>
	 * <p>
	 * Desc: [(D)I]
	 * </p>
	 */
	public static McObfPair func_191286_a = McMappingDatabase.getSRG("TileEntityEndPortalRenderer.func_191286_a");

	/**
	 * <p>
	 * Name: RANDOM
	 * </p>
	 */
	public static McObfPair field_147527_e = McMappingDatabase.getSRG("field_147527_e");

	/**
	 * <p>
	 * Name: END_SKY_TEXTURE
	 * </p>
	 */
	public static McObfPair field_147529_c = McMappingDatabase.getSRG("field_147529_c");

}
