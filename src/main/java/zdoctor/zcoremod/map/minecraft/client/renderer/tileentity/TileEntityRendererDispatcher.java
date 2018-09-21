package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityRendererDispatcher {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwx";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwx";
		else
			return "TileEntityRendererDispatcher";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwx;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityRendererDispatcher;";
	}

	/**
	 * <p>
	 * Name: entityYaw
	 * </p>
	 */
	public static McObfPair field_147562_h = McMappingDatabase.getSRG("field_147562_h");

	/**
	 * <p>
	 * Name: getRenderer
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Lnet/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer;]
	 * </p>
	 */
	public static McObfPair func_147546_a = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_147546_a");

	/**
	 * <p>
	 * Name: staticPlayerY
	 * </p>
	 */
	public static McObfPair field_147555_c = McMappingDatabase.getSRG("field_147555_c");

	/**
	 * <p>
	 * Name: renderers
	 * </p>
	 */
	public static McObfPair field_147559_m = McMappingDatabase.getSRG("field_147559_m");

	/**
	 * <p>
	 * Name: renderEngine
	 * </p>
	 */
	public static McObfPair field_147553_e = McMappingDatabase.getSRG("field_147553_e");

	/**
	 * <p>
	 * Name: cameraHitResult
	 * </p>
	 */
	public static McObfPair field_190057_j = McMappingDatabase.getSRG("field_190057_j");

	/**
	 * <p>
	 * Name: setWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_147543_a = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_147543_a");

	/**
	 * <p>
	 * Name: entityZ
	 * </p>
	 */
	public static McObfPair field_147558_l = McMappingDatabase.getSRG("field_147558_l");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192854_a = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_192854_a");

	/**
	 * <p>
	 * Name: entity
	 * </p>
	 */
	public static McObfPair field_147551_g = McMappingDatabase.getSRG("field_147551_g");

	/**
	 * <p>
	 * Name: prepare
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/RayTraceResult;F)V]
	 * </p>
	 */
	public static McObfPair func_190056_a = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_190056_a");

	/**
	 * <p>
	 * Name: fontRenderer
	 * </p>
	 */
	public static McObfPair field_147557_n = McMappingDatabase.getSRG("field_147557_n");

	/**
	 * <p>
	 * Name: getFontRenderer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/FontRenderer;]
	 * </p>
	 */
	public static McObfPair func_147548_a = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_147548_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;FI)V]
	 * </p>
	 */
	public static McObfPair func_180546_a = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_180546_a");

	/**
	 * <p>
	 * Name: entityPitch
	 * </p>
	 */
	public static McObfPair field_147563_i = McMappingDatabase.getSRG("field_147563_i");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_147550_f = McMappingDatabase.getSRG("field_147550_f");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDF)V]
	 * </p>
	 */
	public static McObfPair func_147549_a = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_147549_a");

	/**
	 * <p>
	 * Name: instance
	 * </p>
	 */
	public static McObfPair field_147556_a = McMappingDatabase.getSRG("field_147556_a");

	/**
	 * <p>
	 * Name: entityX
	 * </p>
	 */
	public static McObfPair field_147560_j = McMappingDatabase.getSRG("field_147560_j");

	/**
	 * <p>
	 * Name: staticPlayerX
	 * </p>
	 */
	public static McObfPair field_147554_b = McMappingDatabase.getSRG("field_147554_b");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_192855_a = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_192855_a");

	/**
	 * <p>
	 * Name: staticPlayerZ
	 * </p>
	 */
	public static McObfPair field_147552_d = McMappingDatabase.getSRG("field_147552_d");

	/**
	 * <p>
	 * Name: entityY
	 * </p>
	 */
	public static McObfPair field_147561_k = McMappingDatabase.getSRG("field_147561_k");

	/**
	 * <p>
	 * Name: getRenderer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;)Lnet/minecraft/client/renderer/tileentity/TileEntitySpecialRenderer;]
	 * </p>
	 */
	public static McObfPair func_147547_b = McMappingDatabase.getSRG("TileEntityRendererDispatcher.func_147547_b");

}
