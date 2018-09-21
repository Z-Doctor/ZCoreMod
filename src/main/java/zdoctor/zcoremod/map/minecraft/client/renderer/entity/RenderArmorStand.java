package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderArmorStand {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byp";
		else
			return "net/minecraft/client/renderer/entity/RenderArmorStand";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "byp";
		else
			return "RenderArmorStand";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbyp;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderArmorStand;";
	}

	/**
	 * <p>
	 * Name: canRenderName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;)Z, (Lnet/minecraft/entity/item/EntityArmorStand;)Z, (Lnet/minecraft/entity/Entity;)Z]
	 * </p>
	 */
	public static McObfPair func_177070_b = McMappingDatabase.getSRG("RenderArmorStand.func_177070_b");

	/**
	 * <p>
	 * Name: TEXTURE_ARMOR_STAND
	 * </p>
	 */
	public static McObfPair field_177103_a = McMappingDatabase.getSRG("field_177103_a");

	/**
	 * <p>
	 * Name: getMainModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/model/ModelArmorStand;, ()Lnet/minecraft/client/model/ModelBase;]
	 * </p>
	 */
	public static McObfPair func_177087_b = McMappingDatabase.getSRG("RenderArmorStand.func_177087_b");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityArmorStand;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderArmorStand.func_110775_a");

	/**
	 * <p>
	 * Name: applyRotations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityArmorStand;FFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFF)V]
	 * </p>
	 */
	public static McObfPair func_77043_a = McMappingDatabase.getSRG("RenderArmorStand.func_77043_a");

	/**
	 * <p>
	 * Name: doRender
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/item/EntityArmorStand;DDDFF)V, (Lnet/minecraft/entity/Entity;DDDFF)V, (Lnet/minecraft/entity/EntityLivingBase;DDDFF)V]
	 * </p>
	 */
	public static McObfPair func_76986_a = McMappingDatabase.getSRG("RenderArmorStand.func_76986_a");

}
