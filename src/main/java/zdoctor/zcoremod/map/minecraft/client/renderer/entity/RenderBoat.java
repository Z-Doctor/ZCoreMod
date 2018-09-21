package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderBoat {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byt";
		else
			return "net/minecraft/client/renderer/entity/RenderBoat";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byt";
		else
			return "RenderBoat";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyt;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderBoat;";
	}

	/**
	 * <p>
	 * Name: renderMultipass
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityBoat;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_188300_b = McMappingDatabase.getSRG("RenderBoat.func_188300_b");

	/**
	 * <p>
	 * Name: modelBoat
	 * </p>
	 */
	public static McObfPair field_76998_a = McMappingDatabase.getSRG("field_76998_a");

	/**
	 * <p>
	 * Name: setupRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityBoat;FF)V]
	 * </p>
	 */
	public static McObfPair func_188311_a = McMappingDatabase.getSRG("RenderBoat.func_188311_a");

	/**
	 * <p>
	 * Name: isMultipass
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_188295_H_ = McMappingDatabase.getSRG("RenderBoat.func_188295_H_");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityBoat;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderBoat.func_110775_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityBoat;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderBoat.func_76986_a");

	/**
	 * <p>
	 * Name: BOAT_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110782_f = McMappingDatabase.getSRG("field_110782_f");

	/**
	 * <p>
	 * Name: setupTranslation
	 * </p>
	 * <p>
	 * Desc: [(DDD)V]
	 * </p>
	 */
	public static McObfPair func_188309_a = McMappingDatabase.getSRG("RenderBoat.func_188309_a");

}
