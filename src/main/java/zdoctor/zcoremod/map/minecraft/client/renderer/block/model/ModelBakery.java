package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBakery {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgb";
		else
			return "net/minecraft/client/renderer/block/model/ModelBakery";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cgb";
		else
			return "ModelBakery";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcgb;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelBakery;";
	}

	/**
	 * <p>
	 * Name: loadModelsCheck
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177597_h = McMappingDatabase.getSRG("ModelBakery.func_177597_h");

	/**
	 * <p>
	 * Name: BUILT_IN_MODELS
	 * </p>
	 */
	public static McObfPair field_177600_d = McMappingDatabase.getSRG("field_177600_d");

	/**
	 * <p>
	 * Name: getItemLocation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177583_a = McMappingDatabase.getSRG("ModelBakery.func_177583_a");

	/**
	 * <p>
	 * Name: bakedRegistry
	 * </p>
	 */
	public static McObfPair field_177605_n = McMappingDatabase.getSRG("field_177605_n");

	/**
	 * <p>
	 * Name: hasItemModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelBlock;)Z]
	 * </p>
	 */
	public static McObfPair func_177581_b = McMappingDatabase.getSRG("ModelBakery.func_177581_b");

	/**
	 * <p>
	 * Name: loadModelBlockDefinition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/client/resources/IResource;)Lnet/minecraft/client/renderer/block/model/ModelBlockDefinition;]
	 * </p>
	 */
	public static McObfPair func_188636_a = McMappingDatabase.getSRG("ModelBakery.func_188636_a");

	/**
	 * <p>
	 * Name: loadModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177574_i = McMappingDatabase.getSRG("ModelBakery.func_177574_i");

	/**
	 * <p>
	 * Name: loadItemModel
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/util/ResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_188634_a = McMappingDatabase.getSRG("ModelBakery.func_188634_a");

	/**
	 * <p>
	 * Name: registerVariant
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelBlockDefinition;Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;)V]
	 * </p>
	 */
	public static McObfPair func_177569_a = McMappingDatabase.getSRG("ModelBakery.func_177569_a");

	/**
	 * <p>
	 * Name: loadSprites
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177572_j = McMappingDatabase.getSRG("ModelBakery.func_177572_j");

	/**
	 * <p>
	 * Name: EMPTY_MODEL_RAW
	 * </p>
	 */
	public static McObfPair field_188643_q = McMappingDatabase.getSRG("field_188643_q");

	/**
	 * <p>
	 * Name: faceBakery
	 * </p>
	 */
	public static McObfPair field_177607_l = McMappingDatabase.getSRG("field_177607_l");

	/**
	 * <p>
	 * Name: bakeItemModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188635_i = McMappingDatabase.getSRG("ModelBakery.func_188635_i");

	/**
	 * <p>
	 * Name: addModelParentLocation
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Deque;Ljava/util/Set;Lnet/minecraft/client/renderer/block/model/ModelBlock;)V]
	 * </p>
	 */
	public static McObfPair func_188633_a = McMappingDatabase.getSRG("ModelBakery.func_188633_a");

	/**
	 * <p>
	 * Name: JOINER
	 * </p>
	 */
	public static McObfPair field_177601_e = McMappingDatabase.getSRG("field_177601_e");

	/**
	 * <p>
	 * Name: bakeBlockModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177588_f = McMappingDatabase.getSRG("ModelBakery.func_177588_f");

	/**
	 * <p>
	 * Name: getVariantNames
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177596_a = McMappingDatabase.getSRG("ModelBakery.func_177596_a");

	/**
	 * <p>
	 * Name: registerVariantNames
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177592_e = McMappingDatabase.getSRG("ModelBakery.func_177592_e");

	/**
	 * <p>
	 * Name: LOCATIONS_BUILTIN_TEXTURES
	 * </p>
	 */
	public static McObfPair field_177602_b = McMappingDatabase.getSRG("field_177602_b");

	/**
	 * <p>
	 * Name: bakeModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelBlock;Lnet/minecraft/client/renderer/block/model/ModelRotation;Z)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_177578_a = McMappingDatabase.getSRG("ModelBakery.func_177578_a");

	/**
	 * <p>
	 * Name: resourceManager
	 * </p>
	 */
	public static McObfPair field_177598_f = McMappingDatabase.getSRG("field_177598_f");

	/**
	 * <p>
	 * Name: makeBakedQuad
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/BlockPart;Lnet/minecraft/client/renderer/block/model/BlockPartFace;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/client/renderer/block/model/ModelRotation;Z)Lnet/minecraft/client/renderer/block/model/BakedQuad;]
	 * </p>
	 */
	public static McObfPair func_177589_a = McMappingDatabase.getSRG("ModelBakery.func_177589_a");

	/**
	 * <p>
	 * Name: loadModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/renderer/block/model/ModelBlock;]
	 * </p>
	 */
	public static McObfPair func_177594_c = McMappingDatabase.getSRG("ModelBakery.func_177594_c");

	/**
	 * <p>
	 * Name: getTextureLocations
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelBlock;)Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_177585_a = McMappingDatabase.getSRG("ModelBakery.func_177585_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_177603_c = McMappingDatabase.getSRG("field_177603_c");

	/**
	 * <p>
	 * Name: MODEL_GENERATED
	 * </p>
	 */
	public static McObfPair field_177606_o = McMappingDatabase.getSRG("field_177606_o");

	/**
	 * <p>
	 * Name: models
	 * </p>
	 */
	public static McObfPair field_177611_h = McMappingDatabase.getSRG("field_177611_h");

	/**
	 * <p>
	 * Name: itemLocations
	 * </p>
	 */
	public static McObfPair field_177615_s = McMappingDatabase.getSRG("field_177615_s");

	/**
	 * <p>
	 * Name: MISSING_MODEL_MESH
	 * </p>
	 */
	public static McObfPair field_188641_d = McMappingDatabase.getSRG("field_188641_d");

	/**
	 * <p>
	 * Name: loadVariantList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;Lnet/minecraft/client/renderer/block/model/VariantList;)V]
	 * </p>
	 */
	public static McObfPair func_188638_a = McMappingDatabase.getSRG("ModelBakery.func_188638_a");

	/**
	 * <p>
	 * Name: makeItemModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177593_l = McMappingDatabase.getSRG("ModelBakery.func_177593_l");

	/**
	 * <p>
	 * Name: getModelLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177580_d = McMappingDatabase.getSRG("ModelBakery.func_177580_d");

	/**
	 * <p>
	 * Name: sprites
	 * </p>
	 */
	public static McObfPair field_177599_g = McMappingDatabase.getSRG("field_177599_g");

	/**
	 * <p>
	 * Name: loadItemModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177590_d = McMappingDatabase.getSRG("ModelBakery.func_177590_d");

	/**
	 * <p>
	 * Name: textureMap
	 * </p>
	 */
	public static McObfPair field_177609_j = McMappingDatabase.getSRG("field_177609_j");

	/**
	 * <p>
	 * Name: loadMultipartMBD
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/renderer/block/model/ModelBlockDefinition;]
	 * </p>
	 */
	public static McObfPair func_188632_a = McMappingDatabase.getSRG("ModelBakery.func_188632_a");

	/**
	 * <p>
	 * Name: loadVariantItemModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177577_b = McMappingDatabase.getSRG("ModelBakery.func_177577_b");

	/**
	 * <p>
	 * Name: getVariantsTextureLocations
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_177575_g = McMappingDatabase.getSRG("ModelBakery.func_177575_g");

	/**
	 * <p>
	 * Name: variantNames
	 * </p>
	 */
	public static McObfPair field_177613_u = McMappingDatabase.getSRG("field_177613_u");

	/**
	 * <p>
	 * Name: loadStaticModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_191401_d = McMappingDatabase.getSRG("ModelBakery.func_191401_d");

	/**
	 * <p>
	 * Name: getParentLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177576_f = McMappingDatabase.getSRG("ModelBakery.func_177576_f");

	/**
	 * <p>
	 * Name: isCustomRenderer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelBlock;)Z]
	 * </p>
	 */
	public static McObfPair func_177587_c = McMappingDatabase.getSRG("ModelBakery.func_177587_c");

	/**
	 * <p>
	 * Name: multipartVariantMap
	 * </p>
	 */
	public static McObfPair field_188642_k = McMappingDatabase.getSRG("field_188642_k");

	/**
	 * <p>
	 * Name: loadMultipartVariantModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188637_e = McMappingDatabase.getSRG("ModelBakery.func_188637_e");

	/**
	 * <p>
	 * Name: itemModelGenerator
	 * </p>
	 */
	public static McObfPair field_177608_m = McMappingDatabase.getSRG("field_177608_m");

	/**
	 * <p>
	 * Name: blockModelShapes
	 * </p>
	 */
	public static McObfPair field_177610_k = McMappingDatabase.getSRG("field_177610_k");

	/**
	 * <p>
	 * Name: MODEL_ENTITY
	 * </p>
	 */
	public static McObfPair field_177616_r = McMappingDatabase.getSRG("field_177616_r");

	/**
	 * <p>
	 * Name: getParentPath
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_177573_e = McMappingDatabase.getSRG("ModelBakery.func_177573_e");

	/**
	 * <p>
	 * Name: createRandomModelForVariantList
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/VariantList;Ljava/lang/String;)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_188639_a = McMappingDatabase.getSRG("ModelBakery.func_188639_a");

	/**
	 * <p>
	 * Name: makeItemModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelBlock;)Lnet/minecraft/client/renderer/block/model/ModelBlock;]
	 * </p>
	 */
	public static McObfPair func_177582_d = McMappingDatabase.getSRG("ModelBakery.func_177582_d");

	/**
	 * <p>
	 * Name: blockDefinitions
	 * </p>
	 */
	public static McObfPair field_177614_t = McMappingDatabase.getSRG("field_177614_t");

	/**
	 * <p>
	 * Name: loadVariantModels
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_177595_c = McMappingDatabase.getSRG("ModelBakery.func_177595_c");

	/**
	 * <p>
	 * Name: MODEL_MISSING
	 * </p>
	 */
	public static McObfPair field_177604_a = McMappingDatabase.getSRG("field_177604_a");

	/**
	 * <p>
	 * Name: getBlockstateLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_188631_b = McMappingDatabase.getSRG("ModelBakery.func_188631_b");

	/**
	 * <p>
	 * Name: getModelBlockDefinition
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/renderer/block/model/ModelBlockDefinition;]
	 * </p>
	 */
	public static McObfPair func_177586_a = McMappingDatabase.getSRG("ModelBakery.func_177586_a");

	/**
	 * <p>
	 * Name: getItemsTextureLocations
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_177571_k = McMappingDatabase.getSRG("ModelBakery.func_177571_k");

	/**
	 * <p>
	 * Name: loadBlocks
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_188640_b = McMappingDatabase.getSRG("ModelBakery.func_188640_b");

	/**
	 * <p>
	 * Name: setupModelRegistry
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/registry/IRegistry;]
	 * </p>
	 */
	public static McObfPair func_177570_a = McMappingDatabase.getSRG("ModelBakery.func_177570_a");

	/**
	 * <p>
	 * Name: variants
	 * </p>
	 */
	public static McObfPair field_177612_i = McMappingDatabase.getSRG("field_177612_i");

}
