package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Stitcher$Holder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdn$a";
		else
			return "net/minecraft/client/renderer/texture/Stitcher$Holder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdn$a";
		else
			return "Stitcher$Holder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdn$a;";
		else
			return "Lnet/minecraft/client/renderer/texture/Stitcher$Holder;";
	}

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_94204_c = McMappingDatabase.getSRG("field_94204_c");

	/**
	 * <p>
	 * Name: mipmapLevelHolder
	 * </p>
	 */
	public static McObfPair field_147968_d = McMappingDatabase.getSRG("field_147968_d");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_94201_d = McMappingDatabase.getSRG("field_94201_d");

	/**
	 * <p>
	 * Name: rotate
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94194_d = McMappingDatabase.getSRG("Stitcher$Holder.func_94194_d");

	/**
	 * <p>
	 * Name: getWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94197_a = McMappingDatabase.getSRG("Stitcher$Holder.func_94197_a");

	/**
	 * <p>
	 * Name: sprite
	 * </p>
	 */
	public static McObfPair field_98151_a = McMappingDatabase.getSRG("field_98151_a");

	/**
	 * <p>
	 * Name: setNewDimension
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_94196_a = McMappingDatabase.getSRG("Stitcher$Holder.func_94196_a");

	/**
	 * <p>
	 * Name: isRotated
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_94195_e = McMappingDatabase.getSRG("Stitcher$Holder.func_94195_e");

	/**
	 * <p>
	 * Name: scaleFactor
	 * </p>
	 */
	public static McObfPair field_94205_a = McMappingDatabase.getSRG("field_94205_a");

	/**
	 * <p>
	 * Name: getHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94199_b = McMappingDatabase.getSRG("Stitcher$Holder.func_94199_b");

	/**
	 * <p>
	 * Name: rotated
	 * </p>
	 */
	public static McObfPair field_94202_e = McMappingDatabase.getSRG("field_94202_e");

	/**
	 * <p>
	 * Name: getAtlasSprite
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;]
	 * </p>
	 */
	public static McObfPair func_98150_a = McMappingDatabase.getSRG("Stitcher$Holder.func_98150_a");

}
