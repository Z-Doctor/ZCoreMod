package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class HorseSaddle {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sl";
		else
			return "net/minecraft/util/datafix/fixes/HorseSaddle";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sl";
		else
			return "HorseSaddle";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsl;";
		else
			return "Lnet/minecraft/util/datafix/fixes/HorseSaddle;";
	}

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("HorseSaddle.func_188217_a");

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("HorseSaddle.func_188216_a");

}
