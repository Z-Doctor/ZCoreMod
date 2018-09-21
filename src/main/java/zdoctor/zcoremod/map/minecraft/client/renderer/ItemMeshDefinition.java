package zdoctor.zcoremod.map.minecraft.client.renderer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ItemMeshDefinition {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buw";
		else
			return "net/minecraft/client/renderer/ItemMeshDefinition";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "buw";
		else
			return "ItemMeshDefinition";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbuw;";
		else
			return "Lnet/minecraft/client/renderer/ItemMeshDefinition;";
	}

	/**
	 * <p>
	 * Name: getModelLocation
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/item/ItemStack;)Lnet/minecraft/client/renderer/block/model/ModelResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_178113_a = McMappingDatabase.getSRG("ItemMeshDefinition.func_178113_a");

}
