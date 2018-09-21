package zdoctor.zcoremod.map.minecraft.entity.monster;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySpider$GroupData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adn$b";
		else
			return "net/minecraft/entity/monster/EntitySpider$GroupData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "adn$b";
		else
			return "EntitySpider$GroupData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ladn$b;";
		else
			return "Lnet/minecraft/entity/monster/EntitySpider$GroupData;";
	}

	/**
	 * <p>
	 * Name: effect
	 * </p>
	 */
	public static McObfPair field_188478_a = McMappingDatabase.getSRG("field_188478_a");

	/**
	 * <p>
	 * Name: setRandomEffect
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)V]
	 * </p>
	 */
	public static McObfPair func_111104_a = McMappingDatabase.getSRG("EntitySpider$GroupData.func_111104_a");

}
