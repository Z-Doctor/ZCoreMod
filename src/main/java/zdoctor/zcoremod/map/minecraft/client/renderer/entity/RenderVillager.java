package zdoctor.zcoremod.map.minecraft.client.renderer.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderVillager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbg";
		else
			return "net/minecraft/client/renderer/entity/RenderVillager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cbg";
		else
			return "RenderVillager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcbg;";
		else
			return "Lnet/minecraft/client/renderer/entity/RenderVillager;";
	}

	/**
	 * <p>
	 * Name: FARMER_VILLAGER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110904_g = McMappingDatabase.getSRG("field_110904_g");

	/**
	 * <p>
	 * Name: getMainModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/model/ModelBase;, ()Lnet/minecraft/client/model/ModelVillager;]
	 * </p>
	 */
	public static McObfPair func_177087_b = McMappingDatabase.getSRG("RenderVillager.func_177087_b");

	/**
	 * <p>
	 * Name: LIBRARIAN_VILLAGER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110908_h = McMappingDatabase.getSRG("field_110908_h");

	/**
	 * <p>
	 * Name: preRenderCallback
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityVillager;F)V, (Lnet/minecraft/entity/EntityLivingBase;F)V]
	 * </p>
	 */
	public static McObfPair func_77041_b = McMappingDatabase.getSRG("RenderVillager.func_77041_b");

	/**
	 * <p>
	 * Name: PRIEST_VILLAGER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110907_k = McMappingDatabase.getSRG("field_110907_k");

	/**
	 * <p>
	 * Name: SMITH_VILLAGER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110905_l = McMappingDatabase.getSRG("field_110905_l");

	/**
	 * <p>
	 * Name: BUTCHER_VILLAGER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110906_m = McMappingDatabase.getSRG("field_110906_m");

	/**
	 * <p>
	 * Name: VILLAGER_TEXTURES
	 * </p>
	 */
	public static McObfPair field_110903_f = McMappingDatabase.getSRG("field_110903_f");

	/**
	 * <p>
	 * Name: getEntityTexture
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/passive/EntityVillager;)Lnet/minecraft/util/ResourceLocation;, (Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_110775_a = McMappingDatabase.getSRG("RenderVillager.func_110775_a");

}
