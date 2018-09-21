package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SpawnEggNames {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tc";
		else
			return "net/minecraft/util/datafix/fixes/SpawnEggNames";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "tc";
		else
			return "SpawnEggNames";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Ltc;";
		else
			return "Lnet/minecraft/util/datafix/fixes/SpawnEggNames;";
	}

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("SpawnEggNames.func_188216_a");

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("SpawnEggNames.func_188217_a");

	/**
	 * <p>
	 * Name: ENTITY_IDS
	 * </p>
	 */
	public static McObfPair field_188226_a = McMappingDatabase.getSRG("field_188226_a");

}
