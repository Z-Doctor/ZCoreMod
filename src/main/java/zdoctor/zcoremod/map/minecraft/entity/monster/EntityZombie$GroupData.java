package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityZombie$GroupData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adt$a";
		else
			return "net/minecraft/entity/monster/EntityZombie$GroupData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adt$a";
		else
			return "EntityZombie$GroupData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladt$a;";
		else
			return "Lnet/minecraft/entity/monster/EntityZombie$GroupData;";
	}

	/**
	 * <p>
	 * Name: isChild
	 * </p>
	 */
	public static McObfPair field_142048_a = McMappingDatabase.getSRG("field_142048_a");

}
