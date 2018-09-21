package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgc";
		else
			return "net/minecraft/client/renderer/block/model/ModelManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgc";
		else
			return "ModelManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgc;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelManager;";
	}

	/**
	 * <p>
	 * Name: getBlockModelShapes
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/BlockModelShapes;]
	 * </p>
	 */
	public static McObfPair func_174954_c = McMappingDatabase.getSRG("ModelManager.func_174954_c");

	/**
	 * <p>
	 * Name: getTextureMap
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureMap;]
	 * </p>
	 */
	public static McObfPair func_174952_b = McMappingDatabase.getSRG("ModelManager.func_174952_b");

	/**
	 * <p>
	 * Name: getMissingModel
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_174951_a = McMappingDatabase.getSRG("ModelManager.func_174951_a");

	/**
	 * <p>
	 * Name: modelRegistry
	 * </p>
	 */
	public static McObfPair field_174958_a = McMappingDatabase.getSRG("field_174958_a");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("ModelManager.func_110549_a");

	/**
	 * <p>
	 * Name: getModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_174953_a = McMappingDatabase.getSRG("ModelManager.func_174953_a");

	/**
	 * <p>
	 * Name: texMap
	 * </p>
	 */
	public static McObfPair field_174956_b = McMappingDatabase.getSRG("field_174956_b");

	/**
	 * <p>
	 * Name: modelProvider
	 * </p>
	 */
	public static McObfPair field_174957_c = McMappingDatabase.getSRG("field_174957_c");

	/**
	 * <p>
	 * Name: defaultModel
	 * </p>
	 */
	public static McObfPair field_174955_d = McMappingDatabase.getSRG("field_174955_d");

}
