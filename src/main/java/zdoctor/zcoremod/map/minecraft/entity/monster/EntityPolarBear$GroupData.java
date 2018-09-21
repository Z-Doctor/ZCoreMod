package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPolarBear$GroupData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aae$b";
		else
			return "net/minecraft/entity/monster/EntityPolarBear$GroupData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aae$b";
		else
			return "EntityPolarBear$GroupData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laae$b;";
		else
			return "Lnet/minecraft/entity/monster/EntityPolarBear$GroupData;";
	}

	/**
	 * <p>
	 * Name: madeParent
	 * </p>
	 */
	public static McObfPair field_190101_a = McMappingDatabase.getSRG("field_190101_a");

}
