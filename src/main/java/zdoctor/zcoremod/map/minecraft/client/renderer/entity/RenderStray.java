package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderStray {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cay";
		else
			return "net/minecraft/client/renderer/entity/RenderStray";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cay";
		else
			return "RenderStray";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcay;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderStray;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/AbstractSkeleton;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/EntityLiving;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderStray.func_110775_a");

	/**
	 * <p>
	 * Name: STRAY_SKELETON_TEXTURES
	 * </p>
	 */
	public static McObfPair field_190084_m = McMappingDatabase.getSRG("field_190084_m");

}
