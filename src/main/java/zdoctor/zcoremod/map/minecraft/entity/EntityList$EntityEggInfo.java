package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityList$EntityEggInfo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vi$a";
		else
			return "net/minecraft/entity/EntityList$EntityEggInfo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vi$a";
		else
			return "EntityList$EntityEggInfo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvi$a;";
		else
			return "Lnet/minecraft/entity/EntityList$EntityEggInfo;";
	}

	/**
	 * <p>
	 * Name: spawnedID
	 * </p>
	 */
	public static McObfPair field_75613_a = McMappingDatabase.getSRG("field_75613_a");

	/**
	 * <p>
	 * Name: entityKilledByStat
	 * </p>
	 */
	public static McObfPair field_151513_e = McMappingDatabase.getSRG("field_151513_e");

	/**
	 * <p>
	 * Name: secondaryColor
	 * </p>
	 */
	public static McObfPair field_75612_c = McMappingDatabase.getSRG("field_75612_c");

	/**
	 * <p>
	 * Name: killEntityStat
	 * </p>
	 */
	public static McObfPair field_151512_d = McMappingDatabase.getSRG("field_151512_d");

	/**
	 * <p>
	 * Name: primaryColor
	 * </p>
	 */
	public static McObfPair field_75611_b = McMappingDatabase.getSRG("field_75611_b");

}
