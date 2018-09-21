package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class SignStrictJSON {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sg";
		else
			return "net/minecraft/util/datafix/fixes/SignStrictJSON";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sg";
		else
			return "SignStrictJSON";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsg;";
		else
			return "Lnet/minecraft/util/datafix/fixes/SignStrictJSON;";
	}

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("SignStrictJSON.func_188217_a");

	/**
	 * <p>
	 * Name: GSON_INSTANCE
	 * </p>
	 */
	public static McObfPair field_188225_a = McMappingDatabase.getSRG("field_188225_a");

	/**
	 * <p>
	 * Name: updateLine
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_188224_a = McMappingDatabase.getSRG("SignStrictJSON.func_188224_a");

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("SignStrictJSON.func_188216_a");

}
