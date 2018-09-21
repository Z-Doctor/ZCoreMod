package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SkeletonSplit {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "st";
		else
			return "net/minecraft/util/datafix/fixes/SkeletonSplit";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "st";
		else
			return "SkeletonSplit";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lst;";
		else
			return "Lnet/minecraft/util/datafix/fixes/SkeletonSplit;";
	}

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("SkeletonSplit.func_188217_a");

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("SkeletonSplit.func_188216_a");

}
