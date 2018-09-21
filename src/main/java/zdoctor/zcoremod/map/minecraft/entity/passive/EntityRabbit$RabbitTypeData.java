package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityRabbit$RabbitTypeData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$c";
		else
			return "net/minecraft/entity/passive/EntityRabbit$RabbitTypeData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aaf$c";
		else
			return "EntityRabbit$RabbitTypeData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laaf$c;";
		else
			return "Lnet/minecraft/entity/passive/EntityRabbit$RabbitTypeData;";
	}

	/**
	 * <p>
	 * Name: typeData
	 * </p>
	 */
	public static McObfPair field_179427_a = McMappingDatabase.getSRG("field_179427_a");

}
