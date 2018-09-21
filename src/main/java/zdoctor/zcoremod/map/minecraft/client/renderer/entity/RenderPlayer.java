package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderPlayer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cct";
		else
			return "net/minecraft/client/renderer/entity/RenderPlayer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cct";
		else
			return "RenderPlayer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcct;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderPlayer;";
	}

	/**
	 * <p>
	 * Name: renderLeftArm
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_177139_c = McMappingDatabase.getSRG("RenderPlayer.func_177139_c");

	/**
	 * <p>
	 * Name: renderRightArm
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_177138_b = McMappingDatabase.getSRG("RenderPlayer.func_177138_b");

	/**
	 * <p>
	 * Name: setModelVisibilities
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_177137_d = McMappingDatabase.getSRG("RenderPlayer.func_177137_d");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderPlayer.func_77041_b");

	/**
	 * <p>
	 * Name: getMainModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/model/ModelBase;, ()Lnet/minecraft/client/model/ModelPlayer;]
	 * </p>
	 */
	public static McObfPair func_177087_b = McMappingDatabase.getSRG("RenderPlayer.func_177087_b");

	/**
	 * <p>
	 * Name: renderLivingAt
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;DDD)V, (Lnet/minecraft/entity/EntityLivingBase;DDD)V]
	 * </p>
	 */
	public static McObfPair func_77039_a = McMappingDatabase.getSRG("RenderPlayer.func_77039_a");

	/**
	 * <p>
	 * Name: transformHeldFull3DItemLayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82422_c = McMappingDatabase.getSRG("RenderPlayer.func_82422_c");

	/**
	 * <p>
	 * Name: smallArms
	 * </p>
	 */
	public static McObfPair field_177140_a = McMappingDatabase.getSRG("field_177140_a");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderPlayer.func_110775_a");

	/**
	 * <p>
	 * Name: renderEntityName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDLjava/lang/String;D)V, (Lnet/minecraft/entity/Entity;DDDLjava/lang/String;D)V]
	 * </p>
	 */
	public static McObfPair func_188296_a = McMappingDatabase.getSRG("RenderPlayer.func_188296_a");

	/**
	 * <p>
	 * Name: applyRotations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;FFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_77043_a = McMappingDatabase.getSRG("RenderPlayer.func_77043_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderPlayer.func_76986_a");

}
