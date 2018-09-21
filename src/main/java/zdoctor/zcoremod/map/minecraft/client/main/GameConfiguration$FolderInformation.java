package zdoctor.zcoremod.map.minecraft.client.main;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class GameConfiguration$FolderInformation {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$b";
		else
			return "net/minecraft/client/main/GameConfiguration$FolderInformation";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "boz$b";
		else
			return "GameConfiguration$FolderInformation";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lboz$b;";
		else
			return "Lnet/minecraft/client/main/GameConfiguration$FolderInformation;";
	}

	/**
	 * <p>
	 * Name: assetIndex
	 * </p>
	 */
	public static McObfPair field_178757_d = McMappingDatabase.getSRG("field_178757_d");

	/**
	 * <p>
	 * Name: mcDataDir
	 * </p>
	 */
	public static McObfPair field_178760_a = McMappingDatabase.getSRG("field_178760_a");

	/**
	 * <p>
	 * Name: resourcePacksDir
	 * </p>
	 */
	public static McObfPair field_178758_b = McMappingDatabase.getSRG("field_178758_b");

	/**
	 * <p>
	 * Name: assetsDir
	 * </p>
	 */
	public static McObfPair field_178759_c = McMappingDatabase.getSRG("field_178759_c");

	/**
	 * <p>
	 * Name: getAssetsIndex
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/resources/ResourceIndex;]
	 * </p>
	 */
	public static McObfPair func_187052_a = McMappingDatabase.getSRG("GameConfiguration$FolderInformation.func_187052_a");

}
