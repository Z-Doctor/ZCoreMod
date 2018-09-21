package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderRabbit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "can";
		else
			return "net/minecraft/client/renderer/entity/RenderRabbit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "can";
		else
			return "RenderRabbit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcan;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderRabbit;";
	}

	/**
	 * <p>
	 * Name: GOLD
	 * </p>
	 */
	public static McObfPair field_177133_k = McMappingDatabase.getSRG("field_177133_k");

	/**
	 * <p>
	 * Name: CAERBANNOG
	 * </p>
	 */
	public static McObfPair field_177129_o = McMappingDatabase.getSRG("field_177129_o");

	/**
	 * <p>
	 * Name: WHITE
	 * </p>
	 */
	public static McObfPair field_177126_e = McMappingDatabase.getSRG("field_177126_e");

	/**
	 * <p>
	 * Name: SALT
	 * </p>
	 */
	public static McObfPair field_177130_l = McMappingDatabase.getSRG("field_177130_l");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityRabbit;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderRabbit.func_110775_a");

	/**
	 * <p>
	 * Name: BLACK
	 * </p>
	 */
	public static McObfPair field_177132_j = McMappingDatabase.getSRG("field_177132_j");

	/**
	 * <p>
	 * Name: TOAST
	 * </p>
	 */
	public static McObfPair field_177128_n = McMappingDatabase.getSRG("field_177128_n");

	/**
	 * <p>
	 * Name: BROWN
	 * </p>
	 */
	public static McObfPair field_177127_a = McMappingDatabase.getSRG("field_177127_a");

	/**
	 * <p>
	 * Name: WHITE_SPLOTCHED
	 * </p>
	 */
	public static McObfPair field_177131_m = McMappingDatabase.getSRG("field_177131_m");

}
