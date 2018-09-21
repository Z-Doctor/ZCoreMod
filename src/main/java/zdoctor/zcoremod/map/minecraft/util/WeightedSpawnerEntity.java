package zdoctor.zcoremod.map.minecraft.util;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class WeightedSpawnerEntity {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ane";
		else
			return "net/minecraft/util/WeightedSpawnerEntity";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ane";
		else
			return "WeightedSpawnerEntity";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lane;";
		else
			return "Lnet/minecraft/util/WeightedSpawnerEntity;";
	}

	/**
	 * <p>
	 * Name: getNbt
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_185277_b = McMappingDatabase.getSRG("WeightedSpawnerEntity.func_185277_b");

	/**
	 * <p>
	 * Name: toCompoundTag
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_185278_a = McMappingDatabase.getSRG("WeightedSpawnerEntity.func_185278_a");

	/**
	 * <p>
	 * Name: nbt
	 * </p>
	 */
	public static McObfPair field_185279_b = McMappingDatabase.getSRG("field_185279_b");

}
