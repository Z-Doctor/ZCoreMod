package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntitySkullRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxg";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntitySkullRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxg";
		else
			return "TileEntitySkullRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxg;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntitySkullRenderer;";
	}

	/**
	 * <p>
	 * Name: humanoidHead
	 * </p>
	 */
	public static McObfPair field_178468_i = McMappingDatabase.getSRG("field_178468_i");

	/**
	 * <p>
	 * Name: WITHER_SKELETON_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147534_d = McMappingDatabase.getSRG("field_147534_d");

	/**
	 * <p>
	 * Name: ZOMBIE_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147535_e = McMappingDatabase.getSRG("field_147535_e");

	/**
	 * <p>
	 * Name: renderSkull
	 * </p>
	 * <p>
	 * Desc: [(FFFLnet/minecraft/util/EnumFacing;FILcom/mojang/authlib/GameProfile;IF)V]
	 * </p>
	 */
	public static McObfPair func_188190_a = McMappingDatabase.getSRG("TileEntitySkullRenderer.func_188190_a");

	/**
	 * <p>
	 * Name: CREEPER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147532_f = McMappingDatabase.getSRG("field_147532_f");

	/**
	 * <p>
	 * Name: DRAGON_TEXTURES
	 * </p>
	 */
	public static McObfPair field_188191_h = McMappingDatabase.getSRG("field_188191_h");

	/**
	 * <p>
	 * Name: SKELETON_TEXTURES
	 * </p>
	 */
	public static McObfPair field_147537_c = McMappingDatabase.getSRG("field_147537_c");

	/**
	 * <p>
	 * Name: dragonHead
	 * </p>
	 */
	public static McObfPair field_188192_i = McMappingDatabase.getSRG("field_188192_i");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntitySkull;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntitySkullRenderer.func_192841_a");

	/**
	 * <p>
	 * Name: skeletonHead
	 * </p>
	 */
	public static McObfPair field_178467_h = McMappingDatabase.getSRG("field_178467_h");

	/**
	 * <p>
	 * Name: instance
	 * </p>
	 */
	public static McObfPair field_147536_b = McMappingDatabase.getSRG("field_147536_b");

	/**
	 * <p>
	 * Name: setRendererDispatcher
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher;)V]
	 * </p>
	 */
	public static McObfPair func_147497_a = McMappingDatabase.getSRG("TileEntitySkullRenderer.func_147497_a");

}
