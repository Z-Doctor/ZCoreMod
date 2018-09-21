package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TextureAtlasSprite {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdq";
		else
			return "net/minecraft/client/renderer/texture/TextureAtlasSprite";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdq";
		else
			return "TextureAtlasSprite";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdq;";
		else
			return "Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;";
	}

	/**
	 * <p>
	 * Name: originY
	 * </p>
	 */
	public static McObfPair field_110974_d = McMappingDatabase.getSRG("field_110974_d");

	/**
	 * <p>
	 * Name: getMinU
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_94209_e = McMappingDatabase.getSRG("TextureAtlasSprite.func_94209_e");

	/**
	 * <p>
	 * Name: getOriginX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_130010_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_130010_a");

	/**
	 * <p>
	 * Name: clearFramesTextureData
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_130103_l = McMappingDatabase.getSRG("TextureAtlasSprite.func_130103_l");

	/**
	 * <p>
	 * Name: allocateFrameTextureData
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_130099_d = McMappingDatabase.getSRG("TextureAtlasSprite.func_130099_d");

	/**
	 * <p>
	 * Name: getFrameTextureData
	 * </p>
	 * <p>
	 * Desc: [(I)[[I]
	 * </p>
	 */
	public static McObfPair func_147965_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_147965_a");

	/**
	 * <p>
	 * Name: getFrameCount
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110970_k = McMappingDatabase.getSRG("TextureAtlasSprite.func_110970_k");

	/**
	 * <p>
	 * Name: getIconWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94211_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_94211_a");

	/**
	 * <p>
	 * Name: getFrameTextureData
	 * </p>
	 * <p>
	 * Desc: [([[IIII)[[I]
	 * </p>
	 */
	public static McObfPair func_147962_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_147962_a");

	/**
	 * <p>
	 * Name: getUnInterpolatedV
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_188536_b = McMappingDatabase.getSRG("TextureAtlasSprite.func_188536_b");

	/**
	 * <p>
	 * Name: getMaxV
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_94210_h = McMappingDatabase.getSRG("TextureAtlasSprite.func_94210_h");

	/**
	 * <p>
	 * Name: originX
	 * </p>
	 */
	public static McObfPair field_110975_c = McMappingDatabase.getSRG("field_110975_c");

	/**
	 * <p>
	 * Name: getInterpolatedV
	 * </p>
	 * <p>
	 * Desc: [(D)F]
	 * </p>
	 */
	public static McObfPair func_94207_b = McMappingDatabase.getSRG("TextureAtlasSprite.func_94207_b");

	/**
	 * <p>
	 * Name: getOriginY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110967_i = McMappingDatabase.getSRG("TextureAtlasSprite.func_110967_i");

	/**
	 * <p>
	 * Name: setIconWidth
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_110966_b = McMappingDatabase.getSRG("TextureAtlasSprite.func_110966_b");

	/**
	 * <p>
	 * Name: getIconName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_94215_i = McMappingDatabase.getSRG("TextureAtlasSprite.func_94215_i");

	/**
	 * <p>
	 * Name: getInterpolatedU
	 * </p>
	 * <p>
	 * Desc: [(D)F]
	 * </p>
	 */
	public static McObfPair func_94214_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_94214_a");

	/**
	 * <p>
	 * Name: maxV
	 * </p>
	 */
	public static McObfPair field_110978_o = McMappingDatabase.getSRG("field_110978_o");

	/**
	 * <p>
	 * Name: iconName
	 * </p>
	 */
	public static McObfPair field_110984_i = McMappingDatabase.getSRG("field_110984_i");

	/**
	 * <p>
	 * Name: setFramesTextureData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_110968_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_110968_a");

	/**
	 * <p>
	 * Name: maxU
	 * </p>
	 */
	public static McObfPair field_110980_m = McMappingDatabase.getSRG("field_110980_m");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_130223_c = McMappingDatabase.getSRG("field_130223_c");

	/**
	 * <p>
	 * Name: setIconHeight
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_110969_c = McMappingDatabase.getSRG("TextureAtlasSprite.func_110969_c");

	/**
	 * <p>
	 * Name: loadSpriteFrames
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/resources/IResource;I)V]
	 * </p>
	 */
	public static McObfPair func_188539_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_188539_a");

	/**
	 * <p>
	 * Name: loadSprite
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/PngSizeInfo;Z)V]
	 * </p>
	 */
	public static McObfPair func_188538_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_188538_a");

	/**
	 * <p>
	 * Name: getUnInterpolatedU
	 * </p>
	 * <p>
	 * Desc: [(F)F]
	 * </p>
	 */
	public static McObfPair func_188537_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_188537_a");

	/**
	 * <p>
	 * Name: interpolatedFrameData
	 * </p>
	 */
	public static McObfPair field_176605_b = McMappingDatabase.getSRG("field_176605_b");

	/**
	 * <p>
	 * Name: frameCounter
	 * </p>
	 */
	public static McObfPair field_110973_g = McMappingDatabase.getSRG("field_110973_g");

	/**
	 * <p>
	 * Name: makeAtlasSprite
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_176604_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_176604_a");

	/**
	 * <p>
	 * Name: updateAnimationInterpolated
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_180599_n = McMappingDatabase.getSRG("TextureAtlasSprite.func_180599_n");

	/**
	 * <p>
	 * Name: updateAnimation
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94219_l = McMappingDatabase.getSRG("TextureAtlasSprite.func_94219_l");

	/**
	 * <p>
	 * Name: initSprite
	 * </p>
	 * <p>
	 * Desc: [(IIIIZ)V]
	 * </p>
	 */
	public static McObfPair func_110971_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_110971_a");

	/**
	 * <p>
	 * Name: generateMipmaps
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_147963_d = McMappingDatabase.getSRG("TextureAtlasSprite.func_147963_d");

	/**
	 * <p>
	 * Name: getMinV
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_94206_g = McMappingDatabase.getSRG("TextureAtlasSprite.func_94206_g");

	/**
	 * <p>
	 * Name: getIconHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94216_b = McMappingDatabase.getSRG("TextureAtlasSprite.func_94216_b");

	/**
	 * <p>
	 * Name: rotated
	 * </p>
	 */
	public static McObfPair field_130222_e = McMappingDatabase.getSRG("field_130222_e");

	/**
	 * <p>
	 * Name: getMaxU
	 * </p>
	 * <p>
	 * Desc: [()F]
	 * </p>
	 */
	public static McObfPair func_94212_f = McMappingDatabase.getSRG("TextureAtlasSprite.func_94212_f");

	/**
	 * <p>
	 * Name: framesTextureData
	 * </p>
	 */
	public static McObfPair field_110976_a = McMappingDatabase.getSRG("field_110976_a");

	/**
	 * <p>
	 * Name: minV
	 * </p>
	 */
	public static McObfPair field_110977_n = McMappingDatabase.getSRG("field_110977_n");

	/**
	 * <p>
	 * Name: interpolateColor
	 * </p>
	 * <p>
	 * Desc: [(DII)I]
	 * </p>
	 */
	public static McObfPair func_188535_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_188535_a");

	/**
	 * <p>
	 * Name: resetSprite
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_130102_n = McMappingDatabase.getSRG("TextureAtlasSprite.func_130102_n");

	/**
	 * <p>
	 * Name: hasAnimationMetadata
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_130098_m = McMappingDatabase.getSRG("TextureAtlasSprite.func_130098_m");

	/**
	 * <p>
	 * Name: animationMetadata
	 * </p>
	 */
	public static McObfPair field_110982_k = McMappingDatabase.getSRG("field_110982_k");

	/**
	 * <p>
	 * Name: minU
	 * </p>
	 */
	public static McObfPair field_110979_l = McMappingDatabase.getSRG("field_110979_l");

	/**
	 * <p>
	 * Name: copyFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)V]
	 * </p>
	 */
	public static McObfPair func_94217_a = McMappingDatabase.getSRG("TextureAtlasSprite.func_94217_a");

	/**
	 * <p>
	 * Name: tickCounter
	 * </p>
	 */
	public static McObfPair field_110983_h = McMappingDatabase.getSRG("field_110983_h");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_130224_d = McMappingDatabase.getSRG("field_130224_d");

}
