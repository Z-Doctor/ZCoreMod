package zdoctor.zcoremod.map.minecraft.client.renderer.block.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ModelBlock$Bookkeep {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvu$a";
		else
			return "net/minecraft/client/renderer/block/model/ModelBlock$Bookkeep";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bvu$a";
		else
			return "ModelBlock$Bookkeep";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbvu$a;";
		else
			return "Lnet/minecraft/client/renderer/block/model/ModelBlock$Bookkeep;";
	}

	/**
	 * <p>
	 * Name: model
	 * </p>
	 */
	public static McObfPair field_178324_a = McMappingDatabase.getSRG("field_178324_a");

	/**
	 * <p>
	 * Name: modelExt
	 * </p>
	 */
	public static McObfPair field_178323_b = McMappingDatabase.getSRG("field_178323_b");

}
