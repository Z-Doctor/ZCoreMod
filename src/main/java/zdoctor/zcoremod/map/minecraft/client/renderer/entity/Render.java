package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Render {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzg";
		else
			return "net/minecraft/client/renderer/entity/Render";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzg";
		else
			return "Render";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzg;";
		else
			return "Lnet/minecraft/client/renderer/entity/Render;";
	}

	/**
	 * <p>
	 * Name: getWorldFromRenderManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/World;]
	 * </p>
	 */
	public static McObfPair func_76982_b = McMappingDatabase.getSRG("Render.func_76982_b");

	/**
	 * <p>
	 * Name: shadowSize
	 * </p>
	 */
	public static McObfPair field_76989_e = McMappingDatabase.getSRG("field_76989_e");

	/**
	 * <p>
	 * Name: renderLivingLabel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Ljava/lang/String;DDDI)V]
	 * </p>
	 */
	public static McObfPair func_147906_a = McMappingDatabase.getSRG("Render.func_147906_a");

	/**
	 * <p>
	 * Name: renderManager
	 * </p>
	 */
	public static McObfPair field_76990_c = McMappingDatabase.getSRG("field_76990_c");

	/**
	 * <p>
	 * Name: bindEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_180548_c = McMappingDatabase.getSRG("Render.func_180548_c");

	/**
	 * <p>
	 * Name: SHADOW_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110778_a = McMappingDatabase.getSRG("field_110778_a");

	/**
	 * <p>
	 * Name: getFontRendererFromRenderManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/gui/FontRenderer;]
	 * </p>
	 */
	public static McObfPair func_76983_a = McMappingDatabase.getSRG("Render.func_76983_a");

	/**
	 * <p>
	 * Name: getTeamColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)I]
	 * </p>
	 */
	public static McObfPair func_188298_c = McMappingDatabase.getSRG("Render.func_188298_c");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("Render.func_76986_a");

	/**
	 * <p>
	 * Name: canRenderName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_177070_b = McMappingDatabase.getSRG("Render.func_177070_b");

	/**
	 * <p>
	 * Name: renderName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDD)V]
	 * </p>
	 */
	public static McObfPair func_177067_a = McMappingDatabase.getSRG("Render.func_177067_a");

	/**
	 * <p>
	 * Name: isMultipass
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188295_H_ = McMappingDatabase.getSRG("Render.func_188295_H_");

	/**
	 * <p>
	 * Name: bindTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_110776_a = McMappingDatabase.getSRG("Render.func_110776_a");

	/**
	 * <p>
	 * Name: renderEntityName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDLjava/lang/String;D)V]
	 * </p>
	 */
	public static McObfPair func_188296_a = McMappingDatabase.getSRG("Render.func_188296_a");

	/**
	 * <p>
	 * Name: setRenderOutlines
	 * </p>
	 * <p>
	 * Desc: [(Z)V]
	 * </p>
	 */
	public static McObfPair func_188297_a = McMappingDatabase.getSRG("Render.func_188297_a");

	/**
	 * <p>
	 * Name: renderEntityOnFire
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDF)V]
	 * </p>
	 */
	public static McObfPair func_76977_a = McMappingDatabase.getSRG("Render.func_76977_a");

	/**
	 * <p>
	 * Name: renderShadow
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76975_c = McMappingDatabase.getSRG("Render.func_76975_c");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("Render.func_110775_a");

	/**
	 * <p>
	 * Name: getRenderManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/entity/RenderManager;]
	 * </p>
	 */
	public static McObfPair func_177068_d = McMappingDatabase.getSRG("Render.func_177068_d");

	/**
	 * <p>
	 * Name: shouldRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z]
	 * </p>
	 */
	public static McObfPair func_177071_a = McMappingDatabase.getSRG("Render.func_177071_a");

	/**
	 * <p>
	 * Name: shadowOpaque
	 * </p>
	 */
	public static McObfPair field_76987_f = McMappingDatabase.getSRG("field_76987_f");

	/**
	 * <p>
	 * Name: renderMultipass
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_188300_b = McMappingDatabase.getSRG("Render.func_188300_b");

	/**
	 * <p>
	 * Name: doRenderShadowAndFire
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76979_b = McMappingDatabase.getSRG("Render.func_76979_b");

	/**
	 * <p>
	 * Name: renderOutlines
	 * </p>
	 */
	public static McObfPair field_188301_f = McMappingDatabase.getSRG("field_188301_f");

	/**
	 * <p>
	 * Name: renderOffsetAABB
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/math/AxisAlignedBB;DDD)V]
	 * </p>
	 */
	public static McObfPair func_76978_a = McMappingDatabase.getSRG("Render.func_76978_a");

	/**
	 * <p>
	 * Name: renderShadowSingle
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;DDDLnet/minecraft/util/math/BlockPos;FFDDD)V]
	 * </p>
	 */
	public static McObfPair func_188299_a = McMappingDatabase.getSRG("Render.func_188299_a");

}
