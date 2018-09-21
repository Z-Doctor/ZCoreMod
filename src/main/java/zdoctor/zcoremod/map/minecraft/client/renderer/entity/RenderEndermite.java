package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderEndermite {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bze";
		else
			return "net/minecraft/client/renderer/entity/RenderEndermite";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bze";
		else
			return "RenderEndermite";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbze;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderEndermite;";
	}

	/**
	 * <p>
	 * Name: ENDERMITE_TEXTURES
	 * </p>
	 */
	public static McObfPair field_177108_a = McMappingDatabase.getSRG("field_177108_a");

	/**
	 * <p>
	 * Name: getDeathMaxRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityEndermite;)F, (Lnet/minecraft/entity/EntityLivingBase;)F]
	 * </p>
	 */
	public static McObfPair func_77037_a = McMappingDatabase.getSRG("RenderEndermite.func_77037_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/monster/EntityEndermite;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderEndermite.func_110775_a");

}
