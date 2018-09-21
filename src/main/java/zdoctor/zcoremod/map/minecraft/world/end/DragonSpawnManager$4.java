package zdoctor.zcoremod.map.minecraft.world.end;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DragonSpawnManager$4 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayq$4";
		else
			return "net/minecraft/world/end/DragonSpawnManager$4";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ayq$4";
		else
			return "DragonSpawnManager$4";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Layq$4;";
		else
			return "Lnet/minecraft/world/end/DragonSpawnManager$4;";
	}

	/**
	 * <p>
	 * Name: process
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/WorldServer;Lnet/minecraft/world/end/DragonFightManager;Ljava/util/List;ILnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_186079_a = McMappingDatabase.getSRG("DragonSpawnManager$4.func_186079_a");

}