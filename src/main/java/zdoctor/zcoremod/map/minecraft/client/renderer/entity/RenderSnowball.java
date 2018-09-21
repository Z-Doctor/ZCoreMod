package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderSnowball {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caz";
		else
			return "net/minecraft/client/renderer/entity/RenderSnowball";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "caz";
		else
			return "RenderSnowball";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcaz;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderSnowball;";
	}

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderSnowball.func_76986_a");

	/**
	 * <p>
	 * Name: itemRenderer
	 * </p>
	 */
	public static McObfPair field_177083_e = McMappingDatabase.getSRG("field_177083_e");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderSnowball.func_110775_a");

	/**
	 * <p>
	 * Name: item
	 * </p>
	 */
	public static McObfPair field_177084_a = McMappingDatabase.getSRG("field_177084_a");

	/**
	 * <p>
	 * Name: getStackToRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/item/ItemStack;]
	 * </p>
	 */
	public static McObfPair func_177082_d = McMappingDatabase.getSRG("RenderSnowball.func_177082_d");

}
