package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityLlama$GroupData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aas$b";
		else
			return "net/minecraft/entity/passive/EntityLlama$GroupData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aas$b";
		else
			return "EntityLlama$GroupData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laas$b;";
		else
			return "Lnet/minecraft/entity/passive/EntityLlama$GroupData;";
	}

	/**
	 * <p>
	 * Name: variant
	 * </p>
	 */
	public static McObfPair field_190886_a = McMappingDatabase.getSRG("field_190886_a");

}
