package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderBiped {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzr";
		else
			return "net/minecraft/client/renderer/entity/RenderBiped";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzr";
		else
			return "RenderBiped";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzr;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderBiped;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/EntityLiving;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderBiped.func_110775_a");

	/**
	 * <p>
	 * Name: DEFAULT_RES_LOC
	 * </p>
	 */
	public static McObfPair field_177118_j = McMappingDatabase.getSRG("field_177118_j");

	/**
	 * <p>
	 * Name: transformHeldFull3DItemLayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82422_c = McMappingDatabase.getSRG("RenderBiped.func_82422_c");

}
