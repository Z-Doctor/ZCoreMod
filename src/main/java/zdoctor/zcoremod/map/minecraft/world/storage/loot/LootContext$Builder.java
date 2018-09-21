package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class LootContext$Builder {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bft$a";
		else
			return "net/minecraft/world/storage/loot/LootContext$Builder";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bft$a";
		else
			return "LootContext$Builder";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbft$a;";
		else
			return "Lnet/minecraft/world/storage/loot/LootContext$Builder;";
	}

	/**
	 * <p>
	 * Name: withDamageSource
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/util/DamageSource;)Lnet/minecraft/world/storage/loot/LootContext$Builder;]
	 * </p>
	 */
	public static McObfPair func_186473_a = McMappingDatabase.getSRG("LootContext$Builder.func_186473_a");

	/**
	 * <p>
	 * Name: build
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/world/storage/loot/LootContext;]
	 * </p>
	 */
	public static McObfPair func_186471_a = McMappingDatabase.getSRG("LootContext$Builder.func_186471_a");

	/**
	 * <p>
	 * Name: withLuck
	 * </p>
	 * <p>
	 * Desc: [(F)Lnet/minecraft/world/storage/loot/LootContext$Builder;]
	 * </p>
	 */
	public static McObfPair func_186469_a = McMappingDatabase.getSRG("LootContext$Builder.func_186469_a");

	/**
	 * <p>
	 * Name: damageSource
	 * </p>
	 */
	public static McObfPair field_186478_e = McMappingDatabase.getSRG("field_186478_e");

	/**
	 * <p>
	 * Name: world
	 * </p>
	 */
	public static McObfPair field_186474_a = McMappingDatabase.getSRG("field_186474_a");

	/**
	 * <p>
	 * Name: player
	 * </p>
	 */
	public static McObfPair field_186477_d = McMappingDatabase.getSRG("field_186477_d");

	/**
	 * <p>
	 * Name: withLootedEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/Entity;)Lnet/minecraft/world/storage/loot/LootContext$Builder;]
	 * </p>
	 */
	public static McObfPair func_186472_a = McMappingDatabase.getSRG("LootContext$Builder.func_186472_a");

	/**
	 * <p>
	 * Name: luck
	 * </p>
	 */
	public static McObfPair field_186475_b = McMappingDatabase.getSRG("field_186475_b");

	/**
	 * <p>
	 * Name: lootedEntity
	 * </p>
	 */
	public static McObfPair field_186476_c = McMappingDatabase.getSRG("field_186476_c");

	/**
	 * <p>
	 * Name: withPlayer
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/entity/player/EntityPlayer;)Lnet/minecraft/world/storage/loot/LootContext$Builder;]
	 * </p>
	 */
	public static McObfPair func_186470_a = McMappingDatabase.getSRG("LootContext$Builder.func_186470_a");

}
