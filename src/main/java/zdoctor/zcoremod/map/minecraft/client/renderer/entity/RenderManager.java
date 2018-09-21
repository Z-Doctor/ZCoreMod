package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzf";
		else
			return "net/minecraft/client/renderer/entity/RenderManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzf";
		else
			return "RenderManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzf;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderManager;";
	}

	/**
	 * <p>
	 * Name: renderEntityStatic
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FZ)V]
	 * </p>
	 */
	public static McObfPair func_188388_a = McMappingDatabase.getSRG("RenderManager.func_188388_a");

	/**
	 * <p>
	 * Name: renderPosZ
	 * </p>
	 */
	public static McObfPair field_78723_d = McMappingDatabase.getSRG("field_78723_d");

	/**
	 * <p>
	 * Name: setRenderShadow
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_178633_a = McMappingDatabase.getSRG("RenderManager.func_178633_a");

	/**
	 * <p>
	 * Name: renderEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFFZ)V]
	 * </p>
	 */
	public static McObfPair func_188391_a = McMappingDatabase.getSRG("RenderManager.func_188391_a");

	/**
	 * <p>
	 * Name: setRenderOutlines
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_178632_c = McMappingDatabase.getSRG("RenderManager.func_178632_c");

	/**
	 * <p>
	 * Name: isRenderMultipass
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_188390_b = McMappingDatabase.getSRG("RenderManager.func_188390_b");

	/**
	 * <p>
	 * Name: getDistanceToCamera
	 * </p>
	 * <p>
	 * Desc: [(DDD)D]
	 * </p>
	 */
	public static McObfPair func_78714_a = McMappingDatabase.getSRG("RenderManager.func_78714_a");

	/**
	 * <p>
	 * Name: shouldRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z]
	 * </p>
	 */
	public static McObfPair func_178635_a = McMappingDatabase.getSRG("RenderManager.func_178635_a");

	/**
	 * <p>
	 * Name: debugBoundingBox
	 * </p>
	 */
	public static McObfPair field_85095_o = McMappingDatabase.getSRG("field_85095_o");

	/**
	 * <p>
	 * Name: renderOutlines
	 * </p>
	 */
	public static McObfPair field_178639_r = McMappingDatabase.getSRG("field_178639_r");

	/**
	 * <p>
	 * Name: getFontRenderer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/FontRenderer;]
	 * </p>
	 */
	public static McObfPair func_78716_a = McMappingDatabase.getSRG("RenderManager.func_78716_a");

	/**
	 * <p>
	 * Name: viewerPosY
	 * </p>
	 */
	public static McObfPair field_78731_m = McMappingDatabase.getSRG("field_78731_m");

	/**
	 * <p>
	 * Name: renderMultipass
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;F)V]
	 * </p>
	 */
	public static McObfPair func_188389_a = McMappingDatabase.getSRG("RenderManager.func_188389_a");

	/**
	 * <p>
	 * Name: textRenderer
	 * </p>
	 */
	public static McObfPair field_78736_p = McMappingDatabase.getSRG("field_78736_p");

	/**
	 * <p>
	 * Name: setDebugBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_178629_b = McMappingDatabase.getSRG("RenderManager.func_178629_b");

	/**
	 * <p>
	 * Name: renderPosX
	 * </p>
	 */
	public static McObfPair field_78725_b = McMappingDatabase.getSRG("field_78725_b");

	/**
	 * <p>
	 * Name: options
	 * </p>
	 */
	public static McObfPair field_78733_k = McMappingDatabase.getSRG("field_78733_k");

	/**
	 * <p>
	 * Name: setWorld
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;)V]
	 * </p>
	 */
	public static McObfPair func_78717_a = McMappingDatabase.getSRG("RenderManager.func_78717_a");

	/**
	 * <p>
	 * Name: playerRenderer
	 * </p>
	 */
	public static McObfPair field_178637_m = McMappingDatabase.getSRG("field_178637_m");

	/**
	 * <p>
	 * Name: setPlayerViewY
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_178631_a = McMappingDatabase.getSRG("RenderManager.func_178631_a");

	/**
	 * <p>
	 * Name: getEntityClassRenderObject
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Lnet/minecraft/client/renderer/entity/Render;]
	 * </p>
	 */
	public static McObfPair func_78715_a = McMappingDatabase.getSRG("RenderManager.func_78715_a");

	/**
	 * <p>
	 * Name: renderShadow
	 * </p>
	 */
	public static McObfPair field_178638_s = McMappingDatabase.getSRG("field_178638_s");

	/**
	 * <p>
	 * Name: pointedEntity
	 * </p>
	 */
	public static McObfPair field_147941_i = McMappingDatabase.getSRG("field_147941_i");

	/**
	 * <p>
	 * Name: viewerPosX
	 * </p>
	 */
	public static McObfPair field_78730_l = McMappingDatabase.getSRG("field_78730_l");

	/**
	 * <p>
	 * Name: renderViewEntity
	 * </p>
	 */
	public static McObfPair field_78734_h = McMappingDatabase.getSRG("field_78734_h");

	/**
	 * <p>
	 * Name: skinMap
	 * </p>
	 */
	public static McObfPair field_178636_l = McMappingDatabase.getSRG("field_178636_l");

	/**
	 * <p>
	 * Name: renderDebugBoundingBox
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_85094_b = McMappingDatabase.getSRG("RenderManager.func_85094_b");

	/**
	 * <p>
	 * Name: playerViewY
	 * </p>
	 */
	public static McObfPair field_78735_i = McMappingDatabase.getSRG("field_78735_i");

	/**
	 * <p>
	 * Name: renderPosY
	 * </p>
	 */
	public static McObfPair field_78726_c = McMappingDatabase.getSRG("field_78726_c");

	/**
	 * <p>
	 * Name: cacheActiveRenderInfo
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/entity/Entity;Lnet/minecraft/entity/Entity;Lnet/minecraft/client/settings/GameSettings;F)V]
	 * </p>
	 */
	public static McObfPair func_180597_a = McMappingDatabase.getSRG("RenderManager.func_180597_a");

	/**
	 * <p>
	 * Name: entityRenderMap
	 * </p>
	 */
	public static McObfPair field_78729_o = McMappingDatabase.getSRG("field_78729_o");

	/**
	 * <p>
	 * Name: playerViewX
	 * </p>
	 */
	public static McObfPair field_78732_j = McMappingDatabase.getSRG("field_78732_j");

	/**
	 * <p>
	 * Name: isRenderShadow
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178627_a = McMappingDatabase.getSRG("RenderManager.func_178627_a");

	/**
	 * <p>
	 * Name: renderEngine
	 * </p>
	 */
	public static McObfPair field_78724_e = McMappingDatabase.getSRG("field_78724_e");

	/**
	 * <p>
	 * Name: getEntityRenderObject
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/client/renderer/entity/Render;]
	 * </p>
	 */
	public static McObfPair func_78713_a = McMappingDatabase.getSRG("RenderManager.func_78713_a");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_78722_g = McMappingDatabase.getSRG("field_78722_g");

	/**
	 * <p>
	 * Name: setRenderPosition
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_178628_a = McMappingDatabase.getSRG("RenderManager.func_178628_a");

	/**
	 * <p>
	 * Name: isDebugBoundingBox
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_178634_b = McMappingDatabase.getSRG("RenderManager.func_178634_b");

	/**
	 * <p>
	 * Name: viewerPosZ
	 * </p>
	 */
	public static McObfPair field_78728_n = McMappingDatabase.getSRG("field_78728_n");

}
