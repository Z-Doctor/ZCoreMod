package zdoctor.zcoremod.map.minecraft.client.resources;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DefaultPlayerSkin {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cef";
		else
			return "net/minecraft/client/resources/DefaultPlayerSkin";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "cef";
		else
			return "DefaultPlayerSkin";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lcef;";
		else
			return "Lnet/minecraft/client/resources/DefaultPlayerSkin;";
	}

	/**
	 * <p>
	 * Name: getSkinType
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_177332_b = McMappingDatabase.getSRG("DefaultPlayerSkin.func_177332_b");

	/**
	 * <p>
	 * Name: getDefaultSkin
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177334_a = McMappingDatabase.getSRG("DefaultPlayerSkin.func_177334_a");

	/**
	 * <p>
	 * Name: isSlimSkin
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/UUID;)Z]
	 * </p>
	 */
	public static McObfPair func_177333_c = McMappingDatabase.getSRG("DefaultPlayerSkin.func_177333_c");

	/**
	 * <p>
	 * Name: getDefaultSkinLegacy
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_177335_a = McMappingDatabase.getSRG("DefaultPlayerSkin.func_177335_a");

	/**
	 * <p>
	 * Name: TEXTURE_ALEX
	 * </p>
	 */
	public static McObfPair field_177336_b = McMappingDatabase.getSRG("field_177336_b");

	/**
	 * <p>
	 * Name: TEXTURE_STEVE
	 * </p>
	 */
	public static McObfPair field_177337_a = McMappingDatabase.getSRG("field_177337_a");

}
