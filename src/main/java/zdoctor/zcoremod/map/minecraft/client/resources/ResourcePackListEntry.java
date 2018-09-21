package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourcePackListEntry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnx";
		else
			return "net/minecraft/client/resources/ResourcePackListEntry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bnx";
		else
			return "ResourcePackListEntry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbnx;";
		else
			return "Lnet/minecraft/client/resources/ResourcePackListEntry;";
	}

	/**
	 * <p>
	 * Name: getResourcePackFormat
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_183019_a = McMappingDatabase.getSRG("ResourcePackListEntry.func_183019_a");

	/**
	 * <p>
	 * Name: drawEntry
	 * </p>
	 * <p>
	 * Desc: [(IIIIIIIZF)V]
	 * </p>
	 */
	public static McObfPair func_192634_a = McMappingDatabase.getSRG("ResourcePackListEntry.func_192634_a");

	/**
	 * <p>
	 * Name: mouseReleased
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)V]
	 * </p>
	 */
	public static McObfPair func_148277_b = McMappingDatabase.getSRG("ResourcePackListEntry.func_148277_b");

	/**
	 * <p>
	 * Name: canMoveUp
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148314_g = McMappingDatabase.getSRG("ResourcePackListEntry.func_148314_g");

	/**
	 * <p>
	 * Name: getResourcePackDescription
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148311_a = McMappingDatabase.getSRG("ResourcePackListEntry.func_148311_a");

	/**
	 * <p>
	 * Name: canMoveDown
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148307_h = McMappingDatabase.getSRG("ResourcePackListEntry.func_148307_h");

	/**
	 * <p>
	 * Name: INCOMPATIBLE
	 * </p>
	 */
	public static McObfPair field_183020_d = McMappingDatabase.getSRG("field_183020_d");

	/**
	 * <p>
	 * Name: INCOMPATIBLE_OLD
	 * </p>
	 */
	public static McObfPair field_183021_e = McMappingDatabase.getSRG("field_183021_e");

	/**
	 * <p>
	 * Name: canMoveRight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148309_e = McMappingDatabase.getSRG("ResourcePackListEntry.func_148309_e");

	/**
	 * <p>
	 * Name: RESOURCE_PACKS_TEXTURE
	 * </p>
	 */
	public static McObfPair field_148316_c = McMappingDatabase.getSRG("field_148316_c");

	/**
	 * <p>
	 * Name: INCOMPATIBLE_NEW
	 * </p>
	 */
	public static McObfPair field_183022_f = McMappingDatabase.getSRG("field_183022_f");

	/**
	 * <p>
	 * Name: canMoveLeft
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148308_f = McMappingDatabase.getSRG("ResourcePackListEntry.func_148308_f");

	/**
	 * <p>
	 * Name: updatePosition
	 * </p>
	 * <p>
	 * Desc: [(IIIF)V]
	 * </p>
	 */
	public static McObfPair func_192633_a = McMappingDatabase.getSRG("ResourcePackListEntry.func_192633_a");

	/**
	 * <p>
	 * Name: isServerPack
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186768_j = McMappingDatabase.getSRG("ResourcePackListEntry.func_186768_j");

	/**
	 * <p>
	 * Name: getResourcePackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148312_b = McMappingDatabase.getSRG("ResourcePackListEntry.func_148312_b");

	/**
	 * <p>
	 * Name: resourcePacksGUI
	 * </p>
	 */
	public static McObfPair field_148315_b = McMappingDatabase.getSRG("field_148315_b");

	/**
	 * <p>
	 * Name: mc
	 * </p>
	 */
	public static McObfPair field_148317_a = McMappingDatabase.getSRG("field_148317_a");

	/**
	 * <p>
	 * Name: bindResourcePackIcon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148313_c = McMappingDatabase.getSRG("ResourcePackListEntry.func_148313_c");

	/**
	 * <p>
	 * Name: showHoverOverlay
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148310_d = McMappingDatabase.getSRG("ResourcePackListEntry.func_148310_d");

	/**
	 * <p>
	 * Name: mousePressed
	 * </p>
	 * <p>
	 * Desc: [(IIIIII)Z]
	 * </p>
	 */
	public static McObfPair func_148278_a = McMappingDatabase.getSRG("ResourcePackListEntry.func_148278_a");

}
