package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityChestRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwz";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityChestRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwz";
		else
			return "TileEntityChestRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwz;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityChestRenderer;";
	}

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityChest;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityChestRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: TEXTURE_CHRISTMAS
	 * </p>
	 */
	public static McObfPair field_147503_f = McMappingDatabase.getSRG("field_147503_f");

	/**
	 * <p>
	 * Name: largeChest
	 * </p>
	 */
	public static McObfPair field_147511_i = McMappingDatabase.getSRG("field_147511_i");

	/**
	 * <p>
	 * Name: simpleChest
	 * </p>
	 */
	public static McObfPair field_147510_h = McMappingDatabase.getSRG("field_147510_h");

	/**
	 * <p>
	 * Name: isChristmas
	 * </p>
	 */
	public static McObfPair field_147509_j = McMappingDatabase.getSRG("field_147509_j");

	/**
	 * <p>
	 * Name: TEXTURE_NORMAL_DOUBLE
	 * </p>
	 */
	public static McObfPair field_147505_d = McMappingDatabase.getSRG("field_147505_d");

	/**
	 * <p>
	 * Name: TEXTURE_NORMAL
	 * </p>
	 */
	public static McObfPair field_147504_g = McMappingDatabase.getSRG("field_147504_g");

	/**
	 * <p>
	 * Name: TEXTURE_TRAPPED
	 * </p>
	 */
	public static McObfPair field_147506_e = McMappingDatabase.getSRG("field_147506_e");

	/**
	 * <p>
	 * Name: TEXTURE_CHRISTMAS_DOUBLE
	 * </p>
	 */
	public static McObfPair field_147508_c = McMappingDatabase.getSRG("field_147508_c");

	/**
	 * <p>
	 * Name: TEXTURE_TRAPPED_DOUBLE
	 * </p>
	 */
	public static McObfPair field_147507_b = McMappingDatabase.getSRG("field_147507_b");

}
