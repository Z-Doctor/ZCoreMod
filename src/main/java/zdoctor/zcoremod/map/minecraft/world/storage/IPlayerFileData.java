package zdoctor.zcoremod.map.minecraft.world.storage;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class IPlayerFileData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfk";
		else
			return "net/minecraft/world/storage/IPlayerFileData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bfk";
		else
			return "IPlayerFileData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbfk;";
		else
			return "Lnet/minecraft/world/storage/IPlayerFileData;";
	}

	/**
	 * <p>
	 * Name: getAvailablePlayerDat
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_75754_f = McMappingDatabase.getSRG("IPlayerFileData.func_75754_f");

	/**
	 * <p>
	 * Name: readPlayerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/nbt/NBTTagCompound;]
	 * </p>
	 */
	public static McObfPair func_75752_b = McMappingDatabase.getSRG("IPlayerFileData.func_75752_b");

	/**
	 * <p>
	 * Name: writePlayerData
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_75753_a = McMappingDatabase.getSRG("IPlayerFileData.func_75753_a");

}
