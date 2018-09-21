package zdoctor.zcoremod.map.minecraft.client.renderer.texture;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class Stitcher$Slot {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdn$b";
		else
			return "net/minecraft/client/renderer/texture/Stitcher$Slot";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cdn$b";
		else
			return "Stitcher$Slot";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcdn$b;";
		else
			return "Lnet/minecraft/client/renderer/texture/Stitcher$Slot;";
	}

	/**
	 * <p>
	 * Name: originY
	 * </p>
	 */
	public static McObfPair field_94190_b = McMappingDatabase.getSRG("field_94190_b");

	/**
	 * <p>
	 * Name: holder
	 * </p>
	 */
	public static McObfPair field_94187_f = McMappingDatabase.getSRG("field_94187_f");

	/**
	 * <p>
	 * Name: getOriginX
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94186_b = McMappingDatabase.getSRG("Stitcher$Slot.func_94186_b");

	/**
	 * <p>
	 * Name: addSlot
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/Stitcher$Holder;)Z]
	 * </p>
	 */
	public static McObfPair func_94182_a = McMappingDatabase.getSRG("Stitcher$Slot.func_94182_a");

	/**
	 * <p>
	 * Name: getStitchHolder
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/renderer/texture/Stitcher$Holder;]
	 * </p>
	 */
	public static McObfPair func_94183_a = McMappingDatabase.getSRG("Stitcher$Slot.func_94183_a");

	/**
	 * <p>
	 * Name: height
	 * </p>
	 */
	public static McObfPair field_94188_d = McMappingDatabase.getSRG("field_94188_d");

	/**
	 * <p>
	 * Name: width
	 * </p>
	 */
	public static McObfPair field_94191_c = McMappingDatabase.getSRG("field_94191_c");

	/**
	 * <p>
	 * Name: originX
	 * </p>
	 */
	public static McObfPair field_94192_a = McMappingDatabase.getSRG("field_94192_a");

	/**
	 * <p>
	 * Name: getOriginY
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_94185_c = McMappingDatabase.getSRG("Stitcher$Slot.func_94185_c");

	/**
	 * <p>
	 * Name: getAllStitchSlots
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/List;)V]
	 * </p>
	 */
	public static McObfPair func_94184_a = McMappingDatabase.getSRG("Stitcher$Slot.func_94184_a");

	/**
	 * <p>
	 * Name: subSlots
	 * </p>
	 */
	public static McObfPair field_94189_e = McMappingDatabase.getSRG("field_94189_e");

}
