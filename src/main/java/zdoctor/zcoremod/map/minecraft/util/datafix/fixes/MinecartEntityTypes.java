package zdoctor.zcoremod.map.minecraft.util.datafix.fixes;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MinecartEntityTypes {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "so";
		else
			return "net/minecraft/util/datafix/fixes/MinecartEntityTypes";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "so";
		else
			return "MinecartEntityTypes";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lso;";
		else
			return "Lnet/minecraft/util/datafix/fixes/MinecartEntityTypes;";
	}

	/**
	 * <p>
	 * Name: MINECART_TYPE_LIST
	 * </p>
	 */
	public static McObfPair field_188222_a = McMappingDatabase.getSRG("field_188222_a");

	/**
	 * <p>
	 * Name: getFixVersion
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_188216_a = McMappingDatabase.getSRG("MinecartEntityTypes.func_188216_a");

	/**
	 * <p>
	 * Name: fixTagCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_188217_a = McMappingDatabase.getSRG("MinecartEntityTypes.func_188217_a");

}
