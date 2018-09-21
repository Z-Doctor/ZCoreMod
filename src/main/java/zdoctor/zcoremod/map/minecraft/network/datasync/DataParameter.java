package zdoctor.zcoremod.map.minecraft.network.datasync;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DataParameter {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "my";
		else
			return "net/minecraft/network/datasync/DataParameter";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "my";
		else
			return "DataParameter";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmy;";
		else
			return "Lnet/minecraft/network/datasync/DataParameter;";
	}

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_187157_a = McMappingDatabase.getSRG("field_187157_a");

	/**
	 * <p>
	 * Name: getSerializer
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/network/datasync/DataSerializer;]
	 * </p>
	 */
	public static McObfPair func_187156_b = McMappingDatabase.getSRG("DataParameter.func_187156_b");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_187155_a = McMappingDatabase.getSRG("DataParameter.func_187155_a");

	/**
	 * <p>
	 * Name: serializer
	 * </p>
	 */
	public static McObfPair field_187158_b = McMappingDatabase.getSRG("field_187158_b");

}
