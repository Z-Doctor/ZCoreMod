package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brs";
		else
			return "net/minecraft/client/model/ModelRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brs";
		else
			return "ModelRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrs;";
		else
			return "Lnet/minecraft/client/model/ModelRenderer;";
	}

	/**
	 * <p>
	 * Name: addChild
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/model/ModelRenderer;)V]
	 * </p>
	 */
	public static McObfPair func_78792_a = McMappingDatabase.getSRG("ModelRenderer.func_78792_a");

	/**
	 * <p>
	 * Name: addBox
	 * </p>
	 * <p>
	 * Desc: [(FFFIII)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_78789_a = McMappingDatabase.getSRG("ModelRenderer.func_78789_a");

	/**
	 * <p>
	 * Name: postRender
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78794_c = McMappingDatabase.getSRG("ModelRenderer.func_78794_c");

	/**
	 * <p>
	 * Name: offsetX
	 * </p>
	 */
	public static McObfPair field_82906_o = McMappingDatabase.getSRG("field_82906_o");

	/**
	 * <p>
	 * Name: childModels
	 * </p>
	 */
	public static McObfPair field_78805_m = McMappingDatabase.getSRG("field_78805_m");

	/**
	 * <p>
	 * Name: addBox
	 * </p>
	 * <p>
	 * Desc: [(FFFIIIZ)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_178769_a = McMappingDatabase.getSRG("ModelRenderer.func_178769_a");

	/**
	 * <p>
	 * Name: setTextureSize
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_78787_b = McMappingDatabase.getSRG("ModelRenderer.func_78787_b");

	/**
	 * <p>
	 * Name: textureOffsetY
	 * </p>
	 */
	public static McObfPair field_78813_p = McMappingDatabase.getSRG("field_78813_p");

	/**
	 * <p>
	 * Name: boxName
	 * </p>
	 */
	public static McObfPair field_78802_n = McMappingDatabase.getSRG("field_78802_n");

	/**
	 * <p>
	 * Name: rotateAngleZ
	 * </p>
	 */
	public static McObfPair field_78808_h = McMappingDatabase.getSRG("field_78808_h");

	/**
	 * <p>
	 * Name: addBox
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;FFFIII)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_78786_a = McMappingDatabase.getSRG("ModelRenderer.func_78786_a");

	/**
	 * <p>
	 * Name: compiled
	 * </p>
	 */
	public static McObfPair field_78812_q = McMappingDatabase.getSRG("field_78812_q");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78785_a = McMappingDatabase.getSRG("ModelRenderer.func_78785_a");

	/**
	 * <p>
	 * Name: isHidden
	 * </p>
	 */
	public static McObfPair field_78807_k = McMappingDatabase.getSRG("field_78807_k");

	/**
	 * <p>
	 * Name: textureOffsetX
	 * </p>
	 */
	public static McObfPair field_78803_o = McMappingDatabase.getSRG("field_78803_o");

	/**
	 * <p>
	 * Name: textureHeight
	 * </p>
	 */
	public static McObfPair field_78799_b = McMappingDatabase.getSRG("field_78799_b");

	/**
	 * <p>
	 * Name: rotateAngleX
	 * </p>
	 */
	public static McObfPair field_78795_f = McMappingDatabase.getSRG("field_78795_f");

	/**
	 * <p>
	 * Name: textureWidth
	 * </p>
	 */
	public static McObfPair field_78801_a = McMappingDatabase.getSRG("field_78801_a");

	/**
	 * <p>
	 * Name: setRotationPoint
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_78793_a = McMappingDatabase.getSRG("ModelRenderer.func_78793_a");

	/**
	 * <p>
	 * Name: rotationPointX
	 * </p>
	 */
	public static McObfPair field_78800_c = McMappingDatabase.getSRG("field_78800_c");

	/**
	 * <p>
	 * Name: offsetY
	 * </p>
	 */
	public static McObfPair field_82908_p = McMappingDatabase.getSRG("field_82908_p");

	/**
	 * <p>
	 * Name: offsetZ
	 * </p>
	 */
	public static McObfPair field_82907_q = McMappingDatabase.getSRG("field_82907_q");

	/**
	 * <p>
	 * Name: mirror
	 * </p>
	 */
	public static McObfPair field_78809_i = McMappingDatabase.getSRG("field_78809_i");

	/**
	 * <p>
	 * Name: setTextureOffset
	 * </p>
	 * <p>
	 * Desc: [(II)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_78784_a = McMappingDatabase.getSRG("ModelRenderer.func_78784_a");

	/**
	 * <p>
	 * Name: rotateAngleY
	 * </p>
	 */
	public static McObfPair field_78796_g = McMappingDatabase.getSRG("field_78796_g");

	/**
	 * <p>
	 * Name: rotationPointZ
	 * </p>
	 */
	public static McObfPair field_78798_e = McMappingDatabase.getSRG("field_78798_e");

	/**
	 * <p>
	 * Name: addBox
	 * </p>
	 * <p>
	 * Desc: [(FFFIIIF)V]
	 * </p>
	 */
	public static McObfPair func_78790_a = McMappingDatabase.getSRG("ModelRenderer.func_78790_a");

	/**
	 * <p>
	 * Name: showModel
	 * </p>
	 */
	public static McObfPair field_78806_j = McMappingDatabase.getSRG("field_78806_j");

	/**
	 * <p>
	 * Name: cubeList
	 * </p>
	 */
	public static McObfPair field_78804_l = McMappingDatabase.getSRG("field_78804_l");

	/**
	 * <p>
	 * Name: renderWithRotation
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78791_b = McMappingDatabase.getSRG("ModelRenderer.func_78791_b");

	/**
	 * <p>
	 * Name: baseModel
	 * </p>
	 */
	public static McObfPair field_78810_s = McMappingDatabase.getSRG("field_78810_s");

	/**
	 * <p>
	 * Name: displayList
	 * </p>
	 */
	public static McObfPair field_78811_r = McMappingDatabase.getSRG("field_78811_r");

	/**
	 * <p>
	 * Name: compileDisplayList
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78788_d = McMappingDatabase.getSRG("ModelRenderer.func_78788_d");

	/**
	 * <p>
	 * Name: rotationPointY
	 * </p>
	 */
	public static McObfPair field_78797_d = McMappingDatabase.getSRG("field_78797_d");

}
