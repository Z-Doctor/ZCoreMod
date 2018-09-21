package zdoctor.zcoremod.map.minecraft.client.renderer.entity.layers;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LayerEntityOnShoulder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cca";
		else
			return "net/minecraft/client/renderer/entity/layers/LayerEntityOnShoulder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cca";
		else
			return "LayerEntityOnShoulder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcca;";
		else
			return "Lnet/minecraft/client/renderer/entity/layers/LayerEntityOnShoulder;";
	}

	/**
	 * <p>
	 * Name: renderManager
	 * </p>
	 */
	public static McObfPair field_192867_c = McMappingDatabase.getSRG("field_192867_c");

	/**
	 * <p>
	 * Name: leftRenderer
	 * </p>
	 */
	public static McObfPair field_192865_a = McMappingDatabase.getSRG("field_192865_a");

	/**
	 * <p>
	 * Name: renderEntityOnShoulder
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;Ljava/util/UUID;Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/client/renderer/entity/RenderLivingBase;Lnet/minecraft/client/model/ModelBase;Lnet/minecraft/util/ResourceLocation;Ljava/lang/Class;FFFFFFFZ)Lnet/minecraft/client/renderer/entity/layers/LayerEntityOnShoulder$DataHolder;]
	 * </p>
	 */
	public static McObfPair func_192864_a = McMappingDatabase.getSRG("LayerEntityOnShoulder.func_192864_a");

	/**
	 * <p>
	 * Name: shouldCombineTextures
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_177142_b = McMappingDatabase.getSRG("LayerEntityOnShoulder.func_177142_b");

	/**
	 * <p>
	 * Name: rightModel
	 * </p>
	 */
	public static McObfPair field_192872_h = McMappingDatabase.getSRG("field_192872_h");

	/**
	 * <p>
	 * Name: rightRenderer
	 * </p>
	 */
	public static McObfPair field_192866_b = McMappingDatabase.getSRG("field_192866_b");

	/**
	 * <p>
	 * Name: leftEntityClass
	 * </p>
	 */
	public static McObfPair field_192871_g = McMappingDatabase.getSRG("field_192871_g");

	/**
	 * <p>
	 * Name: leftUniqueId
	 * </p>
	 */
	public static McObfPair field_192870_f = McMappingDatabase.getSRG("field_192870_f");

	/**
	 * <p>
	 * Name: leftModel
	 * </p>
	 */
	public static McObfPair field_192868_d = McMappingDatabase.getSRG("field_192868_d");

	/**
	 * <p>
	 * Name: rightResource
	 * </p>
	 */
	public static McObfPair field_192873_i = McMappingDatabase.getSRG("field_192873_i");

	/**
	 * <p>
	 * Name: rightUniqueId
	 * </p>
	 */
	public static McObfPair field_192874_j = McMappingDatabase.getSRG("field_192874_j");

	/**
	 * <p>
	 * Name: doRenderLayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;FFFFFFF)V, (Lnet/minecraft/entity/EntityLivingBase;FFFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_177141_a = McMappingDatabase.getSRG("LayerEntityOnShoulder.func_177141_a");

	/**
	 * <p>
	 * Name: leftResource
	 * </p>
	 */
	public static McObfPair field_192869_e = McMappingDatabase.getSRG("field_192869_e");

	/**
	 * <p>
	 * Name: rightEntityClass
	 * </p>
	 */
	public static McObfPair field_192875_k = McMappingDatabase.getSRG("field_192875_k");

}
