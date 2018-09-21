package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHorse$GroupData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaq$a";
		else
			return "net/minecraft/entity/passive/EntityHorse$GroupData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaq$a";
		else
			return "EntityHorse$GroupData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaq$a;";
		else
			return "Lnet/minecraft/entity/passive/EntityHorse$GroupData;";
	}

	/**
	 * <p>
	 * Name: variant
	 * </p>
	 */
	public static McObfPair field_190885_a = McMappingDatabase.getSRG("field_190885_a");

}
