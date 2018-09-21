package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buu";
		else
			return "net/minecraft/client/renderer/ItemRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buu";
		else
			return "ItemRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuu;";
		else
			return "Lnet/minecraft/client/renderer/ItemRenderer;";
	}

	/**
	 * <p>
	 * Name: renderItemSide
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Z)V]
	 * </p>
	 */
	public static McObfPair func_187462_a = McMappingDatabase.getSRG("ItemRenderer.func_187462_a");

	/**
	 * <p>
	 * Name: renderFireInFirstPerson
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78442_d = McMappingDatabase.getSRG("ItemRenderer.func_78442_d");

	/**
	 * <p>
	 * Name: renderMapFirstPerson
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_187461_a = McMappingDatabase.getSRG("ItemRenderer.func_187461_a");

	/**
	 * <p>
	 * Name: itemStackOffHand
	 * </p>
	 */
	public static McObfPair field_187468_e = McMappingDatabase.getSRG("field_187468_e");

	/**
	 * <p>
	 * Name: renderOverlays
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78447_b = McMappingDatabase.getSRG("ItemRenderer.func_78447_b");

	/**
	 * <p>
	 * Name: prevEquippedProgressMainHand
	 * </p>
	 */
	public static McObfPair field_187470_g = McMappingDatabase.getSRG("field_187470_g");

	/**
	 * <p>
	 * Name: transformEatFirstPerson
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/util/EnumHandSide;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_187454_a = McMappingDatabase.getSRG("ItemRenderer.func_187454_a");

	/**
	 * <p>
	 * Name: equippedProgressOffHand
	 * </p>
	 */
	public static McObfPair field_187471_h = McMappingDatabase.getSRG("field_187471_h");

	/**
	 * <p>
	 * Name: itemStackMainHand
	 * </p>
	 */
	public static McObfPair field_187467_d = McMappingDatabase.getSRG("field_187467_d");

	/**
	 * <p>
	 * Name: updateEquippedItem
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_78441_a = McMappingDatabase.getSRG("ItemRenderer.func_78441_a");

	/**
	 * <p>
	 * Name: renderItemInFirstPerson
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/entity/AbstractClientPlayer;FFLnet/minecraft/util/EnumHand;FLnet/minecraft/item/ItemStack;F)V]
	 * </p>
	 */
	public static McObfPair func_187457_a = McMappingDatabase.getSRG("ItemRenderer.func_187457_a");

	/**
	 * <p>
	 * Name: renderItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V]
	 * </p>
	 */
	public static McObfPair func_178099_a = McMappingDatabase.getSRG("ItemRenderer.func_178099_a");

	/**
	 * <p>
	 * Name: RES_UNDERWATER_OVERLAY
	 * </p>
	 */
	public static McObfPair field_110929_d = McMappingDatabase.getSRG("field_110929_d");

	/**
	 * <p>
	 * Name: prevEquippedProgressOffHand
	 * </p>
	 */
	public static McObfPair field_187472_i = McMappingDatabase.getSRG("field_187472_i");

	/**
	 * <p>
	 * Name: renderBlockInHand
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)V]
	 * </p>
	 */
	public static McObfPair func_178108_a = McMappingDatabase.getSRG("ItemRenderer.func_178108_a");

	/**
	 * <p>
	 * Name: rotateArm
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_187458_c = McMappingDatabase.getSRG("ItemRenderer.func_187458_c");

	/**
	 * <p>
	 * Name: renderManager
	 * </p>
	 */
	public static McObfPair field_178111_g = McMappingDatabase.getSRG("field_178111_g");

	/**
	 * <p>
	 * Name: RES_MAP_BACKGROUND
	 * </p>
	 */
	public static McObfPair field_110931_c = McMappingDatabase.getSRG("field_110931_c");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_78455_a = McMappingDatabase.getSRG("field_78455_a");

	/**
	 * <p>
	 * Name: renderWaterOverlayTexture
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78448_c = McMappingDatabase.getSRG("ItemRenderer.func_78448_c");

	/**
	 * <p>
	 * Name: resetEquippedProgress
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHand;)V]
	 * </p>
	 */
	public static McObfPair func_187460_a = McMappingDatabase.getSRG("ItemRenderer.func_187460_a");

	/**
	 * <p>
	 * Name: getMapAngleFromPitch
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_178100_c = McMappingDatabase.getSRG("ItemRenderer.func_178100_c");

	/**
	 * <p>
	 * Name: renderArm
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_187455_a = McMappingDatabase.getSRG("ItemRenderer.func_187455_a");

	/**
	 * <p>
	 * Name: renderMapFirstPersonSide
	 * </p>
	 * <p>
	 * Desc: [(FLnet/minecraft/util/EnumHandSide;FLnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_187465_a = McMappingDatabase.getSRG("ItemRenderer.func_187465_a");

	/**
	 * <p>
	 * Name: transformSideFirstPerson
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHandSide;F)V]
	 * </p>
	 */
	public static McObfPair func_187459_b = McMappingDatabase.getSRG("ItemRenderer.func_187459_b");

	/**
	 * <p>
	 * Name: rotateArroundXAndY
	 * </p>
	 * <p>
	 * Desc: [(FF)V]
	 * </p>
	 */
	public static McObfPair func_178101_a = McMappingDatabase.getSRG("ItemRenderer.func_178101_a");

	/**
	 * <p>
	 * Name: renderMapFirstPerson
	 * </p>
	 * <p>
	 * Desc: [(FFF)V]
	 * </p>
	 */
	public static McObfPair func_187463_a = McMappingDatabase.getSRG("ItemRenderer.func_187463_a");

	/**
	 * <p>
	 * Name: renderArmFirstPerson
	 * </p>
	 * <p>
	 * Desc: [(FFLnet/minecraft/util/EnumHandSide;)V]
	 * </p>
	 */
	public static McObfPair func_187456_a = McMappingDatabase.getSRG("ItemRenderer.func_187456_a");

	/**
	 * <p>
	 * Name: itemRenderer
	 * </p>
	 */
	public static McObfPair field_178112_h = McMappingDatabase.getSRG("field_178112_h");

	/**
	 * <p>
	 * Name: equippedProgressMainHand
	 * </p>
	 */
	public static McObfPair field_187469_f = McMappingDatabase.getSRG("field_187469_f");

	/**
	 * <p>
	 * Name: setLightmap
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187464_b = McMappingDatabase.getSRG("ItemRenderer.func_187464_b");

	/**
	 * <p>
	 * Name: transformFirstPerson
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumHandSide;F)V]
	 * </p>
	 */
	public static McObfPair func_187453_a = McMappingDatabase.getSRG("ItemRenderer.func_187453_a");

	/**
	 * <p>
	 * Name: renderArms
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_187466_c = McMappingDatabase.getSRG("ItemRenderer.func_187466_c");

	/**
	 * <p>
	 * Name: renderItemInFirstPerson
	 * </p>
	 * <p>
	 * Desc: [(F)V]
	 * </p>
	 */
	public static McObfPair func_78440_a = McMappingDatabase.getSRG("ItemRenderer.func_78440_a");

}
