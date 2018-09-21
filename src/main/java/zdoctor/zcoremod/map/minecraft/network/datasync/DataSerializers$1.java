package zdoctor.zcoremod.map.minecraft.network.datasync;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DataSerializers$1 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "na$1";
		else
			return "net/minecraft/network/datasync/DataSerializers$1";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "na$1";
		else
			return "DataSerializers$1";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lna$1;";
		else
			return "Lnet/minecraft/network/datasync/DataSerializers$1;";
	}

	/**
	 * <p>
	 * Name: createKey
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/network/datasync/DataParameter;]
	 * </p>
	 */
	public static McObfPair func_187161_a = McMappingDatabase.getSRG("DataSerializers$1.func_187161_a");

	/**
	 * <p>
	 * Name: read
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;)Ljava/lang/Object;, (Lnet/minecraft/network/PacketBuffer;)Ljava/lang/Byte;]
	 * </p>
	 */
	public static McObfPair func_187159_a = McMappingDatabase.getSRG("DataSerializers$1.func_187159_a");

	/**
	 * <p>
	 * Name: write
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/network/PacketBuffer;Ljava/lang/Byte;)V, (Lnet/minecraft/network/PacketBuffer;Ljava/lang/Object;)V]
	 * </p>
	 */
	public static McObfPair func_187160_a = McMappingDatabase.getSRG("DataSerializers$1.func_187160_a");

	/**
	 * <p>
	 * Name: copyValue
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Byte;)Ljava/lang/Byte;, (Ljava/lang/Object;)Ljava/lang/Object;]
	 * </p>
	 */
	public static McObfPair func_192717_a = McMappingDatabase.getSRG("DataSerializers$1.func_192717_a");

}
