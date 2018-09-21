package zdoctor.zcoremod.map.minecraft.entity.passive;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityVillager$PriceInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$g";
		else
			return "net/minecraft/entity/passive/EntityVillager$PriceInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ady$g";
		else
			return "EntityVillager$PriceInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lady$g;";
		else
			return "Lnet/minecraft/entity/passive/EntityVillager$PriceInfo;";
	}

	/**
	 * <p>
	 * Name: getPrice
	 * </p>
	 * <p>
	 * Desc: [(Ljava/util/Random;)I]
	 * </p>
	 */
	public static McObfPair func_179412_a = McMappingDatabase.getSRG("EntityVillager$PriceInfo.func_179412_a");

}
