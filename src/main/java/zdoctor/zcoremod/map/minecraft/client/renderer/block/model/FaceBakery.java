package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class FaceBakery {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvx";
		else
			return "net/minecraft/client/renderer/block/model/FaceBakery";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvx";
		else
			return "FaceBakery";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvx;";
		else
			return "Lnet/minecraft/client/renderer/block/model/FaceBakery;";
	}

	/**
	 * <p>
	 * Name: fillVertexData
	 * </p>
	 * <p>
	 * Desc: [([IILnet/minecraft/util/EnumFacing;Lnet/minecraft/client/renderer/block/model/BlockFaceUV;[FLnet/minecraft/client/renderer/texture/TextureAtlasSprite;Lnet/minecraft/client/renderer/block/model/ModelRotation;Lnet/minecraft/client/renderer/block/model/BlockPartRotation;Z)V]
	 * </p>
	 */
	public static McObfPair func_188015_a = McMappingDatabase.getSRG("FaceBakery.func_188015_a");

	/**
	 * <p>
	 * Name: rotateVertex
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Vector3f;Lnet/minecraft/util/EnumFacing;ILnet/minecraft/client/renderer/block/model/ModelRotation;)I]
	 * </p>
	 */
	public static McObfPair func_188011_a = McMappingDatabase.getSRG("FaceBakery.func_188011_a");

	/**
	 * <p>
	 * Name: UV_ROTATION_INVERSE
	 * </p>
	 */
	public static McObfPair field_188019_f = McMappingDatabase.getSRG("field_188019_f");

	/**
	 * <p>
	 * Name: getMatrixIdentity
	 * </p>
	 * <p>
	 * Desc: [()Lorg/lwjgl/util/vector/Matrix4f;]
	 * </p>
	 */
	public static McObfPair func_178411_a = McMappingDatabase.getSRG("FaceBakery.func_178411_a");

	/**
	 * <p>
	 * Name: rotatePart
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Vector3f;Lnet/minecraft/client/renderer/block/model/BlockPartRotation;)V]
	 * </p>
	 */
	public static McObfPair func_178407_a = McMappingDatabase.getSRG("FaceBakery.func_178407_a");

	/**
	 * <p>
	 * Name: SCALE_ROTATION_22_5
	 * </p>
	 */
	public static McObfPair field_178418_a = McMappingDatabase.getSRG("field_178418_a");

	/**
	 * <p>
	 * Name: getFaceShadeColor
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_178413_a = McMappingDatabase.getSRG("FaceBakery.func_178413_a");

	/**
	 * <p>
	 * Name: applyFacing
	 * </p>
	 * <p>
	 * Desc: [([ILnet/minecraft/util/EnumFacing;)V]
	 * </p>
	 */
	public static McObfPair func_178408_a = McMappingDatabase.getSRG("FaceBakery.func_178408_a");

	/**
	 * <p>
	 * Name: rotateScale
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Matrix4f;Lorg/lwjgl/util/vector/Vector3f;)V]
	 * </p>
	 */
	public static McObfPair func_178406_a = McMappingDatabase.getSRG("FaceBakery.func_178406_a");

	/**
	 * <p>
	 * Name: UV_ROTATION_0
	 * </p>
	 */
	public static McObfPair field_188017_d = McMappingDatabase.getSRG("field_188017_d");

	/**
	 * <p>
	 * Name: UV_ROTATION_90
	 * </p>
	 */
	public static McObfPair field_188020_g = McMappingDatabase.getSRG("field_188020_g");

	/**
	 * <p>
	 * Name: addUvRotation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelRotation;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/client/renderer/block/model/FaceBakery$Rotation;)V]
	 * </p>
	 */
	public static McObfPair func_188013_a = McMappingDatabase.getSRG("FaceBakery.func_188013_a");

	/**
	 * <p>
	 * Name: UV_ROTATIONS
	 * </p>
	 */
	public static McObfPair field_188016_c = McMappingDatabase.getSRG("field_188016_c");

	/**
	 * <p>
	 * Name: getIndex
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/ModelRotation;Lnet/minecraft/util/EnumFacing;)I]
	 * </p>
	 */
	public static McObfPair func_188014_a = McMappingDatabase.getSRG("FaceBakery.func_188014_a");

	/**
	 * <p>
	 * Name: applyUVLock
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/BlockFaceUV;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/client/renderer/block/model/ModelRotation;)Lnet/minecraft/client/renderer/block/model/BlockFaceUV;]
	 * </p>
	 */
	public static McObfPair func_188010_a = McMappingDatabase.getSRG("FaceBakery.func_188010_a");

	/**
	 * <p>
	 * Name: getPositionsDiv16
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;)[F]
	 * </p>
	 */
	public static McObfPair func_178403_a = McMappingDatabase.getSRG("FaceBakery.func_178403_a");

	/**
	 * <p>
	 * Name: getFacingFromVertexData
	 * </p>
	 * <p>
	 * Desc: [([I)Lnet/minecraft/util/EnumFacing;]
	 * </p>
	 */
	public static McObfPair func_178410_a = McMappingDatabase.getSRG("FaceBakery.func_178410_a");

	/**
	 * <p>
	 * Name: SCALE_ROTATION_GENERAL
	 * </p>
	 */
	public static McObfPair field_178417_b = McMappingDatabase.getSRG("field_178417_b");

	/**
	 * <p>
	 * Name: UV_ROTATION_270
	 * </p>
	 */
	public static McObfPair field_188018_e = McMappingDatabase.getSRG("field_188018_e");

	/**
	 * <p>
	 * Name: makeQuadVertexData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/block/model/BlockFaceUV;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;Lnet/minecraft/util/EnumFacing;[FLnet/minecraft/client/renderer/block/model/ModelRotation;Lnet/minecraft/client/renderer/block/model/BlockPartRotation;Z)[I]
	 * </p>
	 */
	public static McObfPair func_188012_a = McMappingDatabase.getSRG("FaceBakery.func_188012_a");

	/**
	 * <p>
	 * Name: getFaceBrightness
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/EnumFacing;)F]
	 * </p>
	 */
	public static McObfPair func_178412_b = McMappingDatabase.getSRG("FaceBakery.func_178412_b");

	/**
	 * <p>
	 * Name: makeBakedQuad
	 * </p>
	 * <p>
	 * Desc: [(Lorg/lwjgl/util/vector/Vector3f;Lorg/lwjgl/util/vector/Vector3f;Lnet/minecraft/client/renderer/block/model/BlockPartFace;Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/client/renderer/block/model/ModelRotation;Lnet/minecraft/client/renderer/block/model/BlockPartRotation;ZZ)Lnet/minecraft/client/renderer/block/model/BakedQuad;]
	 * </p>
	 */
	public static McObfPair func_178414_a = McMappingDatabase.getSRG("FaceBakery.func_178414_a");

	/**
	 * <p>
	 * Name: storeVertexData
	 * </p>
	 * <p>
	 * Desc: [([IIILorg/lwjgl/util/vector/Vector3f;ILnet/minecraft/client/renderer/texture/TextureAtlasSprite;Lnet/minecraft/client/renderer/block/model/BlockFaceUV;)V]
	 * </p>
	 */
	public static McObfPair func_178404_a = McMappingDatabase.getSRG("FaceBakery.func_178404_a");

}
