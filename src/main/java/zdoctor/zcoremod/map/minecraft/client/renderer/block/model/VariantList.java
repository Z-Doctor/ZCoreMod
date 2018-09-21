package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class VariantList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwd";
		else
			return "net/minecraft/client/renderer/block/model/VariantList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bwd";
		else
			return "VariantList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbwd;";
		else
			return "Lnet/minecraft/client/renderer/block/model/VariantList;";
	}

	/**
	 * <p>
	 * Name: getVariantList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/List;]
	 * </p>
	 */
	public static McObfPair func_188114_a = McMappingDatabase.getSRG("VariantList.func_188114_a");

	/**
	 * <p>
	 * Name: variantList
	 * </p>
	 */
	public static McObfPair field_188115_a = McMappingDatabase.getSRG("field_188115_a");

}
