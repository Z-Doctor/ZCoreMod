package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderSkeleton {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cas";
		else
			return "net/minecraft/client/renderer/entity/RenderSkeleton";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cas";
		else
			return "RenderSkeleton";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcas;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderSkeleton;";
	}

	/**
	 * <p>
	 * Name: SKELETON_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110862_k = McMappingDatabase.getSRG("field_110862_k");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/AbstractSkeleton;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/EntityLiving;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderSkeleton.func_110775_a");

	/**
	 * <p>
	 * Name: transformHeldFull3DItemLayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82422_c = McMappingDatabase.getSRG("RenderSkeleton.func_82422_c");

}
