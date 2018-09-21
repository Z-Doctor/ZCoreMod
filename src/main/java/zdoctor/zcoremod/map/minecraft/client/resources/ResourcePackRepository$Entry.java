package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ResourcePackRepository$Entry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceu$a";
		else
			return "net/minecraft/client/resources/ResourcePackRepository$Entry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ceu$a";
		else
			return "ResourcePackRepository$Entry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lceu$a;";
		else
			return "Lnet/minecraft/client/resources/ResourcePackRepository$Entry;";
	}

	/**
	 * <p>
	 * Name: updateResourcePack
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110516_a = McMappingDatabase.getSRG("ResourcePackRepository$Entry.func_110516_a");

	/**
	 * <p>
	 * Name: getResourcePack
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/IResourcePack;]
	 * </p>
	 */
	public static McObfPair func_110514_c = McMappingDatabase.getSRG("ResourcePackRepository$Entry.func_110514_c");

	/**
	 * <p>
	 * Name: getTexturePackDescription
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110519_e = McMappingDatabase.getSRG("ResourcePackRepository$Entry.func_110519_e");

	/**
	 * <p>
	 * Name: locationTexturePackIcon
	 * </p>
	 */
	public static McObfPair field_110520_f = McMappingDatabase.getSRG("field_110520_f");

	/**
	 * <p>
	 * Name: getPackFormat
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_183027_f = McMappingDatabase.getSRG("ResourcePackRepository$Entry.func_183027_f");

	/**
	 * <p>
	 * Name: bindTexturePackIcon
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/renderer/texture/TextureManager;)V]
	 * </p>
	 */
	public static McObfPair func_110518_a = McMappingDatabase.getSRG("ResourcePackRepository$Entry.func_110518_a");

	/**
	 * <p>
	 * Name: reResourcePack
	 * </p>
	 */
	public static McObfPair field_110524_c = McMappingDatabase.getSRG("field_110524_c");

	/**
	 * <p>
	 * Name: closeResourcePack
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_110517_b = McMappingDatabase.getSRG("ResourcePackRepository$Entry.func_110517_b");

	/**
	 * <p>
	 * Name: rePackMetadataSection
	 * </p>
	 */
	public static McObfPair field_110521_d = McMappingDatabase.getSRG("field_110521_d");

	/**
	 * <p>
	 * Name: getResourcePackName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_110515_d = McMappingDatabase.getSRG("ResourcePackRepository$Entry.func_110515_d");

}
