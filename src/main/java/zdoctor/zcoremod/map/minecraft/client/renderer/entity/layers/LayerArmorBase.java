package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerArmorBase {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbp";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerArmorBase";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbp";
		else
			return "LayerArmorBase";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbp;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerArmorBase;";
	}

	/**
	 * <p>
	 * Name: getModelFromSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Lnet/minecraft/client/model/ModelBase;]
	 * </p>
	 */
	public static McObfPair func_188360_a = McMappingDatabase.getSRG("LayerArmorBase.func_188360_a");

	/**
	 * <p>
	 * Name: modelArmor
	 * </p>
	 */
	public static McObfPair field_177186_d = McMappingDatabase.getSRG("field_177186_d");

	/**
	 * <p>
	 * Name: colorR
	 * </p>
	 */
	public static McObfPair field_177184_f = McMappingDatabase.getSRG("field_177184_f");

	/**
	 * <p>
	 * Name: renderArmorLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFFFFFFLnet/minecraft/inventory/EntityEquipmentSlot;)V]
	 * </p>
	 */
	public static McObfPair func_188361_a = McMappingDatabase.getSRG("LayerArmorBase.func_188361_a");

	/**
	 * <p>
	 * Name: setModelSlotVisible
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/model/ModelBase;Lnet/minecraft/inventory/EntityEquipmentSlot;)V]
	 * </p>
	 */
	public static McObfPair func_188359_a = McMappingDatabase.getSRG("LayerArmorBase.func_188359_a");

	/**
	 * <p>
	 * Name: modelLeggings
	 * </p>
	 */
	public static McObfPair field_177189_c = McMappingDatabase.getSRG("field_177189_c");

	/**
	 * <p>
	 * Name: getArmorResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemArmor;ZLjava/lang/String;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177178_a = McMappingDatabase.getSRG("LayerArmorBase.func_177178_a");

	/**
	 * <p>
	 * Name: getArmorResource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemArmor;Z)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177181_a = McMappingDatabase.getSRG("LayerArmorBase.func_177181_a");

	/**
	 * <p>
	 * Name: renderEnchantedGlint
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/entity/RenderLivingBase;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/client/model/ModelBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_188364_a = McMappingDatabase.getSRG("LayerArmorBase.func_188364_a");

	/**
	 * <p>
	 * Name: colorB
	 * </p>
	 */
	public static McObfPair field_177192_h = McMappingDatabase.getSRG("field_177192_h");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerArmorBase.func_177142_b");

	/**
	 * <p>
	 * Name: skipRenderGlint
	 * </p>
	 */
	public static McObfPair field_177193_i = McMappingDatabase.getSRG("field_177193_i");

	/**
	 * <p>
	 * Name: ENCHANTED_ITEM_GLINT_RES
	 * </p>
	 */
	public static McObfPair field_177188_b = McMappingDatabase.getSRG("field_177188_b");

	/**
	 * <p>
	 * Name: alpha
	 * </p>
	 */
	public static McObfPair field_177187_e = McMappingDatabase.getSRG("field_177187_e");

	/**
	 * <p>
	 * Name: colorG
	 * </p>
	 */
	public static McObfPair field_177185_g = McMappingDatabase.getSRG("field_177185_g");

	/**
	 * <p>
	 * Name: ARMOR_TEXTURE_RES_MAP
	 * </p>
	 */
	public static McObfPair field_177191_j = McMappingDatabase.getSRG("field_177191_j");

	/**
	 * <p>
	 * Name: renderer
	 * </p>
	 */
	public static McObfPair field_177190_a = McMappingDatabase.getSRG("field_177190_a");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerArmorBase.func_177141_a");

	/**
	 * <p>
	 * Name: initArmor
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177177_a = McMappingDatabase.getSRG("LayerArmorBase.func_177177_a");

	/**
	 * <p>
	 * Name: isLegSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/inventory/EntityEquipmentSlot;)Z]
	 * </p>
	 */
	public static McObfPair func_188363_b = McMappingDatabase.getSRG("LayerArmorBase.func_188363_b");

}
