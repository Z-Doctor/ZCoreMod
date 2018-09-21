package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderEvokerFangs {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzh";
		else
			return "net/minecraft/client/renderer/entity/RenderEvokerFangs";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzh";
		else
			return "RenderEvokerFangs";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzh;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderEvokerFangs;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityEvokerFangs;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderEvokerFangs.func_110775_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/projectile/EntityEvokerFangs;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderEvokerFangs.func_76986_a");

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_191330_f = McMappingDatabase.getSRG("field_191330_f");

	/**
	 * <p>
	 * Name: EVOKER_ILLAGER_FANGS
	 * </p>
	 */
	public static McObfPair field_191329_a = McMappingDatabase.getSRG("field_191329_a");

}
