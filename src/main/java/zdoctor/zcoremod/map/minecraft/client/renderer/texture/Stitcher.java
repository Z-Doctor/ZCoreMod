package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Stitcher {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdn";
		else
			return "net/minecraft/client/renderer/texture/Stitcher";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdn";
		else
			return "Stitcher";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdn;";
		else
			return "Lnet/minecraft/client/renderer/texture/Stitcher;";
	}

	/**
	 * <p>
	 * Name: addSprite
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureAtlasSprite;)V]
	 * </p>
	 */
	public static McObfPair func_110934_a = McMappingDatabase.getSRG("Stitcher.func_110934_a");

	/**
	 * <p>
	 * Name: getCurrentWidth
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110935_a = McMappingDatabase.getSRG("Stitcher.func_110935_a");

	/**
	 * <p>
	 * Name: mipmapLevelStitcher
	 * </p>
	 */
	public static McObfPair field_147971_a = McMappingDatabase.getSRG("field_147971_a");

	/**
	 * <p>
	 * Name: allocateSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/Stitcher$Holder;)Z]
	 * </p>
	 */
	public static McObfPair func_94310_b = McMappingDatabase.getSRG("Stitcher.func_94310_b");

	/**
	 * <p>
	 * Name: doStitch
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_94305_f = McMappingDatabase.getSRG("Stitcher.func_94305_f");

	/**
	 * <p>
	 * Name: stitchSlots
	 * </p>
	 */
	public static McObfPair field_94317_b = McMappingDatabase.getSRG("field_94317_b");

	/**
	 * <p>
	 * Name: maxHeight
	 * </p>
	 */
	public static McObfPair field_94313_f = McMappingDatabase.getSRG("field_94313_f");

	/**
	 * <p>
	 * Name: maxWidth
	 * </p>
	 */
	public static McObfPair field_94316_e = McMappingDatabase.getSRG("field_94316_e");

	/**
	 * <p>
	 * Name: getStichSlots
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_94309_g = McMappingDatabase.getSRG("Stitcher.func_94309_g");

	/**
	 * <p>
	 * Name: currentHeight
	 * </p>
	 */
	public static McObfPair field_94315_d = McMappingDatabase.getSRG("field_94315_d");

	/**
	 * <p>
	 * Name: maxTileDimension
	 * </p>
	 */
	public static McObfPair field_94323_h = McMappingDatabase.getSRG("field_94323_h");

	/**
	 * <p>
	 * Name: getMipmapDimension
	 * </p>
	 * <p>
	 * Desc: [(II)I]
	 * </p>
	 */
	public static McObfPair func_147969_b = McMappingDatabase.getSRG("Stitcher.func_147969_b");

	/**
	 * <p>
	 * Name: getCurrentHeight
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_110936_b = McMappingDatabase.getSRG("Stitcher.func_110936_b");

	/**
	 * <p>
	 * Name: expandAndAllocateSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/Stitcher$Holder;)Z]
	 * </p>
	 */
	public static McObfPair func_94311_c = McMappingDatabase.getSRG("Stitcher.func_94311_c");

	/**
	 * <p>
	 * Name: setStitchHolders
	 * </p>
	 */
	public static McObfPair field_94319_a = McMappingDatabase.getSRG("field_94319_a");

	/**
	 * <p>
	 * Name: currentWidth
	 * </p>
	 */
	public static McObfPair field_94318_c = McMappingDatabase.getSRG("field_94318_c");

}
