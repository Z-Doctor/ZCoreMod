package zdoctor.zcoremod.map.minecraft.network.datasync;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DataSerializers$11 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "na$3";
		else
			return "net/minecraft/network/datasync/DataSerializers$11";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "na$3";
		else
			return "DataSerializers$11";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lna$3;";
		else
			return "Lnet/minecraft/network/datasync/DataSerializers$11;";
	}

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;Lcom/google/common/base/Optional;)V, (Lnet/minecraft/network/PacketBuffer;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_187160_a = McMappingDatabase.getSRG("DataSerializers$11.func_187160_a");

	/**
	 * <p>
	 * Name: copyValue
	 * </p>
	 * <p>
	 * Desc: [(Lcom/google/common/base/Optional;)Lcom/google/common/base/Optional;, (Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_192717_a = McMappingDatabase.getSRG("DataSerializers$11.func_192717_a");

	/**
	 * <p>
	 * Name: createKey
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/network/datasync/DataParameter;]
	 * </p>
	 */
	public static McObfPair func_187161_a = McMappingDatabase.getSRG("DataSerializers$11.func_187161_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Ljava/lang/Object;, (Lnet/minecraft/network/PacketBuffer;)Lcom/google/common/base/Optional;]
	 * </p>
	 */
	public static McObfPair func_187159_a = McMappingDatabase.getSRG("DataSerializers$11.func_187159_a");

}
