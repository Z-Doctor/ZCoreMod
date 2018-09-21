package zdoctor.zcoremod.map.minecraft.server.integrated;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IntegratedPlayerList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chc";
		else
			return "net/minecraft/server/integrated/IntegratedPlayerList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "chc";
		else
			return "IntegratedPlayerList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lchc;";
		else
			return "Lnet/minecraft/server/integrated/IntegratedPlayerList;";
	}

	/**
	 * <p>
	 * Name: getHostPlayerData
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_72378_q = McMappingDatabase.getSRG("IntegratedPlayerList.func_72378_q");

	/**
	 * <p>
	 * Name: writePlayerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayerMP;)V]
	 * </p>
	 */
	public static McObfPair func_72391_b = McMappingDatabase.getSRG("IntegratedPlayerList.func_72391_b");

	/**
	 * <p>
	 * Name: hostPlayerData
	 * </p>
	 */
	public static McObfPair field_72416_e = McMappingDatabase.getSRG("field_72416_e");

	/**
	 * <p>
	 * Name: allowUserToConnect
	 * </p>
	 * <p>
	 * Desc: [(Ljava/net/SocketAddress;Lcom/mojang/authlib/GameProfile;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_148542_a = McMappingDatabase.getSRG("IntegratedPlayerList.func_148542_a");

	/**
	 * <p>
	 * Name: getServerInstance
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/server/integrated/IntegratedServer;, ()Lnet/minecraft/server/MinecraftServer;]
	 * </p>
	 */
	public static McObfPair func_72365_p = McMappingDatabase.getSRG("IntegratedPlayerList.func_72365_p");

}
