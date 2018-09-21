package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntitySpawnPlacementRegistry {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vt";
		else
			return "net/minecraft/entity/EntitySpawnPlacementRegistry";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vt";
		else
			return "EntitySpawnPlacementRegistry";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvt;";
		else
			return "Lnet/minecraft/entity/EntitySpawnPlacementRegistry;";
	}

	/**
	 * <p>
	 * Name: getPlacementForEntity
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Lnet/minecraft/entity/EntityLiving$SpawnPlacementType;]
	 * </p>
	 */
	public static McObfPair func_180109_a = McMappingDatabase.getSRG("EntitySpawnPlacementRegistry.func_180109_a");

	/**
	 * <p>
	 * Name: ENTITY_PLACEMENTS
	 * </p>
	 */
	public static McObfPair field_180110_a = McMappingDatabase.getSRG("field_180110_a");

}
