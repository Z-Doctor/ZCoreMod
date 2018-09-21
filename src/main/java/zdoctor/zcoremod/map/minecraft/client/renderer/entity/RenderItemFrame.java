package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderItemFrame {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzv";
		else
			return "net/minecraft/client/renderer/entity/RenderItemFrame";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzv";
		else
			return "RenderItemFrame";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzv;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderItemFrame;";
	}

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItemFrame;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderItemFrame.func_76986_a");

	/**
	 * <p>
	 * Name: mapModel
	 * </p>
	 */
	public static McObfPair field_177073_g = McMappingDatabase.getSRG("field_177073_g");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_147917_g = McMappingDatabase.getSRG("field_147917_g");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItemFrame;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderItemFrame.func_110775_a");

	/**
	 * <p>
	 * Name: itemFrameModel
	 * </p>
	 */
	public static McObfPair field_177072_f = McMappingDatabase.getSRG("field_177072_f");

	/**
	 * <p>
	 * Name: itemRenderer
	 * </p>
	 */
	public static McObfPair field_177074_h = McMappingDatabase.getSRG("field_177074_h");

	/**
	 * <p>
	 * Name: MAP_BACKGROUND_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110789_a = McMappingDatabase.getSRG("field_110789_a");

	/**
	 * <p>
	 * Name: renderName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItemFrame;DDD)V, (Lnet/minecraft/entity/Entity;DDD)V]
	 * </p>
	 */
	public static McObfPair func_177067_a = McMappingDatabase.getSRG("RenderItemFrame.func_177067_a");

	/**
	 * <p>
	 * Name: renderItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityItemFrame;)V]
	 * </p>
	 */
	public static McObfPair func_82402_b = McMappingDatabase.getSRG("RenderItemFrame.func_82402_b");

}
