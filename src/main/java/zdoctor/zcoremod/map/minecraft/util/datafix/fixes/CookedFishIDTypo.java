package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CookedFishIDTypo {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sy";
		else
			return "net/minecraft/util/datafix/fixes/CookedFishIDTypo";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sy";
		else
			return "CookedFishIDTypo";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsy;";
		else
			return "Lnet/minecraft/util/datafix/fixes/CookedFishIDTypo;";
	}

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("CookedFishIDTypo.func_188217_a");

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("CookedFishIDTypo.func_188216_a");

	/**
	 * <p>
	 * Name: WRONG
	 * </p>
	 */
	public static McObfPair field_190050_a = McMappingDatabase.getSRG("field_190050_a");

}
