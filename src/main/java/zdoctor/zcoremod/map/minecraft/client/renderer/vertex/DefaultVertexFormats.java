package zdoctor.zcoremod.map.minecraft.client.renderer.vertex;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DefaultVertexFormats {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdy";
		else
			return "net/minecraft/client/renderer/vertex/DefaultVertexFormats";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdy";
		else
			return "DefaultVertexFormats";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdy;";
		else
			return "Lnet/minecraft/client/renderer/vertex/DefaultVertexFormats;";
	}

	/**
	 * <p>
	 * Name: POSITION_TEX
	 * </p>
	 */
	public static McObfPair field_181707_g = McMappingDatabase.getSRG("field_181707_g");

	/**
	 * <p>
	 * Name: ITEM
	 * </p>
	 */
	public static McObfPair field_176599_b = McMappingDatabase.getSRG("field_176599_b");

	/**
	 * <p>
	 * Name: POSITION
	 * </p>
	 */
	public static McObfPair field_181705_e = McMappingDatabase.getSRG("field_181705_e");

	/**
	 * <p>
	 * Name: POSITION_NORMAL
	 * </p>
	 */
	public static McObfPair field_181708_h = McMappingDatabase.getSRG("field_181708_h");

	/**
	 * <p>
	 * Name: BLOCK
	 * </p>
	 */
	public static McObfPair field_176600_a = McMappingDatabase.getSRG("field_176600_a");

	/**
	 * <p>
	 * Name: COLOR_4UB
	 * </p>
	 */
	public static McObfPair field_181714_n = McMappingDatabase.getSRG("field_181714_n");

	/**
	 * <p>
	 * Name: POSITION_TEX_NORMAL
	 * </p>
	 */
	public static McObfPair field_181710_j = McMappingDatabase.getSRG("field_181710_j");

	/**
	 * <p>
	 * Name: POSITION_TEX_COLOR
	 * </p>
	 */
	public static McObfPair field_181709_i = McMappingDatabase.getSRG("field_181709_i");

	/**
	 * <p>
	 * Name: TEX_2F
	 * </p>
	 */
	public static McObfPair field_181715_o = McMappingDatabase.getSRG("field_181715_o");

	/**
	 * <p>
	 * Name: PADDING_1B
	 * </p>
	 */
	public static McObfPair field_181718_r = McMappingDatabase.getSRG("field_181718_r");

	/**
	 * <p>
	 * Name: POSITION_3F
	 * </p>
	 */
	public static McObfPair field_181713_m = McMappingDatabase.getSRG("field_181713_m");

	/**
	 * <p>
	 * Name: POSITION_TEX_LMAP_COLOR
	 * </p>
	 */
	public static McObfPair field_181711_k = McMappingDatabase.getSRG("field_181711_k");

	/**
	 * <p>
	 * Name: PARTICLE_POSITION_TEX_COLOR_LMAP
	 * </p>
	 */
	public static McObfPair field_181704_d = McMappingDatabase.getSRG("field_181704_d");

	/**
	 * <p>
	 * Name: TEX_2S
	 * </p>
	 */
	public static McObfPair field_181716_p = McMappingDatabase.getSRG("field_181716_p");

	/**
	 * <p>
	 * Name: POSITION_TEX_COLOR_NORMAL
	 * </p>
	 */
	public static McObfPair field_181712_l = McMappingDatabase.getSRG("field_181712_l");

	/**
	 * <p>
	 * Name: NORMAL_3B
	 * </p>
	 */
	public static McObfPair field_181717_q = McMappingDatabase.getSRG("field_181717_q");

	/**
	 * <p>
	 * Name: OLDMODEL_POSITION_TEX_NORMAL
	 * </p>
	 */
	public static McObfPair field_181703_c = McMappingDatabase.getSRG("field_181703_c");

	/**
	 * <p>
	 * Name: POSITION_COLOR
	 * </p>
	 */
	public static McObfPair field_181706_f = McMappingDatabase.getSRG("field_181706_f");

}
