package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourcePackListEntryServer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boa";
		else
			return "net/minecraft/client/resources/ResourcePackListEntryServer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boa";
		else
			return "ResourcePackListEntryServer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboa;";
		else
			return "Lnet/minecraft/client/resources/ResourcePackListEntryServer;";
	}

	/**
	 * <p>
	 * Name: showHoverOverlay
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148310_d = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_148310_d");

	/**
	 * <p>
	 * Name: resourcePackIcon
	 * </p>
	 */
	public static McObfPair field_148321_e = McMappingDatabase.getSRG("field_148321_e");

	/**
	 * <p>
	 * Name: canMoveLeft
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148308_f = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_148308_f");

	/**
	 * <p>
	 * Name: canMoveRight
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148309_e = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_148309_e");

	/**
	 * <p>
	 * Name: canMoveDown
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148307_h = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_148307_h");

	/**
	 * <p>
	 * Name: canMoveUp
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_148314_g = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_148314_g");

	/**
	 * <p>
	 * Name: getResourcePackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148312_b = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_148312_b");

	/**
	 * <p>
	 * Name: getResourcePackFormat
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_183019_a = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_183019_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_148322_c = McMappingDatabase.getSRG("field_148322_c");

	/**
	 * <p>
	 * Name: getResourcePackDescription
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148311_a = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_148311_a");

	/**
	 * <p>
	 * Name: isServerPack
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_186768_j = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_186768_j");

	/**
	 * <p>
	 * Name: resourcePack
	 * </p>
	 */
	public static McObfPair field_148320_d = McMappingDatabase.getSRG("field_148320_d");

	/**
	 * <p>
	 * Name: bindResourcePackIcon
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_148313_c = McMappingDatabase.getSRG("ResourcePackListEntryServer.func_148313_c");

}
