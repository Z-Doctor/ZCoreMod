package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqf";
		else
			return "net/minecraft/client/model/ModelBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bqf";
		else
			return "ModelBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbqf;";
		else
			return "Lnet/minecraft/client/model/ModelBase;";
	}

	/**
	 * <p>
	 * Name: setLivingAnimations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_78086_a = McMappingDatabase.getSRG("ModelBase.func_78086_a");

	/**
	 * <p>
	 * Name: getTextureOffset
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/client/model/TextureOffset;]
	 * </p>
	 */
	public static McObfPair func_78084_a = McMappingDatabase.getSRG("ModelBase.func_78084_a");

	/**
	 * <p>
	 * Name: setRotationAngles
	 * </p>
	 * <p>
	 * Desc: [(FFFFFFLnet/minecraft/entity/Entity;)V]
	 * </p>
	 */
	public static McObfPair func_78087_a = McMappingDatabase.getSRG("ModelBase.func_78087_a");

	/**
	 * <p>
	 * Name: setModelAttributes
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/model/ModelBase;)V]
	 * </p>
	 */
	public static McObfPair func_178686_a = McMappingDatabase.getSRG("ModelBase.func_178686_a");

	/**
	 * <p>
	 * Name: getRandomModelBox
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)Lnet/minecraft/client/model/ModelRenderer;]
	 * </p>
	 */
	public static McObfPair func_85181_a = McMappingDatabase.getSRG("ModelBase.func_85181_a");

	/**
	 * <p>
	 * Name: modelTextureMap
	 * </p>
	 */
	public static McObfPair field_78094_a = McMappingDatabase.getSRG("field_78094_a");

	/**
	 * <p>
	 * Name: boxList
	 * </p>
	 */
	public static McObfPair field_78092_r = McMappingDatabase.getSRG("field_78092_r");

	/**
	 * <p>
	 * Name: setTextureOffset
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;II)V]
	 * </p>
	 */
	public static McObfPair func_78085_a = McMappingDatabase.getSRG("ModelBase.func_78085_a");

	/**
	 * <p>
	 * Name: textureWidth
	 * </p>
	 */
	public static McObfPair field_78090_t = McMappingDatabase.getSRG("field_78090_t");

	/**
	 * <p>
	 * Name: isChild
	 * </p>
	 */
	public static McObfPair field_78091_s = McMappingDatabase.getSRG("field_78091_s");

	/**
	 * <p>
	 * Name: textureHeight
	 * </p>
	 */
	public static McObfPair field_78089_u = McMappingDatabase.getSRG("field_78089_u");

	/**
	 * <p>
	 * Name: isRiding
	 * </p>
	 */
	public static McObfPair field_78093_q = McMappingDatabase.getSRG("field_78093_q");

	/**
	 * <p>
	 * Name: swingProgress
	 * </p>
	 */
	public static McObfPair field_78095_p = McMappingDatabase.getSRG("field_78095_p");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_78088_a = McMappingDatabase.getSRG("ModelBase.func_78088_a");

	/**
	 * <p>
	 * Name: copyModelAngles
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/model/ModelRenderer;Lnet/minecraft/client/model/ModelRenderer;)V]
	 * </p>
	 */
	public static McObfPair func_178685_a = McMappingDatabase.getSRG("ModelBase.func_178685_a");

}
