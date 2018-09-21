package zdoctor.zcoremod.map.minecraft.entity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityList {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vi";
		else
			return "net/minecraft/entity/EntityList";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "vi";
		else
			return "EntityList";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lvi;";
		else
			return "Lnet/minecraft/entity/EntityList;";
	}

	/**
	 * <p>
	 * Name: addSpawnInfo
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;II)Lnet/minecraft/entity/EntityList$EntityEggInfo;]
	 * </p>
	 */
	public static McObfPair func_191305_a = McMappingDatabase.getSRG("EntityList.func_191305_a");

	/**
	 * <p>
	 * Name: createEntityFromNBT
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/nbt/NBTTagCompound;Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_75615_a = McMappingDatabase.getSRG("EntityList.func_75615_a");

	/**
	 * <p>
	 * Name: init
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_151514_a = McMappingDatabase.getSRG("EntityList.func_151514_a");

	/**
	 * <p>
	 * Name: newEntity
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_191304_a = McMappingDatabase.getSRG("EntityList.func_191304_a");

	/**
	 * <p>
	 * Name: ENTITY_EGGS
	 * </p>
	 */
	public static McObfPair field_75627_a = McMappingDatabase.getSRG("field_75627_a");

	/**
	 * <p>
	 * Name: getKey
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_191301_a = McMappingDatabase.getSRG("EntityList.func_191301_a");

	/**
	 * <p>
	 * Name: REGISTRY
	 * </p>
	 */
	public static McObfPair field_191308_b = McMappingDatabase.getSRG("field_191308_b");

	/**
	 * <p>
	 * Name: PLAYER
	 * </p>
	 */
	public static McObfPair field_191310_e = McMappingDatabase.getSRG("field_191310_e");

	/**
	 * <p>
	 * Name: OLD_NAMES
	 * </p>
	 */
	public static McObfPair field_191311_g = McMappingDatabase.getSRG("field_191311_g");

	/**
	 * <p>
	 * Name: getClassFromID
	 * </p>
	 * <p>
	 * Desc: [(I)Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_90035_a = McMappingDatabase.getSRG("EntityList.func_90035_a");

	/**
	 * <p>
	 * Name: getClassFromName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/lang/Class;]
	 * </p>
	 */
	public static McObfPair func_192839_a = McMappingDatabase.getSRG("EntityList.func_192839_a");

	/**
	 * <p>
	 * Name: KNOWN_TYPES
	 * </p>
	 */
	public static McObfPair field_191309_d = McMappingDatabase.getSRG("field_191309_d");

	/**
	 * <p>
	 * Name: register
	 * </p>
	 * <p>
	 * Desc: [(ILjava/lang/String;Ljava/lang/Class;Ljava/lang/String;)V]
	 * </p>
	 */
	public static McObfPair func_191303_a = McMappingDatabase.getSRG("EntityList.func_191303_a");

	/**
	 * <p>
	 * Name: getTranslationName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_191302_a = McMappingDatabase.getSRG("EntityList.func_191302_a");

	/**
	 * <p>
	 * Name: getEntityString
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_75621_b = McMappingDatabase.getSRG("EntityList.func_75621_b");

	/**
	 * <p>
	 * Name: getEntityNameList
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_180124_b = McMappingDatabase.getSRG("EntityList.func_180124_b");

	/**
	 * <p>
	 * Name: createEntityByIDFromName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;Lnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_188429_b = McMappingDatabase.getSRG("EntityList.func_188429_b");

	/**
	 * <p>
	 * Name: isMatchingName
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_180123_a = McMappingDatabase.getSRG("EntityList.func_180123_a");

	/**
	 * <p>
	 * Name: getValidTypeNames
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_192840_b = McMappingDatabase.getSRG("EntityList.func_192840_b");

	/**
	 * <p>
	 * Name: LIGHTNING_BOLT
	 * </p>
	 */
	public static McObfPair field_191307_a = McMappingDatabase.getSRG("field_191307_a");

	/**
	 * <p>
	 * Name: getKey
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/Class;)Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_191306_a = McMappingDatabase.getSRG("EntityList.func_191306_a");

	/**
	 * <p>
	 * Name: LOGGER
	 * </p>
	 */
	public static McObfPair field_151516_b = McMappingDatabase.getSRG("field_151516_b");

	/**
	 * <p>
	 * Name: isRegistered
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/ResourceLocation;)Z]
	 * </p>
	 */
	public static McObfPair func_180125_b = McMappingDatabase.getSRG("EntityList.func_180125_b");

	/**
	 * <p>
	 * Name: createEntityByID
	 * </p>
	 * <p>
	 * Desc: [(ILnet/minecraft/world/World;)Lnet/minecraft/entity/Entity;]
	 * </p>
	 */
	public static McObfPair func_75616_a = McMappingDatabase.getSRG("EntityList.func_75616_a");

}
