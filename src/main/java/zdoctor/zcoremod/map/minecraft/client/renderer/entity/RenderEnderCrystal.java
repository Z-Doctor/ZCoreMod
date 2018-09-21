package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderEnderCrystal {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzb";
		else
			return "net/minecraft/client/renderer/entity/RenderEnderCrystal";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzb";
		else
			return "RenderEnderCrystal";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzb;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderEnderCrystal;";
	}

	/**
	 * <p>
	 * Name: modelEnderCrystalNoBase
	 * </p>
	 */
	public static McObfPair field_188316_g = McMappingDatabase.getSRG("field_188316_g");

	/**
	 * <p>
	 * Name: ENDER_CRYSTAL_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110787_a = McMappingDatabase.getSRG("field_110787_a");

	/**
	 * <p>
	 * Name: modelEnderCrystal
	 * </p>
	 */
	public static McObfPair field_76995_b = McMappingDatabase.getSRG("field_76995_b");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityEnderCrystal;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderEnderCrystal.func_110775_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityEnderCrystal;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderEnderCrystal.func_76986_a");

	/**
	 * <p>
	 * Name: shouldRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityEnderCrystal;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z, (Lnet/minecraft/entity/Entity;Lnet/minecraft/client/renderer/culling/ICamera;DDD)Z]
	 * </p>
	 */
	public static McObfPair func_177071_a = McMappingDatabase.getSRG("RenderEnderCrystal.func_177071_a");

}
