package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemModelGenerator {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvy";
		else
			return "net/minecraft/client/renderer/block/model/ItemModelGenerator";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvy";
		else
			return "ItemModelGenerator";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvy;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ItemModelGenerator;";
	}

	/**
	 * <p>
	 * Name: getBlockParts
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;Ljava/lang/String;I)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178397_a = McMappingDatabase.getSRG("ItemModelGenerator.func_178397_a");

	/**
	 * <p>
	 * Name: makeItemModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureMap;Lnet/minecraft/client/renderer/block/model/ModelBlock;)Lnet/minecraft/client/renderer/block/model/ModelBlock;]
	 * </p>
	 */
	public static McObfPair func_178392_a = McMappingDatabase.getSRG("ItemModelGenerator.func_178392_a");

	/**
	 * <p>
	 * Name: isTransparent
	 * </p>
	 * <p>
	 * Desc: [([IIIII)Z]
	 * </p>
	 */
	public static McObfPair func_178391_a = McMappingDatabase.getSRG("ItemModelGenerator.func_178391_a");

	/**
	 * <p>
	 * Name: createOrExpandSpan
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;Lnet/minecraft/client/renderer/block/model/ItemModelGenerator$SpanFacing;II)V]
	 * </p>
	 */
	public static McObfPair func_178395_a = McMappingDatabase.getSRG("ItemModelGenerator.func_178395_a");

	/**
	 * <p>
	 * Name: checkTransition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ItemModelGenerator$SpanFacing;Ljava/util/List;[IIIIIZ)V]
	 * </p>
	 */
	public static McObfPair func_178396_a = McMappingDatabase.getSRG("ItemModelGenerator.func_178396_a");

	/**
	 * <p>
	 * Name: getSpans
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178393_a = McMappingDatabase.getSRG("ItemModelGenerator.func_178393_a");

	/**
	 * <p>
	 * Name: LAYERS
	 * </p>
	 */
	public static McObfPair field_178398_a = McMappingDatabase.getSRG("field_178398_a");

	/**
	 * <p>
	 * Name: getBlockParts
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_178394_a = McMappingDatabase.getSRG("ItemModelGenerator.func_178394_a");

}
