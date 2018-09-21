package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderPigZombie {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cal";
		else
			return "net/minecraft/client/renderer/entity/RenderPigZombie";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cal";
		else
			return "RenderPigZombie";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcal;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderPigZombie;";
	}

	/**
	 * <p>
	 * Name: ZOMBIE_PIGMAN_TEXTURE
	 * </p>
	 */
	public static McObfPair field_177120_j = McMappingDatabase.getSRG("field_177120_j");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityPigZombie;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/EntityLiving;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderPigZombie.func_110775_a");

}
