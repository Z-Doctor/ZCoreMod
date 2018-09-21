package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderSilverfish {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "car";
		else
			return "net/minecraft/client/renderer/entity/RenderSilverfish";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "car";
		else
			return "RenderSilverfish";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcar;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderSilverfish;";
	}

	/**
	 * <p>
	 * Name: SILVERFISH_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110882_a = McMappingDatabase.getSRG("field_110882_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/monster/EntitySilverfish;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderSilverfish.func_110775_a");

	/**
	 * <p>
	 * Name: getDeathMaxRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntitySilverfish;)F, (Lnet/minecraft/entity/EntityLivingBase;)F]
	 * </p>
	 */
	public static McObfPair func_77037_a = McMappingDatabase.getSRG("RenderSilverfish.func_77037_a");

}
