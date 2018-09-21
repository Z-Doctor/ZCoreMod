package zdoctor.zcoremod.map.minecraft.client.model;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IMultipassModel {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brc";
		else
			return "net/minecraft/client/model/IMultipassModel";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "brc";
		else
			return "IMultipassModel";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbrc;";
		else
			return "Lnet/minecraft/client/model/IMultipassModel;";
	}

	/**
	 * <p>
	 * Name: renderMultipass
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;FFFFFF)V]
	 * </p>
	 */
	public static McObfPair func_187054_b = McMappingDatabase.getSRG("IMultipassModel.func_187054_b");

}
