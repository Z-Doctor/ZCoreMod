package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class RenderItem {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzw";
		else
			return "net/minecraft/client/renderer/RenderItem";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bzw";
		else
			return "RenderItem";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbzw;";
		else
			return "Lnet/minecraft/client/renderer/RenderItem;";
	}

	/**
	 * <p>
	 * Name: registerItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;ILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175048_a = McMappingDatabase.getSRG("RenderItem.func_175048_a");

	/**
	 * <p>
	 * Name: renderItemAndEffectIntoGUI
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;II)V]
	 * </p>
	 */
	public static McObfPair func_180450_b = McMappingDatabase.getSRG("RenderItem.func_180450_b");

	/**
	 * <p>
	 * Name: onResourceManagerReload
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResourceManager;)V]
	 * </p>
	 */
	public static McObfPair func_110549_a = McMappingDatabase.getSRG("RenderItem.func_110549_a");

	/**
	 * <p>
	 * Name: registerBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175031_a = McMappingDatabase.getSRG("RenderItem.func_175031_a");

	/**
	 * <p>
	 * Name: shouldRenderItemIn3D
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Z]
	 * </p>
	 */
	public static McObfPair func_175050_a = McMappingDatabase.getSRG("RenderItem.func_175050_a");

	/**
	 * <p>
	 * Name: getItemModelMesher
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/ItemModelMesher;]
	 * </p>
	 */
	public static McObfPair func_175037_a = McMappingDatabase.getSRG("RenderItem.func_175037_a");

	/**
	 * <p>
	 * Name: registerBlock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/Block;ILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175029_a = McMappingDatabase.getSRG("RenderItem.func_175029_a");

	/**
	 * <p>
	 * Name: renderItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;)V]
	 * </p>
	 */
	public static McObfPair func_181564_a = McMappingDatabase.getSRG("RenderItem.func_181564_a");

	/**
	 * <p>
	 * Name: renderItemAndEffectIntoGUI
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;II)V]
	 * </p>
	 */
	public static McObfPair func_184391_a = McMappingDatabase.getSRG("RenderItem.func_184391_a");

	/**
	 * <p>
	 * Name: renderQuad
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/client/renderer/block/model/BakedQuad;I)V]
	 * </p>
	 */
	public static McObfPair func_191969_a = McMappingDatabase.getSRG("RenderItem.func_191969_a");

	/**
	 * <p>
	 * Name: renderModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/IBakedModel;ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_191967_a = McMappingDatabase.getSRG("RenderItem.func_191967_a");

	/**
	 * <p>
	 * Name: itemColors
	 * </p>
	 */
	public static McObfPair field_184395_f = McMappingDatabase.getSRG("field_184395_f");

	/**
	 * <p>
	 * Name: notRenderingEffectsInGUI
	 * </p>
	 */
	public static McObfPair field_175058_l = McMappingDatabase.getSRG("field_175058_l");

	/**
	 * <p>
	 * Name: renderItemModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Z)V]
	 * </p>
	 */
	public static McObfPair func_184394_a = McMappingDatabase.getSRG("RenderItem.func_184394_a");

	/**
	 * <p>
	 * Name: draw
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;IIIIIIII)V]
	 * </p>
	 */
	public static McObfPair func_181565_a = McMappingDatabase.getSRG("RenderItem.func_181565_a");

	/**
	 * <p>
	 * Name: renderItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Z)V]
	 * </p>
	 */
	public static McObfPair func_184392_a = McMappingDatabase.getSRG("RenderItem.func_184392_a");

	/**
	 * <p>
	 * Name: renderItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/IBakedModel;)V]
	 * </p>
	 */
	public static McObfPair func_180454_a = McMappingDatabase.getSRG("RenderItem.func_180454_a");

	/**
	 * <p>
	 * Name: renderItemOverlayIntoGUI
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/item/ItemStack;IILjava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_180453_a = McMappingDatabase.getSRG("RenderItem.func_180453_a");

	/**
	 * <p>
	 * Name: getItemModelWithOverrides
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/client/renderer/block/model/IBakedModel;]
	 * </p>
	 */
	public static McObfPair func_184393_a = McMappingDatabase.getSRG("RenderItem.func_184393_a");

	/**
	 * <p>
	 * Name: registerItems
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_175041_b = McMappingDatabase.getSRG("RenderItem.func_175041_b");

	/**
	 * <p>
	 * Name: registerItem
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/Item;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_175047_a = McMappingDatabase.getSRG("RenderItem.func_175047_a");

	/**
	 * <p>
	 * Name: setupGuiTransform
	 * </p>
	 * <p>
	 * Desc: [(IIZ)V]
	 * </p>
	 */
	public static McObfPair func_180452_a = McMappingDatabase.getSRG("RenderItem.func_180452_a");

	/**
	 * <p>
	 * Name: putQuadNormal
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Lnet/minecraft/client/renderer/block/model/BakedQuad;)V]
	 * </p>
	 */
	public static McObfPair func_175038_a = McMappingDatabase.getSRG("RenderItem.func_175038_a");

	/**
	 * <p>
	 * Name: renderItemModelIntoGUI
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;IILnet/minecraft/client/renderer/block/model/IBakedModel;)V]
	 * </p>
	 */
	public static McObfPair func_191962_a = McMappingDatabase.getSRG("RenderItem.func_191962_a");

	/**
	 * <p>
	 * Name: textureManager
	 * </p>
	 */
	public static McObfPair field_175057_n = McMappingDatabase.getSRG("field_175057_n");

	/**
	 * <p>
	 * Name: zLevel
	 * </p>
	 */
	public static McObfPair field_77023_b = McMappingDatabase.getSRG("field_77023_b");

	/**
	 * <p>
	 * Name: RES_ITEM_GLINT
	 * </p>
	 */
	public static McObfPair field_110798_h = McMappingDatabase.getSRG("field_110798_h");

	/**
	 * <p>
	 * Name: isThereOneNegativeScale
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ItemTransformVec3f;)Z]
	 * </p>
	 */
	public static McObfPair func_183005_a = McMappingDatabase.getSRG("RenderItem.func_183005_a");

	/**
	 * <p>
	 * Name: itemModelMesher
	 * </p>
	 */
	public static McObfPair field_175059_m = McMappingDatabase.getSRG("field_175059_m");

	/**
	 * <p>
	 * Name: renderModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/IBakedModel;I)V]
	 * </p>
	 */
	public static McObfPair func_191965_a = McMappingDatabase.getSRG("RenderItem.func_191965_a");

	/**
	 * <p>
	 * Name: renderItemOverlays
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/gui/FontRenderer;Lnet/minecraft/item/ItemStack;II)V]
	 * </p>
	 */
	public static McObfPair func_175030_a = McMappingDatabase.getSRG("RenderItem.func_175030_a");

	/**
	 * <p>
	 * Name: renderQuads
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/BufferBuilder;Ljava/util/List;ILnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_191970_a = McMappingDatabase.getSRG("RenderItem.func_191970_a");

	/**
	 * <p>
	 * Name: renderModel
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/IBakedModel;Lnet/minecraft/item/ItemStack;)V]
	 * </p>
	 */
	public static McObfPair func_191961_a = McMappingDatabase.getSRG("RenderItem.func_191961_a");

	/**
	 * <p>
	 * Name: renderEffect
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/IBakedModel;)V]
	 * </p>
	 */
	public static McObfPair func_191966_a = McMappingDatabase.getSRG("RenderItem.func_191966_a");

	/**
	 * <p>
	 * Name: renderItemIntoGUI
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;II)V]
	 * </p>
	 */
	public static McObfPair func_175042_a = McMappingDatabase.getSRG("RenderItem.func_175042_a");

}
