package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderHusk {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzs";
		else
			return "net/minecraft/client/renderer/entity/RenderHusk";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzs";
		else
			return "RenderHusk";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzs;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderHusk;";
	}

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityZombie;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderHusk.func_77041_b");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityZombie;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/EntityLiving;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderHusk.func_110775_a");

	/**
	 * <p>
	 * Name: HUSK_ZOMBIE_TEXTURES
	 * </p>
	 */
	public static McObfPair field_190086_r = McMappingDatabase.getSRG("field_190086_r");

}
