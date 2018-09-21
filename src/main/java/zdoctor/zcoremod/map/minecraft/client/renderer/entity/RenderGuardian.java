package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderGuardian {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzp";
		else
			return "net/minecraft/client/renderer/entity/RenderGuardian";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzp";
		else
			return "RenderGuardian";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzp;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderGuardian;";
	}

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityGuardian;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V, (Lnet/minecraft/entity/EntityLiving;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderGuardian.func_76986_a");

	/**
	 * <p>
	 * Name: shouldRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityGuardian;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z, (Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z, (Lnet/minecraft/entity/EntityLiving;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z]
	 * </p>
	 */
	public static McObfPair func_177071_a = McMappingDatabase.getSRG("RenderGuardian.func_177071_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityGuardian;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderGuardian.func_110775_a");

	/**
	 * <p>
	 * Name: GUARDIAN_BEAM_TEXTURE
	 * </p>
	 */
	public static McObfPair field_177117_k = McMappingDatabase.getSRG("field_177117_k");

	/**
	 * <p>
	 * Name: GUARDIAN_TEXTURE
	 * </p>
	 */
	public static McObfPair field_177114_e = McMappingDatabase.getSRG("field_177114_e");

	/**
	 * <p>
	 * Name: getPosition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;DF)Lnet/minecraft/util/math/Vec3d;]
	 * </p>
	 */
	public static McObfPair func_177110_a = McMappingDatabase.getSRG("RenderGuardian.func_177110_a");

}
