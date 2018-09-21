package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderGhast {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzn";
		else
			return "net/minecraft/client/renderer/entity/RenderGhast";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzn";
		else
			return "RenderGhast";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzn;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderGhast;";
	}

	/**
	 * <p>
	 * Name: GHAST_SHOOTING_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110868_f = McMappingDatabase.getSRG("field_110868_f");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityGhast;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderGhast.func_110775_a");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityGhast;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderGhast.func_77041_b");

	/**
	 * <p>
	 * Name: GHAST_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110869_a = McMappingDatabase.getSRG("field_110869_a");

}
