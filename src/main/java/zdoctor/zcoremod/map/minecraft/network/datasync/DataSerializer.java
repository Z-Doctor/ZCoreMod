package zdoctor.zcoremod.map.minecraft.network.datasync;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DataSerializer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mz";
		else
			return "net/minecraft/network/datasync/DataSerializer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "mz";
		else
			return "DataSerializer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lmz;";
		else
			return "Lnet/minecraft/network/datasync/DataSerializer;";
	}

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_187159_a = McMappingDatabase.getSRG("DataSerializer.func_187159_a");

	/**
	 * <p>
	 * Name: createKey
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/network/datasync/DataParameter;]
	 * </p>
	 */
	public static McObfPair func_187161_a = McMappingDatabase.getSRG("DataSerializer.func_187161_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_187160_a = McMappingDatabase.getSRG("DataSerializer.func_187160_a");

	/**
	 * <p>
	 * Name: copyValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_192717_a = McMappingDatabase.getSRG("DataSerializer.func_192717_a");

}
