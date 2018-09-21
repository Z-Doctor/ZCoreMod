package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityHealth {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sk";
		else
			return "net/minecraft/util/datafix/fixes/EntityHealth";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sk";
		else
			return "EntityHealth";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsk;";
		else
			return "Lnet/minecraft/util/datafix/fixes/EntityHealth;";
	}

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("EntityHealth.func_188216_a");

	/**
	 * <p>
	 * Name: ENTITY_LIST
	 * </p>
	 */
	public static McObfPair field_188218_a = McMappingDatabase.getSRG("field_188218_a");

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("EntityHealth.func_188217_a");

}
