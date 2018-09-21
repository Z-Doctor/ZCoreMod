package zdoctor.zcoremod.map.minecraft.client.multiplayer;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ServerData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bse";
		else
			return "net/minecraft/client/multiplayer/ServerData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bse";
		else
			return "ServerData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbse;";
		else
			return "Lnet/minecraft/client/multiplayer/ServerData;";
	}

	/**
	 * <p>
	 * Name: copyFrom
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerData;)V]
	 * </p>
	 */
	public static McObfPair func_152583_a = McMappingDatabase.getSRG("ServerData.func_152583_a");

	/**
	 * <p>
	 * Name: isOnLAN
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_181041_d = McMappingDatabase.getSRG("ServerData.func_181041_d");

	/**
	 * <p>
	 * Name: getNBTCompound
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_78836_a = McMappingDatabase.getSRG("ServerData.func_78836_a");

	/**
	 * <p>
	 * Name: populationInfo
	 * </p>
	 */
	public static McObfPair field_78846_c = McMappingDatabase.getSRG("field_78846_c");

	/**
	 * <p>
	 * Name: serverIcon
	 * </p>
	 */
	public static McObfPair field_147411_m = McMappingDatabase.getSRG("field_147411_m");

	/**
	 * <p>
	 * Name: gameVersion
	 * </p>
	 */
	public static McObfPair field_82822_g = McMappingDatabase.getSRG("field_82822_g");

	/**
	 * <p>
	 * Name: resourceMode
	 * </p>
	 */
	public static McObfPair field_152587_j = McMappingDatabase.getSRG("field_152587_j");

	/**
	 * <p>
	 * Name: lanServer
	 * </p>
	 */
	public static McObfPair field_181042_l = McMappingDatabase.getSRG("field_181042_l");

	/**
	 * <p>
	 * Name: getBase64EncodedIconData
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_147409_e = McMappingDatabase.getSRG("ServerData.func_147409_e");

	/**
	 * <p>
	 * Name: version
	 * </p>
	 */
	public static McObfPair field_82821_f = McMappingDatabase.getSRG("field_82821_f");

	/**
	 * <p>
	 * Name: setBase64EncodedIconData
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_147407_a = McMappingDatabase.getSRG("ServerData.func_147407_a");

	/**
	 * <p>
	 * Name: playerList
	 * </p>
	 */
	public static McObfPair field_147412_i = McMappingDatabase.getSRG("field_147412_i");

	/**
	 * <p>
	 * Name: setResourceMode
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/client/multiplayer/ServerData$ServerResourceMode;)V]
	 * </p>
	 */
	public static McObfPair func_152584_a = McMappingDatabase.getSRG("ServerData.func_152584_a");

	/**
	 * <p>
	 * Name: pingToServer
	 * </p>
	 */
	public static McObfPair field_78844_e = McMappingDatabase.getSRG("field_78844_e");

	/**
	 * <p>
	 * Name: pinged
	 * </p>
	 */
	public static McObfPair field_78841_f = McMappingDatabase.getSRG("field_78841_f");

	/**
	 * <p>
	 * Name: getResourceMode
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/client/multiplayer/ServerData$ServerResourceMode;]
	 * </p>
	 */
	public static McObfPair func_152586_b = McMappingDatabase.getSRG("ServerData.func_152586_b");

	/**
	 * <p>
	 * Name: serverName
	 * </p>
	 */
	public static McObfPair field_78847_a = McMappingDatabase.getSRG("field_78847_a");

	/**
	 * <p>
	 * Name: serverMOTD
	 * </p>
	 */
	public static McObfPair field_78843_d = McMappingDatabase.getSRG("field_78843_d");

	/**
	 * <p>
	 * Name: getServerDataFromNBTCompound
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;)Lnet/minecraft/client/multiplayer/ServerData;]
	 * </p>
	 */
	public static McObfPair func_78837_a = McMappingDatabase.getSRG("ServerData.func_78837_a");

	/**
	 * <p>
	 * Name: serverIP
	 * </p>
	 */
	public static McObfPair field_78845_b = McMappingDatabase.getSRG("field_78845_b");

}
