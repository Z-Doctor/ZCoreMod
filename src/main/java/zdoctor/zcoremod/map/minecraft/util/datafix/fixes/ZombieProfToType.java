package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ZombieProfToType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sw";
		else
			return "net/minecraft/util/datafix/fixes/ZombieProfToType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "sw";
		else
			return "ZombieProfToType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lsw;";
		else
			return "Lnet/minecraft/util/datafix/fixes/ZombieProfToType;";
	}

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("ZombieProfToType.func_188216_a");

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("ZombieProfToType.func_188217_a");

	/**
	 * <p>
	 * Name: getVillagerProfession
	 * </p>
	 * <p>
	 * Desc: [(I)I]
	 * </p>
	 */
	public static McObfPair func_191277_a = McMappingDatabase.getSRG("ZombieProfToType.func_191277_a");

	/**
	 * <p>
	 * Name: RANDOM
	 * </p>
	 */
	public static McObfPair field_190049_a = McMappingDatabase.getSRG("field_190049_a");

}
