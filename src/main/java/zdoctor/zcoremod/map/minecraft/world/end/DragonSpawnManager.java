package zdoctor.zcoremod.map.minecraft.world.end;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DragonSpawnManager {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayq";
		else
			return "net/minecraft/world/end/DragonSpawnManager";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayq";
		else
			return "DragonSpawnManager";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layq;";
		else
			return "Lnet/minecraft/world/end/DragonSpawnManager;";
	}

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;Lnet/minecraft/world/end/DragonFightManager;Ljava/util/List;ILnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_186079_a = McMappingDatabase.getSRG("DragonSpawnManager.func_186079_a");

}
