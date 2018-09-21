package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemModelMesher {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buv";
		else
			return "net/minecraft/client/renderer/ItemModelMesher";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buv";
		else
			return "ItemModelMesher";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuv;";
		else
			return "Lnet/minecraft/client/renderer/ItemModelMesher;";
	}

	/**
	 * <p>
	 * Name: getItemModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_178089_a = McMappingDatabase.getSRG("ItemModelMesher.func_178089_a");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;Lnet/minecraft/client/renderer/ItemMeshDefinition;)V]
	 * </p>
	 */
	public static McObfPair func_178080_a = McMappingDatabase.getSRG("ItemModelMesher.func_178080_a");

	/**
	 * <p>
	 * Name: getItemModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;I)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_178088_b = McMappingDatabase.getSRG("ItemModelMesher.func_178088_b");

	/**
	 * <p>
	 * Name: modelManager
	 * </p>
	 */
	public static McObfPair field_178090_d = McMappingDatabase.getSRG("field_178090_d");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;I)I]
	 * </p>
	 */
	public static McObfPair func_178081_c = McMappingDatabase.getSRG("ItemModelMesher.func_178081_c");

	/**
	 * <p>
	 * Name: getParticleIcon
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;I)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_178087_a = McMappingDatabase.getSRG("ItemModelMesher.func_178087_a");

	/**
	 * <p>
	 * Name: simpleShapesCache
	 * </p>
	 */
	public static McObfPair field_178091_b = McMappingDatabase.getSRG("field_178091_b");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;ILnet/minecraft/client/renderer/block/model/ModelResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_178086_a = McMappingDatabase.getSRG("ItemModelMesher.func_178086_a");

	/**
	 * <p>
	 * Name: shapers
	 * </p>
	 */
	public static McObfPair field_178092_c = McMappingDatabase.getSRG("field_178092_c");

	/**
	 * <p>
	 * Name: rebuildCache
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_178085_b = McMappingDatabase.getSRG("ItemModelMesher.func_178085_b");

	/**
	 * <p>
	 * Name: getMetadata
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)I]
	 * </p>
	 */
	public static McObfPair func_178084_b = McMappingDatabase.getSRG("ItemModelMesher.func_178084_b");

	/**
	 * <p>
	 * Name: getModelManager
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/block/model/ModelManager;]
	 * </p>
	 */
	public static McObfPair func_178083_a = McMappingDatabase.getSRG("ItemModelMesher.func_178083_a");

	/**
	 * <p>
	 * Name: simpleShapes
	 * </p>
	 */
	public static McObfPair field_178093_a = McMappingDatabase.getSRG("field_178093_a");

	/**
	 * <p>
	 * Name: getParticleIcon
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_178082_a = McMappingDatabase.getSRG("ItemModelMesher.func_178082_a");

}
