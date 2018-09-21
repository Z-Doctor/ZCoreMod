package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderZombie {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbn";
		else
			return "net/minecraft/client/renderer/entity/RenderZombie";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbn";
		else
			return "RenderZombie";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbn;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderZombie;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityZombie;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/EntityLiving;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderZombie.func_110775_a");

	/**
	 * <p>
	 * Name: ZOMBIE_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110865_p = McMappingDatabase.getSRG("field_110865_p");

}
