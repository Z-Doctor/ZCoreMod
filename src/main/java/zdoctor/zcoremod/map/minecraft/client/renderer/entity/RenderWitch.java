package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderWitch {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbi";
		else
			return "net/minecraft/client/renderer/entity/RenderWitch";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbi";
		else
			return "RenderWitch";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbi;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderWitch;";
	}

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityWitch;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderWitch.func_110775_a");

	/**
	 * <p>
	 * Name: getMainModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/model/ModelBase;, ()Lnet/minecraft/client/model/ModelWitch;]
	 * </p>
	 */
	public static McObfPair func_177087_b = McMappingDatabase.getSRG("RenderWitch.func_177087_b");

	/**
	 * <p>
	 * Name: transformHeldFull3DItemLayer
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_82422_c = McMappingDatabase.getSRG("RenderWitch.func_82422_c");

	/**
	 * <p>
	 * Name: WITCH_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110910_a = McMappingDatabase.getSRG("field_110910_a");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityWitch;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderWitch.func_77041_b");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/monster/EntityWitch;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V, (Lnet/minecraft/entity/EntityLiving;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderWitch.func_76986_a");

}
